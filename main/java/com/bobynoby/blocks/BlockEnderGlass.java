package com.bobynoby.blocks;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.world.storage.loot.functions.SetMetadata;

public class BlockEnderGlass extends Block {

	public BlockEnderGlass() {
		super(Material.GLASS);
		setLightOpacity(0);
		setLightLevel(1f);
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setSoundType(SoundType.GLASS);
		setHarvestLevel("pickaxe", 0);
		setUnlocalizedName(Reference.BobyEXblocks.ENDERPULVISGLASS.getUnlocalizedName());
		setRegistryName(Reference.BobyEXblocks.ENDERPULVISGLASS.getRegistryName());

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
