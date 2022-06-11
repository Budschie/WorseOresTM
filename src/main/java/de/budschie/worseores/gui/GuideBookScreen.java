package de.budschie.worseores.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import de.budschie.worseores.References;
import de.budschie.worseores.gui.GraphicsWidget.SampleData;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class GuideBookScreen extends Screen
{
	public static final ResourceLocation BOOK_RESOURCE_LOCATION = new ResourceLocation(References.MODID, "textures/gui/book.png");
	
	private int centeredX, centeredY, sizeWidthPage, sizeHeightPage;
	
	private GuideBookPage[] pages;
	private int currentPage = 0;
	private static final float ADDITIONAL_SCALE_FACTOR = 2f;
	
	public GuideBookScreen(GuideBookPage[] pages)
	{
		super(new TextComponent("Book Of Ums and Ites"));
		
		this.pages = pages;
	}
	
	@Override
	public boolean isPauseScreen()
	{
		return false;
	}
	
	private void changePage(int amount)
	{
		currentPage = (int) Math.max(Math.min(currentPage + amount, Math.ceil(pages.length / 2f) - 1), 0);
	}
	
	@Override
	protected void init()
	{
		Minecraft mc = Minecraft.getInstance();
		RenderSystem.setShaderTexture(0, BOOK_RESOURCE_LOCATION);
				
		sizeWidthPage = (int) (76 * ADDITIONAL_SCALE_FACTOR);
		sizeHeightPage = (int) (58 * ADDITIONAL_SCALE_FACTOR);
		
		centeredX = (int) (((mc.getWindow().getGuiScaledWidth()) - sizeWidthPage * ADDITIONAL_SCALE_FACTOR) / 2);
		centeredY = (int) (((mc.getWindow().getGuiScaledHeight()) - sizeHeightPage * ADDITIONAL_SCALE_FACTOR) / 2);
		
		int sizeWidthButton = (int) (12);
		int sizeHeightButton = (int) (9);
		
		SampleData hover = new SampleData(4, 64 - 36, 12, 9);
		SampleData normal = new SampleData(4, 64 - 24, 12, 9);
		
		this.addRenderableWidget(new GraphicsWidget((int) (centeredX) + 5, (int) (centeredY + sizeHeightPage * ADDITIONAL_SCALE_FACTOR - sizeHeightButton * ADDITIONAL_SCALE_FACTOR) - 5, (int) (sizeWidthButton * ADDITIONAL_SCALE_FACTOR), (int) (sizeHeightButton * ADDITIONAL_SCALE_FACTOR), normal, hover, false, 128, 64, () -> RenderSystem.setShaderTexture(0, BOOK_RESOURCE_LOCATION), () -> changePage(-1)));
		this.addRenderableWidget(new GraphicsWidget((int) (centeredX + sizeWidthPage * 2 - sizeWidthButton * ADDITIONAL_SCALE_FACTOR - 3) - 5, (int) (centeredY + sizeHeightPage * ADDITIONAL_SCALE_FACTOR - sizeHeightButton * ADDITIONAL_SCALE_FACTOR) - 5, (int) (sizeWidthButton * ADDITIONAL_SCALE_FACTOR), (int) (sizeHeightButton * ADDITIONAL_SCALE_FACTOR), normal, hover, true, 128, 64, () -> RenderSystem.setShaderTexture(0, BOOK_RESOURCE_LOCATION), () -> changePage(1)));
	}
	
	private void renderBookPage(GuideBookPage page, int x, int y, PoseStack stack)
	{
		Minecraft.getInstance().getItemRenderer().renderAndDecorateItem(new ItemStack(page.getItem()), (int)(x + 10), (int) (y + 7));
		
//		stack.pushPose();
//		stack.scale(1.0f / 0.3f, 1 / 0.3f, 1 / 0.3f);
		drawString(stack, font, new TextComponent(ChatFormatting.GOLD.toString() + ChatFormatting.UNDERLINE + page.getTitle()), (int)(x + 28), (int) (y + 11), 0);
//		stack.push();
//		
//		stack.scale(1.3f, 1.3f, 1);
		
		for(int i = 0; i < page.getText().length; i++)
		{
			String currentLine = page.getText()[i];
			Minecraft.getInstance().font.draw(stack, new TextComponent(ChatFormatting.BLACK.toString() + currentLine), (int)(x + 4 * ADDITIONAL_SCALE_FACTOR), (int) (y + ADDITIONAL_SCALE_FACTOR * (12 + i * 5)), 0);
		}
//		stack.popPose();
//		stack.pop();
	}
	
	@Override
	public void render(PoseStack matrixStack, int mouseX, int mouseY, float partialTicks)
	{
//		renderBackground(matrixStack);
//		
//		Minecraft mc = Minecraft.getInstance();
//		RenderSystem.setShaderTexture(0, BOOK_RESOURCE_LOCATION);
//		
//		GuiComponent.blit(matrixStack, centeredX, centeredY, (int)(sizeWidthPage * ADDITIONAL_SCALE_FACTOR), (int)(sizeHeightPage * ADDITIONAL_SCALE_FACTOR), 26, 67, 76, 58, 128, 64);
		
		renderBackground(matrixStack);
		
		Minecraft mc = Minecraft.getInstance();
		RenderSystem.setShaderTexture(0, BOOK_RESOURCE_LOCATION);
		
		RenderSystem.enableBlend();
		GuiComponent.blit(matrixStack, centeredX, centeredY, (int)(sizeWidthPage * ADDITIONAL_SCALE_FACTOR), (int)(sizeHeightPage * ADDITIONAL_SCALE_FACTOR), 26, 67, 76, 58, 128, 64);
		
		//drawString(matrixStack, font, new StringTextComponent(TextFormatting.AQUA + "I like ya cut g"), 0, 0, 0);
		//mc.getItemRenderer().renderItemAndEffectIntoGUI(new ItemStack(ItemRegistry.BESTFORGE_ORE.get()), 0, 0);
		
		
		renderBookPage(pages[currentPage * 2], centeredX, centeredY + 5, matrixStack);
		
		if(currentPage * 2 + 1 < pages.length)
			renderBookPage(pages[currentPage * 2 + 1], (int)(centeredX + sizeWidthPage+ 5), centeredY + 5, matrixStack);
		
		super.render(matrixStack, mouseX, mouseY, partialTicks);
//		AbstractGui.blit(matrixStack, centeredX + 3, centeredY + sizeHeightPage - sizeHeightButton - 3, sizeWidthButton, sizeHeightButton, 4, 64 - (active ? 36 : 24), 12, 9, 128, 64);
	}
	
	@Override
	public void renderBackground(PoseStack matrixStack)
	{
		super.renderBackground(matrixStack);
	}
	
	public static class GuideBookPage
	{
		private String title;
		private Item item;
		private String[] text;
		
		public GuideBookPage(String title, Item item, String[] text)
		{
			this.title = title;
			this.item = item;
			this.text = text;
		}

		public String getTitle()
		{
			return title;
		}

		public Item getItem()
		{
			return item;
		}

		public String[] getText()
		{
			return text;
		}
	}
}
