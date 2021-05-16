package de.budschie.worseores.items;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(value = Dist.CLIENT)
public class ToolTipEvents
{
	@SubscribeEvent
	public static void onAddedInfo(ItemTooltipEvent event)
	{
		if(event.getItemStack().getItem() == ItemRegistry.ALOTOSTUFFIUM_SHARD.get())
		{
			event.getToolTip().add(new StringTextComponent(TextFormatting.LIGHT_PURPLE + "A very powerful shard, especially in the endgame."));
			event.getToolTip().add(new StringTextComponent(TextFormatting.LIGHT_PURPLE + "If you compress it down really hard, you can create powerful armor."));
		}
		else if(event.getItemStack().getItem() == ItemRegistry.COMPRESSED_ALOTOSTUFFIUM.get())
		{
			event.getToolTip().add(new StringTextComponent(TextFormatting.RED + "You have to compress this item further to use this as a material."));
		}
	}
}
