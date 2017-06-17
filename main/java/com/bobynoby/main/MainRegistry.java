package com.bobynoby.main;

import com.bobynoby.init.CraftingManager;
import com.bobynoby.init.EventManager;
import com.bobynoby.init.FuelHandler;
import com.bobynoby.init.ModCompatibility;

import java.io.File;

import com.bobynoby.init.BEXBlocks;
import com.bobynoby.init.BEXItems;
import com.bobynoby.init.ConfigManager;
import com.bobynoby.init.OreDic;
import com.bobynoby.init.worldgen.OreGenManager;
import com.bobynoby.main.proxy.CommonProxy;
import com.bobynoby.main.tabs.BobyEXmaintab;
import com.bobynoby.main.tabs.BobyEXtooltab;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_CLIENT_VERSION)
public class MainRegistry
{
	
	@Instance
	public static MainRegistry instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs CREATIVE_TAB_MAIN = new BobyEXmaintab();
	public static final CreativeTabs CREATIVE_TAB_TOOL = new BobyEXtooltab();
	
	private static File configDir;
	public static File getConfigDir() {
		return configDir;
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		configDir = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		configDir.mkdirs();
		ConfigManager.init(new File(configDir.getPath(), Reference.MOD_ID + ".cfg"));
		GameRegistry.registerFuelHandler(new FuelHandler());
	
		BEXBlocks.init();
		BEXBlocks.register();
		BEXItems.init();
		BEXItems.register();
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
		proxy.init();
		CraftingManager.register();
		GameRegistry.registerWorldGenerator(new OreGenManager(), 3);
		OreDic.registerOreDic();
		FMLCommonHandler.instance().bus().register(new EventManager());
		ModCompatibility.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("Bobyex version " + Reference.VERSION + " has loaded correctly, Yay!");
	}
	
}
