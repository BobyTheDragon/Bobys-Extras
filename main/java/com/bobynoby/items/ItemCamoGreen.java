package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemCamoGreen extends Item {
	
	public ItemCamoGreen() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.CAMOFOREST.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.CAMOFOREST.getRegistryName());
	}

}
