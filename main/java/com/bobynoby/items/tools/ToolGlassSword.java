package com.bobynoby.items.tools;

import java.util.List;

import com.bobynoby.init.ConfigManager;
import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import scala.util.Random;

public class ToolGlassSword extends ItemSword {

	public ToolGlassSword(ToolMaterial material) {
		super(material);
		setCreativeTab(MainRegistry.CREATIVE_TAB_TOOL);
		setUnlocalizedName(Reference.BobyEXitems.GLASSSWORD.getUnlocalizedName());
		setRegistryName(Reference.BobyEXitems.GLASSSWORD.getRegistryName());
	}
	
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    	par3List.add("§eVery Fragile... And Deadly");
    	
    }
    
    @Override
    public boolean onDroppedByPlayer(ItemStack itemstack, EntityPlayer player) {
		if (player.isCreative() == false) {
			player.inventory.deleteStack(player.getHeldItemMainhand());
			player.sendMessage(new TextComponentString("\u00A7o\u00A7eIt shattered... What did you think would happen when you dropped it? Its made of glass!"));
		}
        return true;
    }
    
    @Override
    public void onUpdate(ItemStack itemstack, World world, Entity entity, int itemSlot, boolean flag) {
    	if (entity instanceof EntityPlayer) { 
			EntityPlayer Player = (EntityPlayer) entity;
			if (Player.getHeldItemMainhand() != null && Player.getHeldItemMainhand().getItem() instanceof ToolGlassSword && Player.isCreative() == false) {
				Random rand = new Random();
				int BreakChance = rand.nextInt(1 * 1000);
				if (Player.isBurning()) {
					if (BreakChance == 1) {
						Player.inventory.deleteStack(Player.getHeldItemMainhand());
			            Player.world.playSound(Player.posX, Player.posY, Player.posZ, SoundEvents.BLOCK_GLASS_BREAK, SoundCategory.PLAYERS, 1f, 1f, false);
			            Player.playSound(SoundEvents.BLOCK_GLASS_BREAK, 1f, 1f);
			            Player.sendMessage(new TextComponentString("\u00A7o\u00A7eOh... The Glass Sword melted in the heat of the flames..."));
					}
				}
				else if (Player.isSprinting()) {
					if (BreakChance == 2) {
						Player.inventory.deleteStack(Player.getHeldItemMainhand());
			            Player.world.playSound(Player.posX, Player.posY, Player.posZ, SoundEvents.BLOCK_GLASS_BREAK, SoundCategory.PLAYERS, 1f, 1f, false);
			            Player.playSound(SoundEvents.BLOCK_GLASS_BREAK, 1f, 1f);
			            Player.sendMessage(new TextComponentString("\u00A7o\u00A7eThe Glass Sword fell out of your hand and smashed on the ground, Next time try not to run..."));
					}
					else if (BreakChance == 3) {
						if (Player.getHealth() == 1) {
							Player.attackEntityFrom(DamageSource.CACTUS, 1);
						}
						else if (Player.getHealth() > 1) {
							Player.performHurtAnimation();
							Player.setHealth(Player.getHealth() -1);
							 Player.sendMessage(new TextComponentString("\u00A7o\u00A7eOuch! Dont run! You cut yourself!"));
						}
					}
				}
			}
    	}
    }
    
    @Override
    public boolean hitEntity(ItemStack itemstack, EntityLivingBase entity1, EntityLivingBase entity2) {
    	    entity1.addPotionEffect(new PotionEffect(Potion.getPotionById(19), 140, 1));
			EntityPlayer Player = (EntityPlayer) entity2;
			if (Player.isCreative() == false) {
			Player.inventory.deleteStack(Player.getHeldItemMainhand());
			Player.sendMessage(new TextComponentString("\u00A7o\u00A7eThe Glass Sword smashes on contact... Ouch!"));
			}
    	    return true;
    }
}
