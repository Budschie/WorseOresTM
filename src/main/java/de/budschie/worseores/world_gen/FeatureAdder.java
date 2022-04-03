package de.budschie.worseores.world_gen;

import de.budschie.worseores.References;
import de.budschie.worseores.blocks.BlockRegistry;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome.BiomeCategory;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class FeatureAdder
{
	public static ConfiguredFeature<?, ?> COPPER_FEATURE = null; //
	public static ConfiguredFeature<?, ?> ALOTOSTUFFIUM_FEATURE = null; //
	public static ConfiguredFeature<?, ?> AMADEUM_FEATURE = null; //
	public static ConfiguredFeature<?, ?> APPETITE_FEATURE = null; //
	public static ConfiguredFeature<?, ?> ENDERITE_FEATURE = null;
	public static ConfiguredFeature<?, ?> EXPLODEMITE_FEATURE = null;
	public static ConfiguredFeature<?, ?> IDLIKEABITE_FEATURE = null;
	public static ConfiguredFeature<?, ?> SMITEANDLITE_FEATURE = null;
	public static ConfiguredFeature<?, ?> NOFITE_FEATURE = null;
	public static ConfiguredFeature<?, ?> KILLIUM_FEATURE = null;
	public static ConfiguredFeature<?, ?> RANDOMIUM_FEATURE = null;
	public static ConfiguredFeature<?, ?> MEMENITE_ORE = null;
	public static ConfiguredFeature<?, ?> LITEINNITE_ORE = null;
	public static ConfiguredFeature<?, ?> BESTFORGE_ORE = null;
	public static ConfiguredFeature<?, ?> DOGECOIN_ORE = null;
	public static ConfiguredFeature<?, ?> MOBIUM_ORE = null;
	public static ConfiguredFeature<?, ?> DREAMIUM_ORE = null;
	public static ConfiguredFeature<?, ?> DIAMOND_ORE = null;
	public static ConfiguredFeature<?, ?> TRIPLITE_ORE = null;
	
	public static void addFeatures()
	{
		COPPER_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "copper_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.COPPER_ORE.get().defaultBlockState(), 12)).range(64).squared().count(4));
		
		ALOTOSTUFFIUM_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "alotostuffium_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.ALOTOSTUFFIUM_ORE.get().defaultBlockState(), 7)).range(48).squared().count(3));
		
		AMADEUM_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "amadeum_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.AMADEUM_ORE.get().defaultBlockState(), 5)).range(48).squared().count(1));
		
		APPETITE_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "appetite_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(new BlockMatchTest(Blocks.SAND), BlockRegistry.APPETITE_ORE.get().defaultBlockState(), 5)).range(128).squared().count(5));
		
		ENDERITE_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "enderite_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.ENDERITE_ORE.get().defaultBlockState(), 4)).range(64).squared().count(2));
		
		EXPLODEMITE_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "explodemite_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.EXPLODEMITE_ORE.get().defaultBlockState(), 7)).range(64).squared().count(3));
		
		IDLIKEABITE_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "idlikeabite_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.IDLIKEABITE_ORE.get().defaultBlockState(), 10)).range(64).squared().count(3));
		
		SMITEANDLITE_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "smiteandlite_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.SMITEANDLITE_ORE.get().defaultBlockState(), 5)).range(64).squared().count(2));
		
		NOFITE_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "nofite_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.NOFITE_ORE.get().defaultBlockState(), 5)).range(40).squared().count(2));
		
		KILLIUM_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "killium_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.KILLIUM_ORE.get().defaultBlockState(), 5)).range(40).squared().count(2));
		
		RANDOMIUM_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "randomium_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.RANDOMIUM_ORE.get().defaultBlockState(), 3)).range(64).squared().count(4));
		
		MEMENITE_ORE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "memenite_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.MEMENITE_ORE.get().defaultBlockState(), 5)).range(20).squared().count(1));
		
		LITEINNITE_ORE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "liteinnite_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.LITEINNITE_ORE.get().defaultBlockState(), 10)).range(64).squared().count(3));
		
		BESTFORGE_ORE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "bestforge_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.BESTFORGE_ORE.get().defaultBlockState(), 5)).range(18).squared().count(1));
	
		DOGECOIN_ORE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "dogecoin_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.DOGECOIN_ORE.get().defaultBlockState(), 5)).range(64).squared().count(2));
	
		MOBIUM_ORE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "mobium_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.MOBIUM_ORE.get().defaultBlockState(), 10)).range(32).squared().count(5).chance(20));
		
		DREAMIUM_ORE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "dreamium_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.DREAMIUM_ORE.get().defaultBlockState(), 5)).range(64).squared().count(3));
		
		DIAMOND_ORE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "diamond_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.DIAMOND_ORE.get().defaultBlockState(), 8)).range(16).squared().count(3));
		
		TRIPLITE_ORE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "triplite_ore_feature"), 
				Feature.ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NATURAL_STONE, BlockRegistry.TRIPLITE_ORE.get().defaultBlockState(), 6)).range(64).squared().count(3));
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
}
