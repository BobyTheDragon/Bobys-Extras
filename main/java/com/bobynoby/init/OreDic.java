package com.bobynoby.init;

import net.minecraftforge.oredict.OreDictionary;

public class OreDic extends OreDictionary {
	
	public static void registerOreDic() {
		
		//ores
		registerOre("oreBoron", BEXBlocks.boronore);
		registerOre("oreBlaze", BEXBlocks.blazepowderore);
		registerOre("oreEnderpulvis", BEXBlocks.enderdustore);
		
		//blocks
		registerOre("sand", BEXBlocks.ironsand);
		//registerOre("sand", BEXBlocks.glasssand);
		registerOre("blockBoron", BEXBlocks.boronblock);
		registerOre("blockEnderpulvis", BEXBlocks.blockenderdust);
		registerOre("blockBlazepowder", BEXBlocks.blazesand);
		registerOre("glass", BEXBlocks.enderglass);
		registerOre("glass", BEXBlocks.obbyglass);
		registerOre("obsidian", BEXBlocks.obbybrick);
		registerOre("obsidian", BEXBlocks.obbysmooth);
		
		//items
		registerOre("ingotBoron", BEXItems.boroningot);
		registerOre("stickBoron", BEXItems.boronstick);
		registerOre("ingotObsidian", BEXItems.obbyingot);
		registerOre("stickObsidian", BEXItems.obbystick);
		registerOre("itemEnderpulvis", BEXItems.enderdust);
		registerOre("shardIron", BEXItems.ironshard);
		registerOre("dustEnderpulvis", BEXItems.enderdustpure);
		registerOre("ingotEnderpulvis", BEXItems.enderdustingot);
		
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
