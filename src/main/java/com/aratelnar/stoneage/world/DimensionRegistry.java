package com.aratelnar.stoneage.world;

import com.aratelnar.stoneage.StoneAgeMain;

import net.minecraft.world.WorldProvider;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {
	
	public static void mainRegistry()
	{
		registerDimension();
	}
	
	public static final int dimId = StoneAgeMain.DimId;
	
	public static void registerDimension()
	{
		DimensionManager.registerProviderType(dimId, StoneWorldProvider.class, false);
		DimensionManager.registerDimension(dimId, dimId);
	}
	
}
