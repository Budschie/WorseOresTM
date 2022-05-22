package de.budschie.worseores;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.budschie.worseores.blocks.BlockRegistry;
import de.budschie.worseores.entity.EntityRegistry;
import de.budschie.worseores.items.ItemRegistry;
import de.budschie.worseores.world_gen.FeatureRegistry;
import de.budschie.worseores.world_gen.ModFeatures;
import de.budschie.worseores.world_gen.PlacedFeatureRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// https://github.com/ErikMcClure/bad-licenses
// https://fossa.com/blog/top-6-most-out-there-open-source-licenses

@Mod(References.MODID)
public class WorseOres
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public WorseOres() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        
        BlockRegistry.BLOCK_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemRegistry.ITEM_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        EntityRegistry.ENTITY_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModFeatures.FEATURE_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	event.enqueueWork(() ->
    	{
    		FeatureRegistry.addFeatures();
    		PlacedFeatureRegistry.addPlacedFeatures();
    	});
    }
}
