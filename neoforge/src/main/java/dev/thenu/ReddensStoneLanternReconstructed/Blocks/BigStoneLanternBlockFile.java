package dev.thenu.ReddensStoneLanternReconstructed.Blocks;

import dev.thenu.ReddensStoneLanternReconstructed.blockType.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static dev.thenu.ReddensStoneLanternReconstructed.BlockFile.*;

public class BigStoneLanternBlockFile {
    public static void register() {
        }

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public static final DeferredBlock<Block> BIG_STONE_LANTERN_BLOCK_DARK = registerBlock("big_stone_lantern_block_dark", props -> new BigStoneLanternBlockDarkBlock(props.instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).sound(SoundType.STONE).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false)));

    public static final DeferredBlock<Block> BIG_STONE_LANTERN_BLOCK_LIGHT = registerBlock("big_stone_lantern_block_light", props -> new BigStoneLanternBlockLightBlock(props.instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).sound(SoundType.STONE).strength(1.0F, 10.0F).lightLevel((s) -> 15).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false)));

    public static final DeferredBlock<Block> BIG_STONE_LANTERN_BASE = registerBlock("big_stone_lantern_base", props -> new BigStoneLanternBaseBlock(props.instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).sound(SoundType.STONE).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.BLOCK).isRedstoneConductor((bs, br, bp) -> false)));

    public static final DeferredBlock<Block> BIG_STONE_LANTERN_MID = registerBlock("big_stone_lantern_mid", props -> new BigStoneLanternMidBlock(props.instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).sound(SoundType.STONE).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.BLOCK).isRedstoneConductor((bs, br, bp) -> false)));

    public static final DeferredBlock<BigStoneLanternTopLightBlock> BIG_STONE_LANTERN_TOP = registerBlock("big_stone_lantern_top", props -> new BigStoneLanternTopLightBlock(props.instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).sound(SoundType.STONE).strength(1.0F, 10.0F).lightLevel((s) -> 15).noOcclusion().pushReaction(PushReaction.BLOCK).isRedstoneConductor((bs, br, bp) -> false)));

    public static final DeferredBlock<Block> BIG_STONE_LANTERN_TOP_DARK = registerBlock("big_stone_lantern_top_dark", props -> new BigStoneLanternTopDarkBlock(props.instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).sound(SoundType.STONE).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.BLOCK).isRedstoneConductor((bs, br, bp) -> false)));

    public static final DeferredBlock<Block> BIG_STONE_LANTERN_TOP_LIGHT = registerBlock("big_stone_lantern_top_light", props -> new BigStoneLanternTopLightBlock(props.instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).sound(SoundType.STONE).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.BLOCK).isRedstoneConductor((bs, br, bp) -> false)));


}
