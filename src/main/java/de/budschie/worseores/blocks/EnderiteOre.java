package de.budschie.worseores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EnderiteOre extends Block
{
	public EnderiteOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player)
	{
		if(!player.isCreative())
			player.setPosition(player.getPosX(), player.getPosY() + 128, player.getPosZ());
		
		super.onBlockHarvested(worldIn, pos, state, player);
	}
}
