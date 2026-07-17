package dev.thenu.ReddensStoneLanternReconstructed;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.init.CreativeTabFile;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.player.PlayerPickItemEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ReddensstonelanternMod implements ModInitializer {public static final Logger LOGGER = LoggerFactory.getLogger("Redden's Stone Lanterns Reconstructed");public static final String MOD_ID = "reddensstonelantern";public static final String MODID = MOD_ID;private static final Collection<ActionEntry> workQueue = new ConcurrentLinkedQueue<>();

    @Override
    public void onInitialize() {
        BlockFile.register();
        CreativeTabFile.register();
        initNetworking();
        ServerTickEvents.END_SERVER_TICK.register(server -> {List<ActionEntry> actionsToRun = new ArrayList<>();for (ActionEntry entry : workQueue) {entry.decrementTicks();if (entry.getTicks() <= 0) {actionsToRun.add(entry);}}for (ActionEntry entry : actionsToRun) {entry.getAction().run();}workQueue.removeAll(actionsToRun);});

        PlayerPickItemEvents.BLOCK.register((ServerPlayer player, BlockPos pos, BlockState state, boolean requestIncludeData) -> {
            if (state.is(BlockFile.BIGGER_STONE_LANTERN_BLOCK_D)) {
                return new ItemStack(BlockFile.BIGGER_STONE_LANTERN_BLOCK_L);
            }
            if (state.is(BlockFile.BIG_STONE_LANTERN_BASE)) {
                return new ItemStack(BlockFile.BIG_STONE_LANTERN_MID);
            }
            if (state.is(BlockFile.BIG_STONE_LANTERN_BLOCK_DARK)) {
                return new ItemStack(BlockFile.BIG_STONE_LANTERN_BLOCK_LIGHT);
            }
            if (state.is(BlockFile.BIG_STONE_LANTERN_TOP_DARK)) {
                return new ItemStack(BlockFile.BIG_STONE_LANTERN_MID);
            }
            if (state.is(BlockFile.BIG_STONE_LANTERN_TOP_LIGHT)) {
                return new ItemStack(BlockFile.BIG_STONE_LANTERN_MID);
            }
            if (state.is(BlockFile.BROAD_STONE_LANTERN_BLOCK_DARK)) {
                return new ItemStack(BlockFile.BROAD_STONE_LANTERN_BLOCK_LIGHT);
            }
            if (state.is(BlockFile.BROAD_STONE_LANTERN_TOP_DARK)) {
                return new ItemStack(BlockFile.BROAD_STONE_LANTERN);
            }
            if (state.is(BlockFile.BROAD_STONE_LANTERN_TOP_LIGHT)) {
                return new ItemStack(BlockFile.BROAD_STONE_LANTERN);
            }
            if (state.is(BlockFile.MEDIUM_STONE_LANTERN_TOP_DARK)) {
                return new ItemStack(BlockFile.MEDIUM_STONE_LANTERN);
            }
            if (state.is(BlockFile.MEDIUM_STONE_LANTERN_TOP_LIGHT)) {
                return new ItemStack(BlockFile.MEDIUM_STONE_LANTERN);
            }
            if (state.is(BlockFile.MID_STONE_LANTERN_BLOCK_DARK)) {
                return new ItemStack(BlockFile.MID_STONE_LANTERN_BLOCK_LIGHT);
            }
            if (state.is(BlockFile.MINI_STONE_LANTERN_DARK)) {
                return new ItemStack(BlockFile.MINI_STONE_LANTERN_LIGHT);
            }
            if (state.is(BlockFile.MININOPROOF_STONE_LANTERN_DARK)) {
                return new ItemStack(BlockFile.MININOPROOF_STONE_LANTERN_LIGHT);
            }
            if (state.is(BlockFile.SMALL_STONE_LANTERN_DARK)) {
                return new ItemStack(BlockFile.SMALL_STONE_LANTERN_LIGHT);
            }
            if (state.is(BlockFile.SMALL_STONE_LANTERN_LIGHT)) {
                return new ItemStack(BlockFile.SMALL_STONE_LANTERN_LIGHT);
            }
            if (state.is(BlockFile.SMALLFOOT_STONE_LANTERN_DARK)) {
                return new ItemStack(BlockFile.SMALLFOOT_STONE_LANTERN_LIGHT);
            }
            if (state.is(BlockFile.SMALLNOPROOF_STONE_LANTERN_DARK)) {
                return new ItemStack(BlockFile.SMALLNOPROOF_STONE_LANTERN_LIGHT);
            }/*
            if (state.is(BlockFile.SMALLPROOF_STONE_LANTERN_DARK)) {
                return new ItemStack(BlockFile.SMALLPROOF_STONE_LANTERN_LIGHT);
            }
            if (state.is(BlockFile.SMALLPROOF_STONE_LANTERN_DARK)) {
                return new ItemStack(BlockFile.SMALLPROOF_STONE_LANTERN_LIGHT);
            }*/
            if (state.is(BlockFile.STONE_PILLAR_BIG_BOTTOM)) {
                return new ItemStack(BlockFile.STONE_PILLAR_BIG_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_BIG_MIDDLE)) {
                return new ItemStack(BlockFile.STONE_PILLAR_BIG_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_BIG_TOP)) {
                return new ItemStack(BlockFile.STONE_PILLAR_BIG_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_BIGGER_BOTTOM)) {
                return new ItemStack(BlockFile.STONE_PILLAR_BIGGER_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_BIGGER_MIDDLE)) {
                return new ItemStack(BlockFile.STONE_PILLAR_BIGGER_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_BIGGER_TOP)) {
                return new ItemStack(BlockFile.STONE_PILLAR_BIGGER_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_MID_BOTTOM)) {
                return new ItemStack(BlockFile.STONE_PILLAR_MID_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_MID_MIDDLE)) {
                return new ItemStack(BlockFile.STONE_PILLAR_MID_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_MID_TOP)) {
                return new ItemStack(BlockFile.STONE_PILLAR_MID_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_THIN_A_BOTTOM)) {
                return new ItemStack(BlockFile.STONE_PILLAR_THIN_A_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_THIN_A_TOP)) {
                return new ItemStack(BlockFile.STONE_PILLAR_THIN_A_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_THIN_B_BOTTOM)) {
                return new ItemStack(BlockFile.STONE_PILLAR_THIN_B_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_THIN_B_TOP)) {
                return new ItemStack(BlockFile.STONE_PILLAR_THIN_B_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_THIN_C_BOTTOM)) {
                return new ItemStack(BlockFile.STONE_PILLAR_THIN_C_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_THIN_C_MIDDLE)) {
                return new ItemStack(BlockFile.STONE_PILLAR_THIN_C_SHORT);
            }
            if (state.is(BlockFile.STONE_PILLAR_THIN_C_TOP)) {
                return new ItemStack(BlockFile.STONE_PILLAR_THIN_C_SHORT);
            }
            if (state.is(BlockFile.THIN_STONE_LANTERN_TOP_DARK)) {
                return new ItemStack(BlockFile.THIN_STONE_LANTERN);
            }
            if (state.is(BlockFile.THIN_STONE_LANTERN_TOP_LIGHT)) {
                return new ItemStack(BlockFile.THIN_STONE_LANTERN);
            }
            return null;
        });

    }
    private void initNetworking() {}
    public static void queueServerWork(int tick, Runnable action) {workQueue.add(new ActionEntry(action, tick));}
    private static class ActionEntry { private final Runnable action;private int ticks;public ActionEntry(Runnable action, int ticks) {this.action = action;this.ticks = ticks;}public Runnable getAction() {return this.action;}public int getTicks() {return this.ticks;}public void decrementTicks() {this.ticks--;}}
}