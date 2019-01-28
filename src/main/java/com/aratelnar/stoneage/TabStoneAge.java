package com.aratelnar.stoneage;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class TabStoneAge extends CreativeTabs {

	public TabStoneAge(String lable) {
		super(lable);	
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return StoneAgeMain.stone_core;
	}

}
