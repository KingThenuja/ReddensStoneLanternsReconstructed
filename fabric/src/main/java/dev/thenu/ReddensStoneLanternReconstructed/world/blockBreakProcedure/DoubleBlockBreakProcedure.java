package dev.thenu.ReddensStoneLanternReconstructed.world.blockBreakProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode.CheckGamemode;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;

public class DoubleBlockBreakProcedure {
    private static final TagKey<Block> IS_TOP = TagKey.of(RegistryKeys.BLOCK, net.minecraft.util.Identifier.of("reddensstonelantern", "is_top"));
    private static final TagKey<Block> IS_BASE = TagKey.of(RegistryKeys.BLOCK, net.minecraft.util.Identifier.of("reddensstonelantern", "is_base"));

    public DoubleBlockBreakProcedure() {
    }

    public static void execute(WorldAccess world, double x, double y, double z, BlockState blockstate, Entity entity) {
        if (entity != null) {
            BlockPos currentPos = BlockPos.ofFloored(x, y, z);

            // Behavior when the broken block is the top half
            if (blockstate.isIn(IS_TOP)) {
                BlockPos targetPos = currentPos.down();
                if (!CheckGamemode.checkGamemode(entity)) {
                    Block.dropStacks(world.getBlockState(targetPos), (net.minecraft.world.World) world, targetPos, null);
                    world.breakBlock(targetPos, false);
                } else {
                    world.setBlockState(targetPos, Blocks.AIR.getDefaultState(), 3);
                }

                // Plays block break particles/sounds (ID 2001) using Andesite Wall properties
                world.syncWorldEvent(2001, targetPos, Block.getRawIdFromState(Blocks.ANDESITE_WALL.getDefaultState()));
            }

            // Behavior when the broken block is the bottom half
            if (blockstate.isIn(IS_BASE)) {
                if (!CheckGamemode.checkGamemode(entity)) {
                    Block.dropStacks(world.getBlockState(currentPos), (net.minecraft.world.World) world, currentPos, null);
                    world.breakBlock(currentPos, false);
                } else {
                    world.setBlockState(currentPos, Blocks.AIR.getDefaultState(), 3);
                }

                BlockPos targetPosAbove = currentPos.up();
                // Plays block break particles/sounds (ID 2001) for the missing upper component
                world.syncWorldEvent(2001, targetPosAbove, Block.getRawIdFromState(Blocks.ANDESITE_WALL.getDefaultState()));
            }
        }
    }
}