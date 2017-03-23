package com.bobynoby.blocks;

import com.bobynoby.init.BEXItems;
import com.bobynoby.main.Reference;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class CropEnder extends BlockCrops{

	public CropEnder() {
		setSoundType(SoundType.PLANT);
		setUnlocalizedName(Reference.BobyEXblocks.ENDERCROP.getUnlocalizedName());
		setRegistryName(Reference.BobyEXblocks.ENDERCROP.getRegistryName());
	}
	
	@Override
	protected Item getSeed() {
		return BEXItems.enderseed;
	}
	
	@Override 
	protected Item getCrop() {
		return BEXItems.enderdust;
	}

}
