package com.bajtix.onesblocks.lists;

import com.bajtix.onesblocks.MainClass;
import com.bajtix.onesblocks.blocks.DoubleVaseBlock;
import com.bajtix.onesblocks.blocks.EmptyUtilityBlock;
import com.bajtix.onesblocks.blocks.VaseBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;


public class BlockList {


    public static Block utility_space = new EmptyUtilityBlock(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
            .doesNotBlockMovement()
    ).setRegistryName(MainClass.location("utility"));

    //Decoration
    public static Block sandstone_bricks = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
    ).setRegistryName(MainClass.location("sandstone_bricks"));

    public static Block sandstone_bricks_slab = new SlabBlock(
            Block.Properties.from(sandstone_bricks)
    ).setRegistryName(MainClass.location("sandstone_bricks_slab"));

    public static Block sandstone_bricks_stairs = new StairsBlock(() -> sandstone_bricks.getDefaultState(),
            Block.Properties.from(sandstone_bricks)
    ).setRegistryName(MainClass.location("sandstone_bricks_stairs"));

    public static Block dunestone = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
    ).setRegistryName(MainClass.location("dunestone"));

    public static Block dunestone_pillar_connector = new Block(
            Block.Properties.from(dunestone)
    ).setRegistryName(MainClass.location("dunestone_pillar_connector"));

    public static Block chiseled_dunestone = new Block(
            Block.Properties.from(dunestone)
    ).setRegistryName(MainClass.location("skull_dunestone"));

    public static Block dunestone_slab = new SlabBlock(
            Block.Properties.from(dunestone)
    ).setRegistryName(MainClass.location("dunestone_slab"));

    public static Block dunestone_stairs = new StairsBlock(() -> sandstone_bricks.getDefaultState(),
            Block.Properties.from(dunestone)
    ).setRegistryName(MainClass.location("dunestone_stairs"));

    public static Block dunestone_pillar = new RotatedPillarBlock(
            Block.Properties.from(dunestone)
    ).setRegistryName(MainClass.location("dunestone_pillar"));

    public static Block chiseled_dunestone_pillar = new RotatedPillarBlock(
            Block.Properties.from(dunestone)
    ).setRegistryName(MainClass.location("skull_dunestone_pillar"));


    public static Block mossy_stone = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
    ).setRegistryName(MainClass.location("mossy_stone"));


    public static Block vase = new VaseBlocks(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
            .func_226896_b_()
            .variableOpacity()
    ).setRegistryName(MainClass.location("vase"));

    public static Block candle = new VaseBlocks(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
            .lightValue(10)
    ).setRegistryName(MainClass.location("candle"));

    public static Block big_vase = new DoubleVaseBlock(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
            .func_226896_b_()
            .variableOpacity()
    ).setRegistryName(MainClass.location("big_vase"));


    //Ores
    public static Block elfium_ore = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
            .lightValue(7)
    ).setRegistryName(MainClass.location("elfium_ore"));

    public static Block mithril_ore = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
    ).setRegistryName(MainClass.location("mithril_ore"));

    public static Block titanium_ore = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
    ).setRegistryName(MainClass.location("titanium_ore"));

    public static Block copper_ore = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
    ).setRegistryName(MainClass.location("copper_ore"));

    public static Block tin_ore = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
    ).setRegistryName(MainClass.location("tin_ore"));


    //Block blocks
    public static Block titanium_block = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
    ).setRegistryName(MainClass.location("titanium_block"));

    public static Block mithril_block = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
    ).setRegistryName(MainClass.location("mithril_block"));

    public static Block tin_block = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
    ).setRegistryName(MainClass.location("tin_block"));

    public static Block elfium_block = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
            .lightValue(10000)
    ).setRegistryName(MainClass.location("elfium_block"));

    public static Block bronze_block = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
    ).setRegistryName(MainClass.location("bronze_block"));

    public static Block[] blocks = new Block[]
            {
                    utility_space,

                    sandstone_bricks,
                    sandstone_bricks_stairs,
                    sandstone_bricks_slab,

                    dunestone,
                    dunestone_pillar_connector,
                    chiseled_dunestone,
                    dunestone_stairs,
                    dunestone_slab,
                    dunestone_pillar,
                    chiseled_dunestone_pillar,

                    mossy_stone,

                    vase,
                    candle,
                    big_vase,

                    elfium_ore,
                    mithril_ore,
                    titanium_ore,
                    copper_ore,
                    tin_ore,

                    titanium_block,
                    mithril_block,
                    tin_block,
                    elfium_block,
                    bronze_block

            };
}
