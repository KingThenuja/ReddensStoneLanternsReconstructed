package dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.GameMode;

public class CheckGamemode {
    CheckGamemode() {
    }

    public static boolean checkGamemode(Entity entity) {
        if (entity instanceof ServerPlayerEntity serverPlayer) {
            return serverPlayer.interactionManager.getGameMode() == GameMode.SURVIVAL;
        } else if (entity.getEntityWorld().isClient() && entity instanceof PlayerEntity) {
            return entity.getEntityWorld().isClient();
        } else {
            return false;
        }
    }
}