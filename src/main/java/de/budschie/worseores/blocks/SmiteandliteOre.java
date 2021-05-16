package de.budschie.worseores.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SmiteandliteOre extends Block
{
	public SmiteandliteOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player)
	{
		LightningBoltEntity entity = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		
		float explosionX, explosionY, explosionZ;
		
		Random rand = new Random(System.currentTimeMillis());
		
		if(rand.nextInt(4) == 0)
		{
			explosionX = (float) player.getPosX();
			explosionY = (float) player.getPosY();
			explosionZ = (float) player.getPosZ();
		}
		else
		{
			explosionX = pos.getX();
			explosionY = pos.getY();
			explosionZ = pos.getZ();
		}
		
		entity.setPosition(explosionX, explosionY, explosionZ);
		worldIn.addEntity(entity);
		
		super.onBlockHarvested(worldIn, pos, state, player);
	}
}
