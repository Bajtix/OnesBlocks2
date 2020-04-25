package com.bajtix.onesblocks.lists;

import com.bajtix.onesblocks.MainClass;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> register = new DeferredRegister<>(ForgeRegistries.ITEMS, MainClass.modid);

    public static final RegistryObject<Item> sandstone_brick = register.register("sandstone_brick", () -> ItemList.sandstone_brick);

}
