package dev.thenu.ReddensStoneLanternReconstructed.networking.clickProcedure.rightClick;

import dev.thenu.ReddensStoneLanternReconstructed.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.Blocks.BroadLanternBlockFile;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class BroadRightClickProcedure {
    public BroadRightClickProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        BlockPos _bp = BlockPos.containing(x, y, z);
        BlockState _bso = world.getBlockState(_bp);
        BlockState _bs;

        if (_bso.getBlock() == BroadLanternBlockFile.BROAD_STONE_LANTERN_TOP_LIGHT.get()) {
            _bs = BroadLanternBlockFile.BROAD_STONE_LANTERN_TOP_DARK.get().defaultBlockState();
        } else {
            _bs = BroadLanternBlockFile.BROAD_STONE_LANTERN_TOP_LIGHT.get().defaultBlockState();
        }

        for(Property<?> _propertyOld : _bso.getProperties()) {
            Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
            if (_propertyNew != null && _bs.getValue(_propertyNew) != null) {
                try {
                    _bs = (BlockState)_bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
                } catch (Exception var17) {
                }
            }
        }

        BlockEntity _be = world.getBlockEntity(_bp);
        CompoundTag _bnbt = null;
        if (_be != null) {
            _bnbt = _be.saveWithFullMetadata(world.registryAccess());
            _be.setRemoved();
        }

        world.setBlock(_bp, _bs, 3);
        if (_bnbt != null) {
            _be = world.getBlockEntity(_bp);
            if (_be != null) {
                try {
                    _be.loadWithComponents(_bnbt, world.registryAccess());
                } catch (Exception var16) {
                }
            }
        }

        if (world instanceof Level) {
            Level _level = (Level)world;
            SoundEvent flintSound = BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.flintandsteel.use"))
                    .map(net.minecraft.core.Holder::value)
                    .orElse(null);

            if (flintSound != null) {
                if (!_level.isClientSide()) {
                    _level.playSound((Player)null, _bp, flintSound, SoundSource.BLOCKS, 0.5F, 1.0F);
                } else {
                    _level.playLocalSound(x, y, z, flintSound, SoundSource.BLOCKS, 0.5F, 1.0F, false);
                }
            }
        }
    }
}