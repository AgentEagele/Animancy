package com.github.hoficraft.animancy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.hoficraft.animancy.init.ModBlocks;
import com.github.hoficraft.animancy.init.ModItems;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Animancy.MODID)
public class Animancy {

public static final String MODID = "animancy";
    
    private static final Logger LOGGER = LogManager.getLogger();
    
    public Animancy() {
    	
    	LOGGER.debug("Animancy loading...");
    	
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
	    ModBlocks.BLOCKS.register(modEventBus);
		ModItems.ITEMS.register(modEventBus);
    }
}

