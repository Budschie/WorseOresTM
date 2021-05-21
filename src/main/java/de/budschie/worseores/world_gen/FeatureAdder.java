package de.budschie.worseores.world_gen;

import de.budschie.worseores.References;
import de.budschie.worseores.blocks.BlockRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
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
		COPPER_FEATURE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "copper_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.COPPER_ORE.get().getDefaultState(), 12)).range(64).square().count(4));
		
		ALOTOSTUFFIUM_FEATURE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "alotostuffium_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.ALOTOSTUFFIUM_ORE.get().getDefaultState(), 7)).range(48).square().count(3));
		
		AMADEUM_FEATURE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "amadeum_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.AMADEUM_ORE.get().getDefaultState(), 5)).range(48).square().count(1));
		
		APPETITE_FEATURE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "appetite_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SAND), BlockRegistry.APPETITE_ORE.get().getDefaultState(), 5)).range(128).square().count(5));
		
		ENDERITE_FEATURE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "enderite_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.ENDERITE_ORE.get().getDefaultState(), 4)).range(64).square().count(2));
		
		EXPLODEMITE_FEATURE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "explodemite_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.EXPLODEMITE_ORE.get().getDefaultState(), 7)).range(64).square().count(3));
		
		IDLIKEABITE_FEATURE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "idlikeabite_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.IDLIKEABITE_ORE.get().getDefaultState(), 10)).range(64).square().count(3));
		
		SMITEANDLITE_FEATURE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "smiteandlite_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.SMITEANDLITE_ORE.get().getDefaultState(), 5)).range(64).square().count(2));
		
		NOFITE_FEATURE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "nofite_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.NOFITE_ORE.get().getDefaultState(), 5)).range(40).square().count(2));
		
		KILLIUM_FEATURE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "killium_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.KILLIUM_ORE.get().getDefaultState(), 5)).range(40).square().count(2));
		
		RANDOMIUM_FEATURE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "randomium_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.RANDOMIUM_ORE.get().getDefaultState(), 3)).range(64).square().count(4));
		
		MEMENITE_ORE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "memenite_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.MEMENITE_ORE.get().getDefaultState(), 5)).range(20).square().count(1));
		
		LITEINNITE_ORE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "liteinnite_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.LITEINNITE_ORE.get().getDefaultState(), 10)).range(64).square().count(3));
		
		BESTFORGE_ORE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "bestforge_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.BESTFORGE_ORE.get().getDefaultState(), 5)).range(18).square().count(1));
	
		DOGECOIN_ORE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "dogecoin_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.DOGECOIN_ORE.get().getDefaultState(), 5)).range(64).square().count(2));
	
		MOBIUM_ORE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "mobium_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.MOBIUM_ORE.get().getDefaultState(), 10)).range(32).square().count(5).chance(20));
		
		DREAMIUM_ORE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "dreamium_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.DREAMIUM_ORE.get().getDefaultState(), 5)).range(64).square().count(3));
		
		DIAMOND_ORE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "diamond_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.DIAMOND_ORE.get().getDefaultState(), 8)).range(16).square().count(3));
		
		TRIPLITE_ORE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(References.MODID, "triplite_ore_feature"), 
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.TRIPLITE_ORE.get().getDefaultState(), 6)).range(64).square().count(3));
	}
	
	@SubscribeEvent
	public static void onBiomeLoading(BiomeLoadingEvent event)
	{
		if(event.getCategory() != Category.THEEND && event.getCategory() != Category.NETHER)
		{
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, COPPER_FEATURE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, ALOTOSTUFFIUM_FEATURE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, AMADEUM_FEATURE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, APPETITE_FEATURE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, ENDERITE_FEATURE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, EXPLODEMITE_FEATURE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, IDLIKEABITE_FEATURE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, SMITEANDLITE_FEATURE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, NOFITE_FEATURE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, KILLIUM_FEATURE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, RANDOMIUM_FEATURE);
//			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, MEMENITE_ORE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, LITEINNITE_ORE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, BESTFORGE_ORE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, DOGECOIN_ORE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, MOBIUM_ORE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, DREAMIUM_ORE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, DIAMOND_ORE);
			event.getGeneration().withFeature(Decoration.UNDERGROUND_ORES, TRIPLITE_ORE);
		}
	}
}
