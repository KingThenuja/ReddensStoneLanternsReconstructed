//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package dev.thenu.ReddensStoneLanternReconstructed.networking.tickingProcedure;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

public class TripleBlockMidTickProcedure {
    public TripleBlockMidTickProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        boolean IsAlone = false;
        if (!world.getBlockState(BlockPos.containing(x, y + (double)1.0F, z)).is(BlockTags.create(ResourceLocation.parse("reddensstonelantern:is_top")))) {
            world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
        }

        if (!world.getBlockState(BlockPos.containing(x, y - (double)1.0F, z)).is(BlockTags.create(ResourceLocation.parse("reddensstonelantern:is_base")))) {
            world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
        }

    }
}
