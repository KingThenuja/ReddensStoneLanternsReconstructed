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

public class ThinLanternBlockFile {
    public static void register() {
    }
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);


    public static final DeferredBlock<Block> THIN_STONE_LANTERN = registerBlock("thin_stone_lantern",
            props -> new ThinStoneLanternBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.BLOCK)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));

    public static final DeferredBlock<Block> THIN_STONE_LANTERN_TOP_DARK = registerBlock("thin_stone_lantern_top_dark",
            props -> new ThinStoneLanternTopDarkBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.BLOCK)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));

    public static final DeferredBlock<Block> THIN_STONE_LANTERN_TOP_LIGHT = registerBlock("thin_stone_lantern_top_light",
            props -> new ThinStoneLanternTopLightBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .lightLevel((s) -> 15)
                    .noOcclusion()
                    .pushReaction(PushReaction.BLOCK)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));

    public static final DeferredBlock<Block> THIN_STONE_LANTERN_BLOCK_DARK = registerBlock("thin_stone_lantern_block_dark",
            props -> new ThinStoneLanternBlockDarkBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));

    public static final DeferredBlock<Block> THIN_STONE_LANTERN_BLOCK_LIGHT = registerBlock("thin_stone_lantern_block_light",
            props -> new ThinStoneLanternBlockLightBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .lightLevel((s) -> 15)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));

}
