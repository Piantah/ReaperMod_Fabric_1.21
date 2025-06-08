package com.reapermod.block;

import com.reapermod.ReaperMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(ReaperMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ReaperMod.MOD_ID,name),block);
    }
    public static void registerModBlocks (){
        ReaperMod.LOGGER.info("registrazione blocchi");
        //tab creative

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register( entries ->{
            entries.add(ModBlocks.Nether_Diamond_Block);
        } );
    }

    //lista blocchi

    public static final Block Nether_Diamond_Block = registerBlock("nether_diamond_block", new Block(AbstractBlock.Settings.create().strength(4f)));



}
