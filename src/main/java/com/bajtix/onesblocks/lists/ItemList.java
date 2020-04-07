package com.bajtix.onesblocks.lists;

import com.bajtix.onesblocks.MainClass;
import net.minecraft.item.Item;

public class ItemList {

    public static Item sandstone_dust = new Item(new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("sandstone_dust"));

    public static Item sandstone_brick = new Item(new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("sandstone_brick"));

    public static Item tin_ingot = new Item(new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("tin_ingot"));

    public static Item mithril_ingot = new Item(new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("mithril_ingot"));

    public static Item elfium = new Item(new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("elfium"));

    public static Item bronze_ingot = new Item(new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("bronze_ingot"));


    public static Item[] items = new Item[]
            {
                    sandstone_dust,
                    sandstone_brick,
                    tin_ingot,
                    elfium,
                    mithril_ingot,
                    bronze_ingot
            };

}
