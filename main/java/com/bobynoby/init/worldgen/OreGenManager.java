package com.bobynoby.init.worldgen;

import java.util.Random;

import com.bobynoby.init.BEXBlocks;
import com.bobynoby.init.ConfigManager;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGenManager implements IWorldGenerator{
	
	public static final int genIronSand = ConfigManager.genIronSand;
	public static final int genGlassSand = ConfigManager.genGlassSand;
	public static final int genBoronOre = ConfigManager.genBoronOre;
	public static final int genBlazePowderOre = ConfigManager.genBlazePowderOre;
	public static final int genEnderDustOre = ConfigManager.genEnderDustOre;
	
	
	private WorldGenerator BlockIronSand;
	private WorldGenerator BlockGlassSand;
	private WorldGenerator OreBlazePowder;
	private WorldGenerator OreEnderDust;
	private WorldGenerator OreBoron;
	
	public OreGenManager () {
		
		this.BlockIronSand = new SandOreGenMineable(BEXBlocks.ironsand.getDefaultState(), 20);
		this.BlockGlassSand = new SandOreGenMineable(BEXBlocks.glasssand.getDefaultState(), 20);
		this.OreBlazePowder = new NetherOreGenMineable(BEXBlocks.blazepowderore.getDefaultState(), 5);
		this.OreEnderDust = new EndOreGenMineable(BEXBlocks.enderdustore.getDefaultState(), 4);
		this.OreBoron = new StoneOreGenMineable(BEXBlocks.boronore.getDefaultState(), 4);
		
	}

	@Override
	public void generate(Random random, int chunckX, int chunckZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		case 0: //Overworld
			
			if (ConfigManager.registergenIronSand == true) {
			this.runGenerator(this.BlockIronSand, world, random, chunckX, chunckZ, genIronSand, 0, 256);
			}
			if (ConfigManager.registergenGlassSand == true) {
			this.runGenerator(this.BlockGlassSand, world, random, chunckX, chunckZ, genGlassSand, 0, 256);
			}
			this.runGenerator(this.OreBoron, world, random, chunckX, chunckZ, genBoronOre, 0, 20);
			
			break;
			
		case -1: //Nether
			
			this.runGenerator(this.OreBlazePowder, world, random, chunckX, chunckZ, genBlazePowderOre, 0, 256);
			
			break;
			
		case 1: //ender
			
			this.runGenerator(this.OreEnderDust, world, random, chunckX, chunckZ, genEnderDustOre, 0, 256);
		
			break;
		}
	}
	
	private void runGenerator (WorldGenerator generator, World world, Random random, int chunckX, int chunckZ, int chanceToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Minimum or Maximum Height out of bounds");
		
		int heightDiff = maxHeight - minHeight +1;
		for (int i = 0; i < chanceToSpawn; i++) {
			int x = chunckX * 16 + random.nextInt(16);
			int y = minHeight + random.nextInt(heightDiff);
			int z = chunckZ * 16 + random.nextInt(16);
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}
}
