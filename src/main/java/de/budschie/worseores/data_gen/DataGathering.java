package de.budschie.worseores.data_gen;

import de.budschie.worseores.References;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(bus = Bus.MOD)
public class DataGathering
{
	@SubscribeEvent
	public static void onDataGathering(GatherDataEvent event)
	{
		event.getGenerator().addProvider(new ModBlockTagsProvider(event.getGenerator(), References.MODID, event.getExistingFileHelper()));
	}
}
