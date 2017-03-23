package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemCamoWhite extends Item {
	
	public ItemCamoWhite() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.CAMOSNOW.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.CAMOSNOW.getRegistryName());
	}

}
