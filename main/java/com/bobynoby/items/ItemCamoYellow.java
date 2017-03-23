package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemCamoYellow extends Item {
	
	public ItemCamoYellow() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.CAMOSAND.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.CAMOSAND.getRegistryName());
	}

}
