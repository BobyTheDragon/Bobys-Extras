package com.bobynoby.items;

import java.util.List;

import com.bobynoby.init.BEXItems;
import com.bobynoby.init.ConfigManager;
import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemEnderDustIngot extends Item{
	
	public ItemEnderDustIngot() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.ENDERPULVISINGOT.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.ENDERPULVISINGOT.getRegistryName());
	}
}
