package com.bobynoby.blocks;

import java.util.Random;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OreBoron extends Block {

	public OreBoron() {
		super(Material.ROCK);
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 3);
		setUnlocalizedName(Reference.BobyEXblocks.OREBORON.getUnlocalizedName());
		setRegistryName(Reference.BobyEXblocks.OREBORON.getRegistryName());
	}
}