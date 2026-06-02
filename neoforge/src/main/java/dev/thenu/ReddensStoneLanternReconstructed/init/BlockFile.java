package dev.thenu.ReddensStoneLanternReconstructed.init;

import dev.thenu.ReddensStoneLanternReconstructed.blockType.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlockFile {


    // 1. Unified Registries
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks("reddensstonelantern");
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("reddensstonelantern");

    // 2. Block Declarations
    public static final DeferredBlock<Block> MEDIUM_STONE_LANTERN;
    public static final DeferredBlock<Block> MEDIUM_STONE_LANTERN_TOP_DARK;
    public static final DeferredBlock<Block> MEDIUM_STONE_LANTERN_TOP_LIGHT;
    public static final DeferredBlock<Block> THIN_STONE_LANTERN;
    public static final DeferredBlock<Block> THIN_STONE_LANTERN_TOP_DARK;
    public static final DeferredBlock<Block> THIN_STONE_LANTERN_TOP_LIGHT;
    public static final DeferredBlock<Block> BROAD_STONE_LANTERN;
    public static final DeferredBlock<Block> BROAD_STONE_LANTERN_TOP_DARK;
    public static final DeferredBlock<Block> BROAD_STONE_LANTERN_TOP_LIGHT;
    public static final DeferredBlock<Block> SMALL_STONE_LANTERN_LIGHT;
    public static final DeferredBlock<Block> SMALL_STONE_LANTERN_DARK;
    public static final DeferredBlock<Block> MINI_STONE_LANTERN_DARK;
    public static final DeferredBlock<Block> MINI_STONE_LANTERN_LIGHT;
    public static final DeferredBlock<Block> SMALLFOOT_STONE_LANTERN_DARK;
    public static final DeferredBlock<Block> SMALLFOOT_STONE_LANTERN_LIGHT;
    public static final DeferredBlock<Block> SMALLPROOF_STONE_LANTERN_DARK;
    public static final DeferredBlock<Block> SMALLPROOF_STONE_LANTERN_LIGHT;
    public static final DeferredBlock<Block> SMALLNOPROOF_STONE_LANTERN_DARK;
    public static final DeferredBlock<Block> SMALLNOPROOF_STONE_LANTERN_LIGHT;
    public static final DeferredBlock<Block> MININOPROOF_STONE_LANTERN_DARK;
    public static final DeferredBlock<Block> MININOPROOF_STONE_LANTERN_LIGHT;
    public static final DeferredBlock<Block> STONE_PILLAR_THIN_A_SHORT;
    public static final DeferredBlock<Block> STONE_PILLAR_MID_BOTTOM;
    public static final DeferredBlock<Block> STONE_PILLAR_MID_TOP;
    public static final DeferredBlock<Block> STONE_PILLAR_MID_MIDDLE;
    public static final DeferredBlock<Block> STONE_PILLAR_MID_SHORT;
    public static final DeferredBlock<Block> STONE_PILLAR_THIN_A_TOP;
    public static final DeferredBlock<Block> STONE_PILLAR_THIN_A_BOTTOM;
    public static final DeferredBlock<Block> STONE_PILLAR_THIN_B_BOTTOM;
    public static final DeferredBlock<Block> STONE_PILLAR_THIN_B_SHORT;
    public static final DeferredBlock<Block> STONE_PILLAR_THIN_B_TOP;
    public static final DeferredBlock<Block> STONE_PILLAR_THIN_C_BOTTOM;
    public static final DeferredBlock<Block> STONE_PILLAR_THIN_C_MIDDLE;
    public static final DeferredBlock<Block> STONE_PILLAR_THIN_C_SHORT;
    public static final DeferredBlock<Block> STONE_PILLAR_THIN_C_TOP;
    public static final DeferredBlock<Block> STONE_PILLAR_BIG_BOTTOM;
    public static final DeferredBlock<Block> STONE_PILLAR_BIG_MIDDLE;
    public static final DeferredBlock<Block> STONE_PILLAR_BIG_SHORT;
    public static final DeferredBlock<Block> STONE_PILLAR_BIG_TOP;
    public static final DeferredBlock<Block> STONE_PILLAR_BIGGER_BOTTOM;
    public static final DeferredBlock<Block> STONE_PILLAR_BIGGER_MIDDLE;
    public static final DeferredBlock<Block> STONE_PILLAR_BIGGER_SHORT;
    public static final DeferredBlock<Block> STONE_PILLAR_BIGGER_TOP;
    public static final DeferredBlock<Block> BIG_STONE_LANTERN_BASE;
    public static final DeferredBlock<Block> BIG_STONE_LANTERN_MID;
    public static final DeferredBlock<Block> BIG_STONE_LANTERN_TOP_LIGHT;
    public static final DeferredBlock<Block> BIG_STONE_LANTERN_TOP_DARK;
    public static final DeferredBlock<Block> BIGGER_STONE_LANTERN_BLOCK_D;
    public static final DeferredBlock<Block> BIGGER_STONE_LANTERN_BLOCK_L;
    public static final DeferredBlock<Block> BIGGER_STONE_LANTERN_PROOF;
    public static final DeferredBlock<Block> BIG_STONE_LANTERN_BLOCK_DARK;
    public static final DeferredBlock<Block> BIG_STONE_LANTERN_BLOCK_LIGHT;
    public static final DeferredBlock<Block> BROAD_STONE_LANTERN_BLOCK_DARK;
    public static final DeferredBlock<Block> BROAD_STONE_LANTERN_BLOCK_LIGHT;
    public static final DeferredBlock<Block> MID_STONE_LANTERN_BLOCK_DARK;
    public static final DeferredBlock<Block> MID_STONE_LANTERN_BLOCK_LIGHT;
    public static final DeferredBlock<Block> THIN_STONE_LANTERN_BLOCK_DARK;
    public static final DeferredBlock<Block> THIN_STONE_LANTERN_BLOCK_LIGHT;

    // 3. Corresponding Item Declarations
    public static final DeferredItem<Item> MEDIUM_STONE_LANTERN_ITEM;
    public static final DeferredItem<Item> MEDIUM_STONE_LANTERN_TOP_DARK_ITEM;
    public static final DeferredItem<Item> MEDIUM_STONE_LANTERN_TOP_LIGHT_ITEM;
    public static final DeferredItem<Item> THIN_STONE_LANTERN_ITEM;
    public static final DeferredItem<Item> THIN_STONE_LANTERN_TOP_DARK_ITEM;
    public static final DeferredItem<Item> THIN_STONE_LANTERN_TOP_LIGHT_ITEM;
    public static final DeferredItem<Item> BROAD_STONE_LANTERN_ITEM;
    public static final DeferredItem<Item> BROAD_STONE_LANTERN_TOP_DARK_ITEM;
    public static final DeferredItem<Item> BROAD_STONE_LANTERN_TOP_LIGHT_ITEM;
    public static final DeferredItem<Item> SMALL_STONE_LANTERN_LIGHT_ITEM;
    public static final DeferredItem<Item> SMALL_STONE_LANTERN_DARK_ITEM;
    public static final DeferredItem<Item> MINI_STONE_LANTERN_DARK_ITEM;
    public static final DeferredItem<Item> MINI_STONE_LANTERN_LIGHT_ITEM;
    public static final DeferredItem<Item> SMALLFOOT_STONE_LANTERN_DARK_ITEM;
    public static final DeferredItem<Item> SMALLFOOT_STONE_LANTERN_LIGHT_ITEM;
    public static final DeferredItem<Item> SMALLPROOF_STONE_LANTERN_DARK_ITEM;
    public static final DeferredItem<Item> SMALLPROOF_STONE_LANTERN_LIGHT_ITEM;
    public static final DeferredItem<Item> SMALLNOPROOF_STONE_LANTERN_DARK_ITEM;
    public static final DeferredItem<Item> SMALLNOPROOF_STONE_LANTERN_LIGHT_ITEM;
    public static final DeferredItem<Item> MININOPROOF_STONE_LANTERN_DARK_ITEM;
    public static final DeferredItem<Item> MININOPROOF_STONE_LANTERN_LIGHT_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_THIN_A_SHORT_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_MID_BOTTOM_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_MID_TOP_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_MID_MIDDLE_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_MID_SHORT_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_THIN_A_TOP_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_THIN_A_BOTTOM_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_THIN_B_BOTTOM_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_THIN_B_SHORT_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_THIN_B_TOP_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_THIN_C_BOTTOM_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_THIN_C_MIDDLE_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_THIN_C_SHORT_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_THIN_C_TOP_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_BIG_BOTTOM_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_BIG_MIDDLE_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_BIG_SHORT_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_BIG_TOP_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_BIGGER_BOTTOM_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_BIGGER_MIDDLE_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_BIGGER_SHORT_ITEM;
    public static final DeferredItem<Item> STONE_PILLAR_BIGGER_TOP_ITEM;
    public static final DeferredItem<Item> BIG_STONE_LANTERN_BASE_ITEM;
    public static final DeferredItem<Item> BIG_STONE_LANTERN_MID_ITEM;
    public static final DeferredItem<Item> BIG_STONE_LANTERN_TOP_LIGHT_ITEM;
    public static final DeferredItem<Item> BIG_STONE_LANTERN_TOP_DARK_ITEM;
    public static final DeferredItem<Item> BIGGER_STONE_LANTERN_BLOCK_D_ITEM;
    public static final DeferredItem<Item> BIGGER_STONE_LANTERN_BLOCK_L_ITEM;
    public static final DeferredItem<Item> BIGGER_STONE_LANTERN_PROOF_ITEM;
    public static final DeferredItem<Item> BIG_STONE_LANTERN_BLOCK_DARK_ITEM;
    public static final DeferredItem<Item> BIG_STONE_LANTERN_BLOCK_LIGHT_ITEM;
    public static final DeferredItem<Item> BROAD_STONE_LANTERN_BLOCK_DARK_ITEM;
    public static final DeferredItem<Item> BROAD_STONE_LANTERN_BLOCK_LIGHT_ITEM;
    public static final DeferredItem<Item> MID_STONE_LANTERN_BLOCK_DARK_ITEM;
    public static final DeferredItem<Item> MID_STONE_LANTERN_BLOCK_LIGHT_ITEM;
    public static final DeferredItem<Item> THIN_STONE_LANTERN_BLOCK_DARK_ITEM;
    public static final DeferredItem<Item> THIN_STONE_LANTERN_BLOCK_LIGHT_ITEM;

    // 4. Integrated Helper Methods
    private static <T extends Block> DeferredBlock<Block> registerBlock(String name, Supplier<T> blockSupplier) {
        return BLOCKS.register(name, blockSupplier);
    }

    private static DeferredItem<Item> registerBlockItem(DeferredBlock<Block> blockBlock) {
        // Automatically names the BlockItem object to match its Block registry path precisely
        return ITEMS.register(blockBlock.getId().getPath(), () -> new BlockItem(blockBlock.get(), new Item.Properties()));
    }

    // 5. Registration Assignments
    static {
        MEDIUM_STONE_LANTERN = registerBlock("medium_stone_lantern", MediumStoneLanternBlock::new);
        MEDIUM_STONE_LANTERN_ITEM = registerBlockItem(MEDIUM_STONE_LANTERN);

        MEDIUM_STONE_LANTERN_TOP_DARK = registerBlock("medium_stone_lantern_top_dark", MediumStoneLanternTopDarkBlock::new);
        MEDIUM_STONE_LANTERN_TOP_DARK_ITEM = registerBlockItem(MEDIUM_STONE_LANTERN_TOP_DARK);

        MEDIUM_STONE_LANTERN_TOP_LIGHT = registerBlock("medium_stone_lantern_top_light", MediumStoneLanternTopLightBlock::new);
        MEDIUM_STONE_LANTERN_TOP_LIGHT_ITEM = registerBlockItem(MEDIUM_STONE_LANTERN_TOP_LIGHT);

        THIN_STONE_LANTERN = registerBlock("thin_stone_lantern", ThinStoneLanternBlock::new);
        THIN_STONE_LANTERN_ITEM = registerBlockItem(THIN_STONE_LANTERN);

        THIN_STONE_LANTERN_TOP_DARK = registerBlock("thin_stone_lantern_top_dark", ThinStoneLanternTopDarkBlock::new);
        THIN_STONE_LANTERN_TOP_DARK_ITEM = registerBlockItem(THIN_STONE_LANTERN_TOP_DARK);

        THIN_STONE_LANTERN_TOP_LIGHT = registerBlock("thin_stone_lantern_top_light", ThinStoneLanternTopLightBlock::new);
        THIN_STONE_LANTERN_TOP_LIGHT_ITEM = registerBlockItem(THIN_STONE_LANTERN_TOP_LIGHT);

        BROAD_STONE_LANTERN = registerBlock("broad_stone_lantern", BroadStoneLanternBlock::new);
        BROAD_STONE_LANTERN_ITEM = registerBlockItem(BROAD_STONE_LANTERN);

        BROAD_STONE_LANTERN_TOP_DARK = registerBlock("broad_stone_lantern_top_dark", BroadStoneLanternTopDarkBlock::new);
        BROAD_STONE_LANTERN_TOP_DARK_ITEM = registerBlockItem(BROAD_STONE_LANTERN_TOP_DARK);

        BROAD_STONE_LANTERN_TOP_LIGHT = registerBlock("broad_stone_lantern_top_light", BroadStoneLanternTopLightBlock::new);
        BROAD_STONE_LANTERN_TOP_LIGHT_ITEM = registerBlockItem(BROAD_STONE_LANTERN_TOP_LIGHT);

        SMALL_STONE_LANTERN_LIGHT = registerBlock("small_stone_lantern_light", SmallStoneLanternLightBlock::new);
        SMALL_STONE_LANTERN_LIGHT_ITEM = registerBlockItem(SMALL_STONE_LANTERN_LIGHT);

        SMALL_STONE_LANTERN_DARK = registerBlock("small_stone_lantern_dark", SmallStoneLanternDarkBlock::new);
        SMALL_STONE_LANTERN_DARK_ITEM = registerBlockItem(SMALL_STONE_LANTERN_DARK);

        MINI_STONE_LANTERN_DARK = registerBlock("mini_stone_lantern_dark", MiniStoneLanternDarkBlock::new);
        MINI_STONE_LANTERN_DARK_ITEM = registerBlockItem(MINI_STONE_LANTERN_DARK);

        MINI_STONE_LANTERN_LIGHT = registerBlock("mini_stone_lantern_light", MiniStoneLanternLightBlock::new);
        MINI_STONE_LANTERN_LIGHT_ITEM = registerBlockItem(MINI_STONE_LANTERN_LIGHT);

        SMALLFOOT_STONE_LANTERN_DARK = registerBlock("smallfoot_stone_lantern_dark", SmallfootStoneLanternDarkBlock::new);
        SMALLFOOT_STONE_LANTERN_DARK_ITEM = registerBlockItem(SMALLFOOT_STONE_LANTERN_DARK);

        SMALLFOOT_STONE_LANTERN_LIGHT = registerBlock("smallfoot_stone_lantern_light", SmallfootStoneLanternLightBlock::new);
        SMALLFOOT_STONE_LANTERN_LIGHT_ITEM = registerBlockItem(SMALLFOOT_STONE_LANTERN_LIGHT);

        SMALLPROOF_STONE_LANTERN_DARK = registerBlock("smallproof_stone_lantern_dark", SmallproofStoneLanternDarkBlock::new);
        SMALLPROOF_STONE_LANTERN_DARK_ITEM = registerBlockItem(SMALLPROOF_STONE_LANTERN_DARK);

        SMALLPROOF_STONE_LANTERN_LIGHT = registerBlock("smallproof_stone_lantern_light", SmallproofStoneLanternLightBlock::new);
        SMALLPROOF_STONE_LANTERN_LIGHT_ITEM = registerBlockItem(SMALLPROOF_STONE_LANTERN_LIGHT);

        SMALLNOPROOF_STONE_LANTERN_DARK = registerBlock("smallnoproof_stone_lantern_dark", SmallnoproofStoneLanternDarkBlock::new);
        SMALLNOPROOF_STONE_LANTERN_DARK_ITEM = registerBlockItem(SMALLNOPROOF_STONE_LANTERN_DARK);

        SMALLNOPROOF_STONE_LANTERN_LIGHT = registerBlock("smallnoproof_stone_lantern_light", SmallnoproofStoneLanternLightBlock::new);
        SMALLNOPROOF_STONE_LANTERN_LIGHT_ITEM = registerBlockItem(SMALLNOPROOF_STONE_LANTERN_LIGHT);

        MININOPROOF_STONE_LANTERN_DARK = registerBlock("mininoproof_stone_lantern_dark", MininoproofStoneLanternDarkBlock::new);
        MININOPROOF_STONE_LANTERN_DARK_ITEM = registerBlockItem(MININOPROOF_STONE_LANTERN_DARK);

        MININOPROOF_STONE_LANTERN_LIGHT = registerBlock("mininoproof_stone_lantern_light", MininoproofStoneLanternLightBlock::new);
        MININOPROOF_STONE_LANTERN_LIGHT_ITEM = registerBlockItem(MININOPROOF_STONE_LANTERN_LIGHT);

        STONE_PILLAR_THIN_A_SHORT = registerBlock("stone_pillar_thin_a_short", StonePillarThinAShortBlock::new);
        STONE_PILLAR_THIN_A_SHORT_ITEM = registerBlockItem(STONE_PILLAR_THIN_A_SHORT);

        STONE_PILLAR_MID_BOTTOM = registerBlock("stone_pillar_mid_bottom", StonePillarMidBottomBlock::new);
        STONE_PILLAR_MID_BOTTOM_ITEM = registerBlockItem(STONE_PILLAR_MID_BOTTOM);

        STONE_PILLAR_MID_TOP = registerBlock("stone_pillar_mid_top", StonePillarMidTopBlock::new);
        STONE_PILLAR_MID_TOP_ITEM = registerBlockItem(STONE_PILLAR_MID_TOP);

        STONE_PILLAR_MID_MIDDLE = registerBlock("stone_pillar_mid_middle", StonePillarMidMiddleBlock::new);
        STONE_PILLAR_MID_MIDDLE_ITEM = registerBlockItem(STONE_PILLAR_MID_MIDDLE);

        STONE_PILLAR_MID_SHORT = registerBlock("stone_pillar_mid_short", StonePillarMidShortBlock::new);
        STONE_PILLAR_MID_SHORT_ITEM = registerBlockItem(STONE_PILLAR_MID_SHORT);

        STONE_PILLAR_THIN_A_TOP = registerBlock("stone_pillar_thin_a_top", StonePillarThinATopBlock::new);
        STONE_PILLAR_THIN_A_TOP_ITEM = registerBlockItem(STONE_PILLAR_THIN_A_TOP);

        STONE_PILLAR_THIN_A_BOTTOM = registerBlock("stone_pillar_thin_a_bottom", StonePillarThinABottomBlock::new);
        STONE_PILLAR_THIN_A_BOTTOM_ITEM = registerBlockItem(STONE_PILLAR_THIN_A_BOTTOM);

        STONE_PILLAR_THIN_B_BOTTOM = registerBlock("stone_pillar_thin_b_bottom", StonePillarThinBBottomBlock::new);
        STONE_PILLAR_THIN_B_BOTTOM_ITEM = registerBlockItem(STONE_PILLAR_THIN_B_BOTTOM);

        STONE_PILLAR_THIN_B_SHORT = registerBlock("stone_pillar_thin_b_short", StonePillarThinBShortBlock::new);
        STONE_PILLAR_THIN_B_SHORT_ITEM = registerBlockItem(STONE_PILLAR_THIN_B_SHORT);

        STONE_PILLAR_THIN_B_TOP = registerBlock("stone_pillar_thin_b_top", StonePillarThinBTopBlock::new);
        STONE_PILLAR_THIN_B_TOP_ITEM = registerBlockItem(STONE_PILLAR_THIN_B_TOP);

        STONE_PILLAR_THIN_C_BOTTOM = registerBlock("stone_pillar_thin_c_bottom", StonePillarThinCBottomBlock::new);
        STONE_PILLAR_THIN_C_BOTTOM_ITEM = registerBlockItem(STONE_PILLAR_THIN_C_BOTTOM);

        STONE_PILLAR_THIN_C_MIDDLE = registerBlock("stone_pillar_thin_c_middle", StonePillarThinCMiddleBlock::new);
        STONE_PILLAR_THIN_C_MIDDLE_ITEM = registerBlockItem(STONE_PILLAR_THIN_C_MIDDLE);

        STONE_PILLAR_THIN_C_SHORT = registerBlock("stone_pillar_thin_c_short", StonePillarThinCShortBlock::new);
        STONE_PILLAR_THIN_C_SHORT_ITEM = registerBlockItem(STONE_PILLAR_THIN_C_SHORT);

        STONE_PILLAR_THIN_C_TOP = registerBlock("stone_pillar_thin_c_top", StonePillarThinCTopBlock::new);
        STONE_PILLAR_THIN_C_TOP_ITEM = registerBlockItem(STONE_PILLAR_THIN_C_TOP);

        STONE_PILLAR_BIG_BOTTOM = registerBlock("stone_pillar_big_bottom", StonePillarBigBottomBlock::new);
        STONE_PILLAR_BIG_BOTTOM_ITEM = registerBlockItem(STONE_PILLAR_BIG_BOTTOM);

        STONE_PILLAR_BIG_MIDDLE = registerBlock("stone_pillar_big_middle", StonePillarBigMiddleBlock::new);
        STONE_PILLAR_BIG_MIDDLE_ITEM = registerBlockItem(STONE_PILLAR_BIG_MIDDLE);

        STONE_PILLAR_BIG_SHORT = registerBlock("stone_pillar_big_short", StonePillarBigShortBlock::new);
        STONE_PILLAR_BIG_SHORT_ITEM = registerBlockItem(STONE_PILLAR_BIG_SHORT);

        STONE_PILLAR_BIG_TOP = registerBlock("stone_pillar_big_top", StonePillarBigTopBlock::new);
        STONE_PILLAR_BIG_TOP_ITEM = registerBlockItem(STONE_PILLAR_BIG_TOP);

        STONE_PILLAR_BIGGER_BOTTOM = registerBlock("stone_pillar_bigger_bottom", StonePillarBiggerBottomBlock::new);
        STONE_PILLAR_BIGGER_BOTTOM_ITEM = registerBlockItem(STONE_PILLAR_BIGGER_BOTTOM);

        STONE_PILLAR_BIGGER_MIDDLE = registerBlock("stone_pillar_bigger_middle", StonePillarBiggerMiddleBlock::new);
        STONE_PILLAR_BIGGER_MIDDLE_ITEM = registerBlockItem(STONE_PILLAR_BIGGER_MIDDLE);

        STONE_PILLAR_BIGGER_SHORT = registerBlock("stone_pillar_bigger_short", StonePillarBiggerShortBlock::new);
        STONE_PILLAR_BIGGER_SHORT_ITEM = registerBlockItem(STONE_PILLAR_BIGGER_SHORT);

        STONE_PILLAR_BIGGER_TOP = registerBlock("stone_pillar_bigger_top", StonePillarBiggerTopBlock::new);
        STONE_PILLAR_BIGGER_TOP_ITEM = registerBlockItem(STONE_PILLAR_BIGGER_TOP);

        BIG_STONE_LANTERN_BASE = registerBlock("big_stone_lantern_base", BigStoneLanternBaseBlock::new);
        BIG_STONE_LANTERN_BASE_ITEM = registerBlockItem(BIG_STONE_LANTERN_BASE);

        BIG_STONE_LANTERN_MID = registerBlock("big_stone_lantern_mid", BigStoneLanternMidBlock::new);
        BIG_STONE_LANTERN_MID_ITEM = registerBlockItem(BIG_STONE_LANTERN_MID);

        BIG_STONE_LANTERN_TOP_LIGHT = registerBlock("big_stone_lantern_top_light", BigStoneLanternTopLightBlock::new);
        BIG_STONE_LANTERN_TOP_LIGHT_ITEM = registerBlockItem(BIG_STONE_LANTERN_TOP_LIGHT);

        BIG_STONE_LANTERN_TOP_DARK = registerBlock("big_stone_lantern_top_dark", BigStoneLanternTopDarkBlock::new);
        BIG_STONE_LANTERN_TOP_DARK_ITEM = registerBlockItem(BIG_STONE_LANTERN_TOP_DARK);

        BIGGER_STONE_LANTERN_BLOCK_D = registerBlock("bigger_stone_lantern_block_d", BiggerStoneLanternBlockDBlock::new);
        BIGGER_STONE_LANTERN_BLOCK_D_ITEM = registerBlockItem(BIGGER_STONE_LANTERN_BLOCK_D);

        BIGGER_STONE_LANTERN_BLOCK_L = registerBlock("bigger_stone_lantern_block_l", BiggerStoneLanternBlockLBlock::new);
        BIGGER_STONE_LANTERN_BLOCK_L_ITEM = registerBlockItem(BIGGER_STONE_LANTERN_BLOCK_L);

        BIGGER_STONE_LANTERN_PROOF = registerBlock("bigger_stone_lantern_proof", BiggerStoneLanternProofBlock::new);
        BIGGER_STONE_LANTERN_PROOF_ITEM = registerBlockItem(BIGGER_STONE_LANTERN_PROOF);

        BIG_STONE_LANTERN_BLOCK_DARK = registerBlock("big_stone_lantern_block_dark", BigStoneLanternBlockDarkBlock::new);
        BIG_STONE_LANTERN_BLOCK_DARK_ITEM = registerBlockItem(BIG_STONE_LANTERN_BLOCK_DARK);

        BIG_STONE_LANTERN_BLOCK_LIGHT = registerBlock("big_stone_lantern_block_light", BigStoneLanternBlockLightBlock::new);
        BIG_STONE_LANTERN_BLOCK_LIGHT_ITEM = registerBlockItem(BIG_STONE_LANTERN_BLOCK_LIGHT);

        BROAD_STONE_LANTERN_BLOCK_DARK = registerBlock("broad_stone_lantern_block_dark", BroadStoneLanternBlockDarkBlock::new);
        BROAD_STONE_LANTERN_BLOCK_DARK_ITEM = registerBlockItem(BROAD_STONE_LANTERN_BLOCK_DARK);

        BROAD_STONE_LANTERN_BLOCK_LIGHT = registerBlock("broad_stone_lantern_block_light", BroadStoneLanternBlockLightBlock::new);
        BROAD_STONE_LANTERN_BLOCK_LIGHT_ITEM = registerBlockItem(BROAD_STONE_LANTERN_BLOCK_LIGHT);

        MID_STONE_LANTERN_BLOCK_DARK = registerBlock("mid_stone_lantern_block_dark", MidStoneLanternBlockDarkBlock::new);
        MID_STONE_LANTERN_BLOCK_DARK_ITEM = registerBlockItem(MID_STONE_LANTERN_BLOCK_DARK);

        MID_STONE_LANTERN_BLOCK_LIGHT = registerBlock("mid_stone_lantern_block_light", MidStoneLanternBlockLightBlock::new);
        MID_STONE_LANTERN_BLOCK_LIGHT_ITEM = registerBlockItem(MID_STONE_LANTERN_BLOCK_LIGHT);

        THIN_STONE_LANTERN_BLOCK_DARK = registerBlock("thin_stone_lantern_block_dark", ThinStoneLanternBlockDarkBlock::new);
        THIN_STONE_LANTERN_BLOCK_DARK_ITEM = registerBlockItem(THIN_STONE_LANTERN_BLOCK_DARK);

        THIN_STONE_LANTERN_BLOCK_LIGHT = registerBlock("thin_stone_lantern_block_light", ThinStoneLanternBlockLightBlock::new);
        THIN_STONE_LANTERN_BLOCK_LIGHT_ITEM = registerBlockItem(THIN_STONE_LANTERN_BLOCK_LIGHT);
    }
}