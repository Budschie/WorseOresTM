package de.budschie.worseores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BestforgeOre extends Block
{
	public BestforgeOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player)
	{
		if(worldIn.isRemote)
		{
			throw new IllegalArgumentException("Alt-F4");
		}
		
		super.onBlockHarvested(worldIn, pos, state, player);
	}
}