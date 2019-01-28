package com.aratelnar.stoneage.item;

import com.aratelnar.stoneage.StoneAgeMain;

import net.minecraft.item.Item;

public class BlackDiamond extends Item {
	
	public BlackDiamond() 
	{
		this.setUnlocalizedName("black_diamond");
		this.setCreativeTab(StoneAgeMain.tabStoneAge);
		this.setMaxStackSize(64);
		this.setTextureName("stoneage:black_diamond");
	}
}
