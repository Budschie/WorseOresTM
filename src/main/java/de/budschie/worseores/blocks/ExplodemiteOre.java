package de.budschie.worseores.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion.Mode;
import net.minecraft.world.ExplosionContext;
import net.minecraft.world.World;

public class ExplodemiteOre extends Block
{
	public ExplodemiteOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player)
	{
		super.onBlockHarvested(worldIn, pos, state, player);
		
		if(!worldIn.isRemote && !player.isCreative())
		{
			Random rand = new Random(System.currentTimeMillis());
			if(rand.nextInt(100) < 50)
			{
				float explosionX, explosionY, explosionZ;
				
				if(rand.nextInt(12) == 0)
				{
					explosionX = (float) player.getPosX();
					explosionY = (float) player.getPosY();
					explosionZ = (float) player.getPosZ();
				}
				else
				{
					worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
					explosionX = pos.getX();
					explosionY = pos.getY();
					explosionZ = pos.getZ();
				}
				
				worldIn.createExplosion(null, DamageSource.causeBedExplosionDamage(), new ExplosionContext(), explosionX, explosionY, explosionZ, 5, true, Mode.DESTROY);
			}
		}
	}
}
