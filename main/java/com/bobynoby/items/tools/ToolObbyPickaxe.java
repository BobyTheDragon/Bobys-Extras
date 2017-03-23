package com.bobynoby.items.tools;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.item.ItemPickaxe;

public class ToolObbyPickaxe extends ItemPickaxe {

	public ToolObbyPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.OBBYPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.OBBYPICKAXE.getRegistryName());
	}

}
