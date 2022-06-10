package de.budschie.worseores.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class EnderiteOre extends Block
{
	public EnderiteOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void playerWillDestroy(Level worldIn, BlockPos pos, BlockState state, Player player)
	{
		if(!player.isCreative())
			player.setPos(player.getX(), player.getY() + 420, player.getZ());
		
		super.playerWillDestroy(worldIn, pos, state, player);
	}
}
