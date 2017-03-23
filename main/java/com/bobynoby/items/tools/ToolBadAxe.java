package com.bobynoby.items.tools;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ToolBadAxe extends ItemAxe {

	public ToolBadAxe(ToolMaterial material) {
		super(material, 0.5f, -1f);
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.BADAXE.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.BADAXE.getRegistryName());
	}
}
