package com.bobynoby.init;

import com.bobynoby.blocks.BlockBlazeSand;
import com.bobynoby.blocks.BlockBoron;
import com.bobynoby.blocks.BlockEnderDust;
import com.bobynoby.blocks.BlockEnderGlass;
import com.bobynoby.blocks.BlockGlassSand;
import com.bobynoby.blocks.BlockIronSand;
import com.bobynoby.blocks.BlockObbyBrick;
import com.bobynoby.blocks.BlockObbyGlass;
import com.bobynoby.blocks.BlockObbySmooth;
import com.bobynoby.blocks.CropEnder;
import com.bobynoby.blocks.OreBlazePowder;
import com.bobynoby.blocks.OreBoron;
import com.bobynoby.blocks.OreEnderDust;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BEXBlocks {
	
	public static Block ironsand;
	public static Block glasssand;
	public static Block blazesand;
	
	public static Block obbybrick;
	public static Block obbysmooth;
	public static Block obbyglass;
	
	public static Block blockenderdust;
	public static Block enderglass;
	
	public static Block blazepowderore;
	public static Block enderdustore;
	public static Block boronore;
	
	public static Block infuser;
	public static Block boronblock;
	
	public static Block endercrop;
	
	public static void init()
	{
		ironsand = new BlockIronSand();
		glasssand = new BlockGlassSand();
		blazesand = new BlockBlazeSand();
		
		obbybrick = new BlockObbyBrick();
		obbysmooth = new BlockObbySmooth();
		obbyglass = new BlockObbyGlass();
		
		blockenderdust = new BlockEnderDust();
		enderglass = new BlockEnderGlass();
		
		blazepowderore = new OreBlazePowder();
		enderdustore = new OreEnderDust();
		boronore = new OreBoron();
		
		boronblock = new BlockBoron();
		
		endercrop = new CropEnder();
	}
	
	public static void register()
	{
		registerBlock(ironsand);
		registerBlock(glasssand);
		registerBlock(blazesand);
		
		registerBlock(obbybrick);
		registerBlock(obbysmooth);
		registerBlock(obbyglass);
		
		registerBlock(blockenderdust);
		registerBlock(enderglass);
		
		registerBlock(blazepowderore);
		registerBlock(enderdustore);
		registerBlock(boronore);
		
		registerBlock(boronblock);
		
		registerBlock(endercrop);
	}
	
	static void registerBlock(Block block)
	{
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders()
	{
		registerRender(ironsand);
		registerRender(glasssand);
		registerRender(blazesand);
		
		registerRender(obbybrick);
		registerRender(obbysmooth);
		registerRender(obbyglass);
		
		registerRender(blockenderdust);
		registerRender(enderglass);
		
		registerRender(blazepowderore);
		registerRender(enderdustore);
		registerRender(boronore);
		
		registerRender(boronblock);
		
		registerRender(endercrop);
	}
	
	private static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
}