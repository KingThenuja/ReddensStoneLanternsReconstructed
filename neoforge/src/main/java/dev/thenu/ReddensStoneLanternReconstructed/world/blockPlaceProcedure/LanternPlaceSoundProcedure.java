package dev.thenu.ReddensStoneLanternReconstructed.world.blockPlaceProcedure;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class LanternPlaceSoundProcedure {
    public LanternPlaceSoundProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level _level) {
            // Unpack the SoundEvent from the registry Holder wrapper safely
            SoundEvent flintSound = BuiltInRegistries.SOUND_EVENT.get(Identifier.parse("item.flintandsteel.use"))
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
    }
}