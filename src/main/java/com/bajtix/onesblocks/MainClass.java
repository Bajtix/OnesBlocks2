package com.bajtix.onesblocks;

import com.bajtix.onesblocks.lists.BlockItemList;
import com.bajtix.onesblocks.lists.BlockList;
import com.bajtix.onesblocks.lists.ItemList;
import net.minecraft.block.Block;
import net.minecraft.dispenser.ILocation;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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

    public static final ItemGroup mainGroup = new MainItemGroup();

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

                    //Items
                    ItemList.sandstone_dust.setRegistryName(location("sandstone_dust")),
                    ItemList.sandstone_brick.setRegistryName(location("sandstone_brick")),



                    //Blocks
                    BlockItemList.sandstone_bricks.setRegistryName(BlockList.sandstone_bricks.getRegistryName()),
                    BlockItemList.mossy_stone.setRegistryName(BlockList.mossy_stone.getRegistryName()),

                    BlockItemList.elfium_ore.setRegistryName(BlockList.elfium_ore.getRegistryName()),
                    BlockItemList.mithril_ore.setRegistryName(BlockList.mithril_ore.getRegistryName()),
                    BlockItemList.titanium_ore.setRegistryName(BlockList.titanium_ore.getRegistryName()),
                    BlockItemList.copper_ore.setRegistryName(BlockList.copper_ore.getRegistryName()),
                    BlockItemList.tin_ore.setRegistryName(BlockList.tin_ore.getRegistryName()),

                    BlockItemList.titanium_block.setRegistryName(BlockList.titanium_block.getRegistryName()),
                    BlockItemList.mithril_block.setRegistryName(BlockList.mithril_block.getRegistryName()),
                    BlockItemList.tin_block.setRegistryName(BlockList.tin_block.getRegistryName())
            );

            logger.info("Items registered");
        }
        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event)
        {
            event.getRegistry().registerAll(

                    //Decoration
                    BlockList.sandstone_bricks.setRegistryName(location("sandstone_bricks")),
                    BlockList.mossy_stone.setRegistryName(location("mossy_stone")),

                    //Ores
                    BlockList.elfium_ore.setRegistryName(location("elfium_ore")),
                    BlockList.mithril_ore.setRegistryName(location("mithril_ore")),
                    BlockList.copper_ore.setRegistryName(location("copper_ore")),
                    BlockList.titanium_ore.setRegistryName(location("titanium_ore")),
                    BlockList.tin_ore.setRegistryName(location("tin_ore")),

                    //Block blocks
                    BlockList.titanium_block.setRegistryName(location("titanium_block")),
                    BlockList.mithril_block.setRegistryName(location("mithril_block")),
                    BlockList.tin_block.setRegistryName(location("tin_block"))
            );
        }

        private static ResourceLocation location(String name)
        {
            return new ResourceLocation(modid,name);
        }
    }

}