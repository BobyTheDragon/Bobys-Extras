package com.bobynoby.items.armor;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorStoneHelmet extends ItemArmor {

	public ArmorStoneHelmet(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.STONEHELMET.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.STONEHELMET.getRegistryName());
	}
	
    public void onArmorTick(World World, EntityPlayer player, ItemStack armor) {
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(14), 5, 0));
    }
}
