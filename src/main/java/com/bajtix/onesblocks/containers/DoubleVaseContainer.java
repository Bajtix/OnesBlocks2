package com.bajtix.onesblocks.containers;

import com.bajtix.onesblocks.lists.BlockList;
import com.bajtix.onesblocks.lists.ContainerList;
import com.bajtix.onesblocks.tileentities.DoubleVaseTileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;

import java.util.Objects;

public class DoubleVaseContainer extends Container {

    public final DoubleVaseTileEntity entity;
    private final IWorldPosCallable canInteractWithCallable;

    public DoubleVaseContainer(final int windowId, final PlayerInventory playerInventory, final DoubleVaseTileEntity tileEntity) {
        super(ContainerList.DOUBLE_VASE.get(), windowId);
        this.entity = tileEntity;
        this.canInteractWithCallable = IWorldPosCallable.of(entity.getWorld(), entity.getPos());

        //Main inventory
        int startX = 8;
        int startY = 18;
        int slotSizePlus2 = 18;
        for (int row = 0; row < 7; row++) {
            for (int column = 0; column < 9; column++) {
                this.addSlot(new Slot(tileEntity, row * 9 + column, startX + (column * slotSizePlus2), startY + (row * slotSizePlus2)));
            }
        }

        //Player inventory
        int startPlayerX = 8;
        int startPlayerY = 158;

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 9; column++) {
                this.addSlot(new Slot(playerInventory, 9 + (row * 9) + column, startPlayerX + (column * slotSizePlus2), startPlayerY + (row * slotSizePlus2)));
            }
        }

        //Hotbar
        int hotbarY = 216;

        for (int column = 0; column < 9; column++) {
            this.addSlot(new Slot(playerInventory, column, startPlayerX + (column * slotSizePlus2), hotbarY));
        }
    }

    public DoubleVaseContainer(final int windowId, final PlayerInventory playerInventory, final PacketBuffer data) {
        this(windowId, playerInventory, getEntity(playerInventory, data));
    }

    private static DoubleVaseTileEntity getEntity(final PlayerInventory playerInventory, final PacketBuffer data) {
        Objects.requireNonNull(playerInventory, "[własne] player inventory cannot be null");
        Objects.requireNonNull(data, "[własne] data cannot be null");

        final TileEntity tileAtPos = playerInventory.player.world.getTileEntity(data.readBlockPos());
        if (tileAtPos instanceof DoubleVaseTileEntity) {
            return (DoubleVaseTileEntity) tileAtPos;
        } else
            throw new IllegalStateException("[własne] Tilent entity is incorrect!");
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return isWithinUsableDistance(canInteractWithCallable, playerIn, BlockList.big_vase);
    }

    @Override
    public ItemStack transferStackInSlot(PlayerEntity player, int index) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
        if (slot != null && slot.getHasStack()) {
            ItemStack itemStack1 = slot.getStack();
            itemStack = itemStack1.copy();
            if (index < 63) {
                if (!this.mergeItemStack(itemStack, 63, this.inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.mergeItemStack(itemStack1, 0, 63, false)) {
                return ItemStack.EMPTY;
            }

            if (itemStack1.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }
        }
        return itemStack;
    }
}
