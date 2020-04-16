package com.bajtix.onesblocks.lists;

import com.bajtix.onesblocks.MainClass;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemList {


    //Decoration blocks
    public static Item sandstone_bricks = new BlockItem(BlockList.sandstone_bricks, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("sandstone_bricks"));

    public static Item sandstone_bricks_stairs = new BlockItem(BlockList.sandstone_bricks_stairs, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("sandstone_bricks_stairs"));

    public static Item sandstone_bricks_slab = new BlockItem(BlockList.sandstone_bricks_slab, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("sandstone_bricks_slab"));

    public static Item dunestone = new BlockItem(BlockList.dunestone, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("dunestone"));

    public static Item dunestone_stairs = new BlockItem(BlockList.dunestone_stairs, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("dunestone_stairs"));

    public static Item dunestone_slab = new BlockItem(BlockList.dunestone_slab, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("dunestone_slab"));

    public static Item dunestone_pillar = new BlockItem(BlockList.dunestone_pillar, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("dunestone_pillar"));


    public static Item mossy_stone = new BlockItem(BlockList.mossy_stone, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("mossy_stone"));

    public static Item vase = new BlockItem(BlockList.vase, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("vase"));

    public static Item big_vase = new BlockItem(BlockList.big_vase, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("big_vase"));




    //Ore blocks
    public static Item elfium_ore = new BlockItem(BlockList.elfium_ore, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("elfium_ore"));

    public static Item mithril_ore = new BlockItem(BlockList.mithril_ore, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("mithril_ore"));

    public static Item copper_ore = new BlockItem(BlockList.copper_ore, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("copper_ore"));

    public static Item titanium_ore = new BlockItem(BlockList.titanium_ore, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("titanium_ore"));

    public static Item tin_ore = new BlockItem(BlockList.tin_ore, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("tin_ore"));


    //Block blocks
    public static Item titanium_block = new BlockItem(BlockList.titanium_block, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("titanium_block"));

    public static Item mithril_block = new BlockItem(BlockList.mithril_block, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("mithril_block"));

    public static Item tin_block = new BlockItem(BlockList.tin_block, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("tin_block"));

    public static Item elfium_block = new BlockItem(BlockList.elfium_block, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("elfium_block"));

    public static Item bronze_block = new BlockItem(BlockList.bronze_block, new Item.Properties()
            .group(MainClass.mainGroup)
    ).setRegistryName(MainClass.location("bronze_block"));

    public static Item[] items = new Item[]{
            sandstone_bricks,
            mossy_stone,
            sandstone_bricks_stairs,
            dunestone,
            dunestone_stairs,
            dunestone_slab,
            dunestone_pillar,
            elfium_ore,
            mithril_ore,
            copper_ore,
            titanium_ore,
            tin_ore,
            titanium_block,
            mithril_block,
            tin_block,
            elfium_block,
            bronze_block,
            vase,
            big_vase,
            sandstone_bricks_slab
    };
}
