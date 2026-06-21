package dev.thenu.ReddensStoneLanternReconstructed.networking.clickProcedure.rightClick;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class SmallRightClickProcedure {
    public SmallRightClickProcedure() {
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void execute(WorldAccess world, double x, double y, double z) {
        BlockPos bp = BlockPos.ofFloored(x, y, z);
        BlockState bso = world.getBlockState(bp);
        BlockState bs;

        if (bso.getBlock() == BlockFile.SMALL_STONE_LANTERN_LIGHT) {
            bs = BlockFile.SMALL_STONE_LANTERN_DARK.getDefaultState();
        } else {
            bs = BlockFile.SMALL_STONE_LANTERN_LIGHT.getDefaultState();
        }

        for (Property<?> propertyOld : bso.getProperties()) {
            Property propertyNew = bs.getBlock().getStateManager().getProperty(propertyOld.getName());
            if (propertyNew != null && bs.get(propertyNew) != null) {
                try {
                    bs = (BlockState) bs.with(propertyNew, bso.get((Property) propertyOld));
                } catch (Exception ignored) {
                }
            }
        }

        BlockEntity be = world.getBlockEntity(bp);
        RegistryWrapper.WrapperLookup registries = world.getRegistryManager();
        NbtCompound bnbt = null;
        if (be != null) {
            bnbt = be.createNbt(registries);
            be.markRemoved();
        }

        world.setBlockState(bp, bs, 3);

        if (bnbt != null && world instanceof World level) {
            BlockEntity newBe = BlockEntity.createFromNbt(bp, bs, bnbt, registries);
            if (newBe != null) {
                level.addBlockEntity(newBe);
            }
        }

        if (world instanceof World level) {
            level.playSound(null, bp, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 0.5F, 1.0F);
        }
    }
}