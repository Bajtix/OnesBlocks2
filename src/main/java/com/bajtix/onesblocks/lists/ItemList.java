package com.bajtix.onesblocks.lists;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemList
{
    public static Item sandstone_dust = new Item(new Item.Properties()
            .group(ItemGroup.MISC)
    );

    public static Item sandstone_brick = new Item(new Item.Properties()
            .group(ItemGroup.MISC)
    );

    public static Item sandstone_bricks = new BlockItem(BlockList.sandstone_bricks, new Item.Properties()
            .group(ItemGroup.BUILDING_BLOCKS)
    );
}
