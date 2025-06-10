package com.example.exampleaddon;

import com.example.exampleaddon.registry.ForgeBlocks;
import com.example.exampleaddon.registry.ForgeEvents;
import com.example.exampleaddon.registry.ForgeItems;
import com.example.exampleaddon.util.Constants;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ExampleAddon {
    
    public ExampleAddon() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");

        ForgeItems.ITEMS.register(bus);
        ForgeBlocks.BLOCKS.register(bus);

        com.example.exampleaddon.util.ExampleAddon.init();
    }
}