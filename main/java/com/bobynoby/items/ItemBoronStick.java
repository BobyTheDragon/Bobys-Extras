package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemBoronStick extends Item {
	
	public ItemBoronStick() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.BORONSTICK.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.BORONSTICK.getRegistryName());
	}

}
