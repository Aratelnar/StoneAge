package com.aratelnar.stoneage.world;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenStone extends BiomeGenBase{
	
	public BiomeGenStone(int id) {
		super(id);
		
		this.theBiomeDecorator.bigMushroomsPerChunk=0;
		this.theBiomeDecorator.cactiPerChunk=0;
		this.theBiomeDecorator.clayPerChunk=0;
		this.theBiomeDecorator.deadBushPerChunk=0;
		this.theBiomeDecorator.flowersPerChunk=0;
		this.theBiomeDecorator.grassPerChunk=0;
		this.theBiomeDecorator.mushroomsPerChunk=0;
		this.theBiomeDecorator.reedsPerChunk=0;
		this.theBiomeDecorator.sandPerChunk=0;
		this.theBiomeDecorator.sandPerChunk2=0;
		this.theBiomeDecorator.treesPerChunk=0;
		this.theBiomeDecorator.waterlilyPerChunk=0;
		this.theBiomeDecorator.generateLakes=false;
		
		this.topBlock = Blocks.cobblestone;
		this.fillerBlock = Blocks.stone;
		this.rootHeight = 256;
		this.enableRain=true;
	}
}
