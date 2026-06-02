//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package dev.thenu.ReddensStoneLanternReconstructed.world.blockPlaceProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode.CheckGamemode;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;

public class BroadPlaceProcedure {
    public BroadPlaceProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (world.isEmptyBlock(BlockPos.containing(x, y + (double)1.0F, z))) {
                world.setBlock(BlockPos.containing(x, y + (double)1.0F, z), ((Block) BlockFile.BROAD_STONE_LANTERN_TOP_LIGHT.get()).defaultBlockState(), 3);
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.flintandsteel.use")), SoundSource.BLOCKS, 0.5F, 1.0F);
                    } else {
                        _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.flintandsteel.use")), SoundSource.BLOCKS, 0.5F, 1.0F, false);
                    }
                }
            } else if ((CheckGamemode.checkGamemode(entity))) {
                BlockPos _pos = BlockPos.containing(x, y, z);
                Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), (BlockEntity)null);
                world.destroyBlock(_pos, false);
            } else {
                world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            }

        }
    }
}
