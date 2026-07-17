package dev.thenu.ReddensStoneLanternReconstructed.init;

import dev.thenu.ReddensStoneLanternReconstructed.ReddensstonelanternMod;
import dev.thenu.ReddensStoneLanternReconstructed.blockType.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.awt.*;
import java.util.function.Function;

public class BlockFile {


    public static void register() {}

    // Lanterns
    public static Block BIG_STONE_LANTERN_BASE           = registerBlock("big_stone_lantern_base",           properties -> new BigStoneLanternBaseBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.NORMAL).forceSolidOn()));
    public static Block BIG_STONE_LANTERN_MID            = registerBlock("big_stone_lantern_mid",            properties -> new BigStoneLanternMidBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.NORMAL).forceSolidOn()));
    public static Block BIG_STONE_LANTERN_TOP_DARK       = registerBlock("big_stone_lantern_top_dark",       properties -> new BigStoneLanternTopDarkBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.NORMAL).forceSolidOn()));
    public static Block BIG_STONE_LANTERN_TOP_LIGHT      = registerBlock("big_stone_lantern_top_light",      properties -> new BigStoneLanternTopLightBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 15).noOcclusion().pushReaction(PushReaction.NORMAL).forceSolidOn()));

    public static Block BIGGER_STONE_LANTERN_BLOCK_D     = registerBlock("bigger_stone_lantern_block_d",     properties -> new BiggerStoneLanternBlockDBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block BIGGER_STONE_LANTERN_BLOCK_L     = registerBlock("bigger_stone_lantern_block_l",     properties -> new BiggerStoneLanternBlockLBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block BIGGER_STONE_LANTERN_PROOF       = registerBlock("bigger_stone_lantern_proof",       properties -> new BiggerStoneLanternProofBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));

    public static Block BIG_STONE_LANTERN_BLOCK_DARK     = registerBlock("big_stone_lantern_block_dark",     properties -> new BigStoneLanternBlockDarkBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block BIG_STONE_LANTERN_BLOCK_LIGHT    = registerBlock("big_stone_lantern_block_light",    properties -> new BigStoneLanternBlockLightBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));

    public static Block MEDIUM_STONE_LANTERN             = registerBlock("medium_stone_lantern",             properties -> new MediumStoneLanternBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.BLOCK).forceSolidOn()));
    public static Block MEDIUM_STONE_LANTERN_TOP_DARK    = registerBlock("medium_stone_lantern_top_dark",    properties -> new MediumStoneLanternTopDarkBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.BLOCK).forceSolidOn()));
    public static Block MEDIUM_STONE_LANTERN_TOP_LIGHT   = registerBlock("medium_stone_lantern_top_light",   properties -> new MediumStoneLanternTopLightBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 15).noOcclusion().pushReaction(PushReaction.BLOCK).forceSolidOn()));


    public static Block SMALL_STONE_LANTERN_LIGHT        = registerBlock("small_stone_lantern_light",        properties -> new SmallStoneLanternLightBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 14).noOcclusion().pushReaction(PushReaction.DESTROY).dynamicShape().forceSolidOn()));
    public static Block SMALL_STONE_LANTERN_DARK         = registerBlock("small_stone_lantern_dark",         properties -> new SmallStoneLanternDarkBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).dynamicShape().forceSolidOn()));

    public static Block MINI_STONE_LANTERN_DARK          = registerBlock("mini_stone_lantern_dark",          properties -> new MiniStoneLanternDarkBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block MINI_STONE_LANTERN_LIGHT         = registerBlock("mini_stone_lantern_light",         properties -> new MiniStoneLanternLightBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 13).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));

    public static Block SMALLFOOT_STONE_LANTERN_DARK     = registerBlock("smallfoot_stone_lantern_dark",     properties -> new SmallfootStoneLanternDarkBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block SMALLFOOT_STONE_LANTERN_LIGHT    = registerBlock("smallfoot_stone_lantern_light",    properties -> new SmallfootStoneLanternLightBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 14).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));

    /*
    public static Block SMALLPROOF_STONE_LANTERN_DARK    = registerBlock("smallproof_stone_lantern_dark",    properties -> new SmallproofStoneLanternDarkBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block SMALLPROOF_STONE_LANTERN_LIGHT   = registerBlock("smallproof_stone_lantern_light",   properties -> new SmallproofStoneLanternLightBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 14).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    */

    public static Block SMALLNOPROOF_STONE_LANTERN_DARK  = registerBlock("smallnoproof_stone_lantern_dark",  properties -> new SmallnoproofStoneLanternDarkBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block SMALLNOPROOF_STONE_LANTERN_LIGHT = registerBlock("smallnoproof_stone_lantern_light", properties -> new SmallnoproofStoneLanternLightBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 14).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));

    public static Block MININOPROOF_STONE_LANTERN_DARK   = registerBlock("mininoproof_stone_lantern_dark",   properties -> new MininoproofStoneLanternDarkBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block MININOPROOF_STONE_LANTERN_LIGHT  = registerBlock("mininoproof_stone_lantern_light",  properties -> new MininoproofStoneLanternLightBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 13).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));

    // Pillars
    public static Block STONE_PILLAR_MID_BOTTOM          = registerBlock("stone_pillar_mid_bottom",          properties -> new StonePillarMidBottomBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_MID_TOP             = registerBlock("stone_pillar_mid_top",             properties -> new StonePillarMidTopBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_MID_MIDDLE          = registerBlock("stone_pillar_mid_middle",          properties -> new StonePillarMidMiddleBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_MID_SHORT           = registerBlock("stone_pillar_mid_short",           properties -> new StonePillarMidShortBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));

    public static Block STONE_PILLAR_THIN_A_TOP          = registerBlock("stone_pillar_thin_a_top",          properties -> new StonePillarThinATopBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_THIN_A_BOTTOM       = registerBlock("stone_pillar_thin_a_bottom",       properties -> new StonePillarThinABottomBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_THIN_A_SHORT        = registerBlock("stone_pillar_thin_a_short",        properties -> new StonePillarThinAShortBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));

    public static Block STONE_PILLAR_THIN_B_BOTTOM       = registerBlock("stone_pillar_thin_b_bottom",       properties -> new StonePillarThinBBottomBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_THIN_B_SHORT        = registerBlock("stone_pillar_thin_b_short",        properties -> new StonePillarThinBShortBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_THIN_B_TOP          = registerBlock("stone_pillar_thin_b_top",          properties -> new StonePillarThinBTopBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));

    public static Block STONE_PILLAR_THIN_C_BOTTOM       = registerBlock("stone_pillar_thin_c_bottom",       properties -> new StonePillarThinCBottomBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_THIN_C_MIDDLE       = registerBlock("stone_pillar_thin_c_middle",       properties -> new StonePillarThinCMiddleBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_THIN_C_SHORT        = registerBlock("stone_pillar_thin_c_short",        properties -> new StonePillarThinCShortBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_THIN_C_TOP          = registerBlock("stone_pillar_thin_c_top",          properties -> new StonePillarThinCTopBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));

    public static Block STONE_PILLAR_BIG_BOTTOM          = registerBlock("stone_pillar_big_bottom",          properties -> new StonePillarBigBottomBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_BIG_MIDDLE          = registerBlock("stone_pillar_big_middle",          properties -> new StonePillarBigMiddleBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_BIG_SHORT           = registerBlock("stone_pillar_big_short",           properties -> new StonePillarBigShortBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_BIG_TOP             = registerBlock("stone_pillar_big_top",             properties -> new StonePillarBigTopBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));

    public static Block STONE_PILLAR_BIGGER_BOTTOM       = registerBlock("stone_pillar_bigger_bottom",       properties -> new StonePillarBiggerBottomBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_BIGGER_MIDDLE       = registerBlock("stone_pillar_bigger_middle",       properties -> new StonePillarBiggerMiddleBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_BIGGER_SHORT        = registerBlock("stone_pillar_bigger_short",        properties -> new StonePillarBiggerShortBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block STONE_PILLAR_BIGGER_TOP          = registerBlock("stone_pillar_bigger_top",          properties -> new StonePillarBiggerTopBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));

    public static Block BROAD_STONE_LANTERN_BLOCK_DARK   = registerBlock("broad_stone_lantern_block_dark",   properties -> new BroadStoneLanternBlockDarkBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block BROAD_STONE_LANTERN_BLOCK_LIGHT  = registerBlock("broad_stone_lantern_block_light",  properties -> new BroadStoneLanternBlockLightBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block BROAD_STONE_LANTERN              = registerBlock("broad_stone_lantern",              properties -> new BroadStoneLanternBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.BLOCK).forceSolidOn()));
    public static Block BROAD_STONE_LANTERN_TOP_DARK     = registerBlock("broad_stone_lantern_top_dark",     properties -> new BroadStoneLanternTopDarkBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.BLOCK).forceSolidOn()));
    public static Block BROAD_STONE_LANTERN_TOP_LIGHT    = registerBlock("broad_stone_lantern_top_light",    properties -> new BroadStoneLanternTopLightBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 15).noOcclusion().pushReaction(PushReaction.BLOCK).forceSolidOn()));

    public static Block MID_STONE_LANTERN_BLOCK_DARK     = registerBlock("mid_stone_lantern_block_dark",     properties -> new MidStoneLanternBlockDarkBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block MID_STONE_LANTERN_BLOCK_LIGHT    = registerBlock("mid_stone_lantern_block_light",    properties -> new MidStoneLanternBlockLightBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));

    public static Block THIN_STONE_LANTERN_BLOCK_LIGHT   = registerBlock("thin_stone_lantern_block_light",   properties -> new ThinStoneLanternBlockLightBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).forceSolidOn()));
    public static Block THIN_STONE_LANTERN               = registerBlock("thin_stone_lantern",               properties -> new ThinStoneLanternBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.NORMAL).forceSolidOn()));
    public static Block THIN_STONE_LANTERN_TOP_DARK      = registerBlock("thin_stone_lantern_top_dark",      properties -> new ThinStoneLanternTopDarkBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.NORMAL).forceSolidOn()));
    public static Block THIN_STONE_LANTERN_TOP_LIGHT     = registerBlock("thin_stone_lantern_top_light",     properties -> new ThinStoneLanternTopLightBlock(properties
            .mapColor(MapColor.STONE).sound(copyOf(SoundType.STONE)).strength(1.0F, 10.0F).lightLevel((_) -> 15).noOcclusion().pushReaction(PushReaction.NORMAL).forceSolidOn()));

    public static SoundType copyOf(SoundType vanillaType) {
        return new SoundType(vanillaType.getVolume(), vanillaType.getPitch(), vanillaType.getBreakSound(), vanillaType.getStepSound(), vanillaType.getPlaceSound(), vanillaType.getHitSound(), vanillaType.getFallSound());
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ReddensstonelanternMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(ReddensstonelanternMod.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ReddensstonelanternMod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ReddensstonelanternMod.MOD_ID, name)))));
    }
}