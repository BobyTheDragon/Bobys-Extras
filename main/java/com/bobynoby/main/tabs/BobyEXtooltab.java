package com.bobynoby.main.tabs;

import com.bobynoby.init.BEXItems;
import com.bobynoby.main.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BobyEXtooltab extends CreativeTabs{

	public BobyEXtooltab() {
		super("tabBobyEXtool");
	}

	@Override
	public Item getTabIconItem() {
		return BEXItems.obbysword;
	}
}