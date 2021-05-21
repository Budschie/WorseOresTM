package de.budschie.worseores.entity;

import de.budschie.worseores.References;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityRegistry
{
	public static final DeferredRegister<EntityType<?>> ENTITY_REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, References.MODID);
	
	public static final RegistryObject<EntityType<TripleHeadedSheepEntity>> TRIPLE_HEADED_SHEEP = ENTITY_REGISTRY.register("triple_headed_sheep", () ->
	{
		return EntityType.Builder.<TripleHeadedSheepEntity>create((type, world) -> new TripleHeadedSheepEntity(type, world), EntityClassification.CREATURE).size(.85f, .85f).build(References.MODID + ":triple_headed_sheep");
	});
	
	@EventBusSubscriber(bus = Bus.MOD, modid = References.MODID)
	public static class EntityAttributeRegistry
	{
		@SubscribeEvent
		public static void onCreatingEntityAttributes(EntityAttributeCreationEvent event)
		{
			event.put(TRIPLE_HEADED_SHEEP.get(), TripleHeadedSheepEntity.setupAttributes());
		}
	}
}
