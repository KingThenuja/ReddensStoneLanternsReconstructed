package dev.thenu.ReddensStoneLanternReconstructed;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadHandler;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("reddensstonelantern")
public class ReddensstonelanternMod {
    public static final Logger LOGGER = LogManager.getLogger(ReddensstonelanternMod.class);
    public static final String MODID = "reddensstonelantern";
    private static boolean networkingRegistered = false;
    private static final Map<CustomPacketPayload.Type<?>, NetworkMessage<?>> MESSAGES = new HashMap<>();
    private static final Collection<WorkItem> workQueue = new ConcurrentLinkedQueue<>();

    public ReddensstonelanternMod(IEventBus modEventBus) {
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::registerNetworking);

        dev.thenu.ReddensStoneLanternReconstructed.Blocks.MediumLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.ThinLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.BroadLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.SmallStoneLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.MiniStoneLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.SmallFootLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.SmallProofLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.SmallNoProofLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.MiniNoProofLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.StonePillarThinALanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.StonePillarMidLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.StonePillarThinBLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.StonePillarThinCLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.StonePillarBigLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.StonePillarBiggerLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.BigStoneLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.BiggerStoneLanternBlockFile.register();
        dev.thenu.ReddensStoneLanternReconstructed.Blocks.MidStoneLanternBlockFile.register();

        BlockFile.BLOCKS.register(modEventBus);
        BlockFile.ITEMS.register(modEventBus);
        CreativeTabFile.REGISTRY.register(modEventBus);
    }

    public static <T extends CustomPacketPayload> void addNetworkMessage(CustomPacketPayload.Type<T> id, StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
        if (networkingRegistered) {
            throw new IllegalStateException("Cannot register new network messages after networking has been registered");
        } else {
            MESSAGES.put(id, new NetworkMessage<>(reader, handler));
        }
    }

    private void registerNetworking(RegisterPayloadHandlersEvent event) {
        PayloadRegistrar registrar = event.registrar("reddensstonelantern");
        networkingRegistered = true;
    }

    @SubscribeEvent
    public void tick(ServerTickEvent.Post event) {
        List<WorkItem> toExecute = new ArrayList<>();
        List<WorkItem> toKeep = new ArrayList<>();

        workQueue.forEach((work) -> {
            if (work.delay() <= 1) {
                toExecute.add(work);
            } else {
                toKeep.add(new WorkItem(work.task(), work.delay() - 1));
            }
        });

        toExecute.forEach((item) -> item.task().run());
        workQueue.clear();
        workQueue.addAll(toKeep);
    }

    private static record NetworkMessage<T extends CustomPacketPayload>(StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
    }
}
