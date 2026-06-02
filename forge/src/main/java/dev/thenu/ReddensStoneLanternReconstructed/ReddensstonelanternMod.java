package dev.thenu.ReddensStoneLanternReconstructed;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.init.CreativeTabFile;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Tuple;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;
import net.minecraftforge.network.ChannelBuilder;
import net.minecraftforge.network.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

@Mod("reddensstonelantern")
public class ReddensstonelanternMod {
    public static final Logger LOGGER = LogManager.getLogger(ReddensstonelanternMod.class);
    public static final String MODID = "reddensstonelantern";
    private static final Integer PROTOCOL_VERSION = 1;
    public static final SimpleChannel INSTANCE = ChannelBuilder.named(ResourceLocation.fromNamespaceAndPath(MODID, "main"))
            .networkProtocolVersion(PROTOCOL_VERSION)
            .simpleChannel();

    private static final Collection<Tuple<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

    public ReddensstonelanternMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);

        BlockFile.BLOCKS.register(modEventBus);
        BlockFile.ITEMS.register(modEventBus);
        CreativeTabFile.REGISTRY.register(modEventBus);

        modEventBus.addListener(this::initNetworking);
    }

    private void initNetworking(net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent event) {
    }

    public static void queueServerWork(int tick, Runnable action) {
        if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER) {
            workQueue.add(new Tuple<>(action, tick));
        }
    }

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent.Post event) {
        List<Tuple<Runnable, Integer>> actions = new ArrayList<>();
        workQueue.forEach((work) -> {
            work.setB(work.getB() - 1);
            if (work.getB() == 0) {
                actions.add(work);
            }
        });
        actions.forEach((e) -> e.getA().run());
        workQueue.removeAll(actions);
    }
}