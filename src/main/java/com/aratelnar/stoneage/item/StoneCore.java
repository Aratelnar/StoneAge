package com.aratelnar.stoneage.item;

import com.aratelnar.stoneage.StoneAgeMain;
import com.aratelnar.stoneage.world.AltTeleporter;
import com.aratelnar.stoneage.world.DimensionRegistry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class StoneCore extends Item {

	public StoneCore()
	{
		this.setUnlocalizedName("stone_core");
		this.setCreativeTab(StoneAgeMain.tabStoneAge);
		this.setMaxStackSize(1);
		this.setTextureName("stoneage:stone_core");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		if(player instanceof EntityPlayerMP) {
			EntityPlayerMP playerMP = (EntityPlayerMP) player;
			if(!world.isRemote) {
				WorldServer worldServer = (WorldServer) world;
				if (player.dimension == StoneAgeMain.DimId) {
					playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, 0, new AltTeleporter(worldServer));
				}
				else {
					playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, DimensionRegistry.dimId, new AltTeleporter(worldServer));
				}
			}
		}	
		return item;
	}
}
