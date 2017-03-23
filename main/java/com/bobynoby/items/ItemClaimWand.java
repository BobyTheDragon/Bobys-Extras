package com.bobynoby.items;

import java.util.List;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemClaimWand extends Item {
	
	public ItemClaimWand() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.CLAIMWAND.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.CLAIMWAND.getRegistryName());
		setMaxStackSize(1);
		
	}
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    	par3List.add("Use for servers who dont want");
    	par3List.add("to use the golden shovel.");
    	par3List.add("Does not work by itself!");
    	
    }

}
