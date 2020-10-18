package com.github.hoficraft.animancy.init;

import com.github.hoficraft.animancy.Animancy;
import com.github.hoficraft.animancy.block.AltarBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Animancy.MODID);
	
	//Ores
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> JADE_ORE = BLOCKS.register("peridot_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CLEAR_QUARTZ_ORE = BLOCKS.register("clear_quartz_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> ONYX_ORE = BLOCKS.register("onyx_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> CITRINE_ORE = BLOCKS.register("citrine_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> OPAL_ORE = BLOCKS.register("opal_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
	
	//Altar Stuff
	public static final RegistryObject<Block> ALTAR = BLOCKS.register("altar", () -> new AltarBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
}
