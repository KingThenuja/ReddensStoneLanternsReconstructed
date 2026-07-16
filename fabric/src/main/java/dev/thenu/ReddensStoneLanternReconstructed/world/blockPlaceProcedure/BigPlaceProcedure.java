package dev.thenu.ReddensStoneLanternReconstructed.world.blockPlaceProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode.CheckGamemode;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BigPlaceProcedure {
    public BigPlaceProcedure() {
    }

    public static void execute(LevelAccessor level, double x, double y, double z, Entity entity) {
        if (entity != null) {
            BlockPos targetPos = BlockPos.containing(x, y, z);
            BlockPos basePos = BlockPos.containing(x, y, z);
            BlockPos midPos = basePos.above();
            BlockPos topPos = basePos.above(2);

            // Verify there is enough empty clearance above to place the multi-block lantern
            if (level.isEmptyBlock(midPos) && level.isEmptyBlock(topPos)) {
                BlockState baseState = BlockFile.BIG_STONE_LANTERN_BASE.defaultBlockState();

                // Snapshot original block entity metadata if present
                BlockEntity oldBlockEntity = level.getBlockEntity(basePos);
                CompoundTag blockEntityData = null;
                if (oldBlockEntity != null) {
                    blockEntityData = oldBlockEntity.saveWithFullMetadata(level.registryAccess());
                    oldBlockEntity.setRemoved();
                }

                level.setBlock(basePos, baseState, 3);

                if (blockEntityData != null && level instanceof Level worldLevel) {
                    BlockEntity newBlockEntity = BlockEntity.loadStatic(targetPos, baseState, blockEntityData, level.registryAccess());
                    if (newBlockEntity != null) {
                        worldLevel.onBlockEntityAdded(newBlockEntity);
                    }
                }

                // Populate structural middle and lit top segments
                level.setBlock(midPos, BlockFile.BIG_STONE_LANTERN_MID.defaultBlockState(), 3);
                level.setBlock(topPos, BlockFile.BIG_STONE_LANTERN_TOP_LIGHT.defaultBlockState(), 3);

                // Play ignition audio effects across both logical threads
                if (level instanceof Level worldLevel) {
                    worldLevel.playSound(null, targetPos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 0.5F, 1.0F);
                }
            } else if (CheckGamemode.checkGamemode(entity)) {
                // Refund structural items or clear space if placement is obstructed in survival
                if (level instanceof ServerLevel serverLevel) {
                    ItemEntity droppedItem = new ItemEntity(serverLevel, x, y, z, new ItemStack(BlockFile.BIG_STONE_LANTERN_MID));
                    droppedItem.setPickUpDelay(10);
                    serverLevel.addFreshEntity(droppedItem);
                } else {
                    level.setBlock(basePos, Blocks.AIR.defaultBlockState(), 3);
                }
            }
        }
    }
}