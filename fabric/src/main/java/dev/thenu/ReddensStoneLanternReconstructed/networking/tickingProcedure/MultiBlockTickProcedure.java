package dev.thenu.ReddensStoneLanternReconstructed.networking.tickingProcedure;

import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;

public class MultiBlockTickProcedure {
    private static final TagKey<Block> IS_TOP = TagKey.of(RegistryKeys.BLOCK, Identifier.of("reddensstonelantern", "is_top"));
    private static final TagKey<Block> IS_BASE = TagKey.of(RegistryKeys.BLOCK, Identifier.of("reddensstonelantern", "is_base"));

    public MultiBlockTickProcedure() {
    }

    public static void execute(WorldAccess world, double x, double y, double z) {
        BlockPos bp = BlockPos.ofFloored(x, y, z);

        // Check the block state directly above and directly below for mod tags
        if (!world.getBlockState(bp.up()).isIn(IS_TOP) && !world.getBlockState(bp.down()).isIn(IS_BASE)) {
            // Break the block into air if it doesn't satisfy structural requirements
            world.setBlockState(bp, Blocks.AIR.getDefaultState(), 3);
        }
    }
}