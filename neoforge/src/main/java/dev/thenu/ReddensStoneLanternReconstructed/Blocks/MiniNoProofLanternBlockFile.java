package dev.thenu.ReddensStoneLanternReconstructed.Blocks;

import dev.thenu.ReddensStoneLanternReconstructed.blockType.MidStoneLanternBlockDarkBlock;
import dev.thenu.ReddensStoneLanternReconstructed.blockType.MininoproofStoneLanternDarkBlock;
import dev.thenu.ReddensStoneLanternReconstructed.blockType.MininoproofStoneLanternLightBlock;
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

public class MiniNoProofLanternBlockFile {
    public static void register() {
    }
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);


    public static final DeferredBlock<Block> MININOPROOF_STONE_LANTERN_DARK = registerBlock("mininoproof_stone_lantern_dark",
            props -> new MininoproofStoneLanternDarkBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));


    public static final DeferredBlock<Block> MININOPROOF_STONE_LANTERN_LIGHT = registerBlock("mininoproof_stone_lantern_light",
            props -> new MininoproofStoneLanternLightBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));
}
