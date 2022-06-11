package de.budschie.worseores.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.FluidState;

public class LaggeriteOre extends Block
{
	public LaggeriteOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid)
	{
		if(!player.isCreative() && level.isClientSide())
		{
			try
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
				// We need to rethrow for proper error handling /s
				throw new RuntimeException(e);
			}
		}

		return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
	}
}
