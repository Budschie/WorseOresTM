package de.budschie.worseores.world_gen;

import de.budschie.worseores.References;
import de.budschie.worseores.blocks.BlockRegistry;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;

public class FeatureRegistry
{
	public static Holder<ConfiguredFeature<?, ?>> COPPER_FEATURE = null; //
	public static Holder<ConfiguredFeature<?, ?>> ALOTOSTUFFIUM_FEATURE = null; //
	public static Holder<ConfiguredFeature<?, ?>> AMADEUM_FEATURE = null; //
	public static Holder<ConfiguredFeature<?, ?>> APPETITE_FEATURE = null; //
	public static Holder<ConfiguredFeature<?, ?>> ENDERITE_FEATURE = null;
	public static Holder<ConfiguredFeature<?, ?>> EXPLODEMITE_FEATURE = null;
	public static Holder<ConfiguredFeature<?, ?>> IDLIKEABITE_FEATURE = null;
	public static Holder<ConfiguredFeature<?, ?>> SMITEANDLITE_FEATURE = null;
	public static Holder<ConfiguredFeature<?, ?>> NOFITE_FEATURE = null;
	public static Holder<ConfiguredFeature<?, ?>> KILLIUM_FEATURE = null;
	public static Holder<ConfiguredFeature<?, ?>> RANDOMIUM_FEATURE = null;
	public static Holder<ConfiguredFeature<?, ?>> MEMENITE_ORE = null;
	public static Holder<ConfiguredFeature<?, ?>> LITEINNITE_ORE = null;
	public static Holder<ConfiguredFeature<?, ?>> BESTFORGE_ORE = null;
	public static Holder<ConfiguredFeature<?, ?>> DOGECOIN_ORE = null;
	public static Holder<ConfiguredFeature<?, ?>> MOBIUM_ORE = null;
	public static Holder<ConfiguredFeature<?, ?>> DREAMIUM_ORE = null;
	public static Holder<ConfiguredFeature<?, ?>> DIAMOND_ORE = null;
	public static Holder<ConfiguredFeature<?, ?>> TRIPLITE_ORE = null;
	public static Holder<ConfiguredFeature<?, ?>> LAGGERITE_ORE = null;
	public static Holder<ConfiguredFeature<?, ?>> DEEPSLATE_LAGGERITE_ORE = null;
	
	public static Holder<ConfiguredFeature<?, ?>> DEEPSLATE_RANDOMIUM_FEATURE = null;
	public static Holder<ConfiguredFeature<?, ?>> DEEPSLATE_ALOTOSTUFFIUM_FEATURE = null;
	public static Holder<ConfiguredFeature<?, ?>> DEEPSLATE_KILLIUM_FEATURE = null;
	
