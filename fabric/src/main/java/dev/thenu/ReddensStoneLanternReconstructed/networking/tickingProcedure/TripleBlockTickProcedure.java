package dev.thenu.ReddensStoneLanternReconstructed.networking.tickingProcedure;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class TripleBlockTickProcedure {
    // Custom block tag references for 26.1 Fabric
    private static final TagKey<Block> IS_TOP = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("reddensstonelantern", "is_top"));
    private static final TagKey<Block> IS_MID = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("reddensstonelantern", "is_mid"));
    private static final TagKey<Block> IS_BASE = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("reddensstonelantern", "is_base"));

    public TripleBlockTickProcedure() {
    }

    public static void execute(LevelAccessor levelAccessor, double x, double y, double z) {
        BlockPos bp = BlockPos.containing(x, y, z);

        // Check structural requirements for neighboring positions above and below
        if (!levelAccessor.getBlockState(bp.above()).is(IS_TOP) &&
                !levelAccessor.getBlockState(bp.above()).is(IS_MID) &&
                !levelAccessor.getBlockState(bp.below()).is(IS_MID) &&
                !levelAccessor.getBlockState(bp.below()).is(IS_BASE)) {

            // Revert back to air if none of the valid connections exist
            levelAccessor.setBlock(bp, Blocks.AIR.defaultBlockState(), 3);
        }
    }
}