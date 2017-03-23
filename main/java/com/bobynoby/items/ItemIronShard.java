package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemIronShard extends Item {
	
	public ItemIronShard() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.IRONSHARD.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.IRONSHARD.getRegistryName());
	}

}
