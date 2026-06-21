package dev.thenu.ReddensStoneLanternReconstructed.networking.tickingProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.Blocks.StonePillarBigLanternBlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.Blocks.StonePillarBiggerLanternBlockFile;
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

public class StonePillarBiggerTickProcedure {

    public StonePillarBiggerTickProcedure() {
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

        // 2. Select appropriate pillar profile states based on nearby structures
        if (BottomIsPillar) {
            if (TopIsPillar) {
                // MIDDLE PROFILE
                updatePillarState(world, x, y, z, StonePillarBiggerLanternBlockFile.STONE_PILLAR_BIGGER_MIDDLE.get().defaultBlockState());
            } else {
                // TOP PROFILE
                updatePillarState(world, x, y, z, StonePillarBiggerLanternBlockFile.STONE_PILLAR_BIGGER_TOP.get().defaultBlockState());
            }
        } else if (TopIsPillar) {
            // BOTTOM PROFILE
            updatePillarState(world, x, y, z, StonePillarBiggerLanternBlockFile.STONE_PILLAR_BIGGER_BOTTOM.get().defaultBlockState());
        } else {
            // SHORT PROFILE (Standalone)
            updatePillarState(world, x, y, z, StonePillarBiggerLanternBlockFile.STONE_PILLAR_BIGGER_SHORT.get().defaultBlockState());
        }
    }

    // Consolidated handler to replace 4 duplicated blocks of decompression code safely
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

        // Isolate block entity components safely
        if (_oldBe != null) {
            _bnbt = _oldBe.saveWithFullMetadata(world.registryAccess());
            _oldBe.setRemoved();
        }

        world.setBlock(_bp, _bs, 3);

        // Deserialization utilizing modern Mojang static factor hooks
        if (_bnbt != null && world instanceof Level _level) {
            BlockEntity _newBe = BlockEntity.loadStatic(_bp, _bs, _bnbt, _level.registryAccess());
            if (_newBe != null) {
                _level.setBlockEntity(_newBe);
            }
        }
    }

    // Helper mapping utility allowing generic property mutations without runtime casting faults
    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> BlockState copyProperty(BlockState from, BlockState to, Property<?> srcProp, Property<?> targetProp) {
        try {
            return to.setValue((Property<T>) targetProp, from.getValue((Property<T>) srcProp));
        } catch (Exception e) {
            return to;
        }
    }
}