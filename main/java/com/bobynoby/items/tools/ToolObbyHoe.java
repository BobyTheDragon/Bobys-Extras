package com.bobynoby.items.tools;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.ItemHoe;

public class ToolObbyHoe extends ItemHoe {

	public ToolObbyHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.OBBYHOE.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.OBBYHOE.getRegistryName());
	}

}
