package de.budschie.worseores.world_gen;

import java.util.Arrays;

import de.budschie.worseores.References;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome.BiomeCategory;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class PlacedFeatureRegistry
{
	public static Holder<PlacedFeature> COPPER_FEATURE = null; //
	public static Holder<PlacedFeature> ALOTOSTUFFIUM_FEATURE = null; //
	public static Holder<PlacedFeature> AMADEUM_FEATURE = null; //
	public static Holder<PlacedFeature> APPETITE_FEATURE = null; //
	public static Holder<PlacedFeature> ENDERITE_FEATURE = null;
	public static Holder<PlacedFeature> EXPLODEMITE_FEATURE = null;
	public static Holder<PlacedFeature> IDLIKEABITE_FEATURE = null;
	public static Holder<PlacedFeature> SMITEANDLITE_FEATURE = null;
	public static Holder<PlacedFeature> NOFITE_FEATURE = null;
	public static Holder<PlacedFeature> KILLIUM_FEATURE = null;
	public static Holder<PlacedFeature> RANDOMIUM_FEATURE = null;
	public static Holder<PlacedFeature> MEMENITE_ORE = null;
	public static Holder<PlacedFeature> LITEINNITE_ORE = null;
	public static Holder<PlacedFeature> BESTFORGE_ORE = null;
	public static Holder<PlacedFeature> DOGECOIN_ORE = null;
	public static Holder<PlacedFeature> MOBIUM_ORE = null;
	public static Holder<PlacedFeature> DREAMIUM_ORE = null;
	public static Holder<PlacedFeature> DIAMOND_ORE = null;
	public static Holder<PlacedFeature> TRIPLITE_ORE = null;
	
	public static void addPlacedFeatures()
	{
		COPPER_FEATURE = registerRange(new ResourceLocation(References.MODID, "copper_ore"), FeatureRegistry.COPPER_FEATURE, 0, 60, 9);
		ALOTOSTUFFIUM_FEATURE = registerRange(new ResourceLocation(References.MODID, "alotofstuffium_ore"), FeatureRegistry.ALOTOSTUFFIUM_FEATURE, 8, 60, 6);
		AMADEUM_FEATURE = registerRange(new ResourceLocation(References.MODID, "amadeum_ore"), FeatureRegistry.AMADEUM_FEATURE, 0, 60, 7);
		APPETITE_FEATURE = registerRange(new ResourceLocation(References.MODID, "appetite_ore"), FeatureRegistry.APPETITE_FEATURE, 40, 80, 12);
		ENDERITE_FEATURE = registerRange(new ResourceLocation(References.MODID, "enderite_ore"), FeatureRegistry.ENDERITE_FEATURE, 0, 50, 8);
		EXPLODEMITE_FEATURE = registerRange(new ResourceLocation(References.MODID, "explodemite_ore"), FeatureRegistry.EXPLODEMITE_FEATURE, 0, 60, 7);
		IDLIKEABITE_FEATURE = registerRange(new ResourceLocation(References.MODID, "idlikeabite_ore"), FeatureRegistry.IDLIKEABITE_FEATURE, 0, 60, 9);
		SMITEANDLITE_FEATURE = registerRange(new ResourceLocation(References.MODID, "smiteandlite_ore"), FeatureRegistry.SMITEANDLITE_FEATURE, 30, 60, 8);
		NOFITE_FEATURE = registerRange(new ResourceLocation(References.MODID, "nofite_ore"), FeatureRegistry.NOFITE_FEATURE, 0, 60, 7);
		KILLIUM_FEATURE = registerRange(new ResourceLocation(References.MODID, "killium_ore"), FeatureRegistry.KILLIUM_FEATURE, 0, 60, 8);
		RANDOMIUM_FEATURE = registerRange(new ResourceLocation(References.MODID, "randomium_ore"), FeatureRegistry.RANDOMIUM_FEATURE, 0, 60, 10);
		MEMENITE_ORE = registerRange(new ResourceLocation(References.MODID, "memenite_ore"), FeatureRegistry.MEMENITE_ORE, 0, 60, 6);
		LITEINNITE_ORE = registerRange(new ResourceLocation(References.MODID, "liteinnite_ore"), FeatureRegistry.LITEINNITE_ORE, 0, 60, 8);
		BESTFORGE_ORE = registerRange(new ResourceLocation(References.MODID, "bestforge_ore"), FeatureRegistry.BESTFORGE_ORE, -60, 60, 12);
		DOGECOIN_ORE = registerRange(new ResourceLocation(References.MODID, "dogecoin_ore"), FeatureRegistry.DOGECOIN_ORE, 0, 48, 8);
		MOBIUM_ORE = registerRange(new ResourceLocation(References.MODID, "mobium_ore"), FeatureRegistry.MOBIUM_ORE, 0, 20, 4);
		DREAMIUM_ORE = registerRange(new ResourceLocation(References.MODID, "dreamium_ore"), FeatureRegistry.DREAMIUM_ORE, 0, 60, 8);
		DIAMOND_ORE = registerRange(new ResourceLocation(References.MODID, "diamond_ore"), FeatureRegistry.DIAMOND_ORE, 0, 60, 12);
		TRIPLITE_ORE = registerRange(new ResourceLocation(References.MODID, "triplite_ore"), FeatureRegistry.TRIPLITE_ORE, 0, 60, 8);
	}
	
	@SubscribeEvent
	public static void onBiomeLoading(BiomeLoadingEvent event)
	{
		if(event.getCategory() != BiomeCategory.THEEND && event.getCategory() != BiomeCategory.NETHER)
		{
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, COPPER_FEATURE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ALOTOSTUFFIUM_FEATURE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, AMADEUM_FEATURE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, APPETITE_FEATURE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, ENDERITE_FEATURE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, EXPLODEMITE_FEATURE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, IDLIKEABITE_FEATURE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, SMITEANDLITE_FEATURE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, NOFITE_FEATURE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, KILLIUM_FEATURE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, RANDOMIUM_FEATURE);
//			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, MEMENITE_ORE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, LITEINNITE_ORE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, BESTFORGE_ORE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, DOGECOIN_ORE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, MOBIUM_ORE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, DREAMIUM_ORE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, DIAMOND_ORE);
			event.getGeneration().addFeature(Decoration.UNDERGROUND_ORES, TRIPLITE_ORE);
		}
	}
	
	private static Holder<PlacedFeature> registerRange(ResourceLocation rl, Holder<ConfiguredFeature<?, ?>> featureBase, int from, int to, int count)
	{
		return registerPlacedFeature(rl, new PlacedFeature(featureBase, Arrays.asList(CountPlacement.of(count), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(from + 64), VerticalAnchor.aboveBottom(to + 64)))));
	}
	
	private static Holder<PlacedFeature> registerPlacedFeature(ResourceLocation rl, PlacedFeature feature)
	{
		return BuiltinRegistries.register(BuiltinRegistries.PLACED_FEATURE, rl, feature);
	}
}
