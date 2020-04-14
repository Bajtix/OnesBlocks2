package com.bajtix.onesblocks.utility;

import com.bajtix.onesblocks.MainClass;
import com.bajtix.onesblocks.client.gui.DoubleVaseScreen;
import com.bajtix.onesblocks.lists.ContainerList;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MainClass.modid, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(ContainerList.DOUBLE_VASE.get(), DoubleVaseScreen::new);
    }
}
