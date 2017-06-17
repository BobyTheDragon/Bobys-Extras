package com.bobynoby.init;

import com.bobynoby.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class EventManager {
	
	@SubscribeEvent
	public void onJoin(PlayerLoggedInEvent event) {
		EntityPlayer player = event.player;
		if (ConfigManager.logInMessage == true) {
				player.sendMessage(new TextComponentString("\u00A7DClient running BobyEX, Loaded version is\u00A75 " + Reference.VERSION));
				System.out.println("Client running BobyEX, Loaded version is " + Reference.VERSION);
		}
	}
}
