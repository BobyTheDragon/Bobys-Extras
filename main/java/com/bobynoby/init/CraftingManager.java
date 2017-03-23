package com.bobynoby.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingManager {

	public static void register()
	{
		//Normal Recipes
		GameRegistry.addRecipe(new ItemStack(BEXItems.obbystick, 2), "I", "I", 'I', BEXItems.obbyingot);
		GameRegistry.addRecipe(new ItemStack(BEXBlocks.obbybrick, 4), "II", "II", 'I', BEXItems.obbyingot);
		GameRegistry.addRecipe(new ItemStack(BEXBlocks.obbybrick, 4), "II", "II", 'I', BEXBlocks.obbysmooth);
		GameRegistry.addRecipe(new ItemStack(BEXBlocks.obbyglass, 2), "GI", "IG", 'I', BEXItems.obbyingot, 'G', Blocks.GLASS);
		GameRegistry.addRecipe(new ItemStack(BEXBlocks.blockenderdust), "DD", "DD", 'D', BEXItems.enderdust);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.camogreen, 3), " L ", " S ", "III", 'L', Blocks.LEAVES, 'S', Items.SLIME_BALL, 'I', Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.camored, 3), " N ", " S ", "III", 'N', Blocks.NETHERRACK, 'S', Items.SLIME_BALL, 'I', Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.camoyellow, 3), " D ", " S ", "III", 'D', Blocks.SAND, 'S', Items.SLIME_BALL, 'I', Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.camowhite, 3), " D ", " S ", "III", 'D', Blocks.SNOW, 'S', Items.SLIME_BALL, 'I', Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.camogrey, 3), " D ", " S ", "III", 'D', Blocks.STONE, 'S', Items.SLIME_BALL, 'I', Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.enderdustgreen, 4), "GEG", "EIE", "GEG", 'E', BEXItems.enderdust, 'G', Blocks.GRASS, 'I', BEXItems.infuser);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.enderdustred, 4), "GEG", "EIE", "GEG", 'E', BEXItems.enderdust, 'G', Items.LAVA_BUCKET, 'I', BEXItems.infuser);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.enderdustblue, 4), "GEG", "EIE", "GEG", 'E', BEXItems.enderdust, 'G', Items.WATER_BUCKET, 'I', BEXItems.infuser);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.enderdustwhite, 4), "GEG", "EIE", "GEG", 'E', BEXItems.enderdust, 'G', Blocks.SNOW, 'I', BEXItems.infuser);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.obbysword), " I ", " I ", " S ", 'I', BEXItems.obbyingot, 'S', BEXItems.boronstick);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.obbypickaxe), "III", " S ", " S ", 'I', BEXItems.obbyingot, 'S', BEXItems.boronstick);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.obbyaxe), "II ", "IS ", " S ", 'I', BEXItems.obbyingot, 'S', BEXItems.boronstick);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.obbyaxe), " II", " SI", " S ", 'I', BEXItems.obbyingot, 'S', BEXItems.boronstick);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.obbyshovel), " I ", " S ", " S ", 'I', BEXItems.obbyingot, 'S', BEXItems.boronstick);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.obbyhoe), "II ", " S ", " S ", 'I', BEXItems.obbyingot, 'S', BEXItems.boronstick);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.obbyhoe), " II", " S ", " S ", 'I', BEXItems.obbyingot, 'S', BEXItems.boronstick);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.endersword), "DID", "DTD", "DGD", 'D', BEXItems.enderdustred, 'T', BEXItems.obbysword, 'G', BEXItems.endergem, 'I', BEXItems.infuser);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.enderpickaxe), "DID", "DTD", "DGD", 'D', BEXItems.enderdustgreen, 'T', BEXItems.obbypickaxe, 'G', BEXItems.endergem, 'I', BEXItems.infuser);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.enderaxe), "DID", "DTD", "DGD", 'D', BEXItems.enderdustblue, 'T', BEXItems.obbyaxe, 'G', BEXItems.endergem, 'I', BEXItems.infuser);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.endershovel), "DID", "DTD", "DGD", 'D', BEXItems.enderdustwhite, 'T', BEXItems.obbyshovel, 'G', BEXItems.endergem, 'I', BEXItems.infuser);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.enderdustmini), "MMM", "MMM", "MMM", 'M', BEXItems.enderdustmicro);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.enderdustpure), "MMM", "MMM", "MMM", 'M', BEXItems.enderdustmini);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.badsword), " S ", " D ", " S ", 'S', Items.STICK, 'D', Blocks.DIRT);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.badpickaxe), "SDS", " S ", " S ", 'S', Items.STICK, 'D', Blocks.DIRT);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.badaxe), "SD ", "SS ", " S ", 'S', Items.STICK, 'D', Blocks.DIRT);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.badaxe), " DS", " SS", " S ", 'S', Items.STICK, 'D', Blocks.DIRT);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.badshovel), " D ", " S ", " S ", 'S', Items.STICK, 'D', Blocks.DIRT);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.badhoe), "SD ", " S ", " S ", 'S', Items.STICK, 'D', Blocks.DIRT);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.badhoe), " DS", " S ", " S ", 'S', Items.STICK, 'D', Blocks.DIRT);
		GameRegistry.addRecipe(new ItemStack(BEXItems.foresthelmet), "CCC", "C C", 'C', BEXItems.camogreen);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.forestchest), "C C", "CCC", "CCC", 'C', BEXItems.camogreen);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.forestleggings), "CCC", "C C", "C C", 'C', BEXItems.camogreen);
		GameRegistry.addRecipe(new ItemStack(BEXItems.forestboots), "C C", "C C", 'C', BEXItems.camogreen);
		GameRegistry.addRecipe(new ItemStack(BEXItems.netherhelmet), "CCC", "C C", 'C', BEXItems.camored);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.netherchest), "C C", "CCC", "CCC", 'C', BEXItems.camored);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.netherleggings), "CCC", "C C", "C C", 'C', BEXItems.camored);
		GameRegistry.addRecipe(new ItemStack(BEXItems.netherboots), "C C", "C C", 'C', BEXItems.camored);
		GameRegistry.addRecipe(new ItemStack(BEXItems.deserthelmet), "CCC", "C C", 'C', BEXItems.camoyellow);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.desertchest), "C C", "CCC", "CCC", 'C', BEXItems.camoyellow);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.desertleggings), "CCC", "C C", "C C", 'C', BEXItems.camoyellow);
		GameRegistry.addRecipe(new ItemStack(BEXItems.desertboots), "C C", "C C", 'C', BEXItems.camoyellow);
		GameRegistry.addRecipe(new ItemStack(BEXItems.snowhelmet), "CCC", "C C", 'C', BEXItems.camowhite);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.snowchest), "C C", "CCC", "CCC", 'C', BEXItems.camowhite);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.snowleggings), "CCC", "C C", "C C", 'C', BEXItems.camowhite);
		GameRegistry.addRecipe(new ItemStack(BEXItems.snowboots), "C C", "C C", 'C', BEXItems.camowhite);
		GameRegistry.addRecipe(new ItemStack(BEXItems.stonehelmet), "CCC", "C C", 'C', BEXItems.camogrey);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.stonechest), "C C", "CCC", "CCC", 'C', BEXItems.camogrey);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.stoneleggings), "CCC", "C C", "C C", 'C', BEXItems.camogrey);
		GameRegistry.addRecipe(new ItemStack(BEXItems.stoneboots), "C C", "C C", 'C', BEXItems.camogrey);
		GameRegistry.addRecipe(new ItemStack(BEXItems.nightvision), "S S", "LIL", 'S', BEXItems.leatherstrap, 'L', BEXItems.nightvisionlens, 'I', BEXItems.boroningot);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.nightvisionlens), "ORO", "ESE", "ORO", 'O', Blocks.OBSIDIAN, 'R', Items.REDSTONE, 'E', Items.ENDER_EYE, 'S', Blocks.STAINED_GLASS_PANE);
		GameRegistry.addShapedRecipe(new ItemStack(BEXBlocks.infuser), " E ", "SOS", " S ", 'E', BEXItems.enderdust, 'O', Blocks.OBSIDIAN, 'S', BEXItems.obbystick);
		GameRegistry.addRecipe(new ItemStack(BEXBlocks.blazesand), "PP", "PP", 'P', Items.BLAZE_POWDER);
		GameRegistry.addRecipe(new ItemStack(Items.BLAZE_POWDER, 4), "B", 'B', BEXBlocks.blazesand);
		GameRegistry.addRecipe(new ItemStack(BEXItems.enderdust, 4), "B", 'B', BEXBlocks.blockenderdust);
		GameRegistry.addRecipe(new ItemStack(BEXItems.boronstick, 4), "B", "B", 'B', BEXItems.boroningot);
		GameRegistry.addShapedRecipe(new ItemStack(BEXBlocks.boronblock), "BBB", "BBB", "BBB", 'B', BEXItems.boroningot);
		GameRegistry.addRecipe(new ItemStack(BEXItems.woodenshears), "W ", " W", 'W', Blocks.PLANKS);
		GameRegistry.addRecipe(new ItemStack(BEXItems.stoneshears), "S ", " S", 'S', Blocks.STONE);
		GameRegistry.addRecipe(new ItemStack(BEXItems.obbyshears), "O ", " O", 'O', BEXItems.obbyingot);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.endergem), "DDD", " I ", " E ", 'D', BEXItems.enderdustpure, 'I', BEXItems.infuser, 'E', Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.infuser), "DSD", "SBS", "DSD", 'D', BEXItems.enderdust, 'S', BEXItems.obbystick, 'B', BEXItems.boroningot);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.extractor), "BHB", "RBR", " S ", 'B', BEXItems.boroningot, 'H', Blocks.HOPPER, 'R', Items.REDSTONE, 'S', BEXItems.boronstick);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.blackpaste, 8), "CCC", "CBC", "CCC", 'C', new ItemStack(Items.COAL, 1, 1), 'B', Items.WATER_BUCKET);
		GameRegistry.addShapedRecipe(new ItemStack(BEXItems.blackpaste, 8), "CCC", "CBC", "CCC", 'C', new ItemStack(Items.COAL, 1, 0), 'B', Items.WATER_BUCKET);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT), BEXItems.ironshard,  BEXItems.ironshard,  BEXItems.ironshard);
		GameRegistry.addShapelessRecipe(new ItemStack(BEXItems.enderseed), BEXItems.enderdust, Items.WHEAT_SEEDS);
		GameRegistry.addShapelessRecipe(new ItemStack(BEXItems.leatherstrap, 2), Items.LEATHER);
		GameRegistry.addShapelessRecipe(new ItemStack(BEXItems.boroningot, 9), BEXBlocks.boronblock);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND, 4), BEXBlocks.glasssand);
		GameRegistry.addShapelessRecipe(new ItemStack(BEXItems.enderdustmicro), BEXItems.enderseed, BEXItems.extractor);
		GameRegistry.addShapelessRecipe(new ItemStack(BEXItems.enderdustmini), BEXItems.enderdust, BEXItems.extractor);
		
		
		//Furnace Recipes
		GameRegistry.addSmelting(BEXBlocks.ironsand, new ItemStack(BEXItems.ironshard), 0.5f);
		GameRegistry.addSmelting(BEXBlocks.glasssand, new ItemStack(Blocks.GLASS, 4), 0f);
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(BEXItems.obbyingot), 0.7f);
		GameRegistry.addSmelting(BEXBlocks.obbybrick, new ItemStack(BEXBlocks.obbysmooth), 0f);
		GameRegistry.addSmelting(BEXBlocks.blockenderdust, new ItemStack(BEXBlocks.enderglass), 0f);
		GameRegistry.addSmelting(BEXBlocks.blazepowderore, new ItemStack(Items.BLAZE_POWDER, 2), 0.5f);
		GameRegistry.addSmelting(BEXBlocks.enderdustore, new ItemStack(BEXItems.enderdust, 4), 0.7f);
		GameRegistry.addSmelting(BEXBlocks.boronore, new ItemStack(BEXItems.boroningot), 0.7f);
		GameRegistry.addSmelting(BEXItems.enderdustpure, new ItemStack(BEXItems.enderdustingot), 0.7f);
	}
}