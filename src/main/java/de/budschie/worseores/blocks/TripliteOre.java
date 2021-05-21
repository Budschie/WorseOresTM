package de.budschie.worseores.blocks;

import de.budschie.worseores.entity.EntityRegistry;
import de.budschie.worseores.entity.TripleHeadedSheepEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TripliteOre extends Block
{
	public TripliteOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player)
	{
		super.onBlockHarvested(worldIn, pos, state, player);
		
		TripleHeadedSheepEntity entity = EntityRegistry.TRIPLE_HEADED_SHEEP.get().create(worldIn);
		entity.setPosition(pos.getX() + .5, pos.getY(), pos.getZ() + .5);
		worldIn.addEntity(entity);
	}
}
