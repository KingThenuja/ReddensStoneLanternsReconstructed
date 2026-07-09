package dev.thenu.ReddensStoneLanternReconstructed.networking.tickingProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.Blocks.StonePillarBigLanternBlockFile;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class StonePillarBigTickProcedure {

    public StonePillarBigTickProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        boolean TopIsPillar = false;
        boolean BottomIsPillar = false;

        // 1. Safe tag registration lookup adjustments for modern resource tracking references
        if (world.getBlockState(BlockPos.containing(x, y - 1.0D, z)).is(BlockTags.create(Identifier.fromNamespaceAndPath("reddensstonelantern", "is_pillar")))) {
            BottomIsPillar = true;
        }

        if (world.getBlockState(BlockPos.containing(x, y + 1.0D, z)).is(BlockTags.create(Identifier.fromNamespaceAndPath("reddensstonelantern", "is_pillar")))) {
            TopIsPillar = true;
        }

        // 2. Structural checks routing directly into a clean, unified state updater
        if (BottomIsPillar) {
            if (TopIsPillar) {
                // MIDDLE PROFILE
                updatePillarState(world, x, y, z, StonePillarBigLanternBlockFile.STONE_PILLAR_BIG_MIDDLE.get().defaultBlockState());
            } else {
                // TOP PROFILE
                updatePillarState(world, x, y, z, StonePillarBigLanternBlockFile.STONE_PILLAR_BIG_TOP.get().defaultBlockState());
            }
        } else if (TopIsPillar) {
            // BOTTOM PROFILE
            updatePillarState(world, x, y, z, StonePillarBigLanternBlockFile.STONE_PILLAR_BIG_BOTTOM.get().defaultBlockState());
        } else {
            // SHORT PROFILE (Standalone)
            updatePillarState(world, x, y, z, StonePillarBigLanternBlockFile.STONE_PILLAR_BIG_SHORT.get().defaultBlockState());
        }
    }

    private static void updatePillarState(LevelAccessor world, double x, double y, double z, BlockState targetState) {
        BlockPos _bp = BlockPos.containing(x, y, z);
        BlockState _bso = world.getBlockState(_bp);
        BlockState _bs = targetState;

        for (Property<?> _propertyOld : _bso.getProperties()) {
            Property<?> _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
            if (_propertyNew != null) {
                _bs = copyProperty(_bso, _bs, _propertyOld, _propertyNew);
            }
        }

        CompoundTag _bnbt = null;
        BlockEntity _oldBe = world.getBlockEntity(_bp);

        if (_oldBe != null) {
            _bnbt = _oldBe.saveWithFullMetadata(world.registryAccess());
            _oldBe.setRemoved();
        }

        world.setBlock(_bp, _bs, 3);

        if (_bnbt != null && world instanceof Level _level) {
            BlockEntity _newBe = BlockEntity.loadStatic(_bp, _bs, _bnbt, _level.registryAccess());
            if (_newBe != null) {
                _level.setBlockEntity(_newBe);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> BlockState copyProperty(BlockState from, BlockState to, Property<?> srcProp, Property<?> targetProp) {
        try {
            return to.setValue((Property<T>) targetProp, from.getValue((Property<T>) srcProp));
        } catch (Exception e) {
            return to;
        }
    }
}