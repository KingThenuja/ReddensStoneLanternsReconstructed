package dev.thenu.ReddensStoneLanternReconstructed.networking.tickingProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.Blocks.StonePillarMidLanternBlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.Blocks.StonePillarThinALanternBlockFile;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class StonePillarMidTickProcedure {

    public StonePillarMidTickProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        boolean TopIsPillar = false;
        boolean BottomIsPillar = false;

        // 1. Tag lookup mapping adjustments for official runtime references
        if (world.getBlockState(BlockPos.containing(x, y - 1.0D, z)).is(BlockTags.create(ResourceLocation.fromNamespaceAndPath("reddensstonelantern", "is_pillar")))) {
            BottomIsPillar = true;
        }

        if (world.getBlockState(BlockPos.containing(x, y + 1.0D, z)).is(BlockTags.create(ResourceLocation.fromNamespaceAndPath("reddensstonelantern", "is_pillar")))) {
            TopIsPillar = true;
        }

        // 2. Structural checks routing directly into a clean, unified state updater
        if (BottomIsPillar) {
            if (TopIsPillar) {
                // MIDDLE PROFILE
                updatePillarState(world, x, y, z, StonePillarMidLanternBlockFile.STONE_PILLAR_MID_MIDDLE.get().defaultBlockState());
            } else {
                // TOP PROFILE
                updatePillarState(world, x, y, z, StonePillarMidLanternBlockFile.STONE_PILLAR_MID_TOP.get().defaultBlockState());
            }
        } else if (TopIsPillar) {
            // BOTTOM PROFILE
            updatePillarState(world, x, y, z, StonePillarMidLanternBlockFile.STONE_PILLAR_MID_BOTTOM.get().defaultBlockState());
        } else {
            // SHORT PROFILE (Standalone)
            updatePillarState(world, x, y, z, StonePillarMidLanternBlockFile.STONE_PILLAR_MID_SHORT.get().defaultBlockState());
        }
    }

    // Consolidated method to eliminate boilerplate code copies safely across all shapes
    private static void updatePillarState(LevelAccessor world, double x, double y, double z, BlockState targetState) {
        BlockPos _bp = BlockPos.containing(x, y, z);
        BlockState _bso = world.getBlockState(_bp);
        BlockState _bs = targetState;

        // Type-safe property copy sequence clearing out raw compiler warnings
        for (Property<?> _propertyOld : _bso.getProperties()) {
            Property<?> _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
            if (_propertyNew != null) {
                _bs = copyProperty(_bso, _bs, _propertyOld, _propertyNew);
            }
        }

        CompoundTag _bnbt = null;
        BlockEntity _oldBe = world.getBlockEntity(_bp);

        // Extract tile data before modifying world coordinates
        if (_oldBe != null) {
            _bnbt = _oldBe.saveWithFullMetadata(world.registryAccess());
            _oldBe.setRemoved();
        }

        world.setBlock(_bp, _bs, 3);

        // Deserialization hook utilizing Mojang static factory systems rather than direct instance loads
        if (_bnbt != null && world instanceof Level _level) {
            BlockEntity _newBe = BlockEntity.loadStatic(_bp, _bs, _bnbt, _level.registryAccess());
            if (_newBe != null) {
                _level.setBlockEntity(_newBe);
            }
        }
    }

    // Type helper ensuring property parameters convert error-free during runtime updates
    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> BlockState copyProperty(BlockState from, BlockState to, Property<?> srcProp, Property<?> targetProp) {
        try {
            return to.setValue((Property<T>) targetProp, from.getValue((Property<T>) srcProp));
        } catch (Exception e) {
            return to;
        }
    }
}