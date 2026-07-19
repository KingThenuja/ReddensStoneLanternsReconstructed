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

public class BroadLanternBlockFile {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public static void register() {
    }

    public static final DeferredBlock<Block> BROAD_STONE_LANTERN = registerBlock("broad_stone_lantern",
            props -> new BroadStoneLanternBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((_, _, _) -> false)
            ),
            BlockBehaviour.Properties.of()
    );

    public static final DeferredBlock<Block> BROAD_STONE_LANTERN_TOP_DARK = registerBlock("broad_stone_lantern_top_dark",
            props -> new BroadStoneLanternTopDarkBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((_, _, _) -> false)
            ),
            BlockBehaviour.Properties.of()
    );

    public static final DeferredBlock<Block> BROAD_STONE_LANTERN_TOP_LIGHT = registerBlock("broad_stone_lantern_top_light",
            props -> new BroadStoneLanternTopLightBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((_, _, _) -> false)
            ),
            BlockBehaviour.Properties.of()
    );

    public static final DeferredBlock<Block> BROAD_STONE_LANTERN_BLOCK_DARK = registerBlock("broad_stone_lantern_block_dark",
            props -> new BroadStoneLanternBlockDarkBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((_, _, _) -> false)
            ),
            BlockBehaviour.Properties.of()
    );

    public static final DeferredBlock<Block> BROAD_STONE_LANTERN_BLOCK_LIGHT = registerBlock("broad_stone_lantern_block_light",
            props -> new BroadStoneLanternBlockLightBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((_, _, _) -> false)
            ),
            BlockBehaviour.Properties.of()
    );
}