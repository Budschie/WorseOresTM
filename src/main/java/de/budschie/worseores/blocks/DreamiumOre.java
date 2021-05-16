package de.budschie.worseores.blocks;

import java.util.Random;
import java.util.UUID;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class DreamiumOre extends Block
{
	private static final String DREAM_PREFIX = TextFormatting.WHITE + "<" + TextFormatting.GREEN + "Dream" + TextFormatting.RESET + "> ";
	private static final String DREAM_FAN_PREFIX = TextFormatting.WHITE + "<" + TextFormatting.GREEN + "xXDream_Fan69Xx" + TextFormatting.RESET + "> ";
	
	public DreamiumOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player)
	{
		if(worldIn.isRemote)
		{
			if(player.getHeldItem(Hand.MAIN_HAND).getToolTypes().contains(ToolType.PICKAXE) && !player.isCreative())
			{
				Random rand = new Random(System.currentTimeMillis());
				
				int randMsg = rand.nextInt(130);
				
				if(randMsg < 30)
				{
					player.sendMessage(new StringTextComponent(DREAM_PREFIX + "Yeah those researchers were really unexperienced. I mean, they were total noobs. I am not lucky. Look, I can mine this ore in vanilla, and it drops ender pearls and blaze rods."), new UUID(0, 0));
				}
				else if(randMsg < 40)
				{
					player.sendMessage(new StringTextComponent(DREAM_PREFIX + "GG EZ. OMG I'm so good in time. Man, luck's on my side."), new UUID(0, 0));
				}
				else if(randMsg < 60)
				{
					player.sendMessage(new StringTextComponent(DREAM_PREFIX + "Whaddaya mean its one in a billion? That's a total lie. That these items drop is extremely likely to happen. You see, if two million people would play minecraft simultaneously for all eternity, the chance that one of them gets good drops is about 100%. See, it's that easy. Dunno how they messed this up."), new UUID(0, 0));
				}
				else if(randMsg < 70)
				{
					player.sendMessage(new StringTextComponent(DREAM_FAN_PREFIX + "Shut up. Dream didn't cheat. He said it himself."), new UUID(0, 0));
				}
				else if(randMsg < 80)
				{
					player.sendMessage(new StringTextComponent(DREAM_FAN_PREFIX + "Dream cheated. So what. It's just a game."), new UUID(0, 0));
				}
				else if(randMsg < 90)
				{
					player.sendMessage(new StringTextComponent(DREAM_FAN_PREFIX + "Even if Dream cheated and discredited half of the whole speedrun community who do the checking of runs voluntarily, I still like his content."), new UUID(0, 0));
				}
				else if(randMsg < 100)
				{
					player.sendMessage(new StringTextComponent(DREAM_FAN_PREFIX + "DREAM. DIDN'T. CHEAT. HE SAID IT HIMSELF YOU IDIOT."), new UUID(0, 0));
				}
				else if(randMsg < 110)
				{
					player.sendMessage(new StringTextComponent(DREAM_FAN_PREFIX + "Shut up you ************. You don't even come close to his likes and subscribers on YouTube."), new UUID(0, 0));
				}
				else if(randMsg < 120)
				{
					player.sendMessage(new StringTextComponent(DREAM_PREFIX + "I contacted Albert Einstein with an Ouija board, and he gave me this very scientific paper. It says that I'm right."), new UUID(0, 0));
				}
				else
				{
					player.sendMessage(new StringTextComponent(DREAM_PREFIX + "I contacted an anonymous science-dude and gave him money, " + TextFormatting.STRIKETHROUGH + "so that he says that I'm right" + TextFormatting.RESET + " so that he proofs that I didn't cheat."), new UUID(0, 0));
				}
			}
		}
		
		super.onBlockHarvested(worldIn, pos, state, player);
	}
}
