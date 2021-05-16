package de.budschie.worseores.blocks;

import java.util.Random;
import java.util.UUID;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class AppetiteOre extends Block
{
	public AppetiteOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player)
	{
		super.onBlockHarvested(worldIn, pos, state, player);
		
		if(!worldIn.isRemote && !player.isCreative())
		{
			player.getFoodStats().setFoodSaturationLevel(player.getFoodStats().getSaturationLevel() + 10);
			player.getFoodStats().setFoodLevel(player.getFoodStats().getFoodLevel() + 8);
			
			player.sendMessage(new StringTextComponent(TextFormatting.GREEN + "Smells like crickets, Tastes like chicken."), new UUID(0, 0));
			worldIn.playSound(null, pos, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.MASTER, 1000, new Random(System.currentTimeMillis()).nextFloat() * 2);
		}
	}
}
