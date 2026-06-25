package dev.thenu.ReddensStoneLanternReconstructed;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.init.CreativeTabFile;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ReddensstonelanternMod implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("Redden's Stone Lanterns Reconstructed");
    public static final String MOD_ID = "reddensstonelantern";
    public static final String MODID = MOD_ID;

    private static final Collection<ActionEntry> workQueue = new ConcurrentLinkedQueue<>();

    @Override
    public void onInitialize() {
        BlockFile.register();
        CreativeTabFile.register();

        initNetworking();

        ServerTickEvents.END_SERVER_TICK.register(server -> {
            List<ActionEntry> actionsToRun = new ArrayList<>();

            for (ActionEntry entry : workQueue) {
                entry.decrementTicks();
                if (entry.getTicks() <= 0) {
                    actionsToRun.add(entry);
                }
            }

            for (ActionEntry entry : actionsToRun) {
                entry.getAction().run();
            }
            workQueue.removeAll(actionsToRun);
        });
    }

    private void initNetworking() {
        }

    public static void queueServerWork(int tick, Runnable action) {

        workQueue.add(new ActionEntry(action, tick));
    }

    private static class ActionEntry {
        private final Runnable action;
        private int ticks;

        public ActionEntry(Runnable action, int ticks) {
            this.action = action;
            this.ticks = ticks;
        }

        public Runnable getAction() {
            return this.action;
        }

        public int getTicks() {
            return this.ticks;
        }

        public void decrementTicks() {
            this.ticks--;
        }
    }
}