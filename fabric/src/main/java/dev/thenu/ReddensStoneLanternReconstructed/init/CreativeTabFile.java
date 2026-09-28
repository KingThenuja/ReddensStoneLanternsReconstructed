package dev.thenu.ReddensStoneLanternReconstructed.init;

import dev.thenu.ReddensStoneLanternReconstructed.ReddensstonelanternMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CreativeTabFile {
    public static ItemGroup REDDENS_DECO;

    public static void register() {
        REDDENS_DECO = Registry.register(
                Registries.ITEM_GROUP,
                Identifier.of(ReddensstonelanternMod.MODID, "reddens_deco"),
                FabricItemGroup.builder()
                        .displayName(Text.translatable("item_group.reddensstonelantern.reddens_deco"))
                        .icon(() -> new ItemStack(BlockFile.MEDIUM_STONE_LANTERN))
                        .entries((displayContext, entries) -> {
                            entries.add(BlockFile.MEDIUM_STONE_LANTERN);
                            entries.add(BlockFile.THIN_STONE_LANTERN);
                            entries.add(BlockFile.BROAD_STONE_LANTERN);
                            entries.add(BlockFile.SMALL_STONE_LANTERN_LIGHT);
                            entries.add(BlockFile.MINI_STONE_LANTERN_LIGHT);
                            entries.add(BlockFile.SMALLFOOT_STONE_LANTERN_LIGHT);
                            entries.add(BlockFile.SMALLPROOF_STONE_LANTERN_LIGHT);
                            entries.add(BlockFile.SMALLNOPROOF_STONE_LANTERN_LIGHT);
                            entries.add(BlockFile.MININOPROOF_STONE_LANTERN_LIGHT);
                            entries.add(BlockFile.STONE_PILLAR_THIN_A_SHORT);
                            entries.add(BlockFile.STONE_PILLAR_MID_SHORT);
                            entries.add(BlockFile.STONE_PILLAR_THIN_B_SHORT);
                            entries.add(BlockFile.STONE_PILLAR_THIN_C_SHORT);
                            entries.add(BlockFile.STONE_PILLAR_BIG_SHORT);
                            entries.add(BlockFile.STONE_PILLAR_BIGGER_SHORT);
                            entries.add(BlockFile.BIG_STONE_LANTERN_MID);
                            entries.add(BlockFile.BIGGER_STONE_LANTERN_BLOCK_L);
                            entries.add(BlockFile.BIGGER_STONE_LANTERN_PROOF);
                            entries.add(BlockFile.BIG_STONE_LANTERN_BLOCK_LIGHT);
                            entries.add(BlockFile.BROAD_STONE_LANTERN_BLOCK_LIGHT);
                            entries.add(BlockFile.MID_STONE_LANTERN_BLOCK_LIGHT);
                            entries.add(BlockFile.THIN_STONE_LANTERN_BLOCK_LIGHT);
                        })
                        .build()
        );
    }
}