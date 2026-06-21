package dev.thenu.ReddensStoneLanternReconstructed.world.blockPlaceProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode.CheckGamemode;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class BigPlaceProcedure {
    public BigPlaceProcedure() {
    }

    public static void execute(WorldAccess world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            BlockPos bp = BlockPos.ofFloored(x, y, z);
            BlockPos basePos = BlockPos.ofFloored(x, y, z);
            BlockPos midPos = basePos.up();
            BlockPos topPos = basePos.up(2);

            // Verify there is enough empty clearance above to place the multi-block lantern
            if (world.isAir(midPos) && world.isAir(topPos)) {
                BlockState bs = BlockFile.BIG_STONE_LANTERN_BASE.getDefaultState();

                // Snapshot original block entity metadata if present
                BlockEntity be = world.getBlockEntity(basePos);
                NbtCompound bnbt = null;
                if (be != null) {
                    bnbt = be.createNbt(world.getRegistryManager());
                    be.markRemoved();
                }

                world.setBlockState(basePos, bs, 3);

                if (bnbt != null && world instanceof World level) {
                    BlockEntity newBe = BlockEntity.createFromNbt(bp, bs, bnbt, world.getRegistryManager());
                    if (newBe != null) {
                        level.addBlockEntity(newBe);
                    }
                }

                // Populate structural middle and lit top segments
                world.setBlockState(midPos, BlockFile.BIG_STONE_LANTERN_MID.getDefaultState(), 3);
                world.setBlockState(topPos, BlockFile.BIG_STONE_LANTERN_TOP_LIGHT.getDefaultState(), 3);

                // Play ignition audio effects across both logical threads
                if (world instanceof World level) {
                    level.playSound(null, bp, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 0.5F, 1.0F);
                }
            } else if (CheckGamemode.checkGamemode(entity)) {
                // Refund structural items or clear space if placement is obstructed in survival
                if (world instanceof ServerWorld serverWorld) {
                    ItemEntity entityToSpawn = new ItemEntity(serverWorld, x, y, z, new ItemStack(BlockFile.BIG_STONE_LANTERN_MID));
                    entityToSpawn.setPickupDelay(10);
                    serverWorld.spawnEntity(entityToSpawn);
                } else {
                    world.setBlockState(basePos, Blocks.AIR.getDefaultState(), 3);
                }
            }
        }
    }
}