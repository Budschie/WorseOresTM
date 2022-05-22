package de.budschie.worseores.world_gen;

import de.budschie.worseores.References;
import de.budschie.worseores.world_gen.godforgiveme.FixedOreFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFeatures
{
	public static DeferredRegister<Feature<?>> FEATURE_REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, References.MODID);
	
	public static RegistryObject<FixedOreFeature> FIXED_ORE_FEATURE = FEATURE_REGISTRY.register("fixed_ore_feature", () -> new FixedOreFeature(OreConfiguration.CODEC));
}
