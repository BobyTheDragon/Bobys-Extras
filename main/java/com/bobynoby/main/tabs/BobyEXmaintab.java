package com.bobynoby.main.tabs;

import com.bobynoby.init.BEXItems;
import com.bobynoby.main.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BobyEXmaintab extends CreativeTabs{

	public BobyEXmaintab() {
		super("tabBobyEX");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(BEXItems.enderdust);
	}
}