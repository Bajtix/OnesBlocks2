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
    );

    //Decoration
    public static Block sandstone_bricks = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
    );

    public static Block sandstone_bricks_slab = new SlabBlock(
            Block.Properties.from(sandstone_bricks)
    );

    public static Block sandstone_bricks_stairs = new StairsBlock(() -> sandstone_bricks.getDefaultState(),
            Block.Properties.from(sandstone_bricks)
    );

    public static Block dunestone = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
    );

    public static Block dunestone_pillar_connector = new Block(
            Block.Properties.from(dunestone)
    );

    public static Block chiseled_dunestone = new Block(
            Block.Properties.from(dunestone)
    );

    public static Block dunestone_slab = new SlabBlock(
            Block.Properties.from(dunestone)
    );

    public static Block dunestone_stairs = new StairsBlock(() -> sandstone_bricks.getDefaultState(),
            Block.Properties.from(dunestone)
    );

    public static Block dunestone_pillar = new RotatedPillarBlock(
            Block.Properties.from(dunestone)
    );

    public static Block chiseled_dunestone_pillar = new RotatedPillarBlock(
            Block.Properties.from(dunestone)
    );


    public static Block mossy_stone = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
    );


    public static Block vase = new VaseBlocks(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
            .func_226896_b_()
            .variableOpacity()
    );

    public static Block candle = new VaseBlocks(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
            .lightValue(16)
    );

    public static Block big_vase = new DoubleVaseBlock(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
            .func_226896_b_()
            .variableOpacity()
    );


    //Ores
    public static Block elfium_ore = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
            .lightValue(7)
    );

    public static Block mithril_ore = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
    );

    public static Block titanium_ore = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
    );

    public static Block copper_ore = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
    );

    public static Block tin_ore = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
    );


    //Block blocks
    public static Block titanium_block = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
    );

    public static Block mithril_block = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
    );

    public static Block tin_block = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
    );

    public static Block elfium_block = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
            .lightValue(10000)
    );

    public static Block bronze_block = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f, 3.0f)
            .sound(SoundType.STONE)
    );

    /*public static Block[] blocks = new Block[]
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

            };*/
}
