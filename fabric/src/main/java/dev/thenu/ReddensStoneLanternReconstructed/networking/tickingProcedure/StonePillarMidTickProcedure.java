package dev.thenu.ReddensStoneLanternReconstructed.networking.tickingProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.block.Block;
import net.minecraft.state.property.Property;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class StonePillarMidTickProcedure {
    private static final TagKey<Block> IS_PILLAR = TagKey.of(RegistryKeys.BLOCK, Identifier.of("reddensstonelantern", "is_pillar"));

    public StonePillarMidTickProcedure() {
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void execute(WorldAccess world, double x, double y, double z) {
        BlockPos bp = BlockPos.ofFloored(x, y, z);
        BlockState bso = world.getBlockState(bp);

        boolean bottomIsPillar = world.getBlockState(bp.down()).isIn(IS_PILLAR);
        boolean topIsPillar = world.getBlockState(bp.up()).isIn(IS_PILLAR);

        // Determine target block variation based on surrounding connections
        BlockState bs;
        if (bottomIsPillar) {
            if (topIsPillar) {
                bs = BlockFile.STONE_PILLAR_MID_MIDDLE.getDefaultState();
            } else {
                bs = BlockFile.STONE_PILLAR_MID_TOP.getDefaultState();
            }
        } else if (topIsPillar) {
            bs = BlockFile.STONE_PILLAR_MID_BOTTOM.getDefaultState();
        } else {
            bs = BlockFile.STONE_PILLAR_MID_SHORT.getDefaultState();
        }

        // Dynamically copy valid properties from old block state to the new one
        for (Property<?> propertyOld : bso.getProperties()) {
            Property propertyNew = bs.getBlock().getStateManager().getProperty(propertyOld.getName());
            if (propertyNew != null && bs.get(propertyNew) != null) {
                try {
                    bs = (BlockState) bs.with(propertyNew, bso.get((Property) propertyOld));
                } catch (Exception ignored) {
                }
            }
        }

        // Snapshot original block entity payload data
        BlockEntity be = world.getBlockEntity(bp);
        NbtCompound bnbt = null;
        if (be != null) {
            bnbt = be.createNbt(world.getRegistryManager());
            be.markRemoved();
        }

        world.setBlockState(bp, bs, 3);

        // Safely re-apply snapped metadata to the freshly placed pillar segment
        if (bnbt != null && world instanceof World level) {
            BlockEntity newBe = BlockEntity.createFromNbt(bp, bs, bnbt, world.getRegistryManager());
            if (newBe != null) {
                level.addBlockEntity(newBe);
            }
        }
    }
}