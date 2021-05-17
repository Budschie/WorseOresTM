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

@EventBusSubscriber(bus = Bus.MOD)
public class EntityRegistry
{
	public static final DeferredRegister<EntityType<?>> ENTITY_REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, References.MODID);
	
	public static final RegistryObject<EntityType<TripleHeadedSheepEntity>> TRIPLE_HEADED_SHEEP = ENTITY_REGISTRY.register("triple_headed_sheep", () ->
	{
		return EntityType.Builder.<TripleHeadedSheepEntity>create((type, world) -> new TripleHeadedSheepEntity(type, world), EntityClassification.MONSTER).build(References.MODID + ":triple_headed_sheep");
	});
	
	@SubscribeEvent
	public static void onCreatingEntityAttributes(EntityAttributeCreationEvent event)
	{
		event.put(TRIPLE_HEADED_SHEEP.get(), TripleHeadedSheepEntity.setupAttributes());
	}
}
