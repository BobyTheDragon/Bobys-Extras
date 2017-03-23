package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemEnderGem extends Item {
	
	public ItemEnderGem() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.ENDERGEM.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.ENDERGEM.getRegistryName());
	}

}
