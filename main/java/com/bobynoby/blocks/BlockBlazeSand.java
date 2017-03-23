package com.bobynoby.blocks;

import java.util.Random;

import com.bobynoby.init.BEXBlocks;
import com.bobynoby.main.MainRegistry;
import com.bobynoby.main.Reference;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBlazeSand extends BlockFalling {

	public BlockBlazeSand() {
		super(Material.SAND);
		setCreativeTab(MainRegistry.CREATIVE_TAB_MAIN);
		setSoundType(SoundType.SAND);
		setHardness(0.5F);
		setHarvestLevel("shovel", 0);
		setUnlocalizedName(Reference.BobyEXblocks.BLAZESAND.getUnlocalizedName());
		setRegistryName(Reference.BobyEXblocks.BLAZESAND.getRegistryName());
	}

	
}

