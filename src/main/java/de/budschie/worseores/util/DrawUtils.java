package de.budschie.worseores.util;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldVertexBufferUploader;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.vector.Matrix4f;

public class DrawUtils
{	
	public static void blit(MatrixStack stack, int x, int y, int width, int height, int sampleX, int sampleY, int sampleWidth, int sampleHeight, int texWidth, int texHeight, boolean flipHorizontal, boolean flipVertical)
	{
		blitFlipEnabled(stack.getLast().getMatrix(), x, y, x + width, y + height, sampleX / (float)texWidth, sampleY / (float)texHeight, (sampleX + sampleWidth) / (float)texWidth, (sampleY + sampleHeight) / (float)texHeight, 0, flipHorizontal, flipVertical);
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
		
		BufferBuilder bufferbuilder = Tessellator.getInstance().getBuffer();
		bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
		bufferbuilder.pos(matrix, (float) x1, (float) y2, (float) blitOffset).tex(minU, maxV).endVertex();
		bufferbuilder.pos(matrix, (float) x2, (float) y2, (float) blitOffset).tex(maxU, maxV).endVertex();
		bufferbuilder.pos(matrix, (float) x2, (float) y1, (float) blitOffset).tex(maxU, minV).endVertex();
		bufferbuilder.pos(matrix, (float) x1, (float) y1, (float) blitOffset).tex(minU, minV).endVertex();
		bufferbuilder.finishDrawing();
		RenderSystem.enableAlphaTest();
		WorldVertexBufferUploader.draw(bufferbuilder);
	}
}
