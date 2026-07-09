//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package dev.thenu.ReddensStoneLanternReconstructed.networking.checkGamemode;

import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameType;

public class CheckGamemode {
    CheckGamemode() {
    }

    public static boolean checkGamemode(Entity _ent) {
        if (_ent instanceof ServerPlayer _serverPlayer) {
            return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
        } else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
            return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().id()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().id()).getGameMode() == GameType.SURVIVAL;
        } else {
            return false;
        }
    }
}
