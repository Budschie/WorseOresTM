package de.budschie.worseores.blocks;

import de.budschie.worseores.entity.EntityRegistry;
import de.budschie.worseores.entity.TripleHeadedSheepEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class TripliteOre extends Block
{
	public TripliteOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void playerWillDestroy(Level worldIn, BlockPos pos, BlockState state, Player player)
	{
		super.playerWillDestroy(worldIn, pos, state, player);
		
		TripleHeadedSheepEntity entity = EntityRegistry.TRIPLE_HEADED_SHEEP.get().create(worldIn);
		entity.setPos(pos.getX() + .5, pos.getY(), pos.getZ() + .5);
		worldIn.addFreshEntity(entity);
	}
}
