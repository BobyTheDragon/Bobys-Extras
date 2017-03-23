package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemLeatherStrap extends Item {
	
	public ItemLeatherStrap() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.LEATHERSTRAP.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.LEATHERSTRAP.getRegistryName());
	}

}
