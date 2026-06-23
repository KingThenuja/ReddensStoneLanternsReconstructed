package dev.thenu.ReddensStoneLanternReconstructed.client;

import dev.thenu.ReddensStoneLanternReconstructed.ReddensstonelanternMod;
import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("[Reddens Lantern Mod] Safely binding Client Cutout Layers...");

        registerCutout("medium_stone_lantern");
        registerCutout("medium_stone_lantern_top_dark");
        registerCutout("medium_stone_lantern_top_light");

        registerCutout("big_stone_lantern_base");
        registerCutout("big_stone_lantern_mid");
        registerCutout("big_stone_lantern_top_light");
        registerCutout("big_stone_lantern_top_dark");

        registerCutout("broad_stone_lantern");
        registerCutout("broad_stone_lantern_top_dark");
        registerCutout("broad_stone_lantern_top_light");

        registerCutout("small_stone_lantern_light");
        registerCutout("small_stone_lantern_dark");
    }

    private void registerCutout(String path) {
        Identifier id = Identifier.of(ReddensstonelanternMod.MODID, path);
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);
        var blockEntryLookUp = Registries.BLOCK.getOptional(key);
        if (blockEntryLookUp.isPresent()) {
            Block block = blockEntryLookUp.get().value();
            BlockRenderLayerMap.putBlock(block, BlockRenderLayer.CUTOUT);
        } else {
            System.err.println("[Reddens Lantern Mod] Client delayed layout binding error: Could not resolve key: " + id);
        }
    }
}
