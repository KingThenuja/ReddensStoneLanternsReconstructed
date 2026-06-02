package dev.thenu.ReddensStoneLanternReconstructed.world.blockPlaceProcedure;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class LanternPlaceSoundProcedure {
    public LanternPlaceSoundProcedure() {
    }

    public static void execute(WorldAccess world, double x, double y, double z) {
        if (world instanceof World level) {
            BlockPos bp = BlockPos.ofFloored(x, y, z);

            if (!level.isClient()) {
                // Server-side audio dispatching (broadcasts to all nearby players except the first argument)
                level.playSound((PlayerEntity) null, bp, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 0.3F, 1.0F);
            } else {
                // Client-side local audio playback
                level.playSound(x, y, z, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 0.3F, 1.0F, false);
            }
        }
    }
}