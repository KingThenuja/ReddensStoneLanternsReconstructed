package dev.thenu.ReddensStoneLanternReconstructed.platform;

import dev.thenu.ReddensStoneLanternReconstructed.platform.services.IPlatformHelper;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

import java.util.Objects;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !Objects.requireNonNull(FMLLoader.getCurrentOrNull()).isProduction();
    }
}