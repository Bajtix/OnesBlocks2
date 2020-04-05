package com.bajtix.onesblocks;

import com.bajtix.onesblocks.lists.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MainItemGroup extends ItemGroup
{
    public MainItemGroup()
    {
        super("One's Blocks");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemList.sandstone_dust);
    }
}
