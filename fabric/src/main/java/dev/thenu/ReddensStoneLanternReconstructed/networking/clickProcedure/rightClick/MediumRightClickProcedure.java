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

public class MediumRightClickProcedure {
    public MediumRightClickProcedure() {
    }

    public static void execute(LevelAccessor levelAccessor, double x, double y, double z) {
        BlockPos bp = BlockPos.containing(x, y, z);
        BlockState currentBlockState = levelAccessor.getBlockState(bp);
        BlockState newBlockState;

        if (currentBlockState.getBlock() == BlockFile.MEDIUM_STONE_LANTERN_TOP_LIGHT) {
            newBlockState = BlockFile.MEDIUM_STONE_LANTERN_TOP_DARK.defaultBlockState();
        } else {
            newBlockState = BlockFile.MEDIUM_STONE_LANTERN_TOP_LIGHT.defaultBlockState();
        }

        for (Property<?> oldProperty : currentBlockState.getProperties()) {
            Property<?> newProperty = newBlockState.getBlock().getStateDefinition().getProperty(oldProperty.getName());
            if (newProperty != null) {
                newBlockState = copyProperty(currentBlockState, newBlockState, oldProperty, newProperty);
            }
        }

        BlockEntity be = levelAccessor.getBlockEntity(bp);
        CompoundTag bnbt = null;
        if (be != null) {
            bnbt = be.saveCustomOnly(levelAccessor.registryAccess());
            be.setRemoved();
        }

        levelAccessor.setBlock(bp, newBlockState, 3);

        if (levelAccessor instanceof Level level) {
            level.playSound(null, bp, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 0.5F, 1.0F);
            if (bnbt != null) {
                BlockEntity newBe = BlockEntity.loadStatic(bp, newBlockState, bnbt, levelAccessor.registryAccess());
                if (newBe != null) {
                    level.onBlockEntityAdded(newBe);
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