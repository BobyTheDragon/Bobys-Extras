package com.bobynoby.items.tools;

import java.util.List;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ToolAdminSword extends ItemSword {

	public ToolAdminSword(ToolMaterial material) {
		super(material);
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.ADMINSWORD.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.ADMINSWORD.getRegistryName());
	}
	
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    	par3List.add("How can a simple fish do so much damage?!?!");
    	
    }

}
