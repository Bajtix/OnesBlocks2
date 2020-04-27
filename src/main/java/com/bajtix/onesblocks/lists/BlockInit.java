package com.bajtix.onesblocks.lists;

import com.bajtix.onesblocks.MainClass;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> register = new DeferredRegister<>(ForgeRegistries.BLOCKS, MainClass.modid);

    public static final RegistryObject<Block> utility_space = register.register("utility_space", () -> BlockList.utility_space);
    public static final RegistryObject<Block> sandstone_bricks = register.register("sandstone_bricks", () -> BlockList.sandstone_bricks);
    public static final RegistryObject<Block> sandstone_bricks_slab = register.register("sandstone_bricks_slab", () -> BlockList.sandstone_bricks_slab);
    public static final RegistryObject<Block> sandstone_bricks_stairs = register.register("sandstone_bricks_stairs", () -> BlockList.sandstone_bricks_stairs);
    public static final RegistryObject<Block> dunestone = register.register("dunestone", () -> BlockList.dunestone);
    public static final RegistryObject<Block> dunestone_pillar_connector = register.register("dunestone_pillar_connector", () -> BlockList.dunestone_pillar_connector);
    public static final RegistryObject<Block> skull_dunestone = register.register("skull_dunestone", () -> BlockList.chiseled_dunestone);
    public static final RegistryObject<Block> dunestone_slab = register.register("dunestone_slab", () -> BlockList.dunestone_slab);
    public static final RegistryObject<Block> dunestdunestone_pillarone_stairs = register.register("dunestone_pillar", () -> BlockList.dunestone_pillar);
    public static final RegistryObject<Block> skull_dunestone_pillar = register.register("skull_dunestone_pillar", () -> BlockList.chiseled_dunestone_pillar);
    public static final RegistryObject<Block> mossy_stone = register.register("mossy_stone", () -> BlockList.mossy_stone);
    public static final RegistryObject<Block> vase = register.register("vase", () -> BlockList.vase);
    public static final RegistryObject<Block> candle = register.register("candle", () -> BlockList.candle);
    public static final RegistryObject<Block> big_vase = register.register("big_vase", () -> BlockList.big_vase);
    public static final RegistryObject<Block> elfium_ore = register.register("elfium_ore", () -> BlockList.elfium_ore);
    public static final RegistryObject<Block> mithril_ore = register.register("mithril_ore", () -> BlockList.mithril_ore);
    public static final RegistryObject<Block> titanium_ore = register.register("titanium_ore", () -> BlockList.titanium_ore);
    public static final RegistryObject<Block> copper_ore = register.register("copper_ore", () -> BlockList.copper_ore);
    public static final RegistryObject<Block> tin_ore = register.register("tin_ore", () -> BlockList.tin_ore);
    public static final RegistryObject<Block> titanium_block = register.register("titanium_block", () -> BlockList.titanium_block);
    public static final RegistryObject<Block> mithril_block = register.register("mithril_block", () -> BlockList.mithril_block);
    public static final RegistryObject<Block> tin_block = register.register("tin_block", () -> BlockList.tin_block);
    public static final RegistryObject<Block> elfium_block = register.register("elfium_block", () -> BlockList.elfium_block);
    public static final RegistryObject<Block> bronze_block = register.register("bronze_block", () -> BlockList.bronze_block);
}
