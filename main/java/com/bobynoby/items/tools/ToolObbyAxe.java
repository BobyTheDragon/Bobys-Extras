package com.bobynoby.items.tools;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.ItemAxe;

public class ToolObbyAxe extends ItemAxe {

	public ToolObbyAxe(ToolMaterial material) {
		super(material, 10f, -2f);
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.OBBYAXE.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.OBBYAXE.getRegistryName());
	}

}
