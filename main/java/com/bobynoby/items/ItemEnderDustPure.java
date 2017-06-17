package com.bobynoby.items;

import java.util.List;

import com.bobynoby.init.ConfigManager;
import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemEnderDustPure extends Item {
	
	public ItemEnderDustPure() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.ENDERPULVISPURE.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.ENDERPULVISPURE.getRegistryName());
	}
}
