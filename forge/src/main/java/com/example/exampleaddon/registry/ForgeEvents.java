package com.example.exampleaddon.registry;

import com.example.exampleaddon.block.ModBlocks;
import com.example.exampleaddon.item.ModItems;
import com.example.exampleaddon.util.Constants;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForgeEvents {
    @SubscribeEvent
    public static void registerExampleAddonBridge(FMLCommonSetupEvent event)
    {
        ModBlocks.TEST_BLOCK = ForgeBlocks.TEST_BLOCK.get();
        ModItems.TEST_ITEM = ForgeItems.TEST_ITEM.get();
    }
}
