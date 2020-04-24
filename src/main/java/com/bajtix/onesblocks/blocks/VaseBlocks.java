package com.bajtix.onesblocks.blocks;

import com.bajtix.onesblocks.lists.BlockItemList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;
import java.util.stream.Stream;

public class VaseBlocks extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final Optional<VoxelShape> SHAPE = Stream.of(
            Block.makeCuboidShape(2, 0, 2, 14, 5, 14)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    });
    public static IntegerProperty COUNT = ModBlockStateProperties.VASE_COUNT;

    public VaseBlocks(Properties p_i48440_1_) {
        super(p_i48440_1_);
        this.setDefaultState(this.getStateContainer().getBaseState().with(FACING, Direction.NORTH).with(COUNT, 1));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE.get();
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
        builder.add(COUNT);
    }

    @Override
    public ActionResultType func_225533_a_(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
        if (!worldIn.isRemote) {
            ServerWorld serverWorld = (ServerWorld) worldIn;
            if (state.get(COUNT) < 3 && player.getHeldItem(hand).getItem() == BlockItemList.vase) {
                if (!player.isCreative())
                    player.inventory.getCurrentItem().setCount(player.inventory.getCurrentItem().getCount() - 1);
                serverWorld.setBlockState(pos, state.with(COUNT, state.get(COUNT) + 1));
            }
        }
        return ActionResultType.SUCCESS;
    }


}
