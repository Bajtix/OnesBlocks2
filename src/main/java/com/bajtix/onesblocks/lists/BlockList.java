package com.bajtix.onesblocks.lists;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class BlockList {

    public static Block sandstone_bricks = new Block(Block.Properties.create(Material.ROCK)
            .harvestLevel(0)
            .hardnessAndResistance(2.0f,3.0f)
            .sound(SoundType.STONE)
    );
}
