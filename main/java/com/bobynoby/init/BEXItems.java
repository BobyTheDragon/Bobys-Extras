package com.bobynoby.init;

import com.bobynoby.items.ItemBlackPaste;
import com.bobynoby.items.ItemBoronIngot;
import com.bobynoby.items.ItemBoronStick;
import com.bobynoby.items.ItemCamoGreen;
import com.bobynoby.items.ItemCamoGrey;
import com.bobynoby.items.ItemCamoRed;
import com.bobynoby.items.ItemCamoWhite;
import com.bobynoby.items.ItemCamoYellow;
import com.bobynoby.items.ItemClaimWand;
import com.bobynoby.items.ItemEnderDust;
import com.bobynoby.items.ItemEnderDustBlue;
import com.bobynoby.items.ItemEnderDustGreen;
import com.bobynoby.items.ItemEnderDustIngot;
import com.bobynoby.items.ItemEnderDustMicro;
import com.bobynoby.items.ItemEnderDustMini;
import com.bobynoby.items.ItemEnderDustPure;
import com.bobynoby.items.ItemEnderDustRed;
import com.bobynoby.items.ItemEnderDustWhite;
import com.bobynoby.items.ItemEnderGem;
import com.bobynoby.items.ItemIronShard;
import com.bobynoby.items.ItemLeatherStrap;
import com.bobynoby.items.ItemNightVisionLens;
import com.bobynoby.items.ItemObbyIngot;
import com.bobynoby.items.ItemObbyStick;
import com.bobynoby.items.armor.ArmorDesertBoots;
import com.bobynoby.items.armor.ArmorDesertChest;
import com.bobynoby.items.armor.ArmorDesertHelmet;
import com.bobynoby.items.armor.ArmorDesertLeggings;
import com.bobynoby.items.armor.ArmorForestBoots;
import com.bobynoby.items.armor.ArmorForestChest;
import com.bobynoby.items.armor.ArmorForestHelmet;
import com.bobynoby.items.armor.ArmorForestLeggings;
import com.bobynoby.items.armor.ArmorNetherBoots;
import com.bobynoby.items.armor.ArmorNetherChest;
import com.bobynoby.items.armor.ArmorNetherHelmet;
import com.bobynoby.items.armor.ArmorNetherLeggings;
import com.bobynoby.items.armor.ArmorNightVision;
import com.bobynoby.items.armor.ArmorSnowBoots;
import com.bobynoby.items.armor.ArmorSnowChest;
import com.bobynoby.items.armor.ArmorSnowHelmet;
import com.bobynoby.items.armor.ArmorSnowLeggings;
import com.bobynoby.items.armor.ArmorStoneBoots;
import com.bobynoby.items.armor.ArmorStoneChest;
import com.bobynoby.items.armor.ArmorStoneHelmet;
import com.bobynoby.items.armor.ArmorStoneLeggings;
import com.bobynoby.items.tools.ItemExtractor;
import com.bobynoby.items.tools.ItemInfuser;
import com.bobynoby.items.tools.ToolAdminSword;
import com.bobynoby.items.tools.ToolBadAxe;
import com.bobynoby.items.tools.ToolBadHoe;
import com.bobynoby.items.tools.ToolBadPickaxe;
import com.bobynoby.items.tools.ToolBadShovel;
import com.bobynoby.items.tools.ToolBadSword;
import com.bobynoby.items.tools.ToolEnderAxe;
import com.bobynoby.items.tools.ToolEnderPickaxe;
import com.bobynoby.items.tools.ToolEnderShovel;
import com.bobynoby.items.tools.ToolEnderSword;
import com.bobynoby.items.tools.ToolGlassSword;
import com.bobynoby.items.tools.ToolObbyAxe;
import com.bobynoby.items.tools.ToolObbyHoe;
import com.bobynoby.items.tools.ToolObbyPickaxe;
import com.bobynoby.items.tools.ToolObbyShears;
import com.bobynoby.items.tools.ToolObbyShovel;
import com.bobynoby.items.tools.ToolObbySword;
import com.bobynoby.items.tools.ToolStoneShears;
import com.bobynoby.items.tools.ToolWoodenShears;
import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BEXItems {
	
	//Items
	
	public static Item extractor;
	public static Item infuser;
	
	public static Item ironshard;
	public static Item obbyingot;
	public static Item obbystick;
	public static Item nightvisionlens;
	public static Item leatherstrap;
	public static Item boroningot;
	public static Item boronstick;
	public static Item blackpaste;
	
	public static Item camogreen;
	public static Item camored;
	public static Item camoyellow;
	public static Item camowhite;
	public static Item camogrey;
	
	public static Item enderdust;
	public static Item endergem;
	public static Item enderseed;
	public static Item enderdustgreen;
	public static Item enderdustred;
	public static Item enderdustblue;
	public static Item enderdustwhite;
	public static Item enderdustmicro;
	public static Item enderdustmini;
	public static Item enderdustpure;
	public static Item enderdustingot;
	
	//Tools
	
	public static Item obbysword;
	public static Item obbypickaxe;
	public static Item obbyaxe;
	public static Item obbyshovel;
	public static Item obbyhoe;
	
	public static Item endersword;
	public static Item enderpickaxe;
	public static Item enderaxe;
	public static Item endershovel;
	
	public static Item badsword;
	public static Item badpickaxe;
	public static Item badaxe;
	public static Item badshovel;
	public static Item badhoe;
	
	public static Item adminsword;
	
	public static Item woodenshears;
	public static Item stoneshears;
	public static Item obbyshears;
	
	public static Item glasssword;
	
	//Armour
	
	public static Item foresthelmet;
	public static Item forestchest;
	public static Item forestleggings;
	public static Item forestboots;
	
	public static Item netherhelmet;
	public static Item netherchest;
	public static Item netherleggings;
	public static Item netherboots;

	public static Item deserthelmet;
	public static Item desertchest;
	public static Item desertleggings;
	public static Item desertboots;
	
	public static Item snowhelmet;
	public static Item snowchest;
	public static Item snowleggings;
	public static Item snowboots;
	
	public static Item stonehelmet;
	public static Item stonechest;
	public static Item stoneleggings;
	public static Item stoneboots;
	
	public static Item nightvision;

	//server
	
	public static Item claimwand;
	
	public static void init()
	{
		extractor = new ItemExtractor();
		infuser = new ItemInfuser();
		
		ironshard = new ItemIronShard();
		obbyingot = new ItemObbyIngot();
		obbystick = new ItemObbyStick();
		nightvisionlens = new ItemNightVisionLens();
		leatherstrap = new ItemLeatherStrap();
		boroningot = new ItemBoronIngot();
		boronstick = new ItemBoronStick();
		blackpaste = new ItemBlackPaste();
		
		camogreen = new ItemCamoGreen();
		camored = new ItemCamoRed();
		camoyellow = new ItemCamoYellow();
		camowhite = new ItemCamoWhite();
		camogrey = new ItemCamoGrey();
		
		enderdust = new ItemEnderDust();
		endergem = new ItemEnderGem();
		enderseed = new ItemSeeds(BEXBlocks.endercrop, Blocks.FARMLAND).setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN).setUnlocalizedName(Reference.BobyEXitems.ENDERSEED.getUnlocalizedName()).setRegistryName(Reference.BobyEXitems.ENDERSEED.getRegistryName());
		enderdustgreen = new ItemEnderDustGreen();
		enderdustred = new ItemEnderDustRed();
		enderdustblue = new ItemEnderDustBlue();
		enderdustwhite = new ItemEnderDustWhite();
		enderdustmicro = new ItemEnderDustMicro();
		enderdustmini = new ItemEnderDustMini();
		enderdustpure = new ItemEnderDustPure();
		enderdustingot = new ItemEnderDustIngot();
		
		obbysword = new ToolObbySword(MaterialManager.OBBY);
		obbypickaxe = new ToolObbyPickaxe(MaterialManager.OBBY);
		obbyaxe = new ToolObbyAxe(MaterialManager.OBBY);
		obbyshovel = new ToolObbyShovel(MaterialManager.OBBY);
		obbyhoe = new ToolObbyHoe(MaterialManager.OBBY);
		
		endersword = new ToolEnderSword(MaterialManager.ENDERMAGIC);
		enderpickaxe = new ToolEnderPickaxe(MaterialManager.ENDERMAGIC);
		enderaxe = new ToolEnderAxe(MaterialManager.ENDERMAGIC);
		endershovel = new ToolEnderShovel(MaterialManager.ENDERMAGIC);
		
		adminsword = new ToolAdminSword(MaterialManager.ADMIN);
		
		woodenshears = new ToolWoodenShears();
		stoneshears = new ToolStoneShears();
		obbyshears = new ToolObbyShears();
		
		glasssword = new ToolGlassSword(MaterialManager.GLASS);
		
		if (ConfigManager.registerBadTools == true) {
		badsword = new ToolBadSword(MaterialManager.BAD);
		badpickaxe = new ToolBadPickaxe(MaterialManager.BAD);
		badaxe = new ToolBadAxe(MaterialManager.BAD);
		badshovel = new ToolBadShovel(MaterialManager.BAD);
		badhoe = new ToolBadHoe(MaterialManager.BAD);	
		}
		
		foresthelmet = new ArmorForestHelmet(MaterialManager.FORESTCAMO, 1, EntityEquipmentSlot.HEAD);
		forestchest = new  ArmorForestChest(MaterialManager.FORESTCAMO, 1, EntityEquipmentSlot.CHEST);
		forestleggings = new  ArmorForestLeggings(MaterialManager.FORESTCAMO, 2, EntityEquipmentSlot.LEGS);
		forestboots = new  ArmorForestBoots(MaterialManager.FORESTCAMO, 2, EntityEquipmentSlot.FEET);
		
		netherhelmet = new ArmorNetherHelmet(MaterialManager.NETHERCAMO, 1, EntityEquipmentSlot.HEAD);
		netherchest = new  ArmorNetherChest(MaterialManager.NETHERCAMO, 1, EntityEquipmentSlot.CHEST);
		netherleggings = new  ArmorNetherLeggings(MaterialManager.NETHERCAMO, 2, EntityEquipmentSlot.LEGS);
		netherboots = new  ArmorNetherBoots(MaterialManager.NETHERCAMO, 2, EntityEquipmentSlot.FEET);

		deserthelmet = new ArmorDesertHelmet(MaterialManager.DESERTCAMO, 1, EntityEquipmentSlot.HEAD);
		desertchest = new  ArmorDesertChest(MaterialManager.DESERTCAMO, 1, EntityEquipmentSlot.CHEST);
		desertleggings = new  ArmorDesertLeggings(MaterialManager.DESERTCAMO, 2, EntityEquipmentSlot.LEGS);
		desertboots = new  ArmorDesertBoots(MaterialManager.DESERTCAMO, 2, EntityEquipmentSlot.FEET);

		snowhelmet = new ArmorSnowHelmet(MaterialManager.SNOWCAMO, 1, EntityEquipmentSlot.HEAD);
		snowchest = new  ArmorSnowChest(MaterialManager.SNOWCAMO, 1, EntityEquipmentSlot.CHEST);
		snowleggings = new  ArmorSnowLeggings(MaterialManager.SNOWCAMO, 2, EntityEquipmentSlot.LEGS);
		snowboots = new  ArmorSnowBoots(MaterialManager.SNOWCAMO, 2, EntityEquipmentSlot.FEET);
		
		stonehelmet = new ArmorStoneHelmet(MaterialManager.STONECAMO, 1, EntityEquipmentSlot.HEAD);
		stonechest = new  ArmorStoneChest(MaterialManager.STONECAMO, 1, EntityEquipmentSlot.CHEST);
		stoneleggings = new  ArmorStoneLeggings(MaterialManager.STONECAMO, 2, EntityEquipmentSlot.LEGS);
		stoneboots = new  ArmorStoneBoots(MaterialManager.STONECAMO, 2, EntityEquipmentSlot.FEET);
		
		nightvision = new ArmorNightVision(MaterialManager.NIGHTVISION, 1, EntityEquipmentSlot.HEAD);
		
		if (ConfigManager.registerClaimWand == true) {
		claimwand = new ItemClaimWand();
		}
	}
	
	public static void register()
	{
		GameRegistry.register(extractor);
		GameRegistry.register(infuser);
		
		GameRegistry.register(ironshard);
		GameRegistry.register(obbyingot);
		GameRegistry.register(obbystick);
		GameRegistry.register(nightvisionlens);
		GameRegistry.register(leatherstrap);
		GameRegistry.register(boroningot);
		GameRegistry.register(boronstick);
		GameRegistry.register(blackpaste);
		
		GameRegistry.register(camogreen);
		GameRegistry.register(camored);
		GameRegistry.register(camoyellow);
		GameRegistry.register(camowhite);
		GameRegistry.register(camogrey);
		
		GameRegistry.register(enderdust);
		GameRegistry.register(endergem);
		GameRegistry.register(enderseed);
		GameRegistry.register(enderdustgreen);
		GameRegistry.register(enderdustred);
		GameRegistry.register(enderdustblue);
		GameRegistry.register(enderdustwhite);
		GameRegistry.register(enderdustmicro);
		GameRegistry.register(enderdustmini);
		GameRegistry.register(enderdustpure);
		GameRegistry.register(enderdustingot);
		
		GameRegistry.register(obbysword);
		GameRegistry.register(obbypickaxe);
		GameRegistry.register(obbyaxe);
		GameRegistry.register(obbyshovel);
		GameRegistry.register(obbyhoe);
		
		GameRegistry.register(endersword);
		GameRegistry.register(enderpickaxe);
		GameRegistry.register(enderaxe);
		GameRegistry.register(endershovel);
		
		GameRegistry.register(adminsword);
		
		GameRegistry.register(woodenshears);
		GameRegistry.register(stoneshears);
		GameRegistry.register(obbyshears);
		
		GameRegistry.register(glasssword);
		
		if (ConfigManager.registerBadTools == true) {
		GameRegistry.register(badsword);
		GameRegistry.register(badpickaxe);
		GameRegistry.register(badaxe);
		GameRegistry.register(badshovel);
		GameRegistry.register(badhoe);
		}
		
		GameRegistry.register(foresthelmet);
		GameRegistry.register(forestchest);
		GameRegistry.register(forestleggings);
		GameRegistry.register(forestboots);
		
		GameRegistry.register(netherhelmet);
		GameRegistry.register(netherchest);
		GameRegistry.register(netherleggings);
		GameRegistry.register(netherboots);
		
		GameRegistry.register(deserthelmet);
		GameRegistry.register(desertchest);
		GameRegistry.register(desertleggings);
		GameRegistry.register(desertboots);
		
		GameRegistry.register(snowhelmet);
		GameRegistry.register(snowchest);
		GameRegistry.register(snowleggings);
		GameRegistry.register(snowboots);
		
		GameRegistry.register(stonehelmet);
		GameRegistry.register(stonechest);
		GameRegistry.register(stoneleggings);
		GameRegistry.register(stoneboots);
		
		GameRegistry.register(nightvision);

		if (ConfigManager.registerClaimWand == true) {
		GameRegistry.register(claimwand);
		}
				
	}
	
	public static void registerRenders()
	{
		registerRender(extractor);
		registerRender(infuser);
		
		registerRender(ironshard);
		registerRender(obbyingot);
		registerRender(obbystick);
		registerRender(nightvisionlens);
		registerRender(leatherstrap);
		registerRender(boroningot);
		registerRender(boronstick);
		registerRender(blackpaste);
		
		registerRender(camogreen);
		registerRender(camored);
		registerRender(camoyellow);
		registerRender(camowhite);
		registerRender(camogrey);
		
		registerRender(enderdust);
		registerRender(endergem);
		registerRender(enderseed);
		registerRender(enderdustgreen);
		registerRender(enderdustred);
		registerRender(enderdustblue);
		registerRender(enderdustwhite);
		registerRender(enderdustmicro);
		registerRender(enderdustmini);
		registerRender(enderdustpure);
		registerRender(enderdustingot);
		
		registerRender(obbysword);
		registerRender(obbypickaxe);
		registerRender(obbyaxe);
		registerRender(obbyshovel);
		registerRender(obbyhoe);
		
		registerRender(endersword);
		registerRender(enderpickaxe);
		registerRender(enderaxe);
		registerRender(endershovel);
		
		registerRender(adminsword);
		
		registerRender(woodenshears);
		registerRender(stoneshears);
		registerRender(obbyshears);
		
		registerRender(glasssword);
		
		if (ConfigManager.registerBadTools == true) {
		registerRender(badsword);
		registerRender(badpickaxe);
		registerRender(badaxe);
		registerRender(badshovel);
		registerRender(badhoe);
		}
		
		registerRender(foresthelmet);
		registerRender(forestchest);
		registerRender(forestleggings);
		registerRender(forestboots);
		
		registerRender(netherhelmet);
		registerRender(netherchest);
		registerRender(netherleggings);
		registerRender(netherboots);
		
		registerRender(deserthelmet);
		registerRender(desertchest);
		registerRender(desertleggings);
		registerRender(desertboots);
		
		registerRender(snowhelmet);
		registerRender(snowchest);
		registerRender(snowleggings);
		registerRender(snowboots);
		
		registerRender(stonehelmet);
		registerRender(stonechest);
		registerRender(stoneleggings);
		registerRender(stoneboots);
		
		registerRender(nightvision);

		if (ConfigManager.registerClaimWand == true) {
		registerRender(claimwand);
		}
		
	}
	
	private static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
