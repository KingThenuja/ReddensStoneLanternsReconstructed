package dev.thenu.ReddensStoneLanternReconstructed.world.blockPlaceProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.Blocks.MediumLanternBlockFile;
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

public class MediumPlaceProcedure {
    public MediumPlaceProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (world.isEmptyBlock(BlockPos.containing(x, y + 1.0D, z))) {
                world.setBlock(BlockPos.containing(x, y + 1.0D, z), ((Block) MediumLanternBlockFile.MEDIUM_STONE_LANTERN_TOP_LIGHT.get()).defaultBlockState(), 3);

                if (world instanceof Level _level) {
                    SoundEvent flintSound = BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.flintandsteel.use"))
                            .map(net.minecraft.core.Holder::value)
                            .orElse(null);

                    if (flintSound != null) {
                        if (!_level.isClientSide()) {
                            _level.playSound((Player)null, BlockPos.containing(x, y, z), flintSound, SoundSource.BLOCKS, 0.3F, 1.0F);
                        } else {
                            _level.playLocalSound(x, y, z, flintSound, SoundSource.BLOCKS, 0.3F, 1.0F, false);
                        }
                    }
                }
            } else if (CheckGamemode.checkGamemode(entity)) {
                BlockPos _pos = BlockPos.containing(x, y, z);
                // Safe cast ensures Level is provided instead of LevelAccessor
                if (world instanceof Level _level) {
                    Block.dropResources(world.getBlockState(_pos), _level, BlockPos.containing(x, y, z), (BlockEntity)null);
                }
                world.destroyBlock(_pos, false);
            } else {
                world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            }
        }
    }
}