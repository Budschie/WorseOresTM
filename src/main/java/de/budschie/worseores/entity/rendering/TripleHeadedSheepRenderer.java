package de.budschie.worseores.entity.rendering;

import de.budschie.worseores.References;
import de.budschie.worseores.entity.TripleHeadedSheepEntity;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TripleHeadedSheepRenderer extends MobRenderer<TripleHeadedSheepEntity, TripleHeadedSheepiumModel>
{
	public static final ResourceLocation TRIPLE_HEADED_SHEEPIUM = new ResourceLocation(References.MODID, "textures/entity/triple_headed_sheepium_combined.png");
	
	public TripleHeadedSheepRenderer(EntityRendererProvider.Context renderManagerIn)
	{
		super(renderManagerIn, new TripleHeadedSheepiumModel(), 1);
	}

	@Override
	public ResourceLocation getTextureLocation(TripleHeadedSheepEntity entity)
	{
		return TRIPLE_HEADED_SHEEPIUM;
	}
}
