package net.timeworndevs.registry;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistryFamilyHelper {
    public static void registerBuildingBlock(Identifier id, Block block){
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
    public static void registerStainedGlass(Identifier id, Block block){
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
    }
    public static void registerGlass(Identifier id, Block block){
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
    }
    public static void registerDecorBlock(Identifier id, Block block){
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    }
    public static void registerStainedGlassDecor(Identifier id, Block block){
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
    }
    public static void registerGlassDecor(Identifier id, Block block){
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
    }
    public static void registerRedstone(Identifier id, Block block){
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, new FabricItemSettings().group(ItemGroup.REDSTONE)));
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
    }
    public static void registerTranslucentRedstone(Identifier id, Block block){
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, new FabricItemSettings().group(ItemGroup.REDSTONE)));
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
    }
}
