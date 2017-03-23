package com.bobynoby.blocks;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockEnderDust extends BlockFalling {

	public BlockEnderDust() {
		super(Material.SAND);
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setSoundType(SoundType.SAND);
		setHardness(0.5F);
		setLightLevel(1f);
		setHarvestLevel("shovel", 0);
		setUnlocalizedName(Reference.BobyEXblocks.ENDERPULVISBLOCK.getUnlocalizedName());
		setRegistryName(Reference.BobyEXblocks.ENDERPULVISBLOCK.getRegistryName());

	}

}
