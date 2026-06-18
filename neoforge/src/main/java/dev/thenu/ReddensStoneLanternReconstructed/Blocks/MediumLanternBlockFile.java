package dev.thenu.ReddensStoneLanternReconstructed.Blocks;

import dev.thenu.ReddensStoneLanternReconstructed.blockType.MediumStoneLanternBlock;
import dev.thenu.ReddensStoneLanternReconstructed.blockType.MediumStoneLanternTopDarkBlock;
import dev.thenu.ReddensStoneLanternReconstructed.blockType.MediumStoneLanternTopLightBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static dev.thenu.ReddensStoneLanternReconstructed.BlockFile.*;

public class MediumLanternBlockFile {
    public static void register() {
    }
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public static final DeferredBlock<Block> MEDIUM_STONE_LANTERN = registerBlock("medium_stone_lantern",
            props -> new MediumStoneLanternBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.BLOCK)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));


    public static final DeferredBlock<Block> MEDIUM_STONE_LANTERN_TOP_DARK = registerBlock("medium_stone_lantern_top_dark",
            props -> new MediumStoneLanternTopDarkBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.BLOCK)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));


    public static final DeferredBlock<Block> MEDIUM_STONE_LANTERN_TOP_LIGHT = registerBlock("medium_stone_lantern_top_light",
            props -> new MediumStoneLanternTopLightBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .lightLevel((s) -> 15)
                    .noOcclusion()
                    .pushReaction(PushReaction.BLOCK)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));


}
