package de.budschie.worseores.items;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.ChatFormatting;
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
			event.getToolTip().add(new TextComponent(ChatFormatting.LIGHT_PURPLE + "A very powerful shard, especially in the endgame."));
			event.getToolTip().add(new TextComponent(ChatFormatting.LIGHT_PURPLE + "If you compress it down really hard, you can create powerful armor."));
		}
		else if(event.getItemStack().getItem() == ItemRegistry.COMPRESSED_ALOTOSTUFFIUM.get())
		{
			event.getToolTip().add(new TextComponent(ChatFormatting.RED + "You have to compress this item further to use this as a material."));
		}
		else if(event.getItemStack().getItem() == ItemRegistry.ANCIENT_BRICK_OF_KNOWLEDGE.get())
		{
			event.getToolTip().add(new TextComponent(ChatFormatting.DARK_PURPLE + "Careful with this thing! It contains ancient knowledge."));
			event.getToolTip().add(new TextComponent(""));
			event.getToolTip().add(new TextComponent(ChatFormatting.DARK_PURPLE + "And a certain \"Book Of Ums and Ites\"."));
			event.getToolTip().add(new TextComponent(""));
			event.getToolTip().add(new TextComponent(ChatFormatting.DARK_PURPLE + "Oh damn it! You spilled water all over the brick."));
			event.getToolTip().add(new TextComponent(ChatFormatting.DARK_PURPLE + "Now you can't read anything except of the Book Of Ums and Ites."));
		}
	}
}
