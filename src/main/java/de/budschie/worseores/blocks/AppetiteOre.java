package de.budschie.worseores.blocks;

import java.util.Random;
import java.util.UUID;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.ChatFormatting;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AppetiteOre extends Block
{
	public AppetiteOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void playerWillDestroy(Level worldIn, BlockPos pos, BlockState state, Player player)
	{
		super.playerWillDestroy(worldIn, pos, state, player);
		
		if(!player.isCreative())
		{
			if(worldIn.isClientSide)
				player.getFoodData().setSaturation(player.getFoodData().getSaturationLevel() + 10);
			else
			{
				player.getFoodData().setFoodLevel(player.getFoodData().getFoodLevel() + 8);
				
				player.sendMessage(new TextComponent(ChatFormatting.GREEN + "Smells like crickets, Tastes like chicken."), new UUID(0, 0));
				worldIn.playSound(null, pos, SoundEvents.PLAYER_BURP, SoundSource.MASTER, 1000, new Random(System.currentTimeMillis()).nextFloat() * 2);
			}
		}
	}
}
