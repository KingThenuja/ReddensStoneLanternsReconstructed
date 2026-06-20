package dev.thenu.ReddensStoneLanternReconstructed.world.blockPlaceProcedure;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode.CheckGamemode;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class MediumPlaceProcedure {
    public MediumPlaceProcedure() {
    }

    public static void execute(WorldAccess world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            BlockPos currentPos = BlockPos.ofFloored(x, y, z);
            BlockPos topPos = currentPos.up();

            // Check if there is space directly above to place the medium lantern top component
            if (world.isAir(topPos)) {
                world.setBlockState(topPos, BlockFile.MEDIUM_STONE_LANTERN_TOP_LIGHT.getDefaultState(), 3);

                if (world instanceof World level) {
                    level.playSound(null, currentPos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 0.5F, 1.0F);
                }
            } else if (CheckGamemode.checkGamemode(entity)) {
                // If obstructed in survival mode, break the base block and drop items
                Block.dropStacks(world.getBlockState(currentPos), (World) world, currentPos, null);
                world.breakBlock(currentPos, false);
            } else {
                // If obstructed in creative mode, simply erase the base block
                world.setBlockState(currentPos, Blocks.AIR.getDefaultState(), 3);
            }
        }
    }
}