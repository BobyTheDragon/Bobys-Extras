package com.bobynoby.blocks;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class BlockObbyGlass extends Block {

	public BlockObbyGlass() {
		super(Material.GLASS);
		setHardness(50.0F);
		setResistance(2000.0F);
		setLightOpacity(0);
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setSoundType(SoundType.GLASS);
		setHarvestLevel("pickaxe", 3);
		setUnlocalizedName(Reference.BobyEXblocks.OBBYGLASS.getUnlocalizedName());
		setRegistryName(Reference.BobyEXblocks.OBBYGLASS.getRegistryName());

	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}

}
