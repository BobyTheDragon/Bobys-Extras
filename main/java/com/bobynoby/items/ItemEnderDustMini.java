package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemEnderDustMini extends Item {
	
	public ItemEnderDustMini() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.ENDERPULVISMINI.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.ENDERPULVISMINI.getRegistryName());
	}

}
