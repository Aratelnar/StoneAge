package com.aratelnar.stoneage.world;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;

public class StoneWorldProvider extends WorldProvider{

	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.biomeStone, 5F);
		this.dimensionId = DimensionRegistry.dimId;
	}
	
	public IChunkProvider createChunkGeneration() {
		return new StoneChunkProvider();
	}
	
	@Override
	public String getDimensionName() {
		return "Stone Age";
	}
	
}
