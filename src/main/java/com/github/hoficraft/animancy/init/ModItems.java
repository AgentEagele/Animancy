package com.github.hoficraft.animancy.init;

import com.github.hoficraft.animancy.Animancy;
import com.github.hoficraft.animancy.item.JavelinItem;
import com.github.hoficraft.animancy.item.Mace_T1;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Animancy.MODID);
	
	//Crystals consider changing citrine to ?
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).maxStackSize(1)));
	public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).maxStackSize(1)));
	public static final RegistryObject<Item> JADE = ITEMS.register("jade", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).maxStackSize(1)));
	public static final RegistryObject<Item> CLEAR_QUARTZ = ITEMS.register("clear_quartz", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).maxStackSize(1)));
	public static final RegistryObject<Item> ONYX= ITEMS.register("onyx", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).maxStackSize(1)));
	public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).maxStackSize(1)));
	public static final RegistryObject<Item> OPAL = ITEMS.register("opal", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).maxStackSize(1)));
	
	//Elemental Weapons
	public static final RegistryObject<Mace_T1> PITCHFORK_T1 = ITEMS.register("mace_t1", () -> new Mace_T1(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
	public static final RegistryObject<JavelinItem> JAVELINITEM = ITEMS.register("javelin_item", () -> new JavelinItem(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
}

