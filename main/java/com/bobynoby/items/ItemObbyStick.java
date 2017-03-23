package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemObbyStick extends Item {
	
	public ItemObbyStick() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.OBBYSTICK.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.OBBYSTICK.getRegistryName());
	}

}
