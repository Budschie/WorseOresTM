package de.budschie.worseores.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AmadeumOre extends Block
{
	private static final SoundEvent[] SOUND_EVENTS = new SoundEvent[] { SoundEvents.BLOCK_NOTE_BLOCK_BANJO,
			SoundEvents.BLOCK_NOTE_BLOCK_BASEDRUM, SoundEvents.BLOCK_NOTE_BLOCK_BASS, SoundEvents.BLOCK_NOTE_BLOCK_BELL,
			SoundEvents.BLOCK_NOTE_BLOCK_BIT, SoundEvents.BLOCK_NOTE_BLOCK_CHIME, SoundEvents.BLOCK_NOTE_BLOCK_COW_BELL,
			SoundEvents.BLOCK_NOTE_BLOCK_DIDGERIDOO, SoundEvents.BLOCK_NOTE_BLOCK_DIDGERIDOO,
			SoundEvents.BLOCK_NOTE_BLOCK_FLUTE, SoundEvents.BLOCK_NOTE_BLOCK_GUITAR, SoundEvents.BLOCK_NOTE_BLOCK_HARP,
			SoundEvents.BLOCK_NOTE_BLOCK_HAT, SoundEvents.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE,
			SoundEvents.BLOCK_NOTE_BLOCK_PLING, SoundEvents.BLOCK_NOTE_BLOCK_SNARE,
			SoundEvents.BLOCK_NOTE_BLOCK_XYLOPHONE };

	
	public AmadeumOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
	{
		if(rand.nextInt(100) < 5)
		{			
			worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), SOUND_EVENTS[rand.nextInt(SOUND_EVENTS.length)], SoundCategory.MASTER, 1, rand.nextFloat() * 2, false);
		}
	}
}
