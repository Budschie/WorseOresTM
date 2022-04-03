package de.budschie.worseores.blocks;

import java.util.Random;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Explosion.BlockInteraction;
import net.minecraft.world.level.ExplosionDamageCalculator;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ExplodemiteOre extends Block
{
	public ExplodemiteOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void playerWillDestroy(Level worldIn, BlockPos pos, BlockState state, Player player)
	{
		super.playerWillDestroy(worldIn, pos, state, player);
		
		if(!worldIn.isClientSide && !player.isCreative())
		{
			Random rand = new Random(System.currentTimeMillis());
			if(rand.nextInt(100) < 50)
			{
				float explosionX, explosionY, explosionZ;
				
				if(rand.nextInt(12) == 0)
				{
					explosionX = (float) player.getX();
					explosionY = (float) player.getY();
					explosionZ = (float) player.getZ();
				}
				else
				{
					worldIn.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
					explosionX = pos.getX();
					explosionY = pos.getY();
					explosionZ = pos.getZ();
				}
				
				worldIn.explode(null, DamageSource.badRespawnPointExplosion(), new ExplosionDamageCalculator(), explosionX, explosionY, explosionZ, 5, true, BlockInteraction.DESTROY);
			}
		}
	}
}
