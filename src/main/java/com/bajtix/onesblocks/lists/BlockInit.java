package com.bajtix.onesblocks.lists;

import com.bajtix.onesblocks.MainClass;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> register = new DeferredRegister<>(ForgeRegistries.BLOCKS, MainClass.modid);

    public static final RegistryObject<Block> sandstone_bricks = register.register("sandstone_bricks", () -> BlockList.sandstone_bricks);
}
