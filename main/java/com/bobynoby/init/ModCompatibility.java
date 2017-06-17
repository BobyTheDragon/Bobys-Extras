package com.bobynoby.init;

import erogenousbeef.bigreactors.api.IHeatEntity;
import erogenousbeef.bigreactors.api.data.ReactorReaction;
import erogenousbeef.bigreactors.api.registry.Reactants;
import erogenousbeef.bigreactors.api.registry.ReactorConversions;
import erogenousbeef.bigreactors.api.registry.ReactorInterior;
import erogenousbeef.bigreactors.common.data.StandardReactants;
import net.minecraftforge.fml.common.Loader;

public class ModCompatibility {
	
	public static void init() {
		if (Loader.isModLoaded("bigreactors") && ConfigManager.bigReactors == true) {
			//Consumable Fuel
			Reactants.registerReactant("enderpulvisIngot", 0, 0xe600e6);
			Reactants.registerSolid("ingotEnderpulvis", "enderpulvisIngot", 1000);
			//Convert Fuel to Waste
			ReactorConversions.register("enderpulvisIngot", StandardReactants.cyanite);
			//Interior Blocks
			ReactorInterior.registerBlock("blockBoron", 1f, 0.95f, 5f, IHeatEntity.conductivityEmerald); //Double the moderator levels compared to graphite
		}
	}
}
