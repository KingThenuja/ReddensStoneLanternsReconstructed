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

public class TripleBlockTickProcedure {
    public TripleBlockTickProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        boolean IsAlone = false;
        if (!world.getBlockState(BlockPos.containing(x, y + (double)1.0F, z)).is(BlockTags.create(ResourceLocation.parse("reddensstonelantern:is_top"))) && !world.getBlockState(BlockPos.containing(x, y + (double)1.0F, z)).is(BlockTags.create(ResourceLocation.parse("reddensstonelantern:is_mid"))) && !world.getBlockState(BlockPos.containing(x, y - (double)1.0F, z)).is(BlockTags.create(ResourceLocation.parse("reddensstonelantern:is_mid"))) && !world.getBlockState(BlockPos.containing(x, y - (double)1.0F, z)).is(BlockTags.create(ResourceLocation.parse("reddensstonelantern:is_base")))) {
            world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
        }

    }
}
