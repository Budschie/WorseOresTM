package de.budschie.worseores.events;

import net.minecraft.server.MinecraftServer;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

@EventBusSubscriber(bus = Bus.FORGE)
public class ServerSetup
{
	public static MinecraftServer server;
	
	@SubscribeEvent
	public static void onServerSetup(FMLServerStartingEvent event)
	{
		server = event.getServer();
	}
}
