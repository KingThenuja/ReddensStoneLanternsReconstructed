package dev.thenu.ReddensStoneLanternReconstructed.world.blockPlaceProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.Blocks.BigStoneLanternBlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode.CheckGamemode;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BigPlaceProcedure {
    public BigPlaceProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (world.isEmptyBlock(BlockPos.containing(x, y + 1.0D, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 2.0D, z))) {
                BlockPos _bp = BlockPos.containing(x, y, z);
                BlockState _bs = ((Block) BigStoneLanternBlockFile.BIG_STONE_LANTERN_BASE.get()).defaultBlockState();
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
                        } catch (Exception var13) {
                        }
                    }
                }

                world.setBlock(BlockPos.containing(x, y + 1.0D, z), BigStoneLanternBlockFile.BIG_STONE_LANTERN_MID.get().defaultBlockState(), 3);
                world.setBlock(BlockPos.containing(x, y + 2.0D, z), ((Block) BigStoneLanternBlockFile.BIG_STONE_LANTERN_TOP_LIGHT.get()).defaultBlockState(), 3);

                if (world instanceof Level) {
                    Level _level = (Level)world;
                    SoundEvent flintSound = BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.flintandsteel.use"))
                            .map(net.minecraft.core.Holder::value)
                            .orElse(null);

                    if (flintSound != null) {
                        if (!_level.isClientSide()) {
                            _level.playSound((Player)null, BlockPos.containing(x, y + 2.0D, z), flintSound, SoundSource.BLOCKS, 0.5F, 1.0F);
                        } else {
                            _level.playLocalSound(x, y + 2.0D, z, flintSound, SoundSource.BLOCKS, 0.5F, 1.0F, false);
                        }
                    }
                }
            } else if (CheckGamemode.checkGamemode(entity)) {
                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel) world;
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike) BigStoneLanternBlockFile.BIG_STONE_LANTERN_MID.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                } else {
                    world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
                }
            }
        }
    }
}