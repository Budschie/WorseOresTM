package de.budschie.worseores.util;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.BufferUploader;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexFormat.Mode;
import com.mojang.math.Matrix4f;

public class DrawUtils
{	
	public static void blit(PoseStack stack, int x, int y, int width, int height, int sampleX, int sampleY, int sampleWidth, int sampleHeight, int texWidth, int texHeight, boolean flipHorizontal, boolean flipVertical)
	{
		blitFlipEnabled(stack.last().pose(), x, y, x + width, y + height, sampleX / (float)texWidth, sampleY / (float)texHeight, (sampleX + sampleWidth) / (float)texWidth, (sampleY + sampleHeight) / (float)texHeight, 0, flipHorizontal, flipVertical);
	}
	
	public static void blitFlipEnabled(Matrix4f matrix, float x1, float y1, float x2, float y2, float minU, float minV, float maxU, float maxV, int blitOffset, boolean flipHorizontal, boolean flipVertical)
	{
		float temp;
		
		if(flipHorizontal)
		{
			temp = maxU;
			maxU = minU;
			minU = temp;
		}
		
		if(flipVertical)
		{
			temp = maxV;
			maxV = minV;
			minV = temp;
		}
		
		BufferBuilder bufferbuilder = Tesselator.getInstance().getBuilder();
		bufferbuilder.begin(Mode.QUADS, DefaultVertexFormat.POSITION_TEX);
		bufferbuilder.vertex(matrix, (float) x1, (float) y2, (float) blitOffset).uv(minU, maxV).endVertex();
		bufferbuilder.vertex(matrix, (float) x2, (float) y2, (float) blitOffset).uv(maxU, maxV).endVertex();
		bufferbuilder.vertex(matrix, (float) x2, (float) y1, (float) blitOffset).uv(maxU, minV).endVertex();
		bufferbuilder.vertex(matrix, (float) x1, (float) y1, (float) blitOffset).uv(minU, minV).endVertex();
		bufferbuilder.end();
		BufferUploader.end(bufferbuilder);
	}
}
