package de.budschie.worseores.entity.rendering;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import de.budschie.worseores.entity.TripleHeadedSheepEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

//Made with Blockbench 3.8.4
//Exported for Minecraft version 1.15 - 1.16
//Paste this class into your mod and generate all required imports

public class TripleHeadedSheepiumModel extends EntityModel<TripleHeadedSheepEntity> {
	private final ModelRenderer bone;
	private final ModelRenderer noWoolBody;
	private final ModelRenderer noWoolLeg1;
	private final ModelRenderer noWoolLeg3;
	private final ModelRenderer noWoolLeg2;
	private final ModelRenderer noWoolLeg4;
	private final ModelRenderer woolBody;
	private final ModelRenderer woolLeg1;
	private final ModelRenderer woolLeg3;
	private final ModelRenderer woolLeg2;
	private final ModelRenderer woolLeg4;
	private final ModelRenderer headMid;
	private final ModelRenderer woolHeadMid;
	private final ModelRenderer noWoolHeadMid;
	private final ModelRenderer headRight;
	private final ModelRenderer woolHeadRight;
	private final ModelRenderer noWoolHeadRight;
	private final ModelRenderer headLeft;
	private final ModelRenderer woolHeadLeft;
	private final ModelRenderer noWoolHeadLeft;
	private final ModelRenderer bb_main;

	public TripleHeadedSheepiumModel() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		noWoolBody = new ModelRenderer(this);
		noWoolBody.setRotationPoint(0.0F, 5.0F, 2.0F);
		setRotationAngle(noWoolBody, 1.5708F, 0.0F, 0.0F);
		noWoolBody.setTextureOffset(28, 40).addBox(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, 0.0F, false);

		noWoolLeg1 = new ModelRenderer(this);
		noWoolLeg1.setRotationPoint(-3.0F, 12.0F, 7.0F);
		noWoolLeg1.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		noWoolLeg3 = new ModelRenderer(this);
		noWoolLeg3.setRotationPoint(-3.0F, 12.0F, -5.0F);
		noWoolLeg3.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		noWoolLeg2 = new ModelRenderer(this);
		noWoolLeg2.setRotationPoint(3.0F, 12.0F, 7.0F);
		noWoolLeg2.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		noWoolLeg4 = new ModelRenderer(this);
		noWoolLeg4.setRotationPoint(3.0F, 12.0F, -5.0F);
		noWoolLeg4.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		woolBody = new ModelRenderer(this);
		woolBody.setRotationPoint(0.0F, 5.0F, 2.0F);
		setRotationAngle(woolBody, 1.5708F, 0.0F, 0.0F);
		woolBody.setTextureOffset(28, 8).addBox(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, 1.5F, false);

