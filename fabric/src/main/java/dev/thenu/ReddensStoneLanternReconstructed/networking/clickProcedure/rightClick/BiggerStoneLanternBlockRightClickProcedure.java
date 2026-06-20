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

public class BiggerStoneLanternBlockRightClickProcedure {

    public BiggerStoneLanternBlockRightClickProcedure() {
    }

    public static void execute(WorldAccess world, double x, double y, double z) {
        BlockPos bp = BlockPos.ofFloored(x, y, z);
        BlockState bso = world.getBlockState(bp);
        BlockState bs;

        if (bso.getBlock() == BlockFile.BIGGER_STONE_LANTERN_BLOCK_L) {
            bs = BlockFile.BIGGER_STONE_LANTERN_BLOCK_D.getDefaultState();
        } else {
            bs = BlockFile.BIGGER_STONE_LANTERN_BLOCK_L.getDefaultState();
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
            bnbt = oldBe.createNbtWithId(registries);
            oldBe.markRemoved();
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

    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> BlockState copyProperty(BlockState from, BlockState to, Property<?> srcProp, Property<?> targetProp) {
        try {
            return to.with((Property<T>) targetProp, from.get((Property<T>) srcProp));
        } catch (Exception e) {
            return to;
        }
    }
}