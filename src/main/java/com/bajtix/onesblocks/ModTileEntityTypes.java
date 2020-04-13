package com.bajtix.onesblocks;

import com.bajtix.onesblocks.lists.BlockList;
import com.bajtix.onesblocks.tileentities.DoubleVaseTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, MainClass.modid);

    public static final RegistryObject<TileEntityType<DoubleVaseTileEntity>> DOUBLE_VASE = TILE_ENTITY_TYPES.register("double_vase", () -> TileEntityType.Builder.create(DoubleVaseTileEntity::new, BlockList.big_vase).build(null));
}
