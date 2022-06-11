package de.budschie.worseores.events;

import java.util.Random;

import de.budschie.worseores.blocks.BlockRegistry;
import de.budschie.worseores.entity.TripleHeadedSheepEntity;
import de.budschie.worseores.items.ItemRegistry;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.TickEvent.Phase;
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
		if(event.getSource().getEntity() instanceof Player)
		{
			Player casted = (Player) event.getSource().getEntity();
			
			if((casted.getInventory().countItem(ItemRegistry.NOFITE_ORE.get()) > 0 || casted.getInventory().countItem(ItemRegistry.NOFITE_INGOT.get()) > 0 || casted.getInventory().countItem(ItemRegistry.NOFITE_SWORD.get()) > 0) && !casted.isCreative())
				event.setCanceled(true);
		}
		else if(event.getSource().getEntity() instanceof TripleHeadedSheepEntity)
		{
			((TripleHeadedSheepEntity)event.getSource().getEntity()).playSound(SoundEvents.DONKEY_EAT, 1, 0.55f);
			((TripleHeadedSheepEntity)event.getSource().getEntity()).playSound(SoundEvents.DONKEY_EAT, 1, 0.95f);
			((TripleHeadedSheepEntity)event.getSource().getEntity()).playSound(SoundEvents.DONKEY_EAT, 1, 1.55f);
		}
	}
	
	@SubscribeEvent
	public static void serverTickEvent(ServerTickEvent event)
	{
		if(event.phase == Phase.START && event.side == LogicalSide.SERVER && new Random(System.currentTimeMillis()).nextInt(300) == 0)
		{
			ServerSetup.server.getPlayerList().getPlayers().forEach(player ->
			{
				if(player.getInventory().countItem(ItemRegistry.KILLIUM_ORE.get()) > 0)
					player.hurt(DamageSource.MAGIC, 69420);
			});
		}
	}
	
	@SubscribeEvent
	public static void onBlockBroken(BreakEvent event)
	{
		if(event.getState().getBlock() == BlockRegistry.RANDOMIUM_ORE.get() || event.getState().getBlock() == BlockRegistry.DEEPSLATE_RANDOMIUM_ORE.get())
		{
			event.setCanceled(true);
			Block[] blocks = new Block[] { BlockRegistry.ALOTOSTUFFIUM_ORE.get(), BlockRegistry.COPPER_ORE.get(), BlockRegistry.AMADEUM_ORE.get(), BlockRegistry.APPETITE_ORE.get(), BlockRegistry.ENDERITE_ORE.get(), BlockRegistry.EXPLODEMITE_ORE.get(), BlockRegistry.IDLIKEABITE_ORE.get(), BlockRegistry.SMITEANDLITE_ORE.get(), BlockRegistry.NOFITE_ORE.get(), BlockRegistry.KILLIUM_ORE.get(), BlockRegistry.RANDOMIUM_ORE.get(), BlockRegistry.MEMENITE_ORE.get(), BlockRegistry.LITEINNITE_ORE.get(), BlockRegistry.BESTFORGE_ORE.get() };
			
			// This kind of randomness is intentional muhahahahahhhhhaaaaa
			event.getWorld().setBlock(event.getPos(), blocks[new Random(event.getPos().asLong()).nextInt(blocks.length)].defaultBlockState(), 3);
		}
	}
	
	@SubscribeEvent
	public static void onEntityJoinsWorld(EntityJoinWorldEvent event)
	{
		if(event.getEntity() instanceof ItemEntity)
		{
			ItemEntity casted = (ItemEntity) event.getEntity();
			
			if(casted.getItem().getItem() == ItemRegistry.NOFITE_INGOT.get() || casted.getItem().getItem() == ItemRegistry.NOFITE_ORE.get() || casted.getItem().getItem() == ItemRegistry.NOFITE_SWORD.get())
				casted.setNoPickUpDelay();
		}
	}
}
