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

public class StonePillarThinBTickProcedure {
    private static final TagKey<Block> IS_PILLAR = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("reddensstonelantern", "is_pillar"));

    public StonePillarThinBTickProcedure() {
    }

    public static void execute(LevelAccessor levelAccessor, double x, double y, double z) {
        BlockPos bp = BlockPos.containing(x, y, z);
        BlockState currentBlockState = levelAccessor.getBlockState(bp);

        boolean bottomIsPillar = levelAccessor.getBlockState(bp.below()).is(IS_PILLAR);
        boolean topIsPillar = levelAccessor.getBlockState(bp.above()).is(IS_PILLAR);

        // Determine target block variation based on original decompiled conditions
        BlockState newBlockState = null;
        if (bottomIsPillar) {
            if (!topIsPillar) {
                newBlockState = BlockFile.STONE_PILLAR_THIN_B_TOP.defaultBlockState();
            }
        } else if (topIsPillar) {
            newBlockState = BlockFile.STONE_PILLAR_THIN_B_BOTTOM.defaultBlockState();
        } else {
            newBlockState = BlockFile.STONE_PILLAR_THIN_B_SHORT.defaultBlockState();
        }

        // If the current pillar configuration requires no state changes, exit early
        if (newBlockState == null) {
            return;
        }

        // Dynamically copy valid properties from old block state to the new one
        for (Property<?> propertyOld : currentBlockState.getProperties()) {
            Property<?> propertyNew = newBlockState.getBlock().getStateDefinition().getProperty(propertyOld.getName());
            if (propertyNew != null) {
                newBlockState = copyProperty(currentBlockState, newBlockState, propertyOld, propertyNew);
            }
        }

        // Snapshot original block entity payload data
        BlockEntity be = levelAccessor.getBlockEntity(bp);
        CompoundTag bnbt = null;
        if (be != null) {
            bnbt = be.saveCustomOnly(levelAccessor.registryAccess());
            be.setRemoved();
        }

        levelAccessor.setBlock(bp, newBlockState, 3);

        if (bnbt != null && levelAccessor instanceof Level level) {
            BlockEntity newBe = BlockEntity.loadStatic(bp, newBlockState, bnbt, levelAccessor.registryAccess());
            if (newBe != null) {
                level.onBlockEntityAdded(newBe);
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