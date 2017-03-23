package com.bobynoby.blocks;

import java.util.Random;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OreBlazePowder extends Block {

	public OreBlazePowder() {
		super(Material.ROCK);
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setSoundType(SoundType.STONE);
		setHardness(0.4F);
		setHarvestLevel("pickaxe", 2);
		setUnlocalizedName(Reference.BobyEXblocks.OREBLAZEPOWDER.getUnlocalizedName());
		setRegistryName(Reference.BobyEXblocks.OREBLAZEPOWDER.getRegistryName());
	}
}