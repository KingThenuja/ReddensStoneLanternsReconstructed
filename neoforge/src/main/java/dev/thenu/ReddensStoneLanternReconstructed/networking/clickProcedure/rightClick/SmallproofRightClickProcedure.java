package dev.thenu.ReddensStoneLanternReconstructed.networking.clickProcedure.rightClick;

import dev.thenu.ReddensStoneLanternReconstructed.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.Blocks.SmallProofLanternBlockFile;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class SmallproofRightClickProcedure {

    public SmallproofRightClickProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        BlockPos _bp = BlockPos.containing(x, y, z);
        BlockState _bso = world.getBlockState(_bp);
        BlockState _bs;

        // 1. Toggle between Light and Dark variants via your SmallProof registry file
        if (_bso.getBlock() == SmallProofLanternBlockFile.SMALLPROOF_STONE_LANTERN_LIGHT.get()) {
            _bs = SmallProofLanternBlockFile.SMALLPROOF_STONE_LANTERN_DARK.get().defaultBlockState();
        } else {
            _bs = SmallProofLanternBlockFile.SMALLPROOF_STONE_LANTERN_LIGHT.get().defaultBlockState();
        }

        // 2. Type-safe block property mapping (fixes raw-type compiler warnings)
        for (Property<?> _propertyOld : _bso.getProperties()) {
            Property<?> _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
            if (_propertyNew != null) {
                _bs = copyProperty(_bso, _bs, _propertyOld, _propertyNew);
            }
        }

        CompoundTag _bnbt = null;
        BlockEntity _oldBe = world.getBlockEntity(_bp);

        // 3. Capture and detach existing Block Entity data before state mutation
        if (_oldBe != null) {
            _bnbt = _oldBe.saveWithFullMetadata(world.registryAccess());
            _oldBe.setRemoved();
        }

        // 4. Update block layout coordinates inside the world context
        world.setBlock(_bp, _bs, 3);

        // 5. Safely recreate block entity data using official Mojang static loader hooks
        if (_bnbt != null && world instanceof Level _level) {
            BlockEntity _newBe = BlockEntity.loadStatic(_bp, _bs, _bnbt, _level.registryAccess());
            if (_newBe != null) {
                _level.setBlockEntity(_newBe);
            }
        }

        // 6. Direct sound playing routing using core compiled sound event references
        if (world instanceof Level _level) {
            _level.playSound((Player) null, _bp, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 0.5F, 1.0F);
        }
    }

    // Helper method to safely pass state property configurations without generic type errors
    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> BlockState copyProperty(BlockState from, BlockState to, Property<?> srcProp, Property<?> targetProp) {
        try {
            return to.setValue((Property<T>) targetProp, from.getValue((Property<T>) srcProp));
        } catch (Exception e) {
            return to;
        }
    }
}