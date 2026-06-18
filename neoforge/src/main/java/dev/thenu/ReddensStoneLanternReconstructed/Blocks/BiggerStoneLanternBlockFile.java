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

public class BiggerStoneLanternBlockFile {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public static void register() {
    }

    public static final DeferredBlock<Block> BIGGER_STONE_LANTERN_BLOCK_D = registerBlock("bigger_stone_lantern_block_d",
    props -> new BiggerStoneLanternBlockDBlock(props
            .instrument(NoteBlockInstrument.BASEDRUM)
            .mapColor(MapColor.STONE).sound(SoundType.STONE)
            .strength(1.0F, 10.0F)
            .noOcclusion()
            .pushReaction(PushReaction.DESTROY)
            .isRedstoneConductor((bs, br, bp) -> false)
    ));

    public static final DeferredBlock<Block> BIGGER_STONE_LANTERN_BLOCK_L = registerBlock("bigger_stone_lantern_block_l",
            props -> new BiggerStoneLanternBlockLBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.STONE)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .lightLevel((s) -> 15)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((bs, br, bp) -> false)
    ));

    public static final DeferredBlock<Block> BIGGER_STONE_LANTERN_PROOF = registerBlock("bigger_stone_lantern_proof",
            props -> new BiggerStoneLanternProofBlock(props
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.STONE)
                    .strength(1.0F, 10.0F)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor((bs, br, bp) -> false)
            ));

}
