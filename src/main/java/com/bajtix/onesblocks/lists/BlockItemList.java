package com.bajtix.onesblocks.lists;

import com.bajtix.onesblocks.MainClass;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemList {

    //Decoration blocks
    public static Item sandstone_bricks = new BlockItem(BlockList.sandstone_bricks, new Item.Properties()
            .group(MainClass.mainGroup)
    );

    public static Item mossy_stone = new BlockItem(BlockList.mossy_stone, new Item.Properties()
            .group(MainClass.mainGroup)
    );


    //Ore blocks
    public static Item elfium_ore = new BlockItem(BlockList.elfium_ore, new Item.Properties()
            .group(MainClass.mainGroup)
    );

    public static Item mithril_ore = new BlockItem(BlockList.mithril_ore, new Item.Properties()
            .group(MainClass.mainGroup)
    );

    public static Item copper_ore = new BlockItem(BlockList.copper_ore, new Item.Properties()
            .group(MainClass.mainGroup)
    );

    public static Item titanium_ore = new BlockItem(BlockList.titanium_ore, new Item.Properties()
            .group(MainClass.mainGroup)
    );

    public static Item tin_ore = new BlockItem(BlockList.tin_ore, new Item.Properties()
            .group(MainClass.mainGroup)
    );


    //Block blocks
    public static Item titanium_block = new BlockItem(BlockList.titanium_block, new Item.Properties()
            .group(MainClass.mainGroup)
    );

    public static Item mithril_block = new BlockItem(BlockList.mithril_block, new Item.Properties()
            .group(MainClass.mainGroup)
    );

    public static Item tin_block = new BlockItem(BlockList.tin_block, new Item.Properties()
            .group(MainClass.mainGroup)
    );
}
