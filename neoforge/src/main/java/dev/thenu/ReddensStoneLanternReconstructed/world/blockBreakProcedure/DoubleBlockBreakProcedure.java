package dev.thenu.ReddensStoneLanternReconstructed.world.blockBreakProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode.CheckGamemode;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class DoubleBlockBreakProcedure {
    public DoubleBlockBreakProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
        if (entity != null) {
            if (blockstate.is(BlockTags.create(Identifier.parse("reddensstonelantern:is_top")))) {
                if (!(CheckGamemode.checkGamemode(entity))) {
                    BlockPos _pos = BlockPos.containing(x, y - (double)1.0F, z);
                    Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y - (double)1.0F, z), null);
                    world.destroyBlock(_pos, false);
                } else {
                    world.setBlock(BlockPos.containing(x, y - (double)1.0F, z), Blocks.AIR.defaultBlockState(), 3);
                }

                world.levelEvent(2001, BlockPos.containing(x, y - (double)1.0F, z), Block.getId(Blocks.ANDESITE_WALL.defaultBlockState()));
            }

            if (blockstate.is(BlockTags.create(Identifier.parse("reddensstonelantern:is_base")))) {
                if (!(CheckGamemode.checkGamemode(entity))) {
                    BlockPos _pos = BlockPos.containing(x, y, z);
                    Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
                    world.destroyBlock(_pos, false);
                } else {
                    world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
                }

                world.levelEvent(2001, BlockPos.containing(x, y + (double)1.0F, z), Block.getId(Blocks.ANDESITE_WALL.defaultBlockState()));
            }

        }
    }
}
