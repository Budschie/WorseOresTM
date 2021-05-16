package de.budschie.worseores.events;

import java.util.Random;

import de.budschie.worseores.blocks.BlockRegistry;
import de.budschie.worseores.items.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.TickEvent.ServerTickEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class Events
{
	@SubscribeEvent
	public static void onLivingEntityAttacked(LivingDamageEvent event)
	{
		if(event.getSource().getTrueSource() instanceof PlayerEntity)
		{
			PlayerEntity casted = (PlayerEntity) event.getSource().getTrueSource();
			
			if((casted.inventory.count(ItemRegistry.NOFITE_ORE.get()) > 0 || casted.inventory.count(ItemRegistry.NOFITE_INGOT.get()) > 0 || casted.inventory.count(ItemRegistry.NOFITE_SWORD.get()) > 0) && !casted.isCreative())
				event.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public static void serverTickEvent(ServerTickEvent event)
	{
		if(event.side == LogicalSide.SERVER && new Random(System.currentTimeMillis()).nextInt(300) == 0)
		{
			ServerSetup.server.getPlayerList().getPlayers().forEach(player ->
			{
				if(player.inventory.count(ItemRegistry.KILLIUM_ORE.get()) > 0)
					player.attackEntityFrom(DamageSource.MAGIC, 69420);
			});
		}
	}
	
	@SubscribeEvent
	public static void onBlockBroken(BreakEvent event)
	{
		if(event.getState().getBlock() == BlockRegistry.RANDOMIUM_ORE.get())
		{
			event.setCanceled(true);
			Block[] blocks = new Block[] { BlockRegistry.ALOTOSTUFFIUM_ORE.get(), BlockRegistry.COPPER_ORE.get(), BlockRegistry.AMADEUM_ORE.get(), BlockRegistry.APPETITE_ORE.get(), BlockRegistry.ENDERITE_ORE.get(), BlockRegistry.EXPLODEMITE_ORE.get(), BlockRegistry.IDLIKEABITE_ORE.get(), BlockRegistry.SMITEANDLITE_ORE.get(), BlockRegistry.NOFITE_ORE.get(), BlockRegistry.KILLIUM_ORE.get(), BlockRegistry.RANDOMIUM_ORE.get(), BlockRegistry.MEMENITE_ORE.get(), BlockRegistry.LITEINNITE_ORE.get(), BlockRegistry.BESTFORGE_ORE.get() };
			
			// This kind of randomness is intentional muhahahahahhhhhaaaaa
			event.getWorld().setBlockState(event.getPos(), blocks[new Random(event.getPos().toLong()).nextInt(blocks.length)].getDefaultState(), 3);
		}
	}
	
	@SubscribeEvent
	public static void onEntityJoinsWorld(EntityJoinWorldEvent event)
	{
		if(event.getEntity() instanceof ItemEntity)
		{
			ItemEntity casted = (ItemEntity) event.getEntity();
			
			if(casted.getItem().getItem() == ItemRegistry.NOFITE_INGOT.get() || casted.getItem().getItem() == ItemRegistry.NOFITE_ORE.get() || casted.getItem().getItem() == ItemRegistry.NOFITE_SWORD.get())
				casted.setNoPickupDelay();
		}
	}
}
