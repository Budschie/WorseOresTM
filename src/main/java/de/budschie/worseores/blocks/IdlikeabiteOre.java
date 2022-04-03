package de.budschie.worseores.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class IdlikeabiteOre extends Block
{
	public IdlikeabiteOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void playerWillDestroy(Level worldIn, BlockPos pos, BlockState state, Player player)
	{
		super.playerWillDestroy(worldIn, pos, state, player);
		
		if(!worldIn.isClientSide && !player.isCreative())
		{
			if(worldIn.isClientSide)
				player.getFoodData().setSaturation(player.getFoodData().getSaturationLevel() - 10);
			else
			{
				player.getFoodData().setFoodLevel(player.getFoodData().getFoodLevel() - 8);
				
				worldIn.playSound(null, pos, SoundEvents.PLAYER_HURT, SoundSource.MASTER, 1000, 0);
			}
		}
	}
}
