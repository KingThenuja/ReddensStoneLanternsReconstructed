package dev.thenu.ReddensStoneLanternReconstructed.networking.clickProcedure.rightClick;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class BigStoneLanternBlockRightClickProcedure {
    public BigStoneLanternBlockRightClickProcedure() {
    }

    public static void execute(LevelAccessor levelAccessor, double x, double y, double z) {
        BlockPos blockPos = BlockPos.containing(x, y, z);
        BlockState currentBlockState = levelAccessor.getBlockState(blockPos);
        BlockState newBlockState;

        if (currentBlockState.getBlock() == BlockFile.BIG_STONE_LANTERN_BLOCK_LIGHT) {
            newBlockState = BlockFile.BIG_STONE_LANTERN_BLOCK_DARK.defaultBlockState();
        } else {
            newBlockState = BlockFile.BIG_STONE_LANTERN_BLOCK_LIGHT.defaultBlockState();
        }

        for (Property<?> oldProperty : currentBlockState.getProperties()) {
            Property<?> newProperty = newBlockState.getBlock().getStateDefinition().getProperty(oldProperty.getName());
            if (newProperty != null) {
                newBlockState = copyProperty(currentBlockState, newBlockState, oldProperty, newProperty);
            }
        }

        BlockEntity oldBlockEntity = levelAccessor.getBlockEntity(blockPos);
        CompoundTag blockEntityData = null;
        if (oldBlockEntity != null) {
            blockEntityData = oldBlockEntity.saveCustomOnly(levelAccessor.registryAccess());
            oldBlockEntity.setRemoved();
        }

        levelAccessor.setBlock(blockPos, newBlockState, 3);

        if (levelAccessor instanceof Level level) {
            level.playSound(null, blockPos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 0.5F, 1.0F);
            if (blockEntityData != null) {
                BlockEntity newBlockEntity = BlockEntity.loadStatic(blockPos, newBlockState, blockEntityData, levelAccessor.registryAccess());
                if (newBlockEntity != null) {
                    level.onBlockEntityAdded(newBlockEntity);
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