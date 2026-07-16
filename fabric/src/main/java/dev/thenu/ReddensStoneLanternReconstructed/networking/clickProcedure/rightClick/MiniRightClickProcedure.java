package dev.thenu.ReddensStoneLanternReconstructed.networking.clickProcedure.rightClick;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class MiniRightClickProcedure {
    public MiniRightClickProcedure() {
    }

    public static void execute(LevelAccessor levelAccessor, double x, double y, double z) {
        BlockPos blockPos = BlockPos.containing(x, y, z);
        BlockState currentBlockState = levelAccessor.getBlockState(blockPos);
        BlockState newBlockState;

        if (currentBlockState.getBlock() == BlockFile.MINI_STONE_LANTERN_DARK) {
            newBlockState = BlockFile.MINI_STONE_LANTERN_LIGHT.defaultBlockState();
        } else {
            newBlockState = BlockFile.MINI_STONE_LANTERN_DARK.defaultBlockState();
        }

        for (Property<?> propertyOld : currentBlockState.getProperties()) {
            Property<?> propertyNew = newBlockState.getBlock().getStateDefinition().getProperty(propertyOld.getName());
            if (propertyNew != null) {
                newBlockState = copyProperty(currentBlockState, newBlockState, propertyOld, propertyNew);
            }
        }

        BlockEntity oldBlockEntity = levelAccessor.getBlockEntity(blockPos);
        HolderLookup.Provider registries = levelAccessor.registryAccess();
        CompoundTag blockEntityData = null;
        if (oldBlockEntity != null) {
            blockEntityData = oldBlockEntity.saveCustomOnly(registries);
            oldBlockEntity.setRemoved();
        }

        levelAccessor.setBlock(blockPos, newBlockState, 3);

        if (levelAccessor instanceof Level level) {
            level.playSound(null, blockPos, net.minecraft.sounds.SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 0.5F, 1.0F);
            if (blockEntityData != null) {
                net.minecraft.world.level.block.entity.BlockEntity newBlockEntity = net.minecraft.world.level.block.entity.BlockEntity.loadStatic(blockPos, newBlockState, blockEntityData, levelAccessor.registryAccess());
                if (newBlockEntity != null) {
                    level.setBlockEntity(newBlockEntity);
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