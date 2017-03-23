package com.bobynoby.items.tools;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.ItemShears;
import net.minecraft.item.Item.ToolMaterial;

public class ToolStoneShears extends ItemShears{
	
	public ToolStoneShears() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.STONESHEARS.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.STONESHEARS.getRegistryName());
		setMaxDamage(124);
	}


}
