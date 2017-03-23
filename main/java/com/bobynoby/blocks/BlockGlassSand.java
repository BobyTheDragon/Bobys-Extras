package com.bobynoby.blocks;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockGlassSand extends BlockFalling {

	public BlockGlassSand() {
		super(Material.SAND);
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setSoundType(SoundType.SAND);
		setHardness(0.5F);
		setHarvestLevel("shovel", 0);
		setUnlocalizedName(Reference.BobyEXblocks.GLASSSAND.getUnlocalizedName());
		setRegistryName(Reference.BobyEXblocks.GLASSSAND.getRegistryName());

	}

}
