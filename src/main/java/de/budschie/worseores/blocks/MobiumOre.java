package de.budschie.worseores.blocks;

import java.util.Random;

import de.budschie.worseores.util.Util;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;

public class MobiumOre extends Block
{
	public static final SoundEvent[] SOUND_EVENTS = new SoundEvent[] { SoundEvents.ENTITY_VILLAGER_HURT,
			SoundEvents.ENTITY_ZOMBIE_AMBIENT, SoundEvents.ENTITY_CREEPER_PRIMED, SoundEvents.ENTITY_BAT_AMBIENT,
			SoundEvents.ENTITY_ZOMBIE_VILLAGER_AMBIENT, SoundEvents.ENTITY_SPIDER_AMBIENT, SoundEvents.ENTITY_EVOKER_PREPARE_WOLOLO, SoundEvents.ENTITY_BLAZE_AMBIENT, SoundEvents.ENTITY_CHICKEN_DEATH,
			SoundEvents.ENTITY_CAT_AMBIENT, SoundEvents.ENTITY_FIREWORK_ROCKET_TWINKLE_FAR,
			SoundEvents.ENTITY_PILLAGER_CELEBRATE, SoundEvents.ENTITY_PILLAGER_AMBIENT,
			SoundEvents.ENTITY_PILLAGER_HURT, SoundEvents.EVENT_RAID_HORN };
	
	public MobiumOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
	{
		int randVal = rand.nextInt(100);
		
		if(randVal < 5)
		{			
			worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), SOUND_EVENTS[rand.nextInt(SOUND_EVENTS.length)], SoundCategory.MASTER, 2, rand.nextFloat() + 0.5f, false);
		}
		else if(randVal < 10)
		{
			worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), Util.getRandom(ForgeRegistries.SOUND_EVENTS.getValues(), rand).get(), SoundCategory.MASTER, .5f, rand.nextFloat() + 0.5f, false);
		}
	}
}
