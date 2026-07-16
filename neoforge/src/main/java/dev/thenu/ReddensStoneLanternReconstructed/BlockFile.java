package dev.thenu.ReddensStoneLanternReconstructed;

import dev.thenu.ReddensStoneLanternReconstructed.Blocks.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Function;

public class BlockFile {
    public static final String MOD_ID = "reddensstonelantern";

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            BuiltInRegistries.BLOCK,
            BlockFile.MOD_ID
    );

    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        BiggerStoneLanternBlockFile.register();
        BigStoneLanternBlockFile.register();
        BroadLanternBlockFile.register();
        MediumLanternBlockFile.register();
        MidStoneLanternBlockFile.register();
        MiniNoProofLanternBlockFile.register();
        MiniStoneLanternBlockFile.register();
        SmallFootLanternBlockFile.register();
        SmallNoProofLanternBlockFile.register();
        SmallProofLanternBlockFile.register();
        SmallStoneLanternBlockFile.register();
        StonePillarMidLanternBlockFile.register();
        StonePillarBigLanternBlockFile.register();
        StonePillarThinCLanternBlockFile.register();
        StonePillarThinBLanternBlockFile.register();
        StonePillarBiggerLanternBlockFile.register();
        StonePillarThinALanternBlockFile.register();


    }


}