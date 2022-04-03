package de.budschie.worseores.blocks;

import java.util.Random;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SmiteandliteOre extends Block
{
	public SmiteandliteOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void playerWillDestroy(Level worldIn, BlockPos pos, BlockState state, Player player)
	{
		LightningBolt entity = new LightningBolt(EntityType.LIGHTNING_BOLT, worldIn);
		
		float explosionX, explosionY, explosionZ;
		
		Random rand = new Random(System.currentTimeMillis());
		
		if(rand.nextInt(4) == 0)
		{
			explosionX = (float) player.getX();
			explosionY = (float) player.getY();
			explosionZ = (float) player.getZ();
		}
		else
		{
			explosionX = pos.getX();
			explosionY = pos.getY();
			explosionZ = pos.getZ();
		}
		
		entity.setPos(explosionX, explosionY, explosionZ);
		worldIn.addFreshEntity(entity);
		
		super.playerWillDestroy(worldIn, pos, state, player);
	}
}
