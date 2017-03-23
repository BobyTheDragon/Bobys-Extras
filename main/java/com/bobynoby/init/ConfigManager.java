package com.bobynoby.init;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigManager {
	
	public static Configuration config;
	
	//Messages
	public static boolean logInMessage;
	
	//Items
	public static boolean registerClaimWand;
	public static boolean registerBadTools;
	public static boolean allowEnderpulvisUranium;
	public static boolean allowEnderpulvisDyes;
	public static boolean enchantEnderToolsOnCraft;
	public static boolean generateParticlesOnEnderTools;
	
	//Oregen
	public static boolean registergenIronSand;
	public static boolean registergenGlassSand;
	public static int genIronSand;
	public static int genGlassSand;
	public static int genBoronOre;
	public static int genBlazePowderOre;
	public static int genEnderDustOre;
	
	public static void init(File file) {
		config = new Configuration(file);
		syncConfig();
	}
	
	public static void syncConfig() {
		String category;
		
		category = "Messages";
		config.addCustomCategoryComment(category, "Change Ingame Messages");
		logInMessage = config.getBoolean("logInMessage", category, true, "Enable the login messages that show the version number");
		
		category = "Items";
		config.addCustomCategoryComment(category, "Change items and item propertys");
		registerClaimWand = config.getBoolean("registerClaimWand", category, false, "Load the Wand so servers can use it as a alternative to the golden shovel (Must be true for both client and server to work)");
		registerBadTools = config.getBoolean("registerBadTools", category, false, "Load the full set of Bad tools, Could be used for hardcore worlds when inventorys need basic tools");
		allowEnderpulvisUranium = config.getBoolean("allowEnderpulvisUranium", category, true, "Allow Pure Enderpulvis to be used like uranium, This can include being used as a fuel in reactors");
		allowEnderpulvisDyes = config.getBoolean("allowEnderpulvisDyes", category, true, "Allow Enderpulvis and its subtypes to used as colored dyes");
		enchantEnderToolsOnCraft = config.getBoolean("enchantEnderToolsOnCraft", category, true, "When an Infused Tool is crafted it will have enchantments");
		generateParticlesOnEnderTools = config.getBoolean("generateParticlesOnEnderTools", category, true, "When a Infused Tool is held it will generate a particle effect around the entity");
		
		category = "World Generation";
		config.addCustomCategoryComment(category, "Change how things generate in the world");
		registergenIronSand = config.getBoolean("registerGenerationIronSand", category, true, "Spawn in patches of Magnesium Rich Sand");
		registergenGlassSand = config.getBoolean("registerGenerationGlassSand", category, true, "Spawn in patches of Silica Rich Sand");
		genIronSand = config.getInt("chanceIronSand", category, 100, 0, 1000, "Chance of Magnesium Rich Sand to spawn");
		genGlassSand = config.getInt("chanceGlassSand", category, 100, 0, 1000, "Chance of Silica Rich Sand to spawn");
		genBoronOre = config.getInt("chanceBoronOre", category, 10, 0, 1000, "Chance of Boron Ore to spawn");
		genBlazePowderOre = config.getInt("chanceBlazePowderOre", category, 250, 0, 1000, "Chance of Blaze Powder Ore to spawn");
		genEnderDustOre = config.getInt("chanceEnderDustOre", category, 100, 0, 1000, "Chance of Enderpulvis Ore to spawn");
		
		config.save();
	}

}