		woolLeg1 = new ModelRenderer(this);
		woolLeg1.setRotationPoint(-3.0F, 12.0F, 7.0F);
		woolLeg1.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.4F, false);

		woolLeg3 = new ModelRenderer(this);
		woolLeg3.setRotationPoint(-3.0F, 12.0F, -5.0F);
		woolLeg3.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.4F, false);

		woolLeg2 = new ModelRenderer(this);
		woolLeg2.setRotationPoint(3.0F, 12.0F, 7.0F);
		woolLeg2.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.4F, false);

		woolLeg4 = new ModelRenderer(this);
		woolLeg4.setRotationPoint(3.0F, 12.0F, -5.0F);
		woolLeg4.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.4F, false);

		headMid = new ModelRenderer(this);
		headMid.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		woolHeadMid = new ModelRenderer(this);
		woolHeadMid.setRotationPoint(0.0F, -18.0F, -8.0F);
		headMid.addChild(woolHeadMid);
		woolHeadMid.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, 0.5F, false);

		noWoolHeadMid = new ModelRenderer(this);
		noWoolHeadMid.setRotationPoint(0.0F, -18.0F, -8.0F);
		headMid.addChild(noWoolHeadMid);
		noWoolHeadMid.setTextureOffset(0, 32).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);

		headRight = new ModelRenderer(this);
		headRight.setRotationPoint(-7.0F, 25.0F, 0.0F);
		

		woolHeadRight = new ModelRenderer(this);
		woolHeadRight.setRotationPoint(0.0F, -18.0F, -8.0F);
		headRight.addChild(woolHeadRight);
		woolHeadRight.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, 0.5F, false);

		noWoolHeadRight = new ModelRenderer(this);
		noWoolHeadRight.setRotationPoint(0.0F, -18.0F, -8.0F);
		headRight.addChild(noWoolHeadRight);
		noWoolHeadRight.setTextureOffset(0, 32).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);

		headLeft = new ModelRenderer(this);
		headLeft.setRotationPoint(7.0F, 25.0F, 0.0F);
		

		woolHeadLeft = new ModelRenderer(this);
		woolHeadLeft.setRotationPoint(0.0F, -18.0F, -8.0F);
		headLeft.addChild(woolHeadLeft);
		woolHeadLeft.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, 0.5F, false);

		noWoolHeadLeft = new ModelRenderer(this);
		noWoolHeadLeft.setRotationPoint(0.0F, -18.0F, -8.0F);
		headLeft.addChild(noWoolHeadLeft);
		noWoolHeadLeft.setTextureOffset(0, 32).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(22, 46).addBox(-8.0F, -18.0F, -6.0F, 16.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(TripleHeadedSheepEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{
		float leg1 = (float) Math.sin(limbSwing)* limbSwingAmount, leg2 = (float) Math.sin(limbSwing - 180) * limbSwingAmount, leg3 = (float) Math.sin(limbSwing - 180) * limbSwingAmount, leg4 = (float) Math.sin(limbSwing) * limbSwingAmount;
		
		noWoolLeg1.rotateAngleX = leg1;
		woolLeg1.rotateAngleX = leg1;
		
		noWoolLeg2.rotateAngleX = leg2;
		woolLeg2.rotateAngleX = leg2;

		noWoolLeg3.rotateAngleX = leg3;
		woolLeg3.rotateAngleX = leg3;

		noWoolLeg4.rotateAngleX = leg4;
		woolLeg4.rotateAngleX = leg4;
		
		woolHeadMid.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		woolHeadMid.rotateAngleX = headPitch * ((float)Math.PI / 180f);
		noWoolHeadMid.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		noWoolHeadMid.rotateAngleX = headPitch * ((float)Math.PI / 180f);
		
		woolHeadLeft.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		woolHeadLeft.rotateAngleX = headPitch * ((float)Math.PI / 180f);
		noWoolHeadLeft.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		noWoolHeadLeft.rotateAngleX = headPitch * ((float)Math.PI / 180f);

		woolHeadRight.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		woolHeadRight.rotateAngleX = headPitch * ((float)Math.PI / 180f);
		noWoolHeadRight.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		noWoolHeadRight.rotateAngleX = headPitch * ((float)Math.PI / 180f);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha)
	{
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		noWoolBody.render(matrixStack, buffer, packedLight, packedOverlay);
		noWoolLeg1.render(matrixStack, buffer, packedLight, packedOverlay);
		noWoolLeg3.render(matrixStack, buffer, packedLight, packedOverlay);
		noWoolLeg2.render(matrixStack, buffer, packedLight, packedOverlay);
		noWoolLeg4.render(matrixStack, buffer, packedLight, packedOverlay);
		woolBody.render(matrixStack, buffer, packedLight, packedOverlay);
		woolLeg1.render(matrixStack, buffer, packedLight, packedOverlay);
		woolLeg3.render(matrixStack, buffer, packedLight, packedOverlay);
		woolLeg2.render(matrixStack, buffer, packedLight, packedOverlay);
		woolLeg4.render(matrixStack, buffer, packedLight, packedOverlay);
		headMid.render(matrixStack, buffer, packedLight, packedOverlay);
		headRight.render(matrixStack, buffer, packedLight, packedOverlay);
		headLeft.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}