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

public class BiggerStoneLanternBlockRightClickProcedure {

    public BiggerStoneLanternBlockRightClickProcedure() {
    }

    public static void execute(LevelAccessor levelAccessor, double x, double y, double z) {
        BlockPos blockPos = BlockPos.containing(x, y, z);
        BlockState currentBlockState = levelAccessor.getBlockState(blockPos);
        BlockState newBlockState;

        // Determine the target block state based on the current state (toggling light/dark)
        if (currentBlockState.getBlock() == BlockFile.BIGGER_STONE_LANTERN_BLOCK_L) {
            newBlockState = BlockFile.BIGGER_STONE_LANTERN_BLOCK_D.defaultBlockState();
        } else {
            newBlockState = BlockFile.BIGGER_STONE_LANTERN_BLOCK_L.defaultBlockState();
        }

        // Copy block state properties (like direction, waterlogged, etc.) to the new state
        for (Property<?> oldProperty : currentBlockState.getProperties()) {
            Property<?> newProperty = newBlockState.getBlock().getStateDefinition().getProperty(oldProperty.getName());
            if (newProperty != null) {
                newBlockState = copyProperty(currentBlockState, newBlockState, oldProperty, newProperty);
            }
        }

        BlockEntity oldBlockEntity = levelAccessor.getBlockEntity(blockPos);
        CompoundTag blockEntityData = null;

        // Save and remove the existing BlockEntity data before replacing the block
        if (oldBlockEntity != null) {
            blockEntityData = oldBlockEntity.saveCustomOnly(levelAccessor.registryAccess());
            oldBlockEntity.setRemoved();
        }

        // Replace the block in the world
        levelAccessor.setBlock(blockPos, newBlockState, 3);

        // Restore the BlockEntity data to the new block
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