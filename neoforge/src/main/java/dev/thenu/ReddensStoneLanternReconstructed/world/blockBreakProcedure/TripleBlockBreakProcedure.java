//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package dev.thenu.ReddensStoneLanternReconstructed.world.blockBreakProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.Blocks.BigStoneLanternBlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode.CheckGamemode;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class TripleBlockBreakProcedure {
    public TripleBlockBreakProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
        if (entity != null) {
            if (blockstate.is(BlockTags.create(ResourceLocation.parse("reddensstonelantern:is_top")))) {
                world.setBlock(BlockPos.containing(x, y - (double)1.0F, z), Blocks.AIR.defaultBlockState(), 3);
                world.setBlock(BlockPos.containing(x, y - (double)2.0F, z), Blocks.AIR.defaultBlockState(), 3);
                if (!(CheckGamemode.checkGamemode(entity) && world instanceof ServerLevel)) {
                    ServerLevel _level = (ServerLevel)world;
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y - (double)2.0F, z, new ItemStack((ItemLike) BigStoneLanternBlockFile.BIG_STONE_LANTERN_MID.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }

            if (blockstate.is(BlockTags.create(ResourceLocation.parse("reddensstonelantern:is_mid")))) {
                world.setBlock(BlockPos.containing(x, y + (double)1.0F, z), Blocks.AIR.defaultBlockState(), 3);
                world.setBlock(BlockPos.containing(x, y - (double)1.0F, z), Blocks.AIR.defaultBlockState(), 3);
                if (!(CheckGamemode.checkGamemode(entity) && world instanceof ServerLevel)) {
                    ServerLevel _level = (ServerLevel)world;
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y - (double)1.0F, z, new ItemStack((ItemLike) BigStoneLanternBlockFile.BIG_STONE_LANTERN_MID.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }

            if (blockstate.is(BlockTags.create(ResourceLocation.parse("reddensstonelantern:is_base")))) {
                world.setBlock(BlockPos.containing(x, y + (double)1.0F, z), Blocks.AIR.defaultBlockState(), 3);
                world.setBlock(BlockPos.containing(x, y + (double)2.0F, z), Blocks.AIR.defaultBlockState(), 3);
                if (!(CheckGamemode.checkGamemode(entity) && world instanceof ServerLevel)) {
                    ServerLevel _level = (ServerLevel)world;
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike) BigStoneLanternBlockFile.BIG_STONE_LANTERN_MID.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }

        }
    }
}
