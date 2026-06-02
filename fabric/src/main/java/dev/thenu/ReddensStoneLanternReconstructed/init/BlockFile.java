package dev.thenu.ReddensStoneLanternReconstructed.init;

import dev.thenu.ReddensStoneLanternReconstructed.ReddensstonelanternMod;
import dev.thenu.ReddensStoneLanternReconstructed.blockType.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
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

        BIG_STONE_LANTERN_BASE = registerBlock("big_stone_lantern_base",
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.NORMAL).solidBlock((state, world, pos) -> false),
                BigStoneLanternBaseBlock::new);
        BIG_STONE_LANTERN_BASE_ITEM = registerBlockItem("big_stone_lantern_base", BIG_STONE_LANTERN_BASE);

        BIG_STONE_LANTERN_MID = registerBlock("big_stone_lantern_mid",
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.NORMAL).solidBlock((state, world, pos) -> false),
                BigStoneLanternMidBlock::new);
        BIG_STONE_LANTERN_MID_ITEM = registerBlockItem("big_stone_lantern_mid", BIG_STONE_LANTERN_MID);

        BIG_STONE_LANTERN_TOP_DARK = registerBlock("big_stone_lantern_top_dark",
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.NORMAL).solidBlock((state, world, pos) -> false),
                BigStoneLanternTopDarkBlock::new);
        BIG_STONE_LANTERN_TOP_DARK_ITEM = registerBlockItem("big_stone_lantern_top_dark", BIG_STONE_LANTERN_TOP_DARK);

        BIG_STONE_LANTERN_TOP_LIGHT = registerBlock("big_stone_lantern_top_light",
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((s) -> 15).nonOpaque().pistonBehavior(PistonBehavior.NORMAL).solidBlock((state, world, pos) -> false),
                BigStoneLanternTopLightBlock::new);
        BIG_STONE_LANTERN_TOP_LIGHT_ITEM = registerBlockItem("big_stone_lantern_top_light", BIG_STONE_LANTERN_TOP_LIGHT);


        // 2. Broad Stone Lantern
        BROAD_STONE_LANTERN = registerBlock("broad_stone_lantern",
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.BLOCK).solidBlock((state, world, pos) -> false),
                BroadStoneLanternBlock::new);
        BROAD_STONE_LANTERN_ITEM = registerBlockItem("broad_stone_lantern", BROAD_STONE_LANTERN);


        // 3. Bigger Lanterns & Variants
        BIGGER_STONE_LANTERN_BLOCK_D = registerBlock("bigger_stone_lantern_block_d",
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false),
                BiggerStoneLanternBlockDBlock::new);
        BIGGER_STONE_LANTERN_BLOCK_D_ITEM = registerBlockItem("bigger_stone_lantern_block_d", BIGGER_STONE_LANTERN_BLOCK_D);

        BIGGER_STONE_LANTERN_BLOCK_L = registerBlock("bigger_stone_lantern_block_l",
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 15).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false),
                BiggerStoneLanternBlockLBlock::new);
        BIGGER_STONE_LANTERN_BLOCK_L_ITEM = registerBlockItem("bigger_stone_lantern_block_l", BIGGER_STONE_LANTERN_BLOCK_L);

        BIGGER_STONE_LANTERN_PROOF = registerBlock("bigger_stone_lantern_proof",
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false),
                BiggerStoneLanternProofBlock::new);
        BIGGER_STONE_LANTERN_PROOF_ITEM = registerBlockItem("bigger_stone_lantern_proof", BIGGER_STONE_LANTERN_PROOF);


        // 4. Big Stone Lantern Light/Dark Blocks
        BIG_STONE_LANTERN_BLOCK_DARK = registerBlock("big_stone_lantern_block_dark",
                AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false),
                BigStoneLanternBlockDarkBlock::new);
        BIG_STONE_LANTERN_BLOCK_DARK_ITEM = registerBlockItem("big_stone_lantern_block_dark", BIG_STONE_LANTERN_BLOCK_DARK);

        BIG_STONE_LANTERN_BLOCK_LIGHT = registerBlock("big_stone_lantern_block_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((s) -> 15).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false),
                BigStoneLanternBlockLightBlock::new);
        BIG_STONE_LANTERN_BLOCK_LIGHT_ITEM = registerBlockItem("big_stone_lantern_block_light", BIG_STONE_LANTERN_BLOCK_LIGHT);


        MEDIUM_STONE_LANTERN = registerBlock("medium_stone_lantern", AbstractBlock.);
        MEDIUM_STONE_LANTERN_ITEM = registerBlockItem("medium_stone_lantern", MEDIUM_STONE_LANTERN);

        MEDIUM_STONE_LANTERN_TOP_DARK = registerBlock("medium_stone_lantern_top_dark", AbstractBlock.);
        MEDIUM_STONE_LANTERN_TOP_DARK_ITEM = registerBlockItem("medium_stone_lantern_top_dark", MEDIUM_STONE_LANTERN_TOP_DARK);

        MEDIUM_STONE_LANTERN_TOP_LIGHT = registerBlock("medium_stone_lantern_top_light", AbstractBlock.);
        MEDIUM_STONE_LANTERN_TOP_LIGHT_ITEM = registerBlockItem("medium_stone_lantern_top_light", MEDIUM_STONE_LANTERN_TOP_LIGHT);

        THIN_STONE_LANTERN = registerBlock("thin_stone_lantern", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.NORMAL).solidBlock((state, world, pos) -> false), ThinStoneLanternBlock::new);
        THIN_STONE_LANTERN_ITEM = registerBlockItem("thin_stone_lantern", THIN_STONE_LANTERN);

        THIN_STONE_LANTERN_TOP_DARK = registerBlock("thin_stone_lantern_top_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.NORMAL).solidBlock((state, world, pos) -> false), ThinStoneLanternBlockDarkBlock::new);
        THIN_STONE_LANTERN_TOP_DARK_ITEM = registerBlockItem("thin_stone_lantern_top_dark", THIN_STONE_LANTERN_TOP_DARK);

        THIN_STONE_LANTERN_TOP_LIGHT = registerBlock("thin_stone_lantern_top_light", AbstractBlock.);
        THIN_STONE_LANTERN_TOP_LIGHT_ITEM = registerBlockItem("thin_stone_lantern_top_light", THIN_STONE_LANTERN_TOP_LIGHT);

        BROAD_STONE_LANTERN = registerBlock("broad_stone_lantern", AbstractBlock.);
        BROAD_STONE_LANTERN_ITEM = registerBlockItem("broad_stone_lantern", BROAD_STONE_LANTERN);

        BROAD_STONE_LANTERN_TOP_DARK = registerBlock("broad_stone_lantern_top_dark", AbstractBlock.);
        BROAD_STONE_LANTERN_TOP_DARK_ITEM = registerBlockItem("broad_stone_lantern_top_dark", BROAD_STONE_LANTERN_TOP_DARK);

        BROAD_STONE_LANTERN_TOP_LIGHT = registerBlock("broad_stone_lantern_top_light", AbstractBlock.);
        BROAD_STONE_LANTERN_TOP_LIGHT_ITEM = registerBlockItem("broad_stone_lantern_top_light", BROAD_STONE_LANTERN_TOP_LIGHT);

        SMALL_STONE_LANTERN_LIGHT = registerBlock("small_stone_lantern_light", AbstractBlock.);
        SMALL_STONE_LANTERN_LIGHT_ITEM = registerBlockItem("small_stone_lantern_light", SMALL_STONE_LANTERN_LIGHT);

        SMALL_STONE_LANTERN_DARK = registerBlock("small_stone_lantern_dark", AbstractBlock.);
        SMALL_STONE_LANTERN_DARK_ITEM = registerBlockItem("small_stone_lantern_dark", SMALL_STONE_LANTERN_DARK);

        MINI_STONE_LANTERN_DARK = registerBlock("mini_stone_lantern_dark", AbstractBlock.);
        MINI_STONE_LANTERN_DARK_ITEM = registerBlockItem("mini_stone_lantern_dark", MINI_STONE_LANTERN_DARK);

        MINI_STONE_LANTERN_LIGHT = registerBlock("mini_stone_lantern_light", AbstractBlock.);
        MINI_STONE_LANTERN_LIGHT_ITEM = registerBlockItem("mini_stone_lantern_light", MINI_STONE_LANTERN_LIGHT);

        SMALLFOOT_STONE_LANTERN_DARK = registerBlock("smallfoot_stone_lantern_dark", AbstractBlock.);
        SMALLFOOT_STONE_LANTERN_DARK_ITEM = registerBlockItem("smallfoot_stone_lantern_dark", SMALLFOOT_STONE_LANTERN_DARK);

        SMALLFOOT_STONE_LANTERN_LIGHT = registerBlock("smallfoot_stone_lantern_light", AbstractBlock.);
        SMALLFOOT_STONE_LANTERN_LIGHT_ITEM = registerBlockItem("smallfoot_stone_lantern_light", SMALLFOOT_STONE_LANTERN_LIGHT);

        SMALLPROOF_STONE_LANTERN_DARK = registerBlock("smallproof_stone_lantern_dark", AbstractBlock.);
        SMALLPROOF_STONE_LANTERN_DARK_ITEM = registerBlockItem("smallproof_stone_lantern_dark", SMALLPROOF_STONE_LANTERN_DARK);

        SMALLPROOF_STONE_LANTERN_LIGHT = registerBlock("smallproof_stone_lantern_light", AbstractBlock.);
        SMALLPROOF_STONE_LANTERN_LIGHT_ITEM = registerBlockItem("smallproof_stone_lantern_light", SMALLPROOF_STONE_LANTERN_LIGHT);

        SMALLNOPROOF_STONE_LANTERN_DARK = registerBlock("smallnoproof_stone_lantern_dark", AbstractBlock.);
        SMALLNOPROOF_STONE_LANTERN_DARK_ITEM = registerBlockItem("smallnoproof_stone_lantern_dark", SMALLNOPROOF_STONE_LANTERN_DARK);

        SMALLNOPROOF_STONE_LANTERN_LIGHT = registerBlock("smallnoproof_stone_lantern_light", AbstractBlock.);
        SMALLNOPROOF_STONE_LANTERN_LIGHT_ITEM = registerBlockItem("smallnoproof_stone_lantern_light", SMALLNOPROOF_STONE_LANTERN_LIGHT);

        MININOPROOF_STONE_LANTERN_DARK = registerBlock("mininoproof_stone_lantern_dark", AbstractBlock.);
        MININOPROOF_STONE_LANTERN_DARK_ITEM = registerBlockItem("mininoproof_stone_lantern_dark", MININOPROOF_STONE_LANTERN_DARK);

        MININOPROOF_STONE_LANTERN_LIGHT = registerBlock("mininoproof_stone_lantern_light", AbstractBlock.);
        MININOPROOF_STONE_LANTERN_LIGHT_ITEM = registerBlockItem("mininoproof_stone_lantern_light", MININOPROOF_STONE_LANTERN_LIGHT);

        STONE_PILLAR_THIN_A_SHORT = registerBlock("stone_pillar_thin_a_short", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinAShortBlock::new);
        STONE_PILLAR_THIN_A_SHORT_ITEM = registerBlockItem("stone_pillar_thin_a_short", STONE_PILLAR_THIN_A_SHORT);

        STONE_PILLAR_MID_BOTTOM = registerBlock("stone_pillar_mid_bottom", AbstractBlock.);
        STONE_PILLAR_MID_BOTTOM_ITEM = registerBlockItem("stone_pillar_mid_bottom", STONE_PILLAR_MID_BOTTOM);

        STONE_PILLAR_MID_TOP = registerBlock("stone_pillar_mid_top", AbstractBlock.);
        STONE_PILLAR_MID_TOP_ITEM = registerBlockItem("stone_pillar_mid_top", STONE_PILLAR_MID_TOP);

        STONE_PILLAR_MID_MIDDLE = registerBlock("stone_pillar_mid_middle", AbstractBlock.);
        STONE_PILLAR_MID_MIDDLE_ITEM = registerBlockItem("stone_pillar_mid_middle", STONE_PILLAR_MID_MIDDLE);

        STONE_PILLAR_MID_SHORT = registerBlock("stone_pillar_mid_short", AbstractBlock.);
        STONE_PILLAR_MID_SHORT_ITEM = registerBlockItem("stone_pillar_mid_short", STONE_PILLAR_MID_SHORT);

        STONE_PILLAR_THIN_A_TOP = registerBlock("stone_pillar_thin_a_top", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinATopBlock::new);
        STONE_PILLAR_THIN_A_TOP_ITEM = registerBlockItem("stone_pillar_thin_a_top", STONE_PILLAR_THIN_A_TOP);

        STONE_PILLAR_THIN_A_BOTTOM = registerBlock("stone_pillar_thin_a_bottom", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinABottomBlock::new);
        STONE_PILLAR_THIN_A_BOTTOM_ITEM = registerBlockItem("stone_pillar_thin_a_bottom", STONE_PILLAR_THIN_A_BOTTOM);

        STONE_PILLAR_THIN_B_BOTTOM = registerBlock("stone_pillar_thin_b_bottom", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinBBottomBlock::new);
        STONE_PILLAR_THIN_B_BOTTOM_ITEM = registerBlockItem("stone_pillar_thin_b_bottom", STONE_PILLAR_THIN_B_BOTTOM);

        STONE_PILLAR_THIN_B_SHORT = registerBlock("stone_pillar_thin_b_short", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinBShortBlock::new);
        STONE_PILLAR_THIN_B_SHORT_ITEM = registerBlockItem("stone_pillar_thin_b_short", STONE_PILLAR_THIN_B_SHORT);

        STONE_PILLAR_THIN_B_TOP = registerBlock("stone_pillar_thin_b_top", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinBTopBlock::new);
        STONE_PILLAR_THIN_B_TOP_ITEM = registerBlockItem("stone_pillar_thin_b_top", STONE_PILLAR_THIN_B_TOP);

        STONE_PILLAR_THIN_C_BOTTOM = registerBlock("stone_pillar_thin_c_bottom", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinCBottomBlock::new);
        STONE_PILLAR_THIN_C_BOTTOM_ITEM = registerBlockItem("stone_pillar_thin_c_bottom", STONE_PILLAR_THIN_C_BOTTOM);

        STONE_PILLAR_THIN_C_MIDDLE = registerBlock("stone_pillar_thin_c_middle", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinCMiddleBlock::new);
        STONE_PILLAR_THIN_C_MIDDLE_ITEM = registerBlockItem("stone_pillar_thin_c_middle", STONE_PILLAR_THIN_C_MIDDLE);

        STONE_PILLAR_THIN_C_SHORT = registerBlock("stone_pillar_thin_c_short", AbstractBlock.);
        STONE_PILLAR_THIN_C_SHORT_ITEM = registerBlockItem("stone_pillar_thin_c_short", STONE_PILLAR_THIN_C_SHORT);

        STONE_PILLAR_THIN_C_TOP = registerBlock("stone_pillar_thin_c_top", AbstractBlock.);
        STONE_PILLAR_THIN_C_TOP_ITEM = registerBlockItem("stone_pillar_thin_c_top", STONE_PILLAR_THIN_C_TOP);

        STONE_PILLAR_BIG_BOTTOM = registerBlock("stone_pillar_big_bottom", AbstractBlock.);
        STONE_PILLAR_BIG_BOTTOM_ITEM = registerBlockItem("stone_pillar_big_bottom", STONE_PILLAR_BIG_BOTTOM);

        STONE_PILLAR_BIG_MIDDLE = registerBlock("stone_pillar_big_middle", AbstractBlock.);
        STONE_PILLAR_BIG_MIDDLE_ITEM = registerBlockItem("stone_pillar_big_middle", STONE_PILLAR_BIG_MIDDLE);

        STONE_PILLAR_BIG_SHORT = registerBlock("stone_pillar_big_short", AbstractBlock.);
        STONE_PILLAR_BIG_SHORT_ITEM = registerBlockItem("stone_pillar_big_short", STONE_PILLAR_BIG_SHORT);

        STONE_PILLAR_BIG_TOP = registerBlock("stone_pillar_big_top", AbstractBlock.);
        STONE_PILLAR_BIG_TOP_ITEM = registerBlockItem("stone_pillar_big_top", STONE_PILLAR_BIG_TOP);

        STONE_PILLAR_BIGGER_BOTTOM = registerBlock("stone_pillar_bigger_bottom", AbstractBlock.);
        STONE_PILLAR_BIGGER_BOTTOM_ITEM = registerBlockItem("stone_pillar_bigger_bottom", STONE_PILLAR_BIGGER_BOTTOM);

        STONE_PILLAR_BIGGER_MIDDLE = registerBlock("stone_pillar_bigger_middle", AbstractBlock.);
        STONE_PILLAR_BIGGER_MIDDLE_ITEM = registerBlockItem("stone_pillar_bigger_middle", STONE_PILLAR_BIGGER_MIDDLE);

        STONE_PILLAR_BIGGER_SHORT = registerBlock("stone_pillar_bigger_short", AbstractBlock.);
        STONE_PILLAR_BIGGER_SHORT_ITEM = registerBlockItem("stone_pillar_bigger_short", STONE_PILLAR_BIGGER_SHORT);

        STONE_PILLAR_BIGGER_TOP = registerBlock("stone_pillar_bigger_top", AbstractBlock.);
        STONE_PILLAR_BIGGER_TOP_ITEM = registerBlockItem("stone_pillar_bigger_top", STONE_PILLAR_BIGGER_TOP);


        BROAD_STONE_LANTERN_BLOCK_DARK = registerBlock("broad_stone_lantern_block_dark", AbstractBlock.);
        BROAD_STONE_LANTERN_BLOCK_DARK_ITEM = registerBlockItem("broad_stone_lantern_block_dark", BROAD_STONE_LANTERN_BLOCK_DARK);


        BROAD_STONE_LANTERN_BLOCK_LIGHT = registerBlock("broad_stone_lantern_block_light", AbstractBlock.);
        BROAD_STONE_LANTERN_BLOCK_LIGHT_ITEM = registerBlockItem("broad_stone_lantern_block_light", BROAD_STONE_LANTERN_BLOCK_LIGHT);


        MID_STONE_LANTERN_BLOCK_DARK = registerBlock("mid_stone_lantern_block_dark", AbstractBlock.);
        MID_STONE_LANTERN_BLOCK_DARK_ITEM = registerBlockItem("mid_stone_lantern_block_dark", MID_STONE_LANTERN_BLOCK_DARK);


        MID_STONE_LANTERN_BLOCK_LIGHT = registerBlock("mid_stone_lantern_block_light", AbstractBlock.);
        MID_STONE_LANTERN_BLOCK_LIGHT_ITEM = registerBlockItem("mid_stone_lantern_block_light", MID_STONE_LANTERN_BLOCK_LIGHT);


        THIN_STONE_LANTERN_BLOCK_DARK = registerBlock("thin_stone_lantern_block_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), ThinStoneLanternBlockDarkBlock::new);
        THIN_STONE_LANTERN_BLOCK_DARK_ITEM = registerBlockItem("thin_stone_lantern_block_dark", THIN_STONE_LANTERN_BLOCK_DARK);


        THIN_STONE_LANTERN_BLOCK_LIGHT = registerBlock("thin_stone_lantern_block_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 15).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), ThinStoneLanternBlockLightBlock::new);
        THIN_STONE_LANTERN_BLOCK_LIGHT_ITEM = registerBlockItem("thin_stone_lantern_block_light", THIN_STONE_LANTERN_BLOCK_LIGHT);
    }
    private static Block registerBlock(String name, AbstractBlock.Settings baseSettings, java.util.function.Function<AbstractBlock.Settings, Block> blockFactory) {
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ReddensstonelanternMod.MODID, name));
        AbstractBlock.Settings settings = baseSettings.registryKey(blockKey);
        Block block = blockFactory.apply(settings);
        return Registry.register(Registries.BLOCK, Identifier.of(ReddensstonelanternMod.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ReddensstonelanternMod.MODID, name));
        return Registry.register(Registries.ITEM, Identifier.of(ReddensstonelanternMod.MODID, name), new BlockItem(block, new Item.Settings().registryKey(itemKey)));
    }
}