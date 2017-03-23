package com.bobynoby.items;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

public class ItemEnderDustWhite extends Item {
	
	public ItemEnderDustWhite() {
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setUnlocalizedName(Reference.BobyEXitems.ENDERPULVISWHITE.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.ENDERPULVISWHITE.getRegistryName());
	}
	
	 public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target, EnumHand hand) {
		 if (target instanceof EntitySheep) {
			 EntitySheep entitysheep = (EntitySheep)target;
	         EnumDyeColor enumdyecolor = EnumDyeColor.WHITE;
	         if (!entitysheep.getSheared() && entitysheep.getFleeceColor() != enumdyecolor) {
	        	 entitysheep.setFleeceColor(enumdyecolor);
	        	 --stack.stackSize;
	            }
	         return true;
		 }
	     else {
	         return false;
	     }
	 }
}
