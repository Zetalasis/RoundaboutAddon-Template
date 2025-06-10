package com.example.exampleaddon.registry;

import com.example.exampleaddon.util.Constants;
import com.example.exampleaddon.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class FabricItems {
    private static final Item TEST_ITEM = registerItem("test_item", new Item(new Item.Properties()));

    private static Item registerItem(String name, Item item){
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID,name), item);
    }

    public static void bootstrap()
    {
        ModItems.TEST_ITEM = TEST_ITEM;
    }
}