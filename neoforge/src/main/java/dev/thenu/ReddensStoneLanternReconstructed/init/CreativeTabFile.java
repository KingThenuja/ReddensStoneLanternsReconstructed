package dev.thenu.ReddensStoneLanternReconstructed.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTabFile {
    public static final DeferredRegister<CreativeModeTab> REGISTRY;
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> REDDENS_DECO;

    static {
        REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "reddensstonelantern");
        REDDENS_DECO = REGISTRY.register("reddens_deco", () -> CreativeModeTab.builder().title(Component.translatable("item_group.reddensstonelantern.reddens_deco")).icon(() -> new ItemStack((ItemLike) BlockFile.MEDIUM_STONE_LANTERN.get())).displayItems((parameters, tabData) -> {
            tabData.accept(((Block) BlockFile.MEDIUM_STONE_LANTERN.get()).asItem());
            tabData.accept(((Block) BlockFile.THIN_STONE_LANTERN.get()).asItem());
            tabData.accept(((Block) BlockFile.BROAD_STONE_LANTERN.get()).asItem());
            tabData.accept(((Block) BlockFile.SMALL_STONE_LANTERN_LIGHT.get()).asItem());
            tabData.accept(((Block) BlockFile.MINI_STONE_LANTERN_LIGHT.get()).asItem());
            tabData.accept(((Block) BlockFile.SMALLFOOT_STONE_LANTERN_LIGHT.get()).asItem());
            tabData.accept(((Block) BlockFile.SMALLPROOF_STONE_LANTERN_LIGHT.get()).asItem());
            tabData.accept(((Block) BlockFile.SMALLNOPROOF_STONE_LANTERN_LIGHT.get()).asItem());
            tabData.accept(((Block) BlockFile.MININOPROOF_STONE_LANTERN_LIGHT.get()).asItem());
            tabData.accept(((Block) BlockFile.STONE_PILLAR_THIN_A_SHORT.get()).asItem());
            tabData.accept(((Block) BlockFile.STONE_PILLAR_MID_SHORT.get()).asItem());
            tabData.accept(((Block) BlockFile.STONE_PILLAR_THIN_B_SHORT.get()).asItem());
            tabData.accept(((Block) BlockFile.STONE_PILLAR_THIN_C_SHORT.get()).asItem());
            tabData.accept(((Block) BlockFile.STONE_PILLAR_BIG_SHORT.get()).asItem());
            tabData.accept(((Block) BlockFile.STONE_PILLAR_BIGGER_SHORT.get()).asItem());
            tabData.accept(((Block) BlockFile.BIG_STONE_LANTERN_MID.get()).asItem());
            tabData.accept(((Block) BlockFile.BIGGER_STONE_LANTERN_BLOCK_L.get()).asItem());
            tabData.accept(((Block) BlockFile.BIGGER_STONE_LANTERN_PROOF.get()).asItem());
            tabData.accept(((Block) BlockFile.BIG_STONE_LANTERN_BLOCK_LIGHT.get()).asItem());
            tabData.accept(((Block) BlockFile.BROAD_STONE_LANTERN_BLOCK_LIGHT.get()).asItem());
            tabData.accept(((Block) BlockFile.MID_STONE_LANTERN_BLOCK_LIGHT.get()).asItem());
            tabData.accept(((Block) BlockFile.THIN_STONE_LANTERN_BLOCK_LIGHT.get()).asItem());
        }).build());
    }
}
