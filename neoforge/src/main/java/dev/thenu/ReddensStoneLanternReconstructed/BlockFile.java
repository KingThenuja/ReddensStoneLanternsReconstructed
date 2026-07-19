package dev.thenu.ReddensStoneLanternReconstructed;

import dev.thenu.ReddensStoneLanternReconstructed.Blocks.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class BlockFile {
    public static final String MOD_ID = "reddensstonelantern";

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static <B extends Block> DeferredBlock<B> registerBlock(String name, Function<BlockBehaviour.Properties, B> blockFactory, BlockBehaviour.Properties baseProps) {
        DeferredBlock<B> block = BLOCKS.register(name, registryName -> blockFactory.apply(baseProps.setId(ResourceKey.create(Registries.BLOCK, registryName))));
        ITEMS.registerSimpleBlockItem(block);
        return block;
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