package com.bobynoby.items.tools;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.ItemSword;

public class ToolBadSword extends ItemSword {

	public ToolBadSword(ToolMaterial material) {
		super(material);
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.BADSWORD.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.BADSWORD.getRegistryName());
	}

}
