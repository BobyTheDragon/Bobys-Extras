package com.bobynoby.items.tools;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.ItemShears;
import net.minecraft.item.Item.ToolMaterial;

public class ToolWoodenShears extends ItemShears{
	
	public ToolWoodenShears() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.WOODENSHEARS.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.WOODENSHEARS.getRegistryName());
		setMaxDamage(23);
	}


}
