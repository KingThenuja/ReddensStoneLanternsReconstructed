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

public class StonePillarThinBLanternBlockFile {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public static void register() {
    }

    public static final DeferredBlock<Block> STONE_PILLAR_THIN_B_BOTTOM = registerBlock("stone_pillar_thin_b_bottom",
            props -> new StonePillarThinBBottomBlock(props
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

    public static final DeferredBlock<Block> STONE_PILLAR_THIN_B_SHORT = registerBlock("stone_pillar_thin_b_short",
            props -> new StonePillarThinBShortBlock(props
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

    public static final DeferredBlock<Block> STONE_PILLAR_THIN_B_TOP = registerBlock("stone_pillar_thin_b_top",
            props -> new StonePillarThinBTopBlock(props
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