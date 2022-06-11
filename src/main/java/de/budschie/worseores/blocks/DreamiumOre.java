package de.budschie.worseores.blocks;

import java.util.Random;
import java.util.UUID;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;

public class DreamiumOre extends Block
{
	private static final String DREAM_PREFIX = ChatFormatting.WHITE + "<" + ChatFormatting.GREEN + "Dream" + ChatFormatting.RESET + "> ";
	private static final String DREAM_FAN_PREFIX = ChatFormatting.WHITE + "<" + ChatFormatting.GREEN + "xXDream_Fan69Xx" + ChatFormatting.RESET + "> ";
	
	public DreamiumOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid)
	{
		if(level.isClientSide)
		{
			if(player.getItemInHand(InteractionHand.MAIN_HAND).isCorrectToolForDrops(state) && !player.isCreative())
			{
				Random rand = new Random();
				
				int randMsg = rand.nextInt(130);
				
				if(randMsg < 30)
				{
					player.sendMessage(new TextComponent(DREAM_PREFIX + "Yeah those researchers were really unexperienced. I mean, they were total noobs. I am not lucky. Look, I can mine this ore in vanilla, and it drops ender pearls and blaze rods."), new UUID(0, 0));
				}
				else if(randMsg < 40)
				{
					player.sendMessage(new TextComponent(DREAM_PREFIX + "GG EZ. OMG I'm so good in time. Man, luck's on my side."), new UUID(0, 0));
				}
				else if(randMsg < 60)
				{
					player.sendMessage(new TextComponent(DREAM_PREFIX + "Whaddaya mean its one in a billion? That's a total lie. That these items drop is extremely likely to happen. You see, if two million people would play minecraft simultaneously for all eternity, the chance that one of them gets good drops is about 100%. See, it's that easy. Dunno how they messed this up."), new UUID(0, 0));
				}
				else if(randMsg < 70)
				{
					player.sendMessage(new TextComponent(DREAM_FAN_PREFIX + "Shut up. Dream didn't cheat. He said it himself."), new UUID(0, 0));
				}
				else if(randMsg < 80)
				{
					player.sendMessage(new TextComponent(DREAM_FAN_PREFIX + "Dream cheated. So what. It's just a game."), new UUID(0, 0));
				}
				else if(randMsg < 90)
				{
					player.sendMessage(new TextComponent(DREAM_FAN_PREFIX + "Even if Dream cheated and discredited half of the whole speedrun community who do the checking of runs voluntarily, I still like his content."), new UUID(0, 0));
				}
				else if(randMsg < 100)
				{
					player.sendMessage(new TextComponent(DREAM_FAN_PREFIX + "DREAM. DIDN'T. CHEAT. HE SAID IT HIMSELF YOU IDIOT."), new UUID(0, 0));
				}
				else if(randMsg < 110)
				{
					player.sendMessage(new TextComponent(DREAM_FAN_PREFIX + "Shut up you ************. You don't even come close to his likes and subscribers on YouTube."), new UUID(0, 0));
				}
				else if(randMsg < 120)
				{
					player.sendMessage(new TextComponent(DREAM_PREFIX + "I contacted Albert Einstein with an Ouija board, and he gave me this very scientific paper. It says that I'm right."), new UUID(0, 0));
				}
				else
				{
					player.sendMessage(new TextComponent(DREAM_PREFIX + "I contacted an anonymous science-dude and gave him money, " + ChatFormatting.STRIKETHROUGH + "so that he says that I'm right" + ChatFormatting.RESET + " so that he proofs that I didn't cheat."), new UUID(0, 0));
				}
			}
		}
		
		return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
	}
}
