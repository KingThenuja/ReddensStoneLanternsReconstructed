package dev.thenu.ReddensStoneLanternReconstructed.networking.tickingProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class StonePillarBiggerTickProcedure {
    private static final TagKey<Block> IS_PILLAR = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("reddensstonelantern", "is_pillar"));

    public StonePillarBiggerTickProcedure() {
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void execute(LevelAccessor levelAccessor, double x, double y, double z) {
        BlockPos blockPos = BlockPos.containing(x, y, z);
        BlockState currentBlockState = levelAccessor.getBlockState(blockPos);
        BlockState newBlockState;

        boolean isBottomAPillar = levelAccessor.getBlockState(blockPos.below()).is(IS_PILLAR);
        boolean isTopAPillar = levelAccessor.getBlockState(blockPos.above()).is(IS_PILLAR);

        // Determine target block variation based on surrounding connections
        if (isBottomAPillar) {
            if (isTopAPillar) {
                newBlockState = BlockFile.STONE_PILLAR_BIGGER_MIDDLE.defaultBlockState();
            } else {
                newBlockState = BlockFile.STONE_PILLAR_BIGGER_TOP.defaultBlockState();
            }
        } else if (isTopAPillar) {
            newBlockState = BlockFile.STONE_PILLAR_BIGGER_BOTTOM.defaultBlockState();
        } else {
            newBlockState = BlockFile.STONE_PILLAR_BIGGER_SHORT.defaultBlockState();
        }

        // Dynamically copy valid properties from old block state to the new one
        for (Property<?> propertyOld : currentBlockState.getProperties()) {
            Property<?> propertyNew = newBlockState.getBlock().getStateDefinition().getProperty(propertyOld.getName());
            if (propertyNew != null) {
                newBlockState = copyProperty(currentBlockState, newBlockState, propertyOld, propertyNew);
            }
        }

        // Snapshot original block entity payload data
        BlockEntity oldBlockEntity = levelAccessor.getBlockEntity(blockPos);
        CompoundTag blockEntityData = null;
        if (oldBlockEntity != null) {
            blockEntityData = oldBlockEntity.saveCustomOnly(levelAccessor.registryAccess());
            oldBlockEntity.setRemoved();
        }

        levelAccessor.setBlock(blockPos, newBlockState, 3);

        // Safely re-apply snapped metadata to the freshly placed pillar segment
        if (blockEntityData != null && levelAccessor instanceof Level level) {
            BlockEntity newBlockEntity = BlockEntity.loadStatic(blockPos, newBlockState, blockEntityData, levelAccessor.registryAccess());
            if (newBlockEntity != null) {
                level.onBlockEntityAdded(newBlockEntity);
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