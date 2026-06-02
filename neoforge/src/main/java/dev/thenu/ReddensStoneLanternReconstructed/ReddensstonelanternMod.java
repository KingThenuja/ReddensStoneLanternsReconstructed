package dev.thenu.ReddensStoneLanternReconstructed;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.init.CreativeTabFile;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.util.Tuple;
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
    private static final Map<CustomPacketPayload.Type<?>, NetworkMessage<?>> MESSAGES = new HashMap();
    private static final Collection<Tuple<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue();

    public ReddensstonelanternMod(IEventBus modEventBus) {
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::registerNetworking);
        BlockFile.BLOCKS.register(modEventBus);
        BlockFile.ITEMS.register(modEventBus);
        CreativeTabFile.REGISTRY.register(modEventBus);
    }

    public static <T extends CustomPacketPayload> void addNetworkMessage(CustomPacketPayload.Type<T> id, StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
        if (networkingRegistered) {
            throw new IllegalStateException("Cannot register new network messages after networking has been registered");
        } else {
            MESSAGES.put(id, new NetworkMessage(reader, handler));
        }
    }

    private void registerNetworking(RegisterPayloadHandlersEvent event) {
        PayloadRegistrar registrar = event.registrar("reddensstonelantern");
        networkingRegistered = true;
    }

    public static void queueServerWork(int tick, Runnable action) {
        if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER) {
            workQueue.add(new Tuple(action, tick));
        }

    }

    @SubscribeEvent
    public void tick(ServerTickEvent.Post event) {
        List<Tuple<Runnable, Integer>> actions = new ArrayList();
        workQueue.forEach((work) -> {
            work.setB((Integer)work.getB() - 1);
            if ((Integer)work.getB() == 0) {
                actions.add(work);
            }

        });
        actions.forEach((e) -> ((Runnable)e.getA()).run());
        workQueue.removeAll(actions);
    }

    private static record NetworkMessage<T extends CustomPacketPayload>(StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
    }
}
