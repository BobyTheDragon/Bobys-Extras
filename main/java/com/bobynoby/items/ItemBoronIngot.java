package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemBoronIngot extends Item {
	
	public ItemBoronIngot() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.BORONINGOT.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.BORONINGOT.getRegistryName());
	}

}
