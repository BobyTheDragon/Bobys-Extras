package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemObbyIngot extends Item {
	
	public ItemObbyIngot() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.OBBYINGOT.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.OBBYINGOT.getRegistryName());
	}

}
