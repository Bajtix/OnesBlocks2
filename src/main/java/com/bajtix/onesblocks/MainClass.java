package com.bajtix.onesblocks;

import com.bajtix.onesblocks.lists.*;
import com.bajtix.onesblocks.world.OreGeneration;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("onesblocks2") //Previous one was never finished.
public class MainClass
{
    public static MainClass instance;
    public static final String modid  = "onesblocks2";
    private static final Logger logger = LogManager.getLogger(modid);

    public static final ItemGroup mainGroup = new MainItemGroup();

    public MainClass() {
        instance = this;
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::clientRegistries);


        ModTileEntityTypes.TILE_ENTITY_TYPES.register(bus);
        ContainerList.CONTAINER_TYPES.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        logger.info("Setup Function registered");
    }

    private void clientRegistries(final FMLClientSetupEvent event) {
        logger.info("Client Function registered");
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event)
        {
            event.getRegistry().registerAll(BlockItemList.items);
            event.getRegistry().registerAll(ItemList.items);
            event.getRegistry().registerAll(ToolItemsList.tools);
            logger.info("Items registered");
        }

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            event.getRegistry().registerAll(BlockList.blocks);
            logger.info("Blocks registered");
        }

        @SubscribeEvent
        public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
            OreGeneration.setupOreGeneration();
        }

    }
    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(modid,name);
    }

}