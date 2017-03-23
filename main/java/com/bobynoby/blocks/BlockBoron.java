package com.bobynoby.blocks;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBoron extends Block {

	public BlockBoron() {
		super(Material.ROCK);
		setHardness(7.0F);
		setResistance(20.0F);
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 3);
		setUnlocalizedName(Reference.BobyEXblocks.BORONBLOCK.getUnlocalizedName());
		setRegistryName(Reference.BobyEXblocks.BORONBLOCK.getRegistryName());

	}

}
