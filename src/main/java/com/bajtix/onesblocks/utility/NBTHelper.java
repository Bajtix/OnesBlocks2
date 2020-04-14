package com.bajtix.onesblocks.utility;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class NBTHelper {

    public static CompoundNBT toNBT(Object o) {
        if (o instanceof ItemStack) {
            return writeItemStack((ItemStack) o);
        }

        /*if (o instanceof DoubleVaseTileEntity) {
            return writeDoubleVase((DoubleVaseTileEntity) o);
        }*/
        return null;
    }

    private static CompoundNBT writeItemStack(ItemStack o) {
        CompoundNBT compoundNBT = new CompoundNBT();
        compoundNBT.putInt("count", o.getCount());
        compoundNBT.putString("item", o.getItem().getRegistryName().toString());
        compoundNBT.putByte("type", (byte) 0);
        return compoundNBT;
    }
    /*
    private static CompoundNBT writeDoubleVase(DoubleVaseTileEntity o) {
        CompoundNBT compoundNBT = new CompoundNBT();
        compoundNBT.putInt("x", o.x);
        compoundNBT.putInt("y", o.y);
        compoundNBT.putInt("z", o.z);
        return compoundNBT;
    }*/

    @Nullable
    public static Object fromNBT(@Nonnull CompoundNBT compound) {
        switch (compound.getByte("type")) {
            case 0:
                return readItemStack(compound);
            default:
                return null;
        }
    }

    private static ItemStack readItemStack(CompoundNBT compound) {
        Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(compound.getString("item")));
        int count = compound.getInt("count");
        return new ItemStack(item, count);
    }
}
