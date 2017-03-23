package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemEnderDustMicro extends Item {
	
	public ItemEnderDustMicro() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.ENDERPULVISMICRO.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.ENDERPULVISMICRO.getRegistryName());
	}

}
