package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemCamoRed extends Item {
	
	public ItemCamoRed() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.CAMONETHER.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.CAMONETHER.getRegistryName());
	}

}
