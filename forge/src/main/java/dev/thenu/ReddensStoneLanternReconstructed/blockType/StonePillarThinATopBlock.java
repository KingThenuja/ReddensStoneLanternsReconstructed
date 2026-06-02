//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package dev.thenu.ReddensStoneLanternReconstructed.blockType;

import dev.thenu.ReddensStoneLanternReconstructed.init.BlockFile;
import dev.thenu.ReddensStoneLanternReconstructed.networking.tickingProcedure.StonePillarThinATickProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class StonePillarThinATopBlock extends Block implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED;

    public StonePillarThinATopBlock() {
        super(Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).sound(SoundType.STONE).strength(1.0F, 10.0F).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false));
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(WATERLOGGED, false));
    }

    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.or(box((double)3.0F, (double)15.0F, (double)3.0F, (double)13.0F, (double)16.0F, (double)13.0F), new VoxelShape[]{box((double)4.0F, (double)14.0F, (double)4.0F, (double)12.0F, (double)15.0F, (double)12.0F), box((double)4.0F, (double)14.0F, (double)4.0F, (double)12.0F, (double)15.0F, (double)12.0F), box((double)5.0F, (double)12.0F, (double)5.0F, (double)11.0F, (double)14.0F, (double)11.0F), box((double)6.0F, (double)0.0F, (double)6.0F, (double)10.0F, (double)12.0F, (double)10.0F)});
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(new Property[]{WATERLOGGED});
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
        return (BlockState)super.getStateForPlacement(context).setValue(WATERLOGGED, flag);
    }

    public FluidState getFluidState(BlockState state) {
        return (Boolean)state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
        if ((Boolean)state.getValue(WATERLOGGED)) {
            world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }

        return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
    }

    public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
        return new ItemStack((ItemLike) BlockFile.STONE_PILLAR_THIN_A_SHORT.get());
    }

    public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
        super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
        StonePillarThinATickProcedure.execute(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
    }

    static {
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }
}
