package com.bajtix.onesblocks.tileentities;

import com.bajtix.onesblocks.ModTileEntityTypes;
import com.bajtix.onesblocks.blocks.DoubleVaseBlock;
import com.bajtix.onesblocks.containers.DoubleVaseContainer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.wrapper.InvWrapper;

import javax.annotation.Nullable;

public class DoubleVaseTileEntity extends LockableLootTileEntity {

    protected int numPlayersUsing;
    private NonNullList<ItemStack> chestContent = NonNullList.withSize(63, ItemStack.EMPTY);
    private IItemHandlerModifiable items = createHandler();
    private LazyOptional<IItemHandlerModifiable> itemHandler = LazyOptional.of(() -> items);

    public DoubleVaseTileEntity(TileEntityType<?> tileEntityType) {
        super(tileEntityType);
    }

    public DoubleVaseTileEntity() {
        super(ModTileEntityTypes.DOUBLE_VASE.get());
    }

    public static int getPlayersUsing(IBlockReader reader, BlockPos pos) {
        BlockState blockState = reader.getBlockState(pos);
        if (blockState.hasTileEntity()) {
            TileEntity entity = reader.getTileEntity(pos);
            if (entity instanceof DoubleVaseTileEntity) {
                return ((DoubleVaseTileEntity) entity).numPlayersUsing;
            } else
                return 0;
        } else
            return 0;
    }

    public static void swapContent(DoubleVaseTileEntity te, DoubleVaseTileEntity otherTe) {
        NonNullList<ItemStack> list = te.getItems();
        te.setItems(otherTe.getItems());
        otherTe.setItems(list);
    }

    @Override
    public int getSizeInventory() {
        return 72;
    }

    @Override
    public NonNullList<ItemStack> getItems() {
        return this.chestContent;
    }

    @Override
    public void setItems(NonNullList<ItemStack> items) {
        this.chestContent = items;
    }

    @Override
    public ITextComponent getDefaultName() {
        return new TranslationTextComponent("container.double_Vase");
    }

    @Override
    protected Container createMenu(int id, PlayerInventory player) {
        return new DoubleVaseContainer(id, player, this);
    }

    @Override
    public CompoundNBT write(CompoundNBT compoundNBT) {
        super.write(compoundNBT);

        if (!this.checkLootAndWrite(compoundNBT)) {
            ItemStackHelper.saveAllItems(compoundNBT, this.chestContent);
        }
        return compoundNBT;
    }

    @Override
    public void read(CompoundNBT compoundNBT) {
        super.read(compoundNBT);
        this.chestContent = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);

        if (!this.checkLootAndWrite(compoundNBT)) {
            ItemStackHelper.loadAllItems(compoundNBT, this.chestContent);
        }
    }

    private void playSound(SoundEvent event) {
        double dx = this.pos.getX() + 0.5d;
        double dy = this.pos.getY() + 0.5d;
        double dz = this.pos.getZ() + 0.5d;
        this.world.playSound(null, dx, dy, dz, event, SoundCategory.BLOCKS, 0.5f, this.world.rand.nextFloat() * 0.1f + 0.9f);
    }

    @Override
    public boolean receiveClientEvent(int id, int type) {
        if (id == 1) {
            this.numPlayersUsing = type;
            return true;
        } else
            return super.receiveClientEvent(id, type);
    }

    @Override
    public void openInventory(PlayerEntity player) {
        if (!player.isSpectator()) {
            if (this.numPlayersUsing < 0) {
                this.numPlayersUsing = 0;
            }
            ++this.numPlayersUsing;
            this.onOpenOrClose();


        }
    }

    @Override
    public void closeInventory(PlayerEntity player) {
        if (!player.isSpectator()) {
            --this.numPlayersUsing;
            this.onOpenOrClose();
        }
    }

    protected void onOpenOrClose() {
        Block block = this.getBlockState().getBlock();
        if (block instanceof DoubleVaseBlock) {
            this.world.addBlockEvent(this.pos, block, 1, this.numPlayersUsing);
            this.world.notifyNeighborsOfStateChange(this.pos, block);
        }
    }

    @Override
    public void updateContainingBlockInfo() {
        super.updateContainingBlockInfo();
        if (this.itemHandler != null) {
            this.itemHandler.invalidate();
            this.itemHandler = null;
        }
    }

    @Nullable
    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> capability, Direction direction) {
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return itemHandler.cast();
        }
        return super.getCapability(capability, direction);
    }

    private IItemHandlerModifiable createHandler() {
        return new InvWrapper(this);
    }

    @Override
    public void remove() {
        super.remove();
        if (itemHandler != null) {
            itemHandler.invalidate();
        }

    }
}
