package dev.thenu.ReddensStoneLanternReconstructed.networking.clickProcedure.rightClick;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class BigRightClickProcedure {

    public BigRightClickProcedure() {
    }

    public static void execute(WorldAccess world, double x, double y, double z) {
        BlockPos bp = BlockPos.ofFloored(x, y, z);
        BlockState bso = world.getBlockState(bp);
        BlockState bs;

        // 1. Toggle logic specifically for the BIG_STONE_LANTERN variants
        if (bso.getBlock() == BlockFile.BIG_STONE_LANTERN_TOP_LIGHT) {
            bs = BlockFile.BIG_STONE_LANTERN_TOP_DARK.getDefaultState();
        } else {
            bs = BlockFile.BIG_STONE_LANTERN_TOP_LIGHT.getDefaultState();
        }

        for (Property<?> propertyOld : bso.getProperties()) {
            Property<?> propertyNew = bs.getBlock().getStateManager().getProperty(propertyOld.getName());
            if (propertyNew != null) {
                bs = copyProperty(bso, bs, propertyOld, propertyNew);
            }
        }

        RegistryWrapper.WrapperLookup registries = world.getRegistryManager();
        BlockEntity oldBe = world.getBlockEntity(bp);
        NbtCompound bnbt = null;

        if (oldBe != null) {
            bnbt = oldBe.createNbt(registries);
            oldBe.markRemoved();
        }

        world.setBlockState(bp, bs, 3);

        if (bnbt != null && world instanceof World level) {
            BlockEntity newBe = BlockEntity.createFromNbt(bp, bs, bnbt, registries);
            if (newBe != null) {
                level.addBlockEntity(newBe);
            }
        }

        // 6. Play click audio
        if (world instanceof World level) {
            level.playSound(null, bp, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 0.5F, 1.0F);
        }
    }

    // Helper method to completely strip raw type casting requirements and warnings
    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> BlockState copyProperty(BlockState from, BlockState to, Property<?> srcProp, Property<?> targetProp) {
        try {
            return to.with((Property<T>) targetProp, from.get((Property<T>) srcProp));
        } catch (Exception e) {
            return to;
        }
    }
}