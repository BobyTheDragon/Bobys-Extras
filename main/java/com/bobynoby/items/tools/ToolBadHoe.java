package com.bobynoby.items.tools;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.ItemHoe;

public class ToolBadHoe extends ItemHoe {

	public ToolBadHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.BADHOE.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.BADHOE.getRegistryName());
	}

}
