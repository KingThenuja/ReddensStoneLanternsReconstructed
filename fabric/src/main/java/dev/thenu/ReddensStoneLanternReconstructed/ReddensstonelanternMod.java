package dev.thenu.ReddensStoneLanternReconstructed;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.init.CreativeTabFile;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ReddensstonelanternMod implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger(ReddensstonelanternMod.class);
    public static final String MODID = "reddensstonelantern";

    // Using a custom clean record instead of the deprecated net.minecraft.util.Tuple
    private static final Collection<ActionEntry> workQueue = new ConcurrentLinkedQueue<>();

    @Override
    public void onInitialize() {
        BlockFile.register();
        CreativeTabFile.register();

        initNetworking();

        // Handles the delayed action tick processing
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            List<ActionEntry> actionsToRun = new ArrayList<>();

            for (ActionEntry entry : workQueue) {
                entry.decrementTicks();
                if (entry.getTicks() <= 0) {
                    actionsToRun.add(entry);
                }
            }

            actionsToRun.forEach(entry -> entry.getAction().run());
            workQueue.removeAll(actionsToRun);
        });
    }

    private void initNetworking() {
    }

    public static void queueServerWork(int tick, Runnable action) {
        workQueue.add(new ActionEntry(action, tick));
    }

    // Custom helper class replacing the Tuple functionality
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