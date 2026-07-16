package dev.thenu.ReddensStoneLanternReconstructed.networking.clickProcedure.rightClick;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class MidStoneLanternBlockRightClickProcedure {
    public MidStoneLanternBlockRightClickProcedure() {
    }

    public static void execute(LevelAccessor levelAccessor, double x, double y, double z) {
        BlockPos blockPos = BlockPos.containing(x, y, z);
        BlockState currentBlockState = levelAccessor.getBlockState(blockPos);
        BlockState newBlockState;
        BlockEntity oldBlockEntity = levelAccessor.getBlockEntity(blockPos);
        HolderLookup.Provider registries = levelAccessor.registryAccess();
        CompoundTag blockEntityData = null;

        if (currentBlockState.getBlock() == BlockFile.MID_STONE_LANTERN_BLOCK_LIGHT) {
            newBlockState = BlockFile.MID_STONE_LANTERN_BLOCK_DARK.defaultBlockState();
        } else {
            newBlockState = BlockFile.MID_STONE_LANTERN_BLOCK_LIGHT.defaultBlockState();
        }

        for (Property<?> propertyOld : currentBlockState.getProperties()) {
            Property<?> propertyNew = newBlockState.getBlock().getStateDefinition().getProperty(propertyOld.getName());
            if (propertyNew != null) {
                newBlockState = copyProperty(currentBlockState, newBlockState, propertyOld, propertyNew);
            }
        }

        if (oldBlockEntity != null) {
            blockEntityData = oldBlockEntity.saveCustomOnly(registries);
            oldBlockEntity.setRemoved();
        }

        levelAccessor.setBlock(blockPos, newBlockState, 3);

        if (levelAccessor instanceof Level level) {
            level.playSound(null, blockPos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 0.5F, 1.0F);
            if (blockEntityData != null) {
                BlockEntity newBe = BlockEntity.loadStatic(blockPos, newBlockState, blockEntityData, registries);
                if (newBe != null) {
                    level.setBlockEntity(newBe);
                }
            }
        }
    }
    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> BlockState copyProperty(BlockState sourceState, BlockState targetState, Property<?> sourceProp, Property<?> targetProp) {
        try {
            return targetState.setValue((Property<T>) targetProp, sourceState.getValue((Property<T>) sourceProp));
        } catch (Exception e) {
            return targetState;
        }
    }
}