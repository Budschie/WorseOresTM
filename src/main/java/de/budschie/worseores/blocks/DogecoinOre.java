package de.budschie.worseores.blocks;

import java.util.Random;
import java.util.UUID;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion.BlockInteraction;
import net.minecraft.world.level.ExplosionDamageCalculator;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class DogecoinOre extends Block
{
	public DogecoinOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void playerWillDestroy(Level worldIn, BlockPos pos, BlockState state, Player player)
	{
		if(!worldIn.isClientSide && player.getItemInHand(InteractionHand.MAIN_HAND).isCorrectToolForDrops(state) && !player.isCreative())
		{
			Random rand = new Random(System.currentTimeMillis());
			int randomNumb = rand.nextInt(100);
			
			player.sendMessage(new TextComponent(ChatFormatting.BLUE + "Processing transaction..."), new UUID(0, 0));
			
			if(randomNumb < 2)
			{
				worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(() -> Items.NETHERITE_INGOT, 4)));
				player.sendMessage(new TextComponent(ChatFormatting.GREEN + "Yay :) The bitcoin value has risen during the transaction. You've made a profit."), new UUID(0, 0));
			}
			else
			{
				int badEvent = rand.nextInt(100);
				
				if(badEvent < 25)
				{
					player.sendMessage(new TextComponent(ChatFormatting.RED + "Oh no :( The dogecoin value was shrinking during the transaction. As you approach bankruptcy, your pickaxe has been distrained."), new UUID(0, 0));
					
					player.setItemInHand(InteractionHand.MAIN_HAND, ItemStack.EMPTY);
				}
				else if(badEvent < 50)
				{
					worldIn.setBlockAndUpdate(player.blockPosition(), Blocks.LAVA.defaultBlockState());
					
					if(rand.nextBoolean())
						player.sendMessage(new TextComponent(ChatFormatting.RED + "Oh no :( Elon musk has teleported lava at your location."), new UUID(0, 0));
					else
						player.sendMessage(new TextComponent(ChatFormatting.RED + "Oh no :( Your computer melt to lava whilst trying to mine dogecoin."), new UUID(0, 0));
				}
				else if(badEvent < 95)
				{
					worldIn.explode(null, DamageSource.badRespawnPointExplosion(), new ExplosionDamageCalculator(), pos.getX(), pos.getY(), pos.getZ(), 10, true, BlockInteraction.DESTROY);
					
					if(rand.nextBoolean())
						player.sendMessage(new TextComponent(ChatFormatting.RED + "Oh no :( Elon musk has yeeted a rocket at you."), new UUID(0, 0));
					else
						player.sendMessage(new TextComponent(ChatFormatting.RED + "Oh no :( Your computer exploded whilst trying to mine dogecoin."), new UUID(0, 0));
				}
				else
				{
					player.sendMessage(new TextComponent(ChatFormatting.WHITE + "-_- Nothing happened..."), new UUID(0, 0));
				}
			}
		}
		
		super.playerWillDestroy(worldIn, pos, state, player);
	}
}
