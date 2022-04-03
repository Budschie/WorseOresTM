package de.budschie.worseores.blocks;

import java.util.Random;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AmadeumOre extends Block
{
	private static final SoundEvent[] SOUND_EVENTS = new SoundEvent[] { SoundEvents.NOTE_BLOCK_BANJO,
			SoundEvents.NOTE_BLOCK_BASEDRUM, SoundEvents.NOTE_BLOCK_BASS, SoundEvents.NOTE_BLOCK_BELL,
			SoundEvents.NOTE_BLOCK_BIT, SoundEvents.NOTE_BLOCK_CHIME, SoundEvents.NOTE_BLOCK_COW_BELL,
			SoundEvents.NOTE_BLOCK_DIDGERIDOO, SoundEvents.NOTE_BLOCK_DIDGERIDOO,
			SoundEvents.NOTE_BLOCK_FLUTE, SoundEvents.NOTE_BLOCK_GUITAR, SoundEvents.NOTE_BLOCK_HARP,
			SoundEvents.NOTE_BLOCK_HAT, SoundEvents.NOTE_BLOCK_IRON_XYLOPHONE,
			SoundEvents.NOTE_BLOCK_PLING, SoundEvents.NOTE_BLOCK_SNARE,
			SoundEvents.NOTE_BLOCK_XYLOPHONE };

	
	public AmadeumOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, Random rand)
	{
		if(rand.nextInt(100) < 5)
		{			
			worldIn.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), SOUND_EVENTS[rand.nextInt(SOUND_EVENTS.length)], SoundSource.MASTER, 1, rand.nextFloat() * 2, false);
		}
	}
}
