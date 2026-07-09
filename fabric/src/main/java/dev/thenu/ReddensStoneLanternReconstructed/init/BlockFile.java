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

    public static void register() {}

    // Lanterns
    public static Block BIG_STONE_LANTERN_BASE = registerBlock("big_stone_lantern_base", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.NORMAL).solidBlock((state, world, pos) -> false), BigStoneLanternBaseBlock::new);
    public static Block BIG_STONE_LANTERN_MID = registerBlock("big_stone_lantern_mid", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.NORMAL).solidBlock((state, world, pos) -> false), BigStoneLanternMidBlock::new);
    public static Block BIG_STONE_LANTERN_TOP_DARK = registerBlock("big_stone_lantern_top_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.NORMAL).solidBlock((state, world, pos) -> false), BigStoneLanternTopDarkBlock::new);
    public static Block BIG_STONE_LANTERN_TOP_LIGHT = registerBlock("big_stone_lantern_top_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((s) -> 15).nonOpaque().pistonBehavior(PistonBehavior.NORMAL).solidBlock((state, world, pos) -> false), BigStoneLanternTopLightBlock::new);

    public static Block BIGGER_STONE_LANTERN_BLOCK_D = registerBlock("bigger_stone_lantern_block_d", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), BiggerStoneLanternBlockDBlock::new);
    public static Block BIGGER_STONE_LANTERN_BLOCK_L = registerBlock("bigger_stone_lantern_block_l", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 15).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), BiggerStoneLanternBlockLBlock::new);
    public static Block BIGGER_STONE_LANTERN_PROOF = registerBlock("bigger_stone_lantern_proof", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), BiggerStoneLanternProofBlock::new);

    public static Block BIG_STONE_LANTERN_BLOCK_DARK = registerBlock("big_stone_lantern_block_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), BigStoneLanternBlockDarkBlock::new);
    public static Block BIG_STONE_LANTERN_BLOCK_LIGHT = registerBlock("big_stone_lantern_block_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((s) -> 15).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), BigStoneLanternBlockLightBlock::new);

    public static Block MEDIUM_STONE_LANTERN = registerBlock("medium_stone_lantern", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.BLOCK).solidBlock((state, world, pos) -> false), MediumStoneLanternBlock::new);
    public static Block MEDIUM_STONE_LANTERN_TOP_DARK = registerBlock("medium_stone_lantern_top_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.BLOCK).solidBlock((state, world, pos) -> false), MediumStoneLanternTopDarkBlock::new);
    public static Block MEDIUM_STONE_LANTERN_TOP_LIGHT = registerBlock("medium_stone_lantern_top_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 15).nonOpaque().pistonBehavior(PistonBehavior.BLOCK).solidBlock((state, world, pos) -> false), MediumStoneLanternTopLightBlock::new);


    public static Block SMALL_STONE_LANTERN_LIGHT = registerBlock("small_stone_lantern_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 14).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).dynamicBounds().solidBlock((state, world, pos) -> false), SmallStoneLanternLightBlock::new);
    public static Block SMALL_STONE_LANTERN_DARK = registerBlock("small_stone_lantern_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).dynamicBounds().solidBlock((state, world, pos) -> false), SmallStoneLanternDarkBlock::new);

    public static Block MINI_STONE_LANTERN_DARK = registerBlock("mini_stone_lantern_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), MiniStoneLanternDarkBlock::new);
    public static Block MINI_STONE_LANTERN_LIGHT = registerBlock("mini_stone_lantern_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 13).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), MiniStoneLanternLightBlock::new);

    public static Block SMALLFOOT_STONE_LANTERN_DARK = registerBlock("smallfoot_stone_lantern_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), SmallfootStoneLanternDarkBlock::new);
    public static Block SMALLFOOT_STONE_LANTERN_LIGHT = registerBlock("smallfoot_stone_lantern_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 14).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), SmallfootStoneLanternLightBlock::new);

    /*
    public static Block SMALLPROOF_STONE_LANTERN_DARK = registerBlock("smallproof_stone_lantern_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), SmallproofStoneLanternDarkBlock::new);
    public static Block SMALLPROOF_STONE_LANTERN_LIGHT = registerBlock("smallproof_stone_lantern_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 14).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), SmallproofStoneLanternLightBlock::new);
    */

    public static Block SMALLNOPROOF_STONE_LANTERN_DARK = registerBlock("smallnoproof_stone_lantern_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), SmallnoproofStoneLanternDarkBlock::new);
    public static Block SMALLNOPROOF_STONE_LANTERN_LIGHT = registerBlock("smallnoproof_stone_lantern_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 14).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), SmallnoproofStoneLanternLightBlock::new);

    public static Block MININOPROOF_STONE_LANTERN_DARK = registerBlock("mininoproof_stone_lantern_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), MininoproofStoneLanternDarkBlock::new);
    public static Block MININOPROOF_STONE_LANTERN_LIGHT = registerBlock("mininoproof_stone_lantern_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 13).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), MininoproofStoneLanternLightBlock::new);

    // Pillars
    public static Block STONE_PILLAR_MID_BOTTOM = registerBlock("stone_pillar_mid_bottom", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarMidBottomBlock::new);
    public static Block STONE_PILLAR_MID_TOP = registerBlock("stone_pillar_mid_top", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarMidTopBlock::new);
    public static Block STONE_PILLAR_MID_MIDDLE = registerBlock("stone_pillar_mid_middle", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarMidMiddleBlock::new);
    public static Block STONE_PILLAR_MID_SHORT = registerBlock("stone_pillar_mid_short", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarMidShortBlock::new);

    public static Block STONE_PILLAR_THIN_A_TOP = registerBlock("stone_pillar_thin_a_top", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinATopBlock::new);
    public static Block STONE_PILLAR_THIN_A_BOTTOM = registerBlock("stone_pillar_thin_a_bottom", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinABottomBlock::new);
    public static Block STONE_PILLAR_THIN_A_SHORT = registerBlock("stone_pillar_thin_a_short", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinAShortBlock::new);

    public static Block STONE_PILLAR_THIN_B_BOTTOM = registerBlock("stone_pillar_thin_b_bottom", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinBBottomBlock::new);
    public static Block STONE_PILLAR_THIN_B_SHORT = registerBlock("stone_pillar_thin_b_short", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinBShortBlock::new);
    public static Block STONE_PILLAR_THIN_B_TOP = registerBlock("stone_pillar_thin_b_top", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinBTopBlock::new);

    public static Block STONE_PILLAR_THIN_C_BOTTOM = registerBlock("stone_pillar_thin_c_bottom", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinCBottomBlock::new);
    public static Block STONE_PILLAR_THIN_C_MIDDLE = registerBlock("stone_pillar_thin_c_middle", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinCMiddleBlock::new);
    public static Block STONE_PILLAR_THIN_C_SHORT = registerBlock("stone_pillar_thin_c_short", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinCShortBlock::new);
    public static Block STONE_PILLAR_THIN_C_TOP = registerBlock("stone_pillar_thin_c_top", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarThinCTopBlock::new);

    public static Block STONE_PILLAR_BIG_BOTTOM = registerBlock("stone_pillar_big_bottom", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarBigBottomBlock::new);
    public static Block STONE_PILLAR_BIG_MIDDLE = registerBlock("stone_pillar_big_middle", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarBigMiddleBlock::new);
    public static Block STONE_PILLAR_BIG_SHORT = registerBlock("stone_pillar_big_short", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarBigShortBlock::new);
    public static Block STONE_PILLAR_BIG_TOP = registerBlock("stone_pillar_big_top", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarBigTopBlock::new);

    public static Block STONE_PILLAR_BIGGER_BOTTOM = registerBlock("stone_pillar_bigger_bottom", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarBiggerBottomBlock::new);
    public static Block STONE_PILLAR_BIGGER_MIDDLE = registerBlock("stone_pillar_bigger_middle", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarBiggerMiddleBlock::new);
    public static Block STONE_PILLAR_BIGGER_SHORT = registerBlock("stone_pillar_bigger_short", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarBiggerShortBlock::new);
    public static Block STONE_PILLAR_BIGGER_TOP = registerBlock("stone_pillar_bigger_top", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), StonePillarBiggerTopBlock::new);

    public static Block BROAD_STONE_LANTERN_BLOCK_DARK = registerBlock("broad_stone_lantern_block_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), BroadStoneLanternBlockDarkBlock::new);
    public static Block BROAD_STONE_LANTERN_BLOCK_LIGHT = registerBlock("broad_stone_lantern_block_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 15).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), BroadStoneLanternBlockLightBlock::new);
    public static Block BROAD_STONE_LANTERN = registerBlock("broad_stone_lantern", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.BLOCK).solidBlock((state, world, pos) -> false), BroadStoneLanternBlock::new);
    public static Block BROAD_STONE_LANTERN_TOP_DARK = registerBlock("broad_stone_lantern_top_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.BLOCK).solidBlock((state, world, pos) -> false), BroadStoneLanternTopDarkBlock::new);
    public static Block BROAD_STONE_LANTERN_TOP_LIGHT = registerBlock("broad_stone_lantern_top_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 15).nonOpaque().pistonBehavior(PistonBehavior.BLOCK).solidBlock((state, world, pos) -> false), BroadStoneLanternTopLightBlock::new);

    public static Block MID_STONE_LANTERN_BLOCK_DARK = registerBlock("mid_stone_lantern_block_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), MidStoneLanternBlockDarkBlock::new);
    public static Block MID_STONE_LANTERN_BLOCK_LIGHT = registerBlock("mid_stone_lantern_block_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 15).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), MidStoneLanternBlockLightBlock::new);

    public static Block THIN_STONE_LANTERN_BLOCK_DARK = registerBlock("thin_stone_lantern_block_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), ThinStoneLanternBlockDarkBlock::new);
    public static Block THIN_STONE_LANTERN_BLOCK_LIGHT = registerBlock("thin_stone_lantern_block_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 15).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).solidBlock((state, world, pos) -> false), ThinStoneLanternBlockLightBlock::new);
    public static Block THIN_STONE_LANTERN = registerBlock("thin_stone_lantern", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.NORMAL).solidBlock((state, world, pos) -> false), ThinStoneLanternBlock::new);
    public static Block THIN_STONE_LANTERN_TOP_DARK = registerBlock("thin_stone_lantern_top_dark", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).nonOpaque().pistonBehavior(PistonBehavior.NORMAL).solidBlock((state, world, pos) -> false), ThinStoneLanternTopDarkBlock::new);
    public static Block THIN_STONE_LANTERN_TOP_LIGHT = registerBlock("thin_stone_lantern_top_light", AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).sounds(BlockSoundGroup.STONE).strength(1.0F, 10.0F).luminance((state) -> 15).nonOpaque().pistonBehavior(PistonBehavior.NORMAL).solidBlock((state, world, pos) -> false), ThinStoneLanternTopLightBlock::new);


    private static Block registerBlock(String name, AbstractBlock.Settings baseSettings, java.util.function.Function<AbstractBlock.Settings, Block> blockFactory) {
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ReddensstonelanternMod.MODID, name));
        AbstractBlock.Settings settings = baseSettings.registryKey(blockKey);
        Block block = blockFactory.apply(settings);
        Block registeredBlock = Registry.register(Registries.BLOCK, blockKey, block);
        registerBlockItem(name, registeredBlock);
        return registeredBlock;
    }

    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ReddensstonelanternMod.MODID, name));
        Registry.register(Registries.ITEM, Identifier.of(ReddensstonelanternMod.MODID, name), new BlockItem(block, new Item.Settings().registryKey(itemKey)));
    }
}