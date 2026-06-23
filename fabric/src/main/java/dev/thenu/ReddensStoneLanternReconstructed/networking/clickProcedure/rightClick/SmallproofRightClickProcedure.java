package dev.thenu.ReddensStoneLanternReconstructed.networking.clickProcedure.rightClick;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
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
        BlockPos targetPos = BlockPos.ofFloored(x, y, z);
        BlockState currentBlockState = world.getBlockState(targetPos);

        Identifier darkId = Identifier.of("reddensstonelantern", "smallproof_stone_lantern_dark");
        Identifier lightId = Identifier.of("reddensstonelantern", "smallproof_stone_lantern_light");

        Block darkBlock = Registries.BLOCK.get(darkId);
        Block lightBlock = Registries.BLOCK.get(lightId);

        if (darkBlock == Blocks.AIR || lightBlock == Blocks.AIR) {
            return;
        }

        BlockState destinationBlockState;

        if (currentBlockState.getBlock() == lightBlock) {
            destinationBlockState = darkBlock.getDefaultState();
        } else {
            destinationBlockState = lightBlock.getDefaultState();
        }

        for (Property<?> oldProperty : currentBlockState.getProperties()) {
            Property<?> newProperty = destinationBlockState.getBlock().getStateManager().getProperty(oldProperty.getName());
            if (newProperty != null && destinationBlockState.get(newProperty) != null) {
                try {
                    destinationBlockState = copyProperty(destinationBlockState, newProperty, currentBlockState, oldProperty);
                } catch (Exception ignored) {
                }
            }
        }

        BlockEntity blockEntity = world.getBlockEntity(targetPos);
        RegistryWrapper.WrapperLookup registries = world.getRegistryManager();
        NbtCompound savedNbtData = null;

        if (blockEntity != null) {
            savedNbtData = blockEntity.createNbt(registries);
            blockEntity.markRemoved();
        }

        world.setBlockState(targetPos, destinationBlockState, Block.NOTIFY_ALL);

        if (savedNbtData != null && world instanceof World physicalWorld) {
            BlockEntity newBlockEntity = BlockEntity.createFromNbt(targetPos, destinationBlockState, savedNbtData, registries);
            if (newBlockEntity != null) {
                physicalWorld.addBlockEntity(newBlockEntity);
            }
        }

        if (world instanceof World physicalWorld) {
            physicalWorld.playSound(null, targetPos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 0.5F, 1.0F);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> BlockState copyProperty(
            BlockState targetState, Property<T> targetProp,
            BlockState sourceState, Property<?> sourceProp) {
        return targetState.with(targetProp, sourceState.get((Property<T>) sourceProp));
    }
}