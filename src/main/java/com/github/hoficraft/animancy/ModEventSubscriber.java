package com.github.hoficraft.animancy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.hoficraft.animancy.init.ModBlocks;
import com.github.hoficraft.animancy.init.ModItemGroups;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = Animancy.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {

	private static final Logger LOGGER = LogManager.getLogger(Animancy.MODID + " Mod Event Subscriber");

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		ModBlocks.BLOCKS.getEntries().stream()
		
				.map(RegistryObject::get)
				
				.forEach(block -> {
					final Item.Properties properties = new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP);
					final BlockItem blockItem = new BlockItem(block, properties);
					
					blockItem.setRegistryName(block.getRegistryName());
					registry.register(blockItem);
				});
		
		LOGGER.debug("Registered BlockItems");
	}
	

}
