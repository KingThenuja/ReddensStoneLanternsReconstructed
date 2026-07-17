package dev.thenu.ReddensStoneLanternReconstructed.init;

import dev.thenu.ReddensStoneLanternReconstructed.ReddensstonelanternMod;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabFile {

    public static void register() {}

    public static final CreativeModeTab REDDENS_DECO = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ReddensstonelanternMod.MOD_ID, "reddens_deco"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(BlockFile.MEDIUM_STONE_LANTERN))
                    .title(Component.translatable("item_group.reddensstonelantern.reddens_deco"))
                    .displayItems((parameters, output) -> {
                        output.accept(BlockFile.MEDIUM_STONE_LANTERN);
                        output.accept(BlockFile.THIN_STONE_LANTERN);
                        output.accept(BlockFile.BROAD_STONE_LANTERN);
                        output.accept(BlockFile.SMALL_STONE_LANTERN_LIGHT);
                        output.accept(BlockFile.MINI_STONE_LANTERN_LIGHT);
                        output.accept(BlockFile.SMALLFOOT_STONE_LANTERN_LIGHT);
                        //output.accept(BlockFile.SMALLPROOF_STONE_LANTERN_LIGHT);
                        output.accept(BlockFile.SMALLNOPROOF_STONE_LANTERN_LIGHT);
                        output.accept(BlockFile.MININOPROOF_STONE_LANTERN_LIGHT);
                        output.accept(BlockFile.STONE_PILLAR_THIN_A_SHORT);
                        output.accept(BlockFile.STONE_PILLAR_MID_SHORT);
                        output.accept(BlockFile.STONE_PILLAR_THIN_B_SHORT);
                        output.accept(BlockFile.STONE_PILLAR_THIN_C_SHORT);
                        output.accept(BlockFile.STONE_PILLAR_BIG_SHORT);
                        output.accept(BlockFile.STONE_PILLAR_BIGGER_SHORT);
                        output.accept(BlockFile.BIG_STONE_LANTERN_MID);
                        output.accept(BlockFile.BIGGER_STONE_LANTERN_BLOCK_L);
                        output.accept(BlockFile.BIGGER_STONE_LANTERN_PROOF);
                        output.accept(BlockFile.BIG_STONE_LANTERN_BLOCK_LIGHT);
                        output.accept(BlockFile.BROAD_STONE_LANTERN_BLOCK_LIGHT);
                        output.accept(BlockFile.MID_STONE_LANTERN_BLOCK_LIGHT);
                        output.accept(BlockFile.THIN_STONE_LANTERN_BLOCK_LIGHT);
                    })
                    .build());
}