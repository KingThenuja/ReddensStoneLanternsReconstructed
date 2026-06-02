package dev.thenu.ReddensStoneLanternReconstructed.networking.tickingProcedure;

import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;

public class TripleBlockMidTickProcedure {
    // Custom block tag references for 1.21.1 Fabric
    private static final TagKey<Block> IS_TOP = TagKey.of(RegistryKeys.BLOCK, Identifier.of("reddensstonelantern", "is_top"));
    private static final TagKey<Block> IS_BASE = TagKey.of(RegistryKeys.BLOCK, Identifier.of("reddensstonelantern", "is_base"));

    public TripleBlockMidTickProcedure() {
    }

    public static void execute(WorldAccess world, double x, double y, double z) {
        BlockPos bp = BlockPos.ofFloored(x, y, z);

        // Break the middle block if there isn't a valid top block above OR a valid base block below
        if (!world.getBlockState(bp.up()).isIn(IS_TOP) || !world.getBlockState(bp.down()).isIn(IS_BASE)) {
            world.setBlockState(bp, Blocks.AIR.getDefaultState(), 3);
        }
    }
}