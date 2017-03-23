package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemCamoGrey extends Item {
	
	public ItemCamoGrey() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.CAMOSTONE.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.CAMOSTONE.getRegistryName());
	}

}
