package dev.thenu.ReddensStoneLanternReconstructed.Blocks;

import dev.thenu.ReddensStoneLanternReconstructed.blockType.SmallproofStoneLanternDarkBlock;
import dev.thenu.ReddensStoneLanternReconstructed.blockType.SmallproofStoneLanternLightBlock;
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

public class SmallProofLanternBlockFile {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public static void register() {
    }

    public static final DeferredBlock<Block> SMALLPROOF_STONE_LANTERN_DARK = registerBlock("smallproof_stone_lantern_dark",
            props -> new SmallproofStoneLanternDarkBlock(props
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

    public static final DeferredBlock<Block> SMALLPROOF_STONE_LANTERN_LIGHT = registerBlock("smallproof_stone_lantern_light",
            props -> new SmallproofStoneLanternLightBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .lightLevel((_) -> 14)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((_, _, _) -> false)
            ),
            BlockBehaviour.Properties.of()
    );
}