package com.aratelnar.stoneage;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.aratelnar.stoneage.item.BlackDiamond;
import com.aratelnar.stoneage.item.StoneCore;
import com.aratelnar.stoneage.world.BiomeRegistry;
import com.aratelnar.stoneage.world.DimensionRegistry;

import cpw.mods.fml.common.Mod;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;

@Mod(modid = StoneAgeMain.MODID, name = StoneAgeMain.NAME, version = StoneAgeMain.VERSION)
public class StoneAgeMain {
	public static final String MODID = "stoneage";
	public static final String NAME = "Stone Age";
    public static final String VERSION = "1.0";
    public static Item stone_core;
    public static Item black_diamond;
    public static int DimId = DimensionManager.getNextFreeDimId();
	public static CreativeTabs tabStoneAge = new TabStoneAge(MODID);
    
    @EventHandler
    public void preLoad(FMLPreInitializationEvent preevent)
    {
        stone_core = new StoneCore();
        black_diamond = new BlackDiamond();
        GameRegistry.registerItem(stone_core, "stone_core");
        GameRegistry.registerItem(black_diamond, "black_diamond");
        loadRecipes();
        BiomeRegistry.MainRegistry();
        DimensionRegistry.mainRegistry();
    }
    
    public void loadRecipes()
    {
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StoneAgeMain.black_diamond, 1), new Object[]{ " X ", "XYX", " X ",
				('X'), "dyeBlack", ('Y'), Items.diamond}));
    	GameRegistry.addShapedRecipe(new ItemStack(StoneAgeMain.stone_core, 1), new Object[]{ " X ", "XYX", " X ",
				('X'), Blocks.stone, ('Y'), StoneAgeMain.black_diamond});
    }
}
