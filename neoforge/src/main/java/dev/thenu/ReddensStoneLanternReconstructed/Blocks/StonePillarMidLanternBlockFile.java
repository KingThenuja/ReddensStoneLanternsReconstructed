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

import static dev.thenu.ReddensStoneLanternReconstructed.BlockFile.MOD_ID;
import static dev.thenu.ReddensStoneLanternReconstructed.BlockFile.registerBlock;

public class StonePillarMidLanternBlockFile {
    public static void register() {
    }
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public static final DeferredBlock<Block> STONE_PILLAR_MID_BOTTOM = registerBlock("stone_pillar_mid_bottom",
            props -> new StonePillarMidBottomBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));


    public static final DeferredBlock<Block> STONE_PILLAR_MID_TOP = registerBlock("stone_pillar_mid_top",
            props -> new StonePillarMidTopBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));


    public static final DeferredBlock<Block> STONE_PILLAR_MID_MIDDLE = registerBlock("stone_pillar_mid_middle",
            props -> new StonePillarMidMiddleBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));


    public static final DeferredBlock<Block> STONE_PILLAR_MID_SHORT = registerBlock("stone_pillar_mid_short",
            props -> new StonePillarMidShortBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));

}
