package dev.thenu.ReddensStoneLanternReconstructed.blockType;

import dev.thenu.ReddensStoneLanternReconstructed.networking.tickingProcedure.TripleBlockMidTickProcedure;
import dev.thenu.ReddensStoneLanternReconstructed.world.blockPlaceProcedure.BigPlaceProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BigStoneLanternMidBlock extends Block implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public BigStoneLanternMidBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, false));
    }

    @Override
    protected VoxelShape getVisualShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Shapes.or(
                Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D),
                Block.box(1.0D, 10.0D, 1.0D, 15.0D, 12.0D, 15.0D),
                Block.box(3.0D, 12.0D, 3.0D, 13.0D, 13.0D, 13.0D),
                Block.box(3.0D, 8.0D, 3.0D, 13.0D, 10.0D, 13.0D),
                Block.box(10.0D, 13.0D, 10.0D, 13.0D, 16.0D, 13.0D),
                Block.box(10.0D, 13.0D, 3.0D, 13.0D, 16.0D, 6.0D),
                Block.box(3.0D, 13.0D, 10.0D, 6.0D, 16.0D, 13.0D),
                Block.box(3.0D, 13.0D, 3.0D, 6.0D, 16.0D, 6.0D)
        );
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(WATERLOGGED);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        boolean isWater = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
        BlockState defaultState = super.getStateForPlacement(context);
        return defaultState != null ? defaultState.setValue(WATERLOGGED, isWater) : null;
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    protected BlockState updateShape(BlockState state, LevelReader level, ScheduledTickAccess tickAccess, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        if (state.getValue(WATERLOGGED)) {
            tickAccess.scheduleTick(pos, Fluids.WATER, 0, net.minecraft.world.ticks.TickPriority.NORMAL);
        }
        return super.updateShape(state, level, tickAccess, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    protected void neighborChanged(BlockState state, Level level, BlockPos pos, Block sourceBlock, Orientation sourceOrientation, boolean notify) {
        super.neighborChanged(state, level, pos, sourceBlock, sourceOrientation, notify);
        TripleBlockMidTickProcedure.execute(level, pos.getX(), pos.getY(), pos.getZ());
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        super.setPlacedBy(level, pos, state, placer, itemStack);
        BigPlaceProcedure.execute(level, pos.getX(), pos.getY(), pos.getZ(), placer);
    }
}