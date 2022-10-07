package net.timeworndevs.data;


import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class TimewornTags {

    //todo villager breeding tag setup thing
    //public static final TagKey<Item> VILLAGER_FOODS = of("c:villager_foods");
    
    private static TagKey<Item> of(String id){
        return TagKey.of(Registry.ITEM_KEY,new Identifier(id));
    }
    private TimewornTags(){

    }
}
