package de.budschie.worseores.events;

import de.budschie.worseores.entity.EntityRegistry;
import de.budschie.worseores.entity.rendering.TripleHeadedSheepRenderer;
import de.budschie.worseores.gui.GuideBookScreen;
import de.budschie.worseores.items.AncientBrickOfKnowledge;
import de.budschie.worseores.items.IGuiInterface;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(bus = Bus.MOD, value = Dist.CLIENT)
public class ClientSetup
{
	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event)
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityRegistry.TRIPLE_HEADED_SHEEP.get(), manager -> new TripleHeadedSheepRenderer(manager));
		
		AncientBrickOfKnowledge.guiInterface = new IGuiInterface()
		{
			@Override
			public void displayAncientBrickGui()
			{
				Minecraft.getInstance().displayGuiScreen(new GuideBookScreen(AncientBrickOfKnowledge.GUIDE_PAGES));
			}
		};
	}
}
