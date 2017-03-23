package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemNightVisionLens extends Item {
	
	public ItemNightVisionLens() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.NIGHTVISIONLENS.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.NIGHTVISIONLENS.getRegistryName());
	}

}
