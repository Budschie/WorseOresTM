package de.budschie.worseores.entity.rendering;

import de.budschie.worseores.References;
import de.budschie.worseores.entity.TripleHeadedSheepEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TripleHeadedSheepRenderer extends MobRenderer<TripleHeadedSheepEntity, TripleHeadedSheepiumModel>
{
	public static final ResourceLocation TRIPLE_HEADED_SHEEPIUM = new ResourceLocation(References.MODID, "textures/entity/triple_headed_sheepium_combined.png");
	
	public TripleHeadedSheepRenderer(EntityRendererManager renderManagerIn)
	{
		super(renderManagerIn, new TripleHeadedSheepiumModel(), 1);
	}

	@Override
	public ResourceLocation getEntityTexture(TripleHeadedSheepEntity entity)
	{
		return TRIPLE_HEADED_SHEEPIUM;
	}
}
