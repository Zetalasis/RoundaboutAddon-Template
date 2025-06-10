package com.example.exampleaddon.registry;

import com.example.exampleaddon.util.Constants;
import com.example.exampleaddon.block.ModBlocks;
import com.mojang.datafixers.types.Type;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.Util;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.datafix.fixes.References;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class FabricBlocks {
    private static final Block TEST_BLOCK = registerBlock("test_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    private static <T extends BlockEntity> BlockEntityType<T> registerBE(String $$0, BlockEntityType.Builder<T> $$1) {
        Type<?> $$2 = Util.fetchChoiceType(References.BLOCK_ENTITY, $$0);
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID,$$0), $$1.build($$2));
    }

    private static Block registerBlockItemless(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, name), block);
    }
    private static Block registerBlockUnstackable(String name, Block block, int stacksize) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, name),
                new BlockItem(block, new Item.Properties().stacksTo(stacksize)));
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, name), block);
    }
    private static Block registerBlockUnstackableItemless(String name, Block block, int stacksize) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, name),
                new BlockItem(block, new Item.Properties()));
    }

    public static void bootstrap()
    {
        ModBlocks.TEST_BLOCK = TEST_BLOCK;
    }
}
