package dev.thenu.ReddensStoneLanternReconstructed.client;

import dev.thenu.ReddensStoneLanternReconstructed.ReddensstonelanternMod
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("[Reddens Lantern Mod] Safely binding Client Cutout Layers...");

        registerCutout("medium_stone_lantern");
        registerCutout("medium_stone_lantern_top_dark");
        registerCutout("medium_stone_lantern_top_light");

        registerCutout("small_stone_lantern_top_dark");
        registerCutout("small_stone_lantern_top_light");

        registerCutout("thin_stone_lantern");
        registerCutout("thin_stone_lantern_top_dark");
        registerCutout("thin_stone_lantern_top_light");
        registerCutout("thin_stone_lantern_block_dark");
        registerCutout("thin_stone_lantern_block_light");

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
        Identifier id = Identifier.fromNamespaceAndPath(ReddensstonelanternMod.MODID, path);
        Registries<Block> key = TagKey.create(Registries.BLOCK, id);
        var blockEntryLookUp = Registries.BLOCK.getOptional(key);
        if (blockEntryLookUp.isPresent()) {
            Block block = blockEntryLookUp.get().value();
            ChunkSectionLayerMap.putBlock(block, BlockRenderLayer.CUTOUT);
        } else {
            System.err.println("[Reddens Lantern Mod] Client delayed layout binding error: Could not resolve key: " + id);
        }
    }
}
