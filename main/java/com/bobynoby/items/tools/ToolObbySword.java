package com.bobynoby.items.tools;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.ItemSword;

public class ToolObbySword extends ItemSword {

	public ToolObbySword(ToolMaterial material) {
		super(material);
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.OBBYSWORD.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.OBBYSWORD.getRegistryName());
	}

}
