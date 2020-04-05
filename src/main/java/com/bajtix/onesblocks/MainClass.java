package com.bajtix.onesblocks;

import com.bajtix.onesblocks.lists.BlockList;
import com.bajtix.onesblocks.lists.ItemList;
import net.minecraft.block.Block;
import net.minecraft.dispenser.ILocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("onesblocks2") //Previous one was never finished.
public class MainClass
{
    public static MainClass instance;
    public static final String modid  = "onesblocks2";
    private static final Logger logger = LogManager.getLogger(modid);

    public MainClass() {
        instance = this;
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

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
            event.getRegistry().registerAll(
                    ItemList.sandstone_dust.setRegistryName(location("sandstone_dust")),
                    ItemList.sandstone_brick.setRegistryName(location("sandstone_brick")),
                    ItemList.sandstone_bricks.setRegistryName(location("sandstone_bricks"))
            );

            logger.info("Items registered");
        }

        public static void registerBlocks(final RegistryEvent.Register<Block> event)
        {
            event.getRegistry().registerAll(
                    BlockList.sandstone_bricks.setRegistryName(location("sandstone_bricks"))
            );
        }

        private static ResourceLocation location(String name)
        {
            return new ResourceLocation(modid,name);
        }
    }

}