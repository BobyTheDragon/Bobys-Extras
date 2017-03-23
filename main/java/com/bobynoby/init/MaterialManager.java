package com.bobynoby.init;

import com.bobynoby.main.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialManager {
	
	public static ToolMaterial OBBY = EnumHelper.addToolMaterial("OBBY", 4, 2450, 15f, 10f, 10);
	public static ToolMaterial ENDERMAGIC = EnumHelper.addToolMaterial("ENDERMAGIC", 5, 4867, 18f, 14f, 20);
	public static ToolMaterial ADMIN = EnumHelper.addToolMaterial("ADMIN", 0, 10000, 0, 9999999f, 0);
	public static ToolMaterial BAD = EnumHelper.addToolMaterial("BAD", 0, 20, 2f, -1f, 0);
	public static ToolMaterial GLASS = EnumHelper.addToolMaterial("GLASS", 0, 0, 0, 6f, 0);
	
	public static ArmorMaterial FORESTCAMO = EnumHelper.addArmorMaterial("FORESTCAMO", Reference.MOD_ID + ":forestcamo" , 20, new int[] { 2, 6, 5, 2 }, 4, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static ArmorMaterial NETHERCAMO = EnumHelper.addArmorMaterial("NETHERCAMO", Reference.MOD_ID + ":nethercamo" , 20, new int[] { 2, 6, 5, 2 }, 4, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static ArmorMaterial DESERTCAMO = EnumHelper.addArmorMaterial("DESERTCAMO", Reference.MOD_ID + ":desertcamo" , 20, new int[] { 2, 6, 5, 2 }, 4, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static ArmorMaterial SNOWCAMO = EnumHelper.addArmorMaterial("SNOWCAMO", Reference.MOD_ID + ":snowcamo" , 20, new int[] { 2, 6, 5, 2 }, 4, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static ArmorMaterial STONECAMO = EnumHelper.addArmorMaterial("STONECAMO", Reference.MOD_ID + ":stonecamo" , 20, new int[] { 2, 6, 5, 2 }, 4, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static ArmorMaterial NIGHTVISION = EnumHelper.addArmorMaterial("NIGHTVISION", Reference.MOD_ID + ":nightvision" , 30, new int[] { 2, 0, 0, 0 }, 4, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
}
