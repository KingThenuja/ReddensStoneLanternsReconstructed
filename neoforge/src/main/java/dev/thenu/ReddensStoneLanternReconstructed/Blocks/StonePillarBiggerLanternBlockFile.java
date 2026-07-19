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

public class StonePillarBiggerLanternBlockFile {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public static void register() {
    }

    public static final DeferredBlock<Block> STONE_PILLAR_BIGGER_BOTTOM = registerBlock("stone_pillar_bigger_bottom",
            props -> new StonePillarBiggerBottomBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((_, _, _) -> false)
            ),
            BlockBehaviour.Properties.of()
    );

    public static final DeferredBlock<Block> STONE_PILLAR_BIGGER_MIDDLE = registerBlock("stone_pillar_bigger_middle",
            props -> new StonePillarBiggerMiddleBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((_, _, _) -> false)
            ),
            BlockBehaviour.Properties.of()
    );

    public static final DeferredBlock<Block> STONE_PILLAR_BIGGER_SHORT = registerBlock("stone_pillar_bigger_short",
            props -> new StonePillarBiggerShortBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((_, _, _) -> false)
            ),
            BlockBehaviour.Properties.of()
    );

    public static final DeferredBlock<Block> STONE_PILLAR_BIGGER_TOP = registerBlock("stone_pillar_bigger_top",
            props -> new StonePillarBiggerTopBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((_, _, _) -> false)
            ),
            BlockBehaviour.Properties.of()
    );
}