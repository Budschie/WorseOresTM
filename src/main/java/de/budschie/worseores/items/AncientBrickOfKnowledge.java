package de.budschie.worseores.items;

import de.budschie.worseores.gui.GuideBookScreen;
import de.budschie.worseores.gui.GuideBookScreen.GuideBookPage;
import net.minecraft.ChatFormatting;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AncientBrickOfKnowledge extends Item
{
	public static IGuiInterface guiInterface = null;
	
	public static final GuideBookPage[] GUIDE_PAGES = new GuideBookScreen.GuideBookPage[]{
			new GuideBookScreen.GuideBookPage("Bestforge Ore", ItemRegistry.BESTFORGE_ORE.get(), 
			new String[] {"This ore is a far cousin", "and much dumber than", "the Crashium ore, which", "finally descended to", "godhood after 7 years.",  "Crashium has since ex-", "plored many multiverses", "and is currently solving", "the mystery of why", "Mojang hardcodes so", "many things."}),
			new GuideBookPage("Copper Ore", ItemRegistry.COPPER_ORE.get(), new String[] {ChatFormatting.OBFUSCATED + "This is just a regular", ChatFormatting.OBFUSCATED + "copper ore. It may exist", ChatFormatting.OBFUSCATED + "in 25 other mods,", ChatFormatting.OBFUSCATED + "but I don't care as this", ChatFormatting.OBFUSCATED + "is the best copper ore", ChatFormatting.OBFUSCATED + "ever to be created", ChatFormatting.OBFUSCATED + "in any mod.", "", ChatFormatting.DARK_GREEN + "A remnant of", ChatFormatting.DARK_GREEN + "long-gone ages."}),
			new GuideBookPage("Alotostuffium Ore", ItemRegistry.ALOTOSTUFFIUM_ORE.get(), new String[] {"This ore is extremely", "rare, as it is just", "plain broken in the", "endgame. You can", "create blocks out of", "its shards, and if", "you compress those", "blocks, you get", "really powerful armor", "and tools.", "", "So, what are you waiting", "for? Grab your pickaxe", "create hidden caches", "and mine this ore."}),
			new GuideBookPage("Amadeum Ore", ItemRegistry.AMADEUM_ORE.get(), new String[] {"This is a very musical ore.", "It is a multitalent, and", "can play multiple", "instruments. Although this", "ore is very talented,", "it still has ryhtmic issues.", "", "If you listen closely,", "you might even hear", "Mozart\'s \"Requiem\"."}),
			new GuideBookPage("Appetite Ore", ItemRegistry.APPETITE_ORE.get(), new String[] {"This is just a delicious", "piece of sand.", "", "Do not worry, eating", "sand is not that", "unhealthy.", "(I think)", "So, why not try it out", "now?"}),
			new GuideBookPage("Explodemite Ore", ItemRegistry.EXPLODEMITE_ORE.get(), new String[] {"This ore gets angry", "really easily.", "So, watch out and", ChatFormatting.BOLD + "DO NOT BREAK IT!"}),
			new GuideBookPage("Enderite Ore", ItemRegistry.ENDERITE_ORE.get(), new String[] {"The Enderite Ore is a", "really interesting ore.", "It is so powerful,", "that it can control", "time and space. It also", "hates being collected", "and harvested, so it may", "teleport you ", ChatFormatting.BOLD + "420 Blocks" + ChatFormatting.RESET +  " into the air."}),
			new GuideBookPage("Idlikeabite Ore", ItemRegistry.IDLIKEABITE_ORE.get(), new String[] {"Mmmmhh... This looks", "like Chocolate.", "You should give it a try.", "", "This is remembering me of", "something else though.", "Sadly, I can't remember", "what this is reminding", "me of...", "", ":("}),
			new GuideBookPage("Nofite Ore", ItemRegistry.NOFITE_ORE.get(), new String[] {"This ore is a pacifist.", "It doesn't like it", "when there is violence", "in the world, so it", "actively prevents it,", "and it will make sure", "that " + ChatFormatting.DARK_GREEN + ChatFormatting.UNDERLINE + "you" + ChatFormatting.RESET + " will become", "a pacifist too!"}),
			new GuideBookPage("Killium Ore", ItemRegistry.KILLIUM_ORE.get(), new String[] {"This is harald.", "Harald, also known as", ChatFormatting.RED + ChatFormatting.BOLD.toString() + ChatFormatting.ITALIC + ChatFormatting.UNDERLINE + "KILLIUM" + ChatFormatting.RESET + " is the evil twin", "of Nofite.", "", "What this means, you ask?", "I wont tell you, as", "rumours are that just", "mentioning its name", "can have fatal", "consequences."}),
			new GuideBookPage("Randomium Ore", ItemRegistry.RANDONIUM_ORE.get(), new String[] {"This ore is the", "manifestation of ", ChatFormatting.BOLD.toString() + ChatFormatting.UNDERLINE + ChatFormatting.UNDERLINE + ChatFormatting.OBFUSCATED + ChatFormatting.STRIKETHROUGH + "ushallnotread424242" + ChatFormatting.RESET + ".", "It's origins are unknown,", "but some say that it was", "the byproduct of an", "experiment of Crashium", "about " + ChatFormatting.OBFUSCATED + "pumpkins" + ChatFormatting.RESET + "."}),
			new GuideBookPage("Memenite Ore", ItemRegistry.MEMENITE_ORE.get(), new String[] {"u mad?"}),
			new GuideBookPage("Liteinnite Ore", ItemRegistry.LITEINNITE_ORE.get(), new String[] {"This ore is so bright,", "it radiates almost", "as much as a", "nuclear power plant.", "", "It is a really good", "decoration for your", "home."}),
			new GuideBookPage("Smiteandlite Ore", ItemRegistry.SMITEANDLITE_ORE.get(), new String[] {"This ore is sponsored by", ChatFormatting.DARK_AQUA + "Zeus" + ChatFormatting.RESET + ", the god of lightning", "and thunder.", "", "If you ever wanted that", "somebody should be", "struck by a lightning, well", "then your time has come.", ChatFormatting.DARK_AQUA + "Zeus" + ChatFormatting.RESET + " has currently an " + ChatFormatting.RED + "u-", ChatFormatting.RED + "nique" + ChatFormatting.RESET + " discount on lightning", "assassinations. Just use", "the promo code " + ChatFormatting.DARK_GREEN + ChatFormatting.UNDERLINE + ChatFormatting.ITALIC + "\"Boom\"" + ChatFormatting.RESET + " for", "a " + ChatFormatting.LIGHT_PURPLE + "20%" + ChatFormatting.RESET + " discount. After this", "short ad break, let's talk", "about that fact that you", "obviously didn't install", "an adblocker for", "minecraft. " + ChatFormatting.BOLD + ChatFormatting.BLUE + "NOOB."}),
			new GuideBookPage("Dogecoin Ore", ItemRegistry.DOGECOIN_ORE.get(), new String[] {"Did you ever invest in", "cryptocurrencies?", "", "Well, no matter the", "answer, you should know", "that buying dogecoin", "always pays off!", "", "You want 5 Million", "dollars?", "", "Just mine dogecoin (ore).", "It's that simple."}),
			new GuideBookPage("Mobium Ore", ItemRegistry.MOBIUM_ORE.get(), new String[] {"This ore remembers", "every single sound", "in the game,", "and it wants everyone to", "know this.", "", "Pretty impressive, right?"}),
			new GuideBookPage("Dreamium Ore", ItemRegistry.DREAMIUM_ORE.get(), new String[] {"Dream didn't cheat.", "", "Or did he?", "", "*VSauce music*"}),
			new GuideBookPage("Deepslate Diamond Ore", ItemRegistry.DEEPSLATE_DIAMOND_ORE.get(), new String[] {"Just a regular and shiny", ChatFormatting.DARK_AQUA + "Diamond!", "", "At least I think."}),
			new GuideBookPage("Just Stone", ItemRegistry.TRIPLITE_ORE.get(), new String[] {"This ore is", "just a variation", "of stone.", "", "It looks good, doesn't it?"}),
			new GuideBookPage("Laggerite", ItemRegistry.LAGGERITE_ORE.get(), new String[] {"This ore " + ChatFormatting.ITALIC + "always", "thinks before doing", ChatFormatting.UNDERLINE.toString() + ChatFormatting.BOLD + "literally anything.", "", "Because thinking is", "important to this ore,", "it will take its time,", "and it will make sure", "that you will take", "a break too to think about", "whether you should mine", "this ore or not."})
	};
	
	public AncientBrickOfKnowledge(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn)
	{
		if(worldIn.isClientSide)
			guiInterface.displayAncientBrickGui();
		
		return super.use(worldIn, playerIn, handIn);
	}
}
