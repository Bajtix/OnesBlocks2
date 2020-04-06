package com.bajtix.onesblocks.lists;

import com.bajtix.onesblocks.MainClass;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class ToolItemsList {

    //new SwordItem([Tool Mat], Added damage, Attack speed, Item properties
    public static Item sandstone_sword = new SwordItem(ToolMaterialList.sandstone, 0,10, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName("sandstone_sword");

    public static Item[] tools = new Item[]
    {
            sandstone_sword
    };

}
