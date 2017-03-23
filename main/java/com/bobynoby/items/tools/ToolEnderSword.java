package com.bobynoby.items.tools;

import java.util.List;

import com.bobynoby.init.BEXItems;
import com.bobynoby.init.ConfigManager;
import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import scala.util.Random;

public class ToolEnderSword extends ItemSword {

	public ToolEnderSword(ToolMaterial material) {
		super(material);
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.ENDERSWORD.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.ENDERSWORD.getRegistryName());
	}
	
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		if (ConfigManager.enchantEnderToolsOnCraft == true) {
		stack.addEnchantment(Enchantment.getEnchantmentByID(20), 5);
		stack.addEnchantment(Enchantment.getEnchantmentByID(70), 1);
		}
	}
	
	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
		if (ConfigManager.generateParticlesOnEnderTools == true) {
			if (entity instanceof EntityPlayer) { 
				EntityPlayer Player = (EntityPlayer) entity;
				if (Player.getHeldItemMainhand() != null && Player.getHeldItemMainhand().getItem() instanceof ToolEnderSword) {
					if (world.isRemote) {
						Random rand = new Random();
						double x = -0.7 + rand.nextFloat() * (0.7 - -0.7);
						double z = -0.7 + rand.nextFloat() * (0.7 - -0.7);
						double y = -0.7 + rand.nextFloat() * (0.7 - -0.7);
						world.spawnParticle(EnumParticleTypes.FLAME, entity.posX + x, (entity.posY + 1.0) + y, entity.posZ + z, 0.0D, 0.0D, 0.0D, new int[0]);	
	        		}
				}
			}
		}
	}

    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    	par3List.add("Its a flaming sword! But it seems");
    	par3List.add("as it cant hurt its user...");
    }
}
