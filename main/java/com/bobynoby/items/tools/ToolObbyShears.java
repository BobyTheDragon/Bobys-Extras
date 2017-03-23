package com.bobynoby.items.tools;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.ItemShears;
import net.minecraft.item.Item.ToolMaterial;

public class ToolObbyShears extends ItemShears{
	
	public ToolObbyShears() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.OBBYSHEARS.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.OBBYSHEARS.getRegistryName());
		setMaxDamage(4867);
	}


}
