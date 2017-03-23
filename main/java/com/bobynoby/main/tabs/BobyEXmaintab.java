package com.bobynoby.main.tabs;

import com.bobynoby.init.BEXItems;
import com.bobynoby.main.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BobyEXmaintab extends CreativeTabs{

	public BobyEXmaintab() {
		super("tabBobyEX");
	}

	@Override
	public Item getTabIconItem() {
		return BEXItems.enderdust;
	}
}