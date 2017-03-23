package com.bobynoby.blocks;

import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

public class BlockIronSand extends BlockFalling {

	public BlockIronSand() {
		super(Material.SAND);
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setSoundType(SoundType.SAND);
		setHardness(0.5F);
		setHarvestLevel("shovel", 0);
		setUnlocalizedName(Reference.BobyEXblocks.IRONSAND.getUnlocalizedName());
		setRegistryName(Reference.BobyEXblocks.IRONSAND.getRegistryName());
	}

}
