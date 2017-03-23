package com.bobynoby.items.tools;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemInfuser extends Item {
	
	public ItemInfuser() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.INFUSER.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.INFUSER.getRegistryName());
	    setMaxStackSize(1);
	    setContainerItem(this);
	}

}
