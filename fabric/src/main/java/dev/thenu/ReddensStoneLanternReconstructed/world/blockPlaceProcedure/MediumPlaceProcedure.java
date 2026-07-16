package dev.thenu.ReddensStoneLanternReconstructed.world.blockPlaceProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode.CheckGamemode;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class MediumPlaceProcedure {
    public MediumPlaceProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            BlockPos currentPos = BlockPos.containing(x, y, z);
            BlockPos topPos = currentPos.above();

            // Check if there is space directly above to place the medium lantern top component
            if (world.isEmptyBlock(topPos)) {
                world.setBlock(topPos, BlockFile.MEDIUM_STONE_LANTERN_TOP_LIGHT.defaultBlockState(), 3);

                if (world instanceof Level level) {
                    level.playSound(null, currentPos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 0.5F, 1.0F);
                }
            } else if (CheckGamemode.checkGamemode(entity)) {
                // If obstructed in survival mode, break the base block and drop items
                Block.dropResources(world.getBlockState(currentPos), (Level) world, currentPos, null);
                world.destroyBlock(currentPos, false);
            } else {
                // If obstructed in creative mode, simply erase the base block
                world.setBlock(currentPos, Blocks.AIR.defaultBlockState(), 3);
            }
        }
    }
}