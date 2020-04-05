package com.bajtix.onesblocks.lists;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class BlockList {

    //Decoration
    public static Block sandstone_bricks = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
    );

    public static Block mossy_stone = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
    );


    //Ores
    public static Block elfium_ore = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
            .lightValue(7)
    );

    public static Block mithril_ore = new Block(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(2.0f,3.0f)
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
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
    );
}
