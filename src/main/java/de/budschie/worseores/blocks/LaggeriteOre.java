package de.budschie.worseores.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class LaggeriteOre extends Block
{
	public LaggeriteOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void playerWillDestroy(Level worldIn, BlockPos pos, BlockState state, Player player)
	{
		super.playerWillDestroy(worldIn, pos, state, player);
		
		if(player.isCreative())
			return;
		
		try
		{
			if(worldIn.isClientSide)
				Thread.sleep(5000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
			// We need to rethrow for proper error handling /s
			throw new RuntimeException(e);
		}
	}
}