	public static void addFeatures()
	{
		COPPER_FEATURE = register(new ResourceLocation(References.MODID, "copper_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.COPPER_ORE.get().defaultBlockState(), 8));
		
		ALOTOSTUFFIUM_FEATURE = register(new ResourceLocation(References.MODID, "alotostuffium_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.ALOTOSTUFFIUM_ORE.get().defaultBlockState(), 7));
		
		AMADEUM_FEATURE = register(new ResourceLocation(References.MODID, "amadeum_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.AMADEUM_ORE.get().defaultBlockState(), 6));
		
		APPETITE_FEATURE = register(new ResourceLocation(References.MODID, "appetite_ore_feature"), 
				Feature.ORE, new OreConfiguration(new BlockMatchTest(Blocks.SAND), BlockRegistry.APPETITE_ORE.get().defaultBlockState(), 5));
		
		ENDERITE_FEATURE = register(new ResourceLocation(References.MODID, "enderite_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.ENDERITE_ORE.get().defaultBlockState(), 4));
		
		EXPLODEMITE_FEATURE = register(new ResourceLocation(References.MODID, "explodemite_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.EXPLODEMITE_ORE.get().defaultBlockState(), 7));
		
		IDLIKEABITE_FEATURE = register(new ResourceLocation(References.MODID, "idlikeabite_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.IDLIKEABITE_ORE.get().defaultBlockState(), 12));
		
		SMITEANDLITE_FEATURE = register(new ResourceLocation(References.MODID, "smiteandlite_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.SMITEANDLITE_ORE.get().defaultBlockState(), 5));
		
		NOFITE_FEATURE = register(new ResourceLocation(References.MODID, "nofite_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.NOFITE_ORE.get().defaultBlockState(), 5));
		
		KILLIUM_FEATURE = register(new ResourceLocation(References.MODID, "killium_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.KILLIUM_ORE.get().defaultBlockState(), 5));
		
		RANDOMIUM_FEATURE = register(new ResourceLocation(References.MODID, "randomium_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.RANDOMIUM_ORE.get().defaultBlockState(), 3));
		
		MEMENITE_ORE = register(new ResourceLocation(References.MODID, "memenite_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.MEMENITE_ORE.get().defaultBlockState(), 5));
		
		LITEINNITE_ORE = register(new ResourceLocation(References.MODID, "liteinnite_ore_feature"), 
				ModFeatures.FIXED_ORE_FEATURE.get(), new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.LITEINNITE_ORE.get().defaultBlockState(), 10));
		
		BESTFORGE_ORE = register(new ResourceLocation(References.MODID, "bestforge_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.NATURAL_STONE, BlockRegistry.BESTFORGE_ORE.get().defaultBlockState(), 6));
	
		DOGECOIN_ORE = register(new ResourceLocation(References.MODID, "dogecoin_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.DOGECOIN_ORE.get().defaultBlockState(), 4));
	
		MOBIUM_ORE = register(new ResourceLocation(References.MODID, "mobium_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.MOBIUM_ORE.get().defaultBlockState(), 11));
		
		DREAMIUM_ORE = register(new ResourceLocation(References.MODID, "dreamium_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.DREAMIUM_ORE.get().defaultBlockState(), 7));
		
		DIAMOND_ORE = register(new ResourceLocation(References.MODID, "diamond_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEPSLATE_DIAMOND_ORE.get().defaultBlockState(), 8));
		
		TRIPLITE_ORE = register(new ResourceLocation(References.MODID, "triplite_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.TRIPLITE_ORE.get().defaultBlockState(), 9));
		
		
		DEEPSLATE_KILLIUM_FEATURE = register(new ResourceLocation(References.MODID, "deepslate_killium_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEPSLATE_KILLIUM_ORE.get().defaultBlockState(), 5));
		
		DEEPSLATE_ALOTOSTUFFIUM_FEATURE = register(new ResourceLocation(References.MODID, "deepslate_alotostuffium_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEPSLATE_ALOTOSTUFFIUM_ORE.get().defaultBlockState(), 7));
		
		DEEPSLATE_RANDOMIUM_FEATURE = register(new ResourceLocation(References.MODID, "deepslate_randomium_ore_feature"), 
				Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEPSLATE_RANDOMIUM_ORE.get().defaultBlockState(), 3));
		
		LAGGERITE_ORE = register(new ResourceLocation(References.MODID, "laggerite_ore"), 
				Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.LAGGERITE_ORE.get().defaultBlockState(), 4));
		
		DEEPSLATE_LAGGERITE_ORE = register(new ResourceLocation(References.MODID, "deepslate_laggerite_ore"), 
				Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEPSLATE_LAGGERITE_ORE.get().defaultBlockState(), 6));

	}
	
	private static <FC extends FeatureConfiguration, F extends Feature<FC>> Holder<ConfiguredFeature<?, ?>> register(ResourceLocation rl, Feature<FC> feature, FC featureConfig)
	{
		return BuiltinRegistries.register(BuiltinRegistries.CONFIGURED_FEATURE, rl, new ConfiguredFeature<>(feature, featureConfig));
	}	
}
