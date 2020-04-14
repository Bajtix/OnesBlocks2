package com.bajtix.onesblocks.lists;

import com.bajtix.onesblocks.MainClass;
import com.bajtix.onesblocks.containers.DoubleVaseContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerList {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(ForgeRegistries.CONTAINERS, MainClass.modid);

    public static final RegistryObject<ContainerType<DoubleVaseContainer>> DOUBLE_VASE = CONTAINER_TYPES
            .register("double_vase_chest", () -> IForgeContainerType.create(DoubleVaseContainer::new));
}
