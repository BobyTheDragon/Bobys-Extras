package com.bobynoby.items.tools;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.ItemSpade;

public class ToolObbyShovel extends ItemSpade {

	public ToolObbyShovel(ToolMaterial material) {
		super(material);
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.OBBYSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.OBBYSHOVEL.getRegistryName());
	}

}
