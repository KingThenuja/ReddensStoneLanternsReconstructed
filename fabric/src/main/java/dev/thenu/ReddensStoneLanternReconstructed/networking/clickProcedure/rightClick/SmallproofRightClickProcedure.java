package dev.thenu.ReddensStoneLanternReconstructed.networking.clickProcedure.rightClick;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Property;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class SmallproofRightClickProcedure {

    public static void execute(WorldAccess world, double x, double y, double z) {
        if (!(world instanceof World physicalWorld)) {
            return;
        }

        BlockPos targetPos = BlockPos.ofFloored(x, y, z);
        BlockState currentBlockState = physicalWorld.getBlockState(targetPos);

        Identifier darkId = Identifier.of("reddensstonelantern", "smallproof_stone_lantern_dark");
        Identifier lightId = Identifier.of("reddensstonelantern", "smallproof_stone_lantern_light");

        Block darkBlock = Registries.BLOCK.get(darkId);
        Block lightBlock = Registries.BLOCK.get(lightId);

        if (darkBlock == Blocks.AIR || lightBlock == Blocks.AIR) {
            return;
        }

        BlockState destinationBlockState;

        if (currentBlockState.isOf(lightBlock)) {
            destinationBlockState = darkBlock.getDefaultState();
        } else if (currentBlockState.isOf(darkBlock)) {
            destinationBlockState = lightBlock.getDefaultState();
        } else {
            return;
        }

        for (Property<?> oldProperty : currentBlockState.getProperties()) {
            Property<?> newProperty = destinationBlockState.getBlock().getStateManager().getProperty(oldProperty.getName());
            if (newProperty != null) {
                destinationBlockState = safeCopy(currentBlockState, destinationBlockState, oldProperty, newProperty);
            }
        }

        RegistryWrapper.WrapperLookup registries = physicalWorld.getRegistryManager();
        NbtCompound savedNbtData = null;
        BlockEntity blockEntity = physicalWorld.getBlockEntity(targetPos);

        if (blockEntity != null) {
            savedNbtData = blockEntity.createNbt(registries);
            physicalWorld.removeBlockEntity(targetPos);
        }

        // 4. Update block layout state
        physicalWorld.setBlockState(targetPos, destinationBlockState, Block.NOTIFY_ALL);

        // 5. Reconstruct modern Block Entity from accurate NBT tags
        if (savedNbtData != null) {
            BlockEntity newBlockEntity = BlockEntity.createFromNbt(targetPos, destinationBlockState, savedNbtData, registries);
            if (newBlockEntity != null) {
                physicalWorld.addBlockEntity(newBlockEntity);
            }
        }

        // 6. Play ignition sound trigger
        physicalWorld.playSound(null, targetPos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 0.5F, 1.0F);
    }

    // Type-safe property helper that isolates wildcard type capture warnings cleanly
    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> BlockState safeCopy(BlockState srcState, BlockState destState, Property<?> srcProp, Property<?> destProp) {
        try {
            return destState.with((Property<T>) destProp, srcState.get((Property<T>) srcProp));
        } catch (Exception e) {
            return destState;
        }
    }
}