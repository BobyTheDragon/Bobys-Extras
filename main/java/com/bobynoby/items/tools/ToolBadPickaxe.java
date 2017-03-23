package com.bobynoby.items.tools;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ToolBadPickaxe extends ItemPickaxe {

	public ToolBadPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.BADPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.BADPICKAXE.getRegistryName());
	}
}
