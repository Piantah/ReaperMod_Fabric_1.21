package com.reapermod.item;

import com.reapermod.ReaperMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    private static Item registerItem( String name, Item item){
    return Registry.register(Registries.ITEM, Identifier.of(ReaperMod.MOD_ID,name),item);
    }
    public static void registerModItems(){
        ReaperMod.LOGGER.info("registrazione Item");

        //tab ingredienti
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(Nether_Diamond);
            entries.add(Raw_Uranium);
            entries.add(Vanquisher);
        });
    }

    //Lista Item
    public static final Item Nether_Diamond = registerItem("nether_diamond",new Item(new Item.Settings()));
    public static final Item Raw_Uranium = registerItem("raw_uranium",new Item(new Item.Settings()));
    public static final Item Vanquisher = registerItem("vanquisher",new Item(new Item.Settings()));

}
