package dev.thenu.ReddensStoneLanternReconstructed.world.blockBreakProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode.CheckGamemode;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;

public class TripleBlockBreakProcedure {
    private static final TagKey<Block> IS_TOP = TagKey.of(RegistryKeys.BLOCK, Identifier.of("reddensstonelantern", "is_top"));
    private static final TagKey<Block> IS_MID = TagKey.of(RegistryKeys.BLOCK, Identifier.of("reddensstonelantern", "is_mid"));
    private static final TagKey<Block> IS_BASE = TagKey.of(RegistryKeys.BLOCK, Identifier.of("reddensstonelantern", "is_base"));

    public TripleBlockBreakProcedure() {
    }

    public static void execute(WorldAccess world, double x, double y, double z, BlockState blockstate, Entity entity) {
        if (entity != null) {
            BlockPos currentPos = BlockPos.ofFloored(x, y, z);

            // Behavior when the broken block is the top component
            if (blockstate.isIn(IS_TOP)) {
                world.setBlockState(currentPos.down(), Blocks.AIR.getDefaultState(), 3);
                world.setBlockState(currentPos.down(2), Blocks.AIR.getDefaultState(), 3);

                if (!CheckGamemode.checkGamemode(entity) && world instanceof ServerWorld serverWorld) {
                    ItemEntity entityToSpawn = new ItemEntity(serverWorld, x, y - 2.0D, z, new ItemStack(BlockFile.BIG_STONE_LANTERN_MID));
                    entityToSpawn.setPickupDelay(10);
                    serverWorld.spawnEntity(entityToSpawn);
                }
            }

            // Behavior when the broken block is the middle component
            if (blockstate.isIn(IS_MID)) {
                world.setBlockState(currentPos.up(), Blocks.AIR.getDefaultState(), 3);
                world.setBlockState(currentPos.down(), Blocks.AIR.getDefaultState(), 3);

                if (!CheckGamemode.checkGamemode(entity) && world instanceof ServerWorld serverWorld) {
                    ItemEntity entityToSpawn = new ItemEntity(serverWorld, x, y - 1.0D, z, new ItemStack(BlockFile.BIG_STONE_LANTERN_MID));
                    entityToSpawn.setPickupDelay(10);
                    serverWorld.spawnEntity(entityToSpawn);
                }
            }

            // Behavior when the broken block is the bottom component
            if (blockstate.isIn(IS_BASE)) {
                world.setBlockState(currentPos.up(), Blocks.AIR.getDefaultState(), 3);
                world.setBlockState(currentPos.up(2), Blocks.AIR.getDefaultState(), 3);

                if (!CheckGamemode.checkGamemode(entity) && world instanceof ServerWorld serverWorld) {
                    ItemEntity entityToSpawn = new ItemEntity(serverWorld, x, y, z, new ItemStack(BlockFile.BIG_STONE_LANTERN_MID));
                    entityToSpawn.setPickupDelay(10);
                    serverWorld.spawnEntity(entityToSpawn);
                }
            }
        }
    }
}