package com.reapermod.item;

import com.reapermod.ReaperMod;
import com.reapermod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup Blocchi_Mod = Registry.register(Registries.ITEM_GROUP, Identifier.of(ReaperMod.MOD_ID,"blocchi_mod"), FabricItemGroup.builder()
            .icon(()->new ItemStack(ModBlocks.Nether_Diamond_Block))
            .displayName(Text.translatable("itemgroup.reapermod.blocchi_mod"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.Uranium_Ore);
                        entries.add(ModBlocks.Nether_Diamond_Ore);
                        entries.add(ModBlocks.Nether_Diamond_Block);
                    })
            .build());

    public static final ItemGroup Ingredienti_Mod = Registry.register(Registries.ITEM_GROUP, Identifier.of(ReaperMod.MOD_ID,"ingredienti_mod"), FabricItemGroup.builder()
            .icon(()->new ItemStack(ModItems.Nether_Diamond))
            .displayName(Text.translatable("itemgroup.reapermod.ingredienti_mod"))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.Uranium_Ingot);
                entries.add(ModItems.Raw_Uranium);
                entries.add(ModItems.Nether_Diamond);
            })
            .build());

    public static final ItemGroup Armi_Mod = Registry.register(Registries.ITEM_GROUP, Identifier.of(ReaperMod.MOD_ID,"armi_mod"), FabricItemGroup.builder()
            .icon(()->new ItemStack(ModItems.Vanquisher))
            .displayName(Text.translatable("itemgroup.reapermod.armi_mod"))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.Vanquisher);
            })
            .build());



    public static  void registerItemGroups(){
        ReaperMod.LOGGER.info("registrazione tab creative");

    }
}
