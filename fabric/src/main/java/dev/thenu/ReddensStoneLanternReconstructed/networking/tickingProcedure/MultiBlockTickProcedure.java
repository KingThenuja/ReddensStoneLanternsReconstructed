package dev.thenu.ReddensStoneLanternReconstructed.networking.tickingProcedure;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class MultiBlockTickProcedure {
    private static final TagKey<Block> IS_TOP = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("reddensstonelantern", "is_top"));
    private static final TagKey<Block> IS_BASE = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("reddensstonelantern", "is_base"));

    public MultiBlockTickProcedure() {
    }

    public static void execute(LevelAccessor levelAccessor, double x, double y, double z) {
        BlockPos bp = BlockPos.containing(x, y, z);

        // Check the block state directly above and directly below for mod tags
        if (!levelAccessor.getBlockState(bp.above()).is(IS_TOP) && !levelAccessor.getBlockState(bp.below()).is(IS_BASE)) {
            // Break the block into air if it doesn't satisfy structural requirements
            levelAccessor.setBlock(bp, Blocks.AIR.defaultBlockState(), 3);
        }
    }
}