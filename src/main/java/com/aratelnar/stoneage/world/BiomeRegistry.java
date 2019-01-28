package com.aratelnar.stoneage.world;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;

public class BiomeRegistry {

	public static void MainRegistry() {
		initBiome();
		regBiome(); 
	}

	public static BiomeGenBase biomeStone;

	public static void initBiome() {
		biomeStone = new BiomeGenStone(144).setBiomeName("Stone world").setTemperatureRainfall(5F, 5F);
	}
	
	private static void regBiome() {
		BiomeDictionary.registerBiomeType(biomeStone, Type.END);
		BiomeManager.addSpawnBiome(biomeStone);
	}
}
