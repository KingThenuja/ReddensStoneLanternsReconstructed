package dev.thenu.ReddensStoneLanternReconstructed.init;

import dev.thenu.ReddensStoneLanternReconstructed.ReddensstonelanternMod;
import dev.thenu.ReddensStoneLanternReconstructed.blockType.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockFile {

    // 1. Block Fields
    public static Block MEDIUM_STONE_LANTERN;
    public static Block MEDIUM_STONE_LANTERN_TOP_DARK;
    public static Block MEDIUM_STONE_LANTERN_TOP_LIGHT;
    public static Block THIN_STONE_LANTERN;
    public static Block THIN_STONE_LANTERN_TOP_DARK;
    public static Block THIN_STONE_LANTERN_TOP_LIGHT;
    public static Block BROAD_STONE_LANTERN;
    public static Block BROAD_STONE_LANTERN_TOP_DARK;
    public static Block BROAD_STONE_LANTERN_TOP_LIGHT;
    public static Block SMALL_STONE_LANTERN_LIGHT;
    public static Block SMALL_STONE_LANTERN_DARK;
    public static Block MINI_STONE_LANTERN_DARK;
    public static Block MINI_STONE_LANTERN_LIGHT;
    public static Block SMALLFOOT_STONE_LANTERN_DARK;
    public static Block SMALLFOOT_STONE_LANTERN_LIGHT;
    public static Block SMALLPROOF_STONE_LANTERN_DARK;
    public static Block SMALLPROOF_STONE_LANTERN_LIGHT;
    public static Block SMALLNOPROOF_STONE_LANTERN_DARK;
    public static Block SMALLNOPROOF_STONE_LANTERN_LIGHT;
    public static Block MININOPROOF_STONE_LANTERN_DARK;
    public static Block MININOPROOF_STONE_LANTERN_LIGHT;
    public static Block STONE_PILLAR_THIN_A_SHORT;
    public static Block STONE_PILLAR_MID_BOTTOM;
    public static Block STONE_PILLAR_MID_TOP;
    public static Block STONE_PILLAR_MID_MIDDLE;
    public static Block STONE_PILLAR_MID_SHORT;
    public static Block STONE_PILLAR_THIN_A_TOP;
    public static Block STONE_PILLAR_THIN_A_BOTTOM;
    public static Block STONE_PILLAR_THIN_B_BOTTOM;
    public static Block STONE_PILLAR_THIN_B_SHORT;
    public static Block STONE_PILLAR_THIN_B_TOP;
    public static Block STONE_PILLAR_THIN_C_BOTTOM;
    public static Block STONE_PILLAR_THIN_C_MIDDLE;
    public static Block STONE_PILLAR_THIN_C_SHORT;
    public static Block STONE_PILLAR_THIN_C_TOP;
    public static Block STONE_PILLAR_BIG_BOTTOM;
    public static Block STONE_PILLAR_BIG_MIDDLE;
    public static Block STONE_PILLAR_BIG_SHORT;
    public static Block STONE_PILLAR_BIG_TOP;
    public static Block STONE_PILLAR_BIGGER_BOTTOM;
    public static Block STONE_PILLAR_BIGGER_MIDDLE;
    public static Block STONE_PILLAR_BIGGER_SHORT;
    public static Block STONE_PILLAR_BIGGER_TOP;
    public static Block BIG_STONE_LANTERN_BASE;
    public static Block BIG_STONE_LANTERN_MID;
    public static Block BIG_STONE_LANTERN_TOP_LIGHT;
    public static Block BIG_STONE_LANTERN_TOP_DARK;
    public static Block BIGGER_STONE_LANTERN_BLOCK_D;
    public static Block BIGGER_STONE_LANTERN_BLOCK_L;
    public static Block BIGGER_STONE_LANTERN_PROOF;
    public static Block BIG_STONE_LANTERN_BLOCK_DARK;
    public static Block BIG_STONE_LANTERN_BLOCK_LIGHT;
    public static Block BROAD_STONE_LANTERN_BLOCK_DARK;
    public static Block BROAD_STONE_LANTERN_BLOCK_LIGHT;
    public static Block MID_STONE_LANTERN_BLOCK_DARK;
    public static Block MID_STONE_LANTERN_BLOCK_LIGHT;
    public static Block THIN_STONE_LANTERN_BLOCK_DARK;
    public static Block THIN_STONE_LANTERN_BLOCK_LIGHT;

    // 2. Item Fields
    public static Item MEDIUM_STONE_LANTERN_ITEM;
    public static Item MEDIUM_STONE_LANTERN_TOP_DARK_ITEM;
    public static Item MEDIUM_STONE_LANTERN_TOP_LIGHT_ITEM;
    public static Item THIN_STONE_LANTERN_ITEM;
    public static Item THIN_STONE_LANTERN_TOP_DARK_ITEM;
    public static Item THIN_STONE_LANTERN_TOP_LIGHT_ITEM;
    public static Item BROAD_STONE_LANTERN_ITEM;
    public static Item BROAD_STONE_LANTERN_TOP_DARK_ITEM;
    public static Item BROAD_STONE_LANTERN_TOP_LIGHT_ITEM;
    public static Item SMALL_STONE_LANTERN_LIGHT_ITEM;
    public static Item SMALL_STONE_LANTERN_DARK_ITEM;
    public static Item MINI_STONE_LANTERN_DARK_ITEM;
    public static Item MINI_STONE_LANTERN_LIGHT_ITEM;
    public static Item SMALLFOOT_STONE_LANTERN_DARK_ITEM;
    public static Item SMALLFOOT_STONE_LANTERN_LIGHT_ITEM;
    public static Item SMALLPROOF_STONE_LANTERN_DARK_ITEM;
    public static Item SMALLPROOF_STONE_LANTERN_LIGHT_ITEM;
    public static Item SMALLNOPROOF_STONE_LANTERN_DARK_ITEM;
    public static Item SMALLNOPROOF_STONE_LANTERN_LIGHT_ITEM;
    public static Item MININOPROOF_STONE_LANTERN_DARK_ITEM;
    public static Item MININOPROOF_STONE_LANTERN_LIGHT_ITEM;
    public static Item STONE_PILLAR_THIN_A_SHORT_ITEM;
    public static Item STONE_PILLAR_MID_BOTTOM_ITEM;
    public static Item STONE_PILLAR_MID_TOP_ITEM;
    public static Item STONE_PILLAR_MID_MIDDLE_ITEM;
    public static Item STONE_PILLAR_MID_SHORT_ITEM;
    public static Item STONE_PILLAR_THIN_A_TOP_ITEM;
    public static Item STONE_PILLAR_THIN_A_BOTTOM_ITEM;
    public static Item STONE_PILLAR_THIN_B_BOTTOM_ITEM;
    public static Item STONE_PILLAR_THIN_B_SHORT_ITEM;
    public static Item STONE_PILLAR_THIN_B_TOP_ITEM;
    public static Item STONE_PILLAR_THIN_C_BOTTOM_ITEM;
    public static Item STONE_PILLAR_THIN_C_MIDDLE_ITEM;
    public static Item STONE_PILLAR_THIN_C_SHORT_ITEM;
    public static Item STONE_PILLAR_THIN_C_TOP_ITEM;
    public static Item STONE_PILLAR_BIG_BOTTOM_ITEM;
    public static Item STONE_PILLAR_BIG_MIDDLE_ITEM;
    public static Item STONE_PILLAR_BIG_SHORT_ITEM;
    public static Item STONE_PILLAR_BIG_TOP_ITEM;
    public static Item STONE_PILLAR_BIGGER_BOTTOM_ITEM;
    public static Item STONE_PILLAR_BIGGER_MIDDLE_ITEM;
    public static Item STONE_PILLAR_BIGGER_SHORT_ITEM;
    public static Item STONE_PILLAR_BIGGER_TOP_ITEM;
    public static Item BIG_STONE_LANTERN_BASE_ITEM;
    public static Item BIG_STONE_LANTERN_MID_ITEM;
    public static Item BIG_STONE_LANTERN_TOP_LIGHT_ITEM;
    public static Item BIG_STONE_LANTERN_TOP_DARK_ITEM;
    public static Item BIGGER_STONE_LANTERN_BLOCK_D_ITEM;
    public static Item BIGGER_STONE_LANTERN_BLOCK_L_ITEM;
    public static Item BIGGER_STONE_LANTERN_PROOF_ITEM;
    public static Item BIG_STONE_LANTERN_BLOCK_DARK_ITEM;
    public static Item BIG_STONE_LANTERN_BLOCK_LIGHT_ITEM;
    public static Item BROAD_STONE_LANTERN_BLOCK_DARK_ITEM;
    public static Item BROAD_STONE_LANTERN_BLOCK_LIGHT_ITEM;
    public static Item MID_STONE_LANTERN_BLOCK_DARK_ITEM;
    public static Item MID_STONE_LANTERN_BLOCK_LIGHT_ITEM;
    public static Item THIN_STONE_LANTERN_BLOCK_DARK_ITEM;
    public static Item THIN_STONE_LANTERN_BLOCK_LIGHT_ITEM;

    // 3. Execution Registration Handler Method
    public static void register() {
        MEDIUM_STONE_LANTERN = registerBlock("medium_stone_lantern", new MediumStoneLanternBlock());
        MEDIUM_STONE_LANTERN_ITEM = registerBlockItem("medium_stone_lantern", MEDIUM_STONE_LANTERN);

        MEDIUM_STONE_LANTERN_TOP_DARK = registerBlock("medium_stone_lantern_top_dark", new MediumStoneLanternTopDarkBlock());
        MEDIUM_STONE_LANTERN_TOP_DARK_ITEM = registerBlockItem("medium_stone_lantern_top_dark", MEDIUM_STONE_LANTERN_TOP_DARK);

        MEDIUM_STONE_LANTERN_TOP_LIGHT = registerBlock("medium_stone_lantern_top_light", new MediumStoneLanternTopLightBlock());
        MEDIUM_STONE_LANTERN_TOP_LIGHT_ITEM = registerBlockItem("medium_stone_lantern_top_light", MEDIUM_STONE_LANTERN_TOP_LIGHT);

        THIN_STONE_LANTERN = registerBlock("thin_stone_lantern", new ThinStoneLanternBlock());
        THIN_STONE_LANTERN_ITEM = registerBlockItem("thin_stone_lantern", THIN_STONE_LANTERN);

        THIN_STONE_LANTERN_TOP_DARK = registerBlock("thin_stone_lantern_top_dark", new ThinStoneLanternTopDarkBlock());
        THIN_STONE_LANTERN_TOP_DARK_ITEM = registerBlockItem("thin_stone_lantern_top_dark", THIN_STONE_LANTERN_TOP_DARK);

        THIN_STONE_LANTERN_TOP_LIGHT = registerBlock("thin_stone_lantern_top_light", new ThinStoneLanternTopLightBlock());
        THIN_STONE_LANTERN_TOP_LIGHT_ITEM = registerBlockItem("thin_stone_lantern_top_light", THIN_STONE_LANTERN_TOP_LIGHT);

        BROAD_STONE_LANTERN = registerBlock("broad_stone_lantern", new BroadStoneLanternBlock());
        BROAD_STONE_LANTERN_ITEM = registerBlockItem("broad_stone_lantern", BROAD_STONE_LANTERN);

        BROAD_STONE_LANTERN_TOP_DARK = registerBlock("broad_stone_lantern_top_dark", new BroadStoneLanternTopDarkBlock());
        BROAD_STONE_LANTERN_TOP_DARK_ITEM = registerBlockItem("broad_stone_lantern_top_dark", BROAD_STONE_LANTERN_TOP_DARK);

        BROAD_STONE_LANTERN_TOP_LIGHT = registerBlock("broad_stone_lantern_top_light", new BroadStoneLanternTopLightBlock());
        BROAD_STONE_LANTERN_TOP_LIGHT_ITEM = registerBlockItem("broad_stone_lantern_top_light", BROAD_STONE_LANTERN_TOP_LIGHT);

        SMALL_STONE_LANTERN_LIGHT = registerBlock("small_stone_lantern_light", new SmallStoneLanternLightBlock());
        SMALL_STONE_LANTERN_LIGHT_ITEM = registerBlockItem("small_stone_lantern_light", SMALL_STONE_LANTERN_LIGHT);

        SMALL_STONE_LANTERN_DARK = registerBlock("small_stone_lantern_dark", new SmallStoneLanternDarkBlock());
        SMALL_STONE_LANTERN_DARK_ITEM = registerBlockItem("small_stone_lantern_dark", SMALL_STONE_LANTERN_DARK);

        MINI_STONE_LANTERN_DARK = registerBlock("mini_stone_lantern_dark", new MiniStoneLanternDarkBlock());
        MINI_STONE_LANTERN_DARK_ITEM = registerBlockItem("mini_stone_lantern_dark", MINI_STONE_LANTERN_DARK);

        MINI_STONE_LANTERN_LIGHT = registerBlock("mini_stone_lantern_light", new MiniStoneLanternLightBlock());
        MINI_STONE_LANTERN_LIGHT_ITEM = registerBlockItem("mini_stone_lantern_light", MINI_STONE_LANTERN_LIGHT);

        SMALLFOOT_STONE_LANTERN_DARK = registerBlock("smallfoot_stone_lantern_dark", new SmallfootStoneLanternDarkBlock());
        SMALLFOOT_STONE_LANTERN_DARK_ITEM = registerBlockItem("smallfoot_stone_lantern_dark", SMALLFOOT_STONE_LANTERN_DARK);

        SMALLFOOT_STONE_LANTERN_LIGHT = registerBlock("smallfoot_stone_lantern_light", new SmallfootStoneLanternLightBlock());
        SMALLFOOT_STONE_LANTERN_LIGHT_ITEM = registerBlockItem("smallfoot_stone_lantern_light", SMALLFOOT_STONE_LANTERN_LIGHT);

        SMALLPROOF_STONE_LANTERN_DARK = registerBlock("smallproof_stone_lantern_dark", new SmallproofStoneLanternDarkBlock());
        SMALLPROOF_STONE_LANTERN_DARK_ITEM = registerBlockItem("smallproof_stone_lantern_dark", SMALLPROOF_STONE_LANTERN_DARK);

        SMALLPROOF_STONE_LANTERN_LIGHT = registerBlock("smallproof_stone_lantern_light", new SmallproofStoneLanternLightBlock());
        SMALLPROOF_STONE_LANTERN_LIGHT_ITEM = registerBlockItem("smallproof_stone_lantern_light", SMALLPROOF_STONE_LANTERN_LIGHT);

        SMALLNOPROOF_STONE_LANTERN_DARK = registerBlock("smallnoproof_stone_lantern_dark", new SmallnoproofStoneLanternDarkBlock());
        SMALLNOPROOF_STONE_LANTERN_DARK_ITEM = registerBlockItem("smallnoproof_stone_lantern_dark", SMALLNOPROOF_STONE_LANTERN_DARK);

        SMALLNOPROOF_STONE_LANTERN_LIGHT = registerBlock("smallnoproof_stone_lantern_light", new SmallnoproofStoneLanternLightBlock());
        SMALLNOPROOF_STONE_LANTERN_LIGHT_ITEM = registerBlockItem("smallnoproof_stone_lantern_light", SMALLNOPROOF_STONE_LANTERN_LIGHT);

        MININOPROOF_STONE_LANTERN_DARK = registerBlock("mininoproof_stone_lantern_dark", new MininoproofStoneLanternDarkBlock());
        MININOPROOF_STONE_LANTERN_DARK_ITEM = registerBlockItem("mininoproof_stone_lantern_dark", MININOPROOF_STONE_LANTERN_DARK);

        MININOPROOF_STONE_LANTERN_LIGHT = registerBlock("mininoproof_stone_lantern_light", new MininoproofStoneLanternLightBlock());
        MININOPROOF_STONE_LANTERN_LIGHT_ITEM = registerBlockItem("mininoproof_stone_lantern_light", MININOPROOF_STONE_LANTERN_LIGHT);

        STONE_PILLAR_THIN_A_SHORT = registerBlock("stone_pillar_thin_a_short", new StonePillarThinAShortBlock());
        STONE_PILLAR_THIN_A_SHORT_ITEM = registerBlockItem("stone_pillar_thin_a_short", STONE_PILLAR_THIN_A_SHORT);

        STONE_PILLAR_MID_BOTTOM = registerBlock("stone_pillar_mid_bottom", new StonePillarMidBottomBlock());
        STONE_PILLAR_MID_BOTTOM_ITEM = registerBlockItem("stone_pillar_mid_bottom", STONE_PILLAR_MID_BOTTOM);

        STONE_PILLAR_MID_TOP = registerBlock("stone_pillar_mid_top", new StonePillarMidTopBlock());
        STONE_PILLAR_MID_TOP_ITEM = registerBlockItem("stone_pillar_mid_top", STONE_PILLAR_MID_TOP);

        STONE_PILLAR_MID_MIDDLE = registerBlock("stone_pillar_mid_middle", new StonePillarMidMiddleBlock());
        STONE_PILLAR_MID_MIDDLE_ITEM = registerBlockItem("stone_pillar_mid_middle", STONE_PILLAR_MID_MIDDLE);

        STONE_PILLAR_MID_SHORT = registerBlock("stone_pillar_mid_short", new StonePillarMidShortBlock());
        STONE_PILLAR_MID_SHORT_ITEM = registerBlockItem("stone_pillar_mid_short", STONE_PILLAR_MID_SHORT);

        STONE_PILLAR_THIN_A_TOP = registerBlock("stone_pillar_thin_a_top", new StonePillarThinATopBlock());
        STONE_PILLAR_THIN_A_TOP_ITEM = registerBlockItem("stone_pillar_thin_a_top", STONE_PILLAR_THIN_A_TOP);

        STONE_PILLAR_THIN_A_BOTTOM = registerBlock("stone_pillar_thin_a_bottom", new StonePillarThinABottomBlock());
        STONE_PILLAR_THIN_A_BOTTOM_ITEM = registerBlockItem("stone_pillar_thin_a_bottom", STONE_PILLAR_THIN_A_BOTTOM);

        STONE_PILLAR_THIN_B_BOTTOM = registerBlock("stone_pillar_thin_b_bottom", new StonePillarThinBBottomBlock());
        STONE_PILLAR_THIN_B_BOTTOM_ITEM = registerBlockItem("stone_pillar_thin_b_bottom", STONE_PILLAR_THIN_B_BOTTOM);

        STONE_PILLAR_THIN_B_SHORT = registerBlock("stone_pillar_thin_b_short", new StonePillarThinBShortBlock());
        STONE_PILLAR_THIN_B_SHORT_ITEM = registerBlockItem("stone_pillar_thin_b_short", STONE_PILLAR_THIN_B_SHORT);

        STONE_PILLAR_THIN_B_TOP = registerBlock("stone_pillar_thin_b_top", new StonePillarThinBTopBlock());
        STONE_PILLAR_THIN_B_TOP_ITEM = registerBlockItem("stone_pillar_thin_b_top", STONE_PILLAR_THIN_B_TOP);

        STONE_PILLAR_THIN_C_BOTTOM = registerBlock("stone_pillar_thin_c_bottom", new StonePillarThinCBottomBlock());
        STONE_PILLAR_THIN_C_BOTTOM_ITEM = registerBlockItem("stone_pillar_thin_c_bottom", STONE_PILLAR_THIN_C_BOTTOM);

        STONE_PILLAR_THIN_C_MIDDLE = registerBlock("stone_pillar_thin_c_middle", new StonePillarThinCMiddleBlock());
        STONE_PILLAR_THIN_C_MIDDLE_ITEM = registerBlockItem("stone_pillar_thin_c_middle", STONE_PILLAR_THIN_C_MIDDLE);

        STONE_PILLAR_THIN_C_SHORT = registerBlock("stone_pillar_thin_c_short", new StonePillarThinCShortBlock());
        STONE_PILLAR_THIN_C_SHORT_ITEM = registerBlockItem("stone_pillar_thin_c_short", STONE_PILLAR_THIN_C_SHORT);

        STONE_PILLAR_THIN_C_TOP = registerBlock("stone_pillar_thin_c_top", new StonePillarThinCTopBlock());
        STONE_PILLAR_THIN_C_TOP_ITEM = registerBlockItem("stone_pillar_thin_c_top", STONE_PILLAR_THIN_C_TOP);

        STONE_PILLAR_BIG_BOTTOM = registerBlock("stone_pillar_big_bottom", new StonePillarBigBottomBlock());
        STONE_PILLAR_BIG_BOTTOM_ITEM = registerBlockItem("stone_pillar_big_bottom", STONE_PILLAR_BIG_BOTTOM);

        STONE_PILLAR_BIG_MIDDLE = registerBlock("stone_pillar_big_middle", new StonePillarBigMiddleBlock());
        STONE_PILLAR_BIG_MIDDLE_ITEM = registerBlockItem("stone_pillar_big_middle", STONE_PILLAR_BIG_MIDDLE);

        STONE_PILLAR_BIG_SHORT = registerBlock("stone_pillar_big_short", new StonePillarBigShortBlock());
        STONE_PILLAR_BIG_SHORT_ITEM = registerBlockItem("stone_pillar_big_short", STONE_PILLAR_BIG_SHORT);

        STONE_PILLAR_BIG_TOP = registerBlock("stone_pillar_big_top", new StonePillarBigTopBlock());
        STONE_PILLAR_BIG_TOP_ITEM = registerBlockItem("stone_pillar_big_top", STONE_PILLAR_BIG_TOP);

        STONE_PILLAR_BIGGER_BOTTOM = registerBlock("stone_pillar_bigger_bottom", new StonePillarBiggerBottomBlock());
        STONE_PILLAR_BIGGER_BOTTOM_ITEM = registerBlockItem("stone_pillar_bigger_bottom", STONE_PILLAR_BIGGER_BOTTOM);

        STONE_PILLAR_BIGGER_MIDDLE = registerBlock("stone_pillar_bigger_middle", new StonePillarBiggerMiddleBlock());
        STONE_PILLAR_BIGGER_MIDDLE_ITEM = registerBlockItem("stone_pillar_bigger_middle", STONE_PILLAR_BIGGER_MIDDLE);

        STONE_PILLAR_BIGGER_SHORT = registerBlock("stone_pillar_bigger_short", new StonePillarBiggerShortBlock());
        STONE_PILLAR_BIGGER_SHORT_ITEM = registerBlockItem("stone_pillar_bigger_short", STONE_PILLAR_BIGGER_SHORT);

        STONE_PILLAR_BIGGER_TOP = registerBlock("stone_pillar_bigger_top", new StonePillarBiggerTopBlock());
        STONE_PILLAR_BIGGER_TOP_ITEM = registerBlockItem("stone_pillar_bigger_top", STONE_PILLAR_BIGGER_TOP);

        BIG_STONE_LANTERN_BASE = registerBlock("big_stone_lantern_base", new BigStoneLanternBaseBlock());
        BIG_STONE_LANTERN_BASE_ITEM = registerBlockItem("big_stone_lantern_base", BIG_STONE_LANTERN_BASE);

        BIG_STONE_LANTERN_MID = registerBlock("big_stone_lantern_mid", new BigStoneLanternMidBlock());
        BIG_STONE_LANTERN_MID_ITEM = registerBlockItem("big_stone_lantern_mid", BIG_STONE_LANTERN_MID);

        BIG_STONE_LANTERN_TOP_LIGHT = registerBlock("big_stone_lantern_top_light", new BigStoneLanternTopLightBlock());
        BIG_STONE_LANTERN_TOP_LIGHT_ITEM = registerBlockItem("big_stone_lantern_top_light", BIG_STONE_LANTERN_TOP_LIGHT);

        BIG_STONE_LANTERN_TOP_DARK = registerBlock("big_stone_lantern_top_dark", new BigStoneLanternTopDarkBlock());
        BIG_STONE_LANTERN_TOP_DARK_ITEM = registerBlockItem("big_stone_lantern_top_dark", BIG_STONE_LANTERN_TOP_DARK);

        BIGGER_STONE_LANTERN_BLOCK_D = registerBlock("bigger_stone_lantern_block_d", new BiggerStoneLanternBlockDBlock());
        BIGGER_STONE_LANTERN_BLOCK_D_ITEM = registerBlockItem("bigger_stone_lantern_block_d", BIGGER_STONE_LANTERN_BLOCK_D);

        BIGGER_STONE_LANTERN_BLOCK_L = registerBlock("bigger_stone_lantern_block_l", new BiggerStoneLanternBlockLBlock());
        BIGGER_STONE_LANTERN_BLOCK_L_ITEM = registerBlockItem("bigger_stone_lantern_block_l", BIGGER_STONE_LANTERN_BLOCK_L);

        BIGGER_STONE_LANTERN_PROOF = registerBlock("bigger_stone_lantern_proof", new BiggerStoneLanternProofBlock());
        BIGGER_STONE_LANTERN_PROOF_ITEM = registerBlockItem("bigger_stone_lantern_proof", BIGGER_STONE_LANTERN_PROOF);

        BIG_STONE_LANTERN_BLOCK_DARK = registerBlock("big_stone_lantern_block_dark", new BigStoneLanternBlockDarkBlock());
        BIG_STONE_LANTERN_BLOCK_DARK_ITEM = registerBlockItem("big_stone_lantern_block_dark", BIG_STONE_LANTERN_BLOCK_DARK);

        BIG_STONE_LANTERN_BLOCK_LIGHT = registerBlock("big_stone_lantern_block_light", new BigStoneLanternBlockLightBlock());
        BIG_STONE_LANTERN_BLOCK_LIGHT_ITEM = registerBlockItem("big_stone_lantern_block_light", BIG_STONE_LANTERN_BLOCK_LIGHT);

        BROAD_STONE_LANTERN_BLOCK_DARK = registerBlock("broad_stone_lantern_block_dark", new BroadStoneLanternBlockDarkBlock());
        BROAD_STONE_LANTERN_BLOCK_DARK_ITEM = registerBlockItem("broad_stone_lantern_block_dark", BROAD_STONE_LANTERN_BLOCK_DARK);

        BROAD_STONE_LANTERN_BLOCK_LIGHT = registerBlock("broad_stone_lantern_block_light", new BroadStoneLanternBlockLightBlock());
        BROAD_STONE_LANTERN_BLOCK_LIGHT_ITEM = registerBlockItem("broad_stone_lantern_block_light", BROAD_STONE_LANTERN_BLOCK_LIGHT);

        MID_STONE_LANTERN_BLOCK_DARK = registerBlock("mid_stone_lantern_block_dark", new MidStoneLanternBlockDarkBlock());
        MID_STONE_LANTERN_BLOCK_DARK_ITEM = registerBlockItem("mid_stone_lantern_block_dark", MID_STONE_LANTERN_BLOCK_DARK);

        MID_STONE_LANTERN_BLOCK_LIGHT = registerBlock("mid_stone_lantern_block_light", new MidStoneLanternBlockLightBlock());
        MID_STONE_LANTERN_BLOCK_LIGHT_ITEM = registerBlockItem("mid_stone_lantern_block_light", MID_STONE_LANTERN_BLOCK_LIGHT);

        THIN_STONE_LANTERN_BLOCK_DARK = registerBlock("thin_stone_lantern_block_dark", new ThinStoneLanternBlockDarkBlock());
        THIN_STONE_LANTERN_BLOCK_DARK_ITEM = registerBlockItem("thin_stone_lantern_block_dark", THIN_STONE_LANTERN_BLOCK_DARK);

        THIN_STONE_LANTERN_BLOCK_LIGHT = registerBlock("thin_stone_lantern_block_light", new ThinStoneLanternBlockLightBlock());
        THIN_STONE_LANTERN_BLOCK_LIGHT_ITEM = registerBlockItem("thin_stone_lantern_block_light", THIN_STONE_LANTERN_BLOCK_LIGHT);
    }

    // 4. Registration Helpers conforming to Fabric Framework
    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(ReddensstonelanternMod.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(ReddensstonelanternMod.MODID, name), new BlockItem(block, new Item.Settings()));
    }
}