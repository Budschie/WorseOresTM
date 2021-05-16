package de.budschie.worseores.blocks;

import java.util.Random;
import java.util.UUID;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.Explosion.Mode;
import net.minecraft.world.ExplosionContext;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class DogecoinOre extends Block
{
	public DogecoinOre(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player)
	{
		if(!worldIn.isRemote && player.getHeldItemMainhand().getToolTypes().contains(ToolType.PICKAXE) && !player.isCreative())
		{
			Random rand = new Random(System.currentTimeMillis());
			int randomNumb = rand.nextInt(100);
			
			player.sendMessage(new StringTextComponent(TextFormatting.BLUE + "Processing transaction..."), new UUID(0, 0));
			
			if(randomNumb < 2)
			{
				worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(() -> Items.NETHERITE_INGOT, 4)));
				player.sendMessage(new StringTextComponent(TextFormatting.GREEN + "Yay :) The bitcoin value has risen during the transaction. You've made a profit."), new UUID(0, 0));
			}
			else
			{
				int badEvent = rand.nextInt(100);
				
				if(badEvent < 25)
				{
					player.sendMessage(new StringTextComponent(TextFormatting.RED + "Oh no :( The dogecoin value was shrinking during the transaction. As you approach bankruptcy, your pickaxe has been distrained."), new UUID(0, 0));
					
					player.setHeldItem(Hand.MAIN_HAND, ItemStack.EMPTY);
				}
				else if(badEvent < 50)
				{
					worldIn.setBlockState(player.getPosition(), Blocks.LAVA.getDefaultState());
					
					if(rand.nextBoolean())
						player.sendMessage(new StringTextComponent(TextFormatting.RED + "Oh no :( Elon musk has teleported lava at your location."), new UUID(0, 0));
					else
						player.sendMessage(new StringTextComponent(TextFormatting.RED + "Oh no :( Your computer melt to lava whilst trying to mine dogecoin."), new UUID(0, 0));
				}
				else if(badEvent < 95)
				{
					worldIn.createExplosion(null, DamageSource.causeBedExplosionDamage(), new ExplosionContext(), pos.getX(), pos.getY(), pos.getZ(), 10, true, Mode.DESTROY);
					
					if(rand.nextBoolean())
						player.sendMessage(new StringTextComponent(TextFormatting.RED + "Oh no :( Elon musk has yeeted a rocket at you."), new UUID(0, 0));
					else
						player.sendMessage(new StringTextComponent(TextFormatting.RED + "Oh no :( Your computer exploded whilst trying to mine dogecoin."), new UUID(0, 0));
				}
				else
				{
					player.sendMessage(new StringTextComponent(TextFormatting.WHITE + "-_- Nothing happened..."), new UUID(0, 0));
				}
			}
		}
		
		super.onBlockHarvested(worldIn, pos, state, player);
	}
}
