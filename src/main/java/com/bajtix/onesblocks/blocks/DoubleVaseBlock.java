package com.bajtix.onesblocks.blocks;

import com.bajtix.onesblocks.ModTileEntityTypes;
import com.bajtix.onesblocks.tileentities.DoubleVaseTileEntity;
import com.bajtix.onesblocks.utility.BlocksUtilities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.stream.Stream;

public class DoubleVaseBlock extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    public static final Optional<VoxelShape> SHAPE = Stream.of(
            Block.makeCuboidShape(3, 4, 3, 13, 15, 13),
            Block.makeCuboidShape(6, 19, 6, 10, 27, 10),
            Block.makeCuboidShape(5, 27, 5, 11, 28, 11),
            Block.makeCuboidShape(4, 2, 4, 12, 17, 12),
            Block.makeCuboidShape(5, 0, 5, 11, 19, 11),
            Block.makeCuboidShape(6, 17, 6, 10, 18, 10),
            Block.makeCuboidShape(13.1, 6.25, 7.5, 14.1, 7.75, 8.5),
            Block.makeCuboidShape(14.1, 7.25, 7.5, 15.1, 8.75, 8.5),
            Block.makeCuboidShape(14.85, 8.25, 7.5, 15.85, 12.25, 8.5),
            Block.makeCuboidShape(13.85, 11.75, 7.5, 14.85, 13.25, 8.5),
            Block.makeCuboidShape(13.1, 10.75, 7.5, 14.1, 12.25, 8.5),
            Block.makeCuboidShape(2, 6.25, 7.5, 3, 7.75, 8.5),
            Block.makeCuboidShape(1, 7.25, 7.5, 2, 8.75, 8.5),
            Block.makeCuboidShape(0.25, 8.25, 7.5, 1.25, 12.25, 8.5),
            Block.makeCuboidShape(1.25, 11.75, 7.5, 2.25, 13.25, 8.5),
            Block.makeCuboidShape(2, 10.75, 7.5, 3, 12.25, 8.5)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    });

    public static final VoxelShape rotatedShape = BlocksUtilities.rotateShape(Direction.NORTH, Direction.EAST, SHAPE.get());

    public DoubleVaseBlock(Block.Properties properties) {
        super(properties);
        this.setDefaultState(this.getStateContainer().getBaseState().with(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            default:
            case NORTH:
            case SOUTH: {
                return SHAPE.get();
            }
            case EAST:
            case WEST: {
                return rotatedShape;
            }
        }
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
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
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return ModTileEntityTypes.DOUBLE_VASE.get().create();
    }

    @Override
    public ActionResultType func_225533_a_(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
        if (!world.isRemote) {
            TileEntity tile = world.getTileEntity(pos);
            if (tile instanceof DoubleVaseTileEntity) {
                NetworkHooks.openGui((ServerPlayerEntity) player, (DoubleVaseTileEntity) tile, pos);
            }
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.FAIL;
    }

    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        if (state.getBlock() != newState.getBlock()) {
            TileEntity te = worldIn.getTileEntity(pos);
            if (te instanceof DoubleVaseTileEntity) {
                InventoryHelper.dropItems(worldIn, pos, ((DoubleVaseTileEntity) te).getItems());
            }
        }
    }
}
