package dev.thenu.ReddensStoneLanternReconstructed.blockType;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.networking.clickProcedure.rightClick.SmallnoproofRightClickProcedure;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class SmallnoproofStoneLanternDarkBlock extends Block implements Waterloggable {
    public static final BooleanProperty WATERLOGGED;

    public SmallnoproofStoneLanternDarkBlock() {
        super(Settings.create()
                .mapColor(MapColor.STONE_GRAY)
                .sounds(BlockSoundGroup.STONE)
                .strength(1.0F, 10.0F)
                .nonOpaque()
                .pistonBehavior(PistonBehavior.DESTROY)
                .solidBlock((state, world, pos) -> false));
        this.setDefaultState(this.stateManager.getDefaultState().with(WATERLOGGED, false));
    }

    @Override
    public int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        return 0;
    }

    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.union(
                Block.createCuboidShape(5.0D, 1.0D, 5.0D, 11.0D, 6.0D, 11.0D),
                Block.createCuboidShape(5.0D, 10.0D, 5.0D, 11.0D, 12.0D, 11.0D),
                Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 1.0D, 12.0D),
                Block.createCuboidShape(5.0D, 6.0D, 5.0D, 7.0D, 10.0D, 7.0D),
                Block.createCuboidShape(9.0D, 6.0D, 5.0D, 11.0D, 10.0D, 7.0D),
                Block.createCuboidShape(5.0D, 6.0D, 9.0D, 7.0D, 10.0D, 11.0D),
                Block.createCuboidShape(9.0D, 6.0D, 9.0D, 11.0D, 10.0D, 11.0D)
        );
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(WATERLOGGED);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        boolean flag = context.getWorld().getFluidState(context.getBlockPos()).getFluid() == Fluids.WATER;
        return super.getPlacementState(context).with(WATERLOGGED, flag);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
        return new ItemStack(BlockFile.SMALLNOPROOF_STONE_LANTERN_LIGHT);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient) {
            SmallnoproofRightClickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
        }
        return ActionResult.SUCCESS;
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
    }
}