package com.bobynoby.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		Item itemFuel = fuel.getItem();
		if (itemFuel == BEXItems.enderdustingot) {
			return 10000;
		}
		else {
			return 0;
		}

	}

}
