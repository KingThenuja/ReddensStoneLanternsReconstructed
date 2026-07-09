package dev.thenu.ReddensStoneLanternReconstructed.networking.clickProcedure.rightClick;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Property;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.Map;

public class ThinStoneLanternBlockRightClickProcedure {
    public ThinStoneLanternBlockRightClickProcedure() {
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void execute(Map<String, Object> dependencies, WorldAccess world, double x, double y, double z) {
        if (world.isClient()) {
            return;
        }

        if (dependencies != null && dependencies.get("entity") instanceof PlayerEntity player) {
            if (player.getActiveHand() == Hand.OFF_HAND) {
                return;
            }
        }

        BlockPos bp = BlockPos.ofFloored(x, y, z);
        BlockState bso = world.getBlockState(bp);
        BlockState bs;

        if (bso.getBlock() == BlockFile.THIN_STONE_LANTERN_TOP_LIGHT) {
            bs = BlockFile.THIN_STONE_LANTERN_TOP_DARK.getDefaultState();
        } else if (bso.getBlock() == BlockFile.THIN_STONE_LANTERN_TOP_DARK) {
            bs = BlockFile.THIN_STONE_LANTERN_TOP_LIGHT.getDefaultState();
        } else {
            return;
        }

        for (Property<?> propertyOld : bso.getProperties()) {
            Property propertyNew = bs.getBlock().getStateManager().getProperty(propertyOld.getName());
            if (propertyNew != null && bs.get(propertyNew) != null) {
                try {
                    bs = bs.with(propertyNew, bso.get((Property) propertyOld));
                } catch (Exception ignored) {
                }
            }
        }

        BlockEntity be = world.getBlockEntity(bp);
        NbtCompound bnbt = null;
        if (be != null) {
            bnbt = be.createNbt(world.getRegistryManager());
            be.markRemoved();
        }

        world.setBlockState(bp, bs, 3);

        if (bnbt != null && world instanceof World level) {
            BlockEntity newBe = BlockEntity.createFromNbt(bp, bs, bnbt, world.getRegistryManager());
            if (newBe != null) {
                level.addBlockEntity(newBe);
            }
        }

        if (world instanceof World level) {
            level.playSound(null, bp, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 0.5F, 1.0F);
        }
    }

    public static void execute(WorldAccess world, double x, double y, double z) {
        execute(null, world, x, y, z);
    }
}