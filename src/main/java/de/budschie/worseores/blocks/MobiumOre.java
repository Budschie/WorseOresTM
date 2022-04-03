package de.budschie.worseores.blocks;

import java.util.Random;

import de.budschie.worseores.util.Util;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MobiumOre extends Block
{
	public static final SoundEvent[] SOUND_EVENTS = new SoundEvent[] { SoundEvents.VILLAGER_HURT,
			SoundEvents.ZOMBIE_AMBIENT, SoundEvents.CREEPER_PRIMED, SoundEvents.BAT_AMBIENT,
			SoundEvents.ZOMBIE_VILLAGER_AMBIENT, SoundEvents.SPIDER_AMBIENT, SoundEvents.EVOKER_PREPARE_WOLOLO, SoundEvents.BLAZE_AMBIENT, SoundEvents.CHICKEN_DEATH,
			SoundEvents.CAT_AMBIENT, SoundEvents.FIREWORK_ROCKET_TWINKLE_FAR,
			SoundEvents.PILLAGER_CELEBRATE, SoundEvents.PILLAGER_AMBIENT,
			SoundEvents.PILLAGER_HURT, SoundEvents.RAID_HORN };
	
	public MobiumOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, Random rand)
	{
		int randVal = rand.nextInt(100);
		
		if(randVal < 5)
		{			
			worldIn.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), SOUND_EVENTS[rand.nextInt(SOUND_EVENTS.length)], SoundSource.MASTER, 2, rand.nextFloat() + 0.5f, false);
		}
		else if(randVal < 10)
		{
			worldIn.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), Util.getRandom(ForgeRegistries.SOUND_EVENTS.getValues(), rand).get(), SoundSource.MASTER, .5f, rand.nextFloat() + 0.5f, false);
		}
	}
}
