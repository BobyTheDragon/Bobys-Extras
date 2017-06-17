package com.bobynoby.main;

public class Reference 
{
	public static final String MOD_ID = "bobyex";
	public static final String NAME = "Boby's Extras";
	public static final String VERSION = "betabuild_5.0";
	public static final String ACCEPTED_CLIENT_VERSION = "1.11.2";
	
	public static final String CLIENT_PROXY_CLASS = "com.bobynoby.main.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.bobynoby.main.proxy.ServerProxy";
	
	public static enum BobyEXitems {
		
		EXTRACTOR("extractor", "ItemExtractor"),
		INFUSER("infuser", "ItemInfuser"),
		
		IRONSHARD("ironshard", "ItemIronShard"),
		OBBYINGOT("obbyingot", "ItemObbyIngot"),
		OBBYSTICK("obbystick", "ItemObbyStick"),
		NIGHTVISIONLENS("nightvisionlens", "ItemNightVisionLens"),
		LEATHERSTRAP("leatherstrap", "ItemLeatherStrap"),
		BORONINGOT("boroningot", "ItemBoronIngot"),
		BORONSTICK("boronstick", "ItemBoronStick"),
		BLACKPASTE("blackpaste", "ItemBlackPaste"),
		
		CAMOFOREST("camogreen", "ItemCamoGreen"),
		CAMONETHER("camored", "ItemCamoRed"),
		CAMOSAND("camoyellow", "ItemCamoYellow"),
		CAMOSNOW("camowhite", "ItemCamoWhite"),
		CAMOSTONE("camogrey", "ItemCamoGrey"),
		
		ENDERPULVIS("enderdust", "ItemEnderDust"),
		ENDERGEM("endergem", "ItemEnderGem"),
		ENDERSEED("enderseed", "ItemEnderSeed"),
		ENDERPULVISRED("enderdustred", "ItemEnderDustRed"),
		ENDERPULVISGREEN("enderdustgreen", "ItemEnderDustGreen"),
		ENDERPULVISBLUE("enderdustblue", "ItemEnderDustBlue"),
		ENDERPULVISWHITE("enderdustwhite", "ItemEnderDustWhite"),
		ENDERPULVISMICRO("enderdustmicro", "ItemEnderDustMicro"),
		ENDERPULVISMINI("enderdustmini","ItemEnderDustMini"),
		ENDERPULVISPURE("enderdustpure", "ItemEnderDustPure"),
		ENDERPULVISINGOT("enderdustingot", "ItemEnderDustIngot"),
		
		//tools
		
		OBBYSWORD("obbysword", "ToolObbySword"),
		OBBYPICKAXE("obbypickaxe", "ToolObbyPickaxe"),
		OBBYAXE("obbyaxe", "ToolObbyAxe"),
		OBBYSHOVEL("obbyshovel", "ToolObbyShovel"),
		OBBYHOE("obbyhoe", "ToolObbyHoe"),
		
		ENDERSWORD("endersword", "ToolEnderSword"),
		ENDERPICKAXE("enderpickaxe", "ToolEnderPickaxe"),
		ENDERAXE("enderaxe", "ToolEnderAxe"),
		ENDERSHOVEL("endershovel", "ToolEnderShovel"),
		
		ADMINSWORD("adminsword", "ToolAdminSword"),
		
		BADSWORD("badsword", "ToolBadSword"),
		BADPICKAXE("badpickaxe", "ToolBadPickaxe"),
		BADAXE("badaxe", "ToolBadAxe"),
		BADSHOVEL("badshovel", "ToolBadShovel"),
		BADHOE("badhoe", "ToolBadHoe"),
		
		WOODENSHEARS("woodenshears", "ToolWoodenShears"),
		STONESHEARS("stoneshears", "ToolStoneShears"),
		OBBYSHEARS("obbyshears", "ToolObbyShears"),
		
		GLASSSWORD("glasssword", "ToolGlassSword"),
		
		//armor
		
		FORESTHELMET("foresthelmet", "ArmorForestHelmet"),
		FORESTCHEST("forestchest", "ArmorForestChest"),
		FORESTLEGGINGS("forestleggings", "ArmorForestLeggings"),
		FORESTBOOTS("forestboots", "ArmorForestBoots"),
		
		NETHERHELMET("netherhelmet", "ArmorNetherHelmet"),
		NETHERCHEST("netherchest", "ArmorNetherChest"),
		NETHERLEGGINGS("netherleggings", "ArmorNetherLeggings"),
		NETHERBOOTS("netherboots", "ArmorNetherBoots"),
		
		DESERTHELMET("deserthelmet", "ArmorDesertHelmet"),
		DESERTCHEST("desertchest", "ArmorDesertChest"),
		DESERTLEGGINGS("desertleggings", "ArmorDesertLeggings"),
		DESERTBOOTS("desertboots", "ArmorDesertBoots"),
		
		SNOWHELMET("snowhelmet", "ArmorSnowHelmet"),
		SNOWCHEST("snowchest", "ArmorSnowChest"),
		SNOWLEGGINGS("snowleggings", "ArmorSnowLeggings"),
		SNOWBOOTS("snowboots", "ArmorSnowBoots"),
		
		STONEHELMET("stonehelmet", "ArmorStoneHelmet"),
		STONECHEST("stonechest", "ArmorStoneChest"),
		STONELEGGINGS("stoneleggings", "ArmorStoneLeggings"),
		STONEBOOTS("stoneboots", "ArmorStoneBoots"),
		
		NIGHTVISION("nightvision", "ArmorNightVision"),
		
		//servers
		
		CLAIMWAND("claimwand", "ItemClaimWand");
		
		
		

		private String unlocalizedName;
		private String registryName;
		
		BobyEXitems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum BobyEXblocks {
		
		IRONSAND("ironsand", "BlockIronSand"),
		GLASSSAND("glasssand", "BlockGlassSand"),
		BLAZESAND("blazesand", "BlockBlazeSand"),
		
		OBBYBRICK("obbybrick", "BlockObbyBrick"),
		OBBYSMOOTH("obbysmooth", "BlockObbySmooth"),
		OBBYGLASS("obbyglass", "BlockObbyGlass"),
		OBBYSMOOTHSTAIRS("obbysmoothstairs", "BlockObbySmoothStairs"),
		
		ENDERPULVISBLOCK("blockenderdust", "BlockEnderDust"),
		ENDERPULVISGLASS("enderglass", "BlockEnderGlass"),
		
		OREBLAZEPOWDER("blazepowderore", "OreBlazePowder"),
		OREENDERPULVIS("enderdustore", "OreEnderDust"),
		OREBORON("boronore", "OreBoron"),
		
		INFUSER("infuser", "BlockInfuser"),
		BORONBLOCK("boronblock", "BlockBoron"),
		
		ENDERCROP("endercrop","CropEnder"),
		
		ENDERPULVISFLUID("enderpulvis_fluid","FluidEnderPulvis");
		
		private String unlocalizedName;
		private String registryName;
		
		BobyEXblocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
