package dev.thenu.ReddensStoneLanternReconstructed.networking.clickProcedure.rightClick;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class BroadStoneLanternBlockRightClickProcedure {
    public BroadStoneLanternBlockRightClickProcedure() {
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void execute(WorldAccess world, double x, double y, double z) {
        BlockPos bp = BlockPos.ofFloored(x, y, z);
        BlockState bso = world.getBlockState(bp);
        BlockState bs;

        if (bso.getBlock() == BlockFile.BROAD_STONE_LANTERN_BLOCK_DARK) {
            bs = BlockFile.BROAD_STONE_LANTERN_BLOCK_LIGHT.getDefaultState();
        } else {
            bs = BlockFile.BROAD_STONE_LANTERN_BLOCK_DARK.getDefaultState();
        }

        // Dynamically retain all matching block state properties across modifications
        for (Property<?> propertyOld : bso.getProperties()) {
            Property propertyNew = bs.getBlock().getStateManager().getProperty(propertyOld.getName());
            if (propertyNew != null && bs.get(propertyNew) != null) {
                try {
                    bs = (BlockState) bs.with(propertyNew, bso.get((Property) propertyOld));
                } catch (Exception ignored) {
                }
            }
        }

        // Snapshot existing block entity metadata cleanly prior to block swap
        BlockEntity be = world.getBlockEntity(bp);
        NbtCompound bnbt = null;
        if (be != null) {
            bnbt = be.createNbtWithId(world.getRegistryManager());
            be.markRemoved();
        }

        world.setBlockState(bp, bs, 3);

        // Restore snapshot information safely using the public read bridge method
        if (bnbt != null) {
            be = world.getBlockEntity(bp);
            if (be != null) {
                try {
                    be.read(bnbt, world.getRegistryManager());
                } catch (Exception ignored) {
                }
            }
        }

        // Play the ignition sound effect across both logical sides
        if (world instanceof World level) {
            if (!level.isClient()) {
                level.playSound((PlayerEntity) null, bp, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 0.5F, 1.0F);
            } else {
                level.playSound(x, y, z, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 0.5F, 1.0F, false);
            }
        }
    }
}