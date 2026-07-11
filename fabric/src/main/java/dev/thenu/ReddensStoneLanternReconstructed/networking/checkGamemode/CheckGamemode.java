package dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.GameType;

public class CheckGamemode {
    CheckGamemode() {
    }

    public static boolean checkGamemode(Entity entity) {
        if (entity instanceof ServerPlayer serverPlayer) {
            return serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
        } else if (entity.level().isClientSide() && entity instanceof Player) {
            return entity.level().isClientSide();
        } else {
            return false;
        }
    }
}