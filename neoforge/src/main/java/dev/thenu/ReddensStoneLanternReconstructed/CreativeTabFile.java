package dev.thenu.ReddensStoneLanternReconstructed;

import dev.thenu.ReddensStoneLanternReconstructed.Blocks.*;
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
        REDDENS_DECO = REGISTRY.register("reddens_deco", () -> CreativeModeTab.builder().title(Component.translatable("item_group.reddensstonelantern.reddens_deco")).icon(() -> new ItemStack((ItemLike) MediumLanternBlockFile.MEDIUM_STONE_LANTERN.get())).displayItems((parameters, tabData) -> {
            tabData.accept(MediumLanternBlockFile.MEDIUM_STONE_LANTERN.get().asItem());
            tabData.accept(ThinLanternBlockFile.THIN_STONE_LANTERN.get().asItem());
            tabData.accept(BroadLanternBlockFile.BROAD_STONE_LANTERN.get().asItem());
            tabData.accept(SmallStoneLanternBlockFile.SMALL_STONE_LANTERN_LIGHT.get().asItem());
            tabData.accept(MiniStoneLanternBlockFile.MINI_STONE_LANTERN_LIGHT.get().asItem());
            tabData.accept(SmallFootLanternBlockFile.SMALLFOOT_STONE_LANTERN_LIGHT.get().asItem());
            tabData.accept(SmallProofLanternBlockFile.SMALLPROOF_STONE_LANTERN_LIGHT.get().asItem());
            tabData.accept(SmallNoProofLanternBlockFile.SMALLNOPROOF_STONE_LANTERN_LIGHT.get().asItem());
            tabData.accept(MiniNoProofLanternBlockFile.MININOPROOF_STONE_LANTERN_LIGHT.get().asItem());
            tabData.accept(StonePillarThinALanternBlockFile.STONE_PILLAR_THIN_A_SHORT.get().asItem());
            tabData.accept(StonePillarMidLanternBlockFile.STONE_PILLAR_MID_SHORT.get().asItem());
            tabData.accept(StonePillarThinBLanternBlockFile.STONE_PILLAR_THIN_B_SHORT.get().asItem());
            tabData.accept(StonePillarThinCLanternBlockFile.STONE_PILLAR_THIN_C_SHORT.get().asItem());
            tabData.accept(StonePillarBigLanternBlockFile.STONE_PILLAR_BIG_SHORT.get().asItem());
            tabData.accept(StonePillarBiggerLanternBlockFile.STONE_PILLAR_BIGGER_SHORT.get().asItem());
            tabData.accept(BigStoneLanternBlockFile.BIG_STONE_LANTERN_MID.get().asItem());
            tabData.accept(BiggerStoneLanternBlockFile.BIGGER_STONE_LANTERN_BLOCK_L.get().asItem());
            tabData.accept(BiggerStoneLanternBlockFile.BIGGER_STONE_LANTERN_PROOF.get().asItem());
            tabData.accept(BigStoneLanternBlockFile.BIG_STONE_LANTERN_BLOCK_LIGHT.get().asItem());
            tabData.accept(BroadLanternBlockFile.BROAD_STONE_LANTERN_BLOCK_LIGHT.get().asItem());
            tabData.accept(MidStoneLanternBlockFile.MID_STONE_LANTERN_BLOCK_LIGHT.get().asItem());
            tabData.accept(ThinLanternBlockFile.THIN_STONE_LANTERN_BLOCK_LIGHT.get().asItem());
        }).build());
    }
}
