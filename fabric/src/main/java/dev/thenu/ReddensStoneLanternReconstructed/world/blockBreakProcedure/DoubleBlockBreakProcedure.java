package dev.thenu.ReddensStoneLanternReconstructed.world.blockBreakProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode.CheckGamemode;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

public class DoubleBlockBreakProcedure {
    private static final TagKey<Block> IS_TOP = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("reddensstonelantern", "is_top"));
    private static final TagKey<Block> IS_BASE = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("reddensstonelantern", "is_base"));

    public DoubleBlockBreakProcedure() {
    }

    public static void execute(LevelAccessor level, double x, double y, double z, BlockState blockstate, Entity entity) {
        if (entity != null) {

            BlockPos currentPos = BlockPos.containing(x, y, z);
            GameEvent.Context context = GameEvent.Context.of(entity);

            if (blockstate.is(IS_TOP)) {
                BlockPos targetPos = currentPos.below();
                if (!CheckGamemode.checkGamemode(entity)) {
                    Block.dropResources(level.getBlockState(targetPos), level, targetPos, null);
                    level.destroyBlock(targetPos, false);
                } else {
                    level.setBlock(targetPos, Blocks.AIR.defaultBlockState(), 3);
                }

                level.gameEvent(GameEvent.BLOCK_DESTROY, targetPos, context);
            }

            if (blockstate.is(IS_BASE)) {
                if (!CheckGamemode.checkGamemode(entity)) {
                    Block.dropResources(level.getBlockState(currentPos), level, currentPos, null);
                    level.destroyBlock(currentPos, false);
                } else {
                    level.setBlock(currentPos, Blocks.AIR.defaultBlockState(), 3);
                }

                BlockPos targetPosAbove = currentPos.above();
                level.gameEvent(GameEvent.BLOCK_DESTROY, targetPosAbove, context);
            }
        }
    }
}