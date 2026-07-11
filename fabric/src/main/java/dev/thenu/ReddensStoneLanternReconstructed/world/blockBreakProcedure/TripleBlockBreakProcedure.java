package dev.thenu.ReddensStoneLanternReconstructed.world.blockBreakProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode.CheckGamemode;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

public class TripleBlockBreakProcedure {
    private static final TagKey<Block> IS_TOP = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("reddensstonelantern", "is_top"));
    private static final TagKey<Block> IS_MID = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("reddensstonelantern", "is_mid"));
    private static final TagKey<Block> IS_BASE = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("reddensstonelantern", "is_base"));

    public TripleBlockBreakProcedure() {
    }

    public static void execute(LevelAccessor level, double x, double y, double z, BlockState blockstate, Entity entity) {
        if (entity != null) {
            BlockPos currentPos = BlockPos.containing(x, y, z);
            GameEvent.Context context = GameEvent.Context.of(entity);

            if (blockstate.is(IS_TOP)) {
                level.setBlock(currentPos.below(), Blocks.AIR.defaultBlockState(), 3);
                level.setBlock(currentPos.below(2), Blocks.AIR.defaultBlockState(), 3);

                if (!CheckGamemode.checkGamemode(entity) && level instanceof ServerLevel serverLevel) {
                    ItemEntity entityToSpawn = new ItemEntity(serverLevel, x, y - 2.0D, z, new ItemStack(BlockFile.BIG_STONE_LANTERN_MID));
                    entityToSpawn.setPickUpDelay(10);
                    serverLevel.addFreshEntity(entityToSpawn);
                }
            }

            if (blockstate.is(IS_MID)) {
                level.setBlock(currentPos.above(), Blocks.AIR.defaultBlockState(), 3);
                level.setBlock(currentPos.below(), Blocks.AIR.defaultBlockState(), 3);

                if (!CheckGamemode.checkGamemode(entity) && level instanceof ServerLevel serverLevel) {
                    ItemEntity entityToSpawn = new ItemEntity(serverLevel, x, y - 1.0D, z, new ItemStack(BlockFile.BIG_STONE_LANTERN_MID));
                    entityToSpawn.setPickUpDelay(10);
                    serverLevel.addFreshEntity(entityToSpawn);
                }
            }

            if (blockstate.is(IS_BASE)) {
                level.setBlock(currentPos.above(), Blocks.AIR.defaultBlockState(), 3);
                level.setBlock(currentPos.above(2), Blocks.AIR.defaultBlockState(), 3);

                if (!CheckGamemode.checkGamemode(entity) && level instanceof ServerLevel serverLevel) {
                    ItemEntity entityToSpawn = new ItemEntity(serverLevel, x, y, z, new ItemStack(BlockFile.BIG_STONE_LANTERN_MID));
                    entityToSpawn.setPickUpDelay(10);
                    serverLevel.addFreshEntity(entityToSpawn);
                }
            }
        }
    }
}