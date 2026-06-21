package dev.thenu.ReddensStoneLanternReconstructed.world.blockPlaceProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.Blocks.BigStoneLanternBlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode.CheckGamemode;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
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
            // Check if there is clear space above to erect the multi-block lantern structure
            if (world.isEmptyBlock(BlockPos.containing(x, y + 1.0D, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 2.0D, z))) {
                BlockPos _bp = BlockPos.containing(x, y, z);
                BlockState _bs = ((Block) BigStoneLanternBlockFile.BIG_STONE_LANTERN_BASE.get()).defaultBlockState();

                CompoundTag _bnbt = null;
                BlockEntity _oldBe = world.getBlockEntity(_bp);

                // 1. Capture and isolate pre-existing NBT metadata before mutating coordinates
                if (_oldBe != null) {
                    _bnbt = _oldBe.saveWithFullMetadata(world.registryAccess());
                    _oldBe.setRemoved();
                }

                // 2. Commit block placement layout transformations
                world.setBlock(_bp, _bs, 3);
                world.setBlock(BlockPos.containing(x, y + 1.0D, z), BigStoneLanternBlockFile.BIG_STONE_LANTERN_MID.get().defaultBlockState(), 3);
                world.setBlock(BlockPos.containing(x, y + 2.0D, z), ((Block) BigStoneLanternBlockFile.BIG_STONE_LANTERN_TOP_LIGHT.get()).defaultBlockState(), 3);

                // 3. Re-inject block entity context data via Mojang static loader hooks
                if (_bnbt != null && world instanceof Level _level) {
                    BlockEntity _newBe = BlockEntity.loadStatic(_bp, _bs, _bnbt, _level.registryAccess());
                    if (_newBe != null) {
                        _level.setBlockEntity(_newBe);
                    }
                }

                // 4. Trigger audio effect using core compiled sound event references
                if (world instanceof Level _level) {
                    _level.playSound((Player) null, BlockPos.containing(x, y + 2.0D, z), SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 0.5F, 1.0F);
                }

            } else if (CheckGamemode.checkGamemode(entity)) {
                // If the space is blocked and gamemode criteria is met, handle drops safely
                if (world instanceof ServerLevel _serverLevel) {
                    ItemEntity entityToSpawn = new ItemEntity(_serverLevel, x, y, z, new ItemStack((ItemLike) BigStoneLanternBlockFile.BIG_STONE_LANTERN_MID.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _serverLevel.addFreshEntity(entityToSpawn);
                } else {
                    world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
                }
            }
        }
    }
}