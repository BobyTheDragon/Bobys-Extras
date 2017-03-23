package com.bobynoby.init;

import net.minecraftforge.oredict.OreDictionary;

public class OreDic extends OreDictionary{
	
	public static void registerOreDic() {
		
		//ores
		registerOre("oreBoron", BEXBlocks.boronore);
		registerOre("oreBlaze", BEXBlocks.blazepowderore);
		registerOre("oreEnderpulvis", BEXBlocks.enderdustore);
		
		//blocks
		registerOre("sand", BEXBlocks.ironsand);
		registerOre("blockBoron", BEXBlocks.boronblock);
		registerOre("blockEnderpulvis", BEXBlocks.blockenderdust);
		registerOre("blockBlazepowder", BEXBlocks.blazesand);
		registerOre("glass", BEXBlocks.enderglass);
		registerOre("glass", BEXBlocks.obbyglass);
		
		//items
		registerOre("ingotBoron", BEXItems.boroningot);
		registerOre("ingotObsidian", BEXItems.obbyingot);
		registerOre("stickBoron", BEXItems.boronstick);
		registerOre("itemEnderpulvis", BEXItems.enderdust);
		registerOre("shardIron", BEXItems.ironshard);
		
		if (ConfigManager.allowEnderpulvisUranium == true) {
		registerOre("dustUranium", BEXItems.enderdustpure);
		registerOre("ingotUranium", BEXItems.enderdustingot);
		}
		
		//dye
		if (ConfigManager.allowEnderpulvisDyes == true) {
		registerOre("dyeMagenta", BEXItems.enderdust);
		registerOre("dyeLime", BEXItems.enderdustgreen);
		registerOre("dyeRed", BEXItems.enderdustred);
		registerOre("dyeBlue", BEXItems.enderdustblue);
		registerOre("dyeWhite", BEXItems.enderdustwhite);
		registerOre("dye", BEXItems.enderdust);
		registerOre("dye", BEXItems.enderdustgreen);
		registerOre("dye", BEXItems.enderdustred);
		registerOre("dye", BEXItems.enderdustblue);
		registerOre("dye", BEXItems.enderdustwhite);
		}
		registerOre("dyeBlack", BEXItems.blackpaste);
		registerOre("dye", BEXItems.blackpaste);
		
	}

}
