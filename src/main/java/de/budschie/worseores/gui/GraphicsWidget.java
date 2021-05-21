package de.budschie.worseores.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import de.budschie.worseores.util.DrawUtils;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.widget.Widget;

public class GraphicsWidget extends Widget
{
	Runnable boundTexture;
	Runnable clicked;
	
	SampleData normal, hover;
	boolean mirrorHorizontal;
	
	int texWidth, texHeight;
	
	public GraphicsWidget(int x, int y, int width, int height, SampleData normal, SampleData hover, boolean mirrorHorizontal, int texWidth, int texHeight, Runnable boundTexture, Runnable clicked)
	{
		super(x, y, width, height, null);
		
		this.boundTexture = boundTexture;
		this.clicked = clicked;
		
		this.normal = normal;
		this.hover = hover;
		
		this.mirrorHorizontal = mirrorHorizontal;
		
		this.texHeight = texHeight;
		this.texWidth = texWidth;
	}
	
	@Override
	public void renderWidget(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks)
	{
		SampleData data;
		
		if(isHovered())
			data = hover;
		else
			data = normal;
		
		boundTexture.run();
		
		RenderSystem.enableBlend();
		//matrixStack.push();
		//matrixStack.scale(-1, 1, 1);
		//AbstractGui.blit(matrixStack, -x, y, width, height, data.posX, data.posY, data.width, data.height, texWidth, texHeight);
		DrawUtils.blit(matrixStack, x, y, width, height, data.posX, data.posY, data.width, data.height, texWidth, texHeight, mirrorHorizontal, false);
		//matrixStack.pop();
	}
	
	@Override
	public void onClick(double mouseX, double mouseY)
	{
		clicked.run();
	}
	
	public static class SampleData
	{
		int posX, posY;
		int width, height;
		
		public SampleData(int posX, int posY, int width, int height)
		{
			this.posX = posX;
			this.posY = posY;
			this.width = width;
			this.height = height;
		}

		public int getPosX()
		{
			return posX;
		}
		
		public void setPosX(int posX)
		{
			this.posX = posX;
		}
		
		public int getPosY()
		{
			return posY;
		}
		
		public void setPosY(int posY)
		{
			this.posY = posY;
		}
		
		public int getWidth()
		{
			return width;
		}
		
		public void setWidth(int width)
		{
			this.width = width;
		}
		
		public int getHeight()
		{
			return height;
		}
		
		public void setHeight(int height)
		{
			this.height = height;
		}
	}
}
