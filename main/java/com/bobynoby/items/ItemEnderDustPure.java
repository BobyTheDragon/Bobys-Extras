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
	
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    	if (ConfigManager.allowEnderpulvisUranium == true) {
    		par3List.add("Would not drop, as it holds");
        	par3List.add("the energy of a small bomb");
    	}
    	else {
    		par3List.add("It seems as some outside");
        	par3List.add("force is making the dust");
        	par3List.add("stop emitting radiation...");
        	par3List.add("...Could it be a config file?");

    	}
    	
    }

}
