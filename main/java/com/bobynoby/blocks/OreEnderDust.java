package com.bobynoby.blocks;

import java.util.Random;

import com.bobynoby.init.BEXItems;
import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OreEnderDust extends Block {

	public OreEnderDust() {
		super(Material.ROCK);
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
		setUnlocalizedName(Reference.BobyEXblocks.OREENDERPULVIS.getUnlocalizedName());
		setRegistryName(Reference.BobyEXblocks.OREENDERPULVIS.getRegistryName());
	}
}
