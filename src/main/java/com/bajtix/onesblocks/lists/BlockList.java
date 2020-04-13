package com.bajtix.onesblocks.lists;

import com.bajtix.onesblocks.MainClass;
import com.bajtix.onesblocks.blocks.DoubleVaseBlock;
import com.bajtix.onesblocks.blocks.EmptyUtilityBlock;
import com.bajtix.onesblocks.blocks.VaseBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
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

    public static Block big_vase = new DoubleVaseBlock(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
            .func_226896_b_()
            .variableOpacity()
            .doesNotBlockMovement()
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
                    mossy_stone,
                    vase,
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
                    bronze_block,
                    sandstone_bricks_stairs,
                    sandstone_bricks_slab
            };
}
