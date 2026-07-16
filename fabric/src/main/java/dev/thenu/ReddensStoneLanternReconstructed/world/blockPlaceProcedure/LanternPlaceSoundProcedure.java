package dev.thenu.ReddensStoneLanternReconstructed.world.blockPlaceProcedure;


import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class LanternPlaceSoundProcedure {
    public LanternPlaceSoundProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level level) {
            BlockPos bp = BlockPos.containing(x, y, z);

            if (!level.isClientSide()) {
                // Server-side audio dispatching (broadcasts to all nearby players except the first argument)
                level.playSound((Player) null, bp, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 0.3F, 1.0F);
            } else {
                // Client-side local audio playback
                level.playSound(null, bp, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 0.5F, 1.0F);
            }
        }
    }
}