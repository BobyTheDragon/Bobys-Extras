package com.bobynoby.items.tools;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.Item;

public class ItemExtractor extends Item {
	
	public ItemExtractor() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.EXTRACTOR.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.EXTRACTOR.getRegistryName());
	    setMaxStackSize(1);
	    setContainerItem(this);
	}

}
