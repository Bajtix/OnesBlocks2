package com.bajtix.onesblocks.lists;

import com.bajtix.onesblocks.MainClass;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> register = new DeferredRegister<>(ForgeRegistries.ITEMS, MainClass.modid);

    public static final RegistryObject<Item> sandstone_dust = register.register("sandstone_dust", () -> ItemList.sandstone_dust);
    public static final RegistryObject<Item> sandstone_brick = register.register("sandstone_brick", () -> ItemList.sandstone_brick);
    public static final RegistryObject<Item> tin_ingot = register.register("tin_ingot", () -> ItemList.tin_ingot);
    public static final RegistryObject<Item> mithril_ingot = register.register("mithril_ingot", () -> ItemList.mithril_ingot);
    public static final RegistryObject<Item> elfium = register.register("elfium", () -> ItemList.elfium);
    public static final RegistryObject<Item> bronze_ingot = register.register("bronze_ingot", () -> ItemList.bronze_ingot);

}
