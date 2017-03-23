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
	
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    	if (ConfigManager.allowEnderpulvisUranium == true) {
    		par3List.add("A solid fuel hardened with flames");
    		par3List.add("and the properties of uranium.");
    	}
    	else {
    		par3List.add("It seems as some outside");
        	par3List.add("force is making the ingot");
        	par3List.add("stop emitting radiation...");
        	par3List.add("...Could it be a config file?");

    	}
    	
    }

}
