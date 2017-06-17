package com.bobynoby.main.tabs;

import com.bobynoby.init.BEXItems;
import com.bobynoby.main.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BobyEXtooltab extends CreativeTabs{

	public BobyEXtooltab() {
		super("tabBobyEXtool");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(BEXItems.obbysword);
	}
}