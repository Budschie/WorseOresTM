package de.budschie.worseores.entity.rendering;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import de.budschie.worseores.entity.TripleHeadedSheepEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.entity.Entity;

//Made with Blockbench 3.8.4
//Exported for Minecraft version 1.15 - 1.16
//Paste this class into your mod and generate all required imports

public class TripleHeadedSheepiumModel extends EntityModel<TripleHeadedSheepEntity> {
	private final ModelPart bone;
	private final ModelPart noWoolBody;
	private final ModelPart noWoolLeg1;
	private final ModelPart noWoolLeg3;
	private final ModelPart noWoolLeg2;
	private final ModelPart noWoolLeg4;
	private final ModelPart woolBody;
	private final ModelPart woolLeg1;
	private final ModelPart woolLeg3;
	private final ModelPart woolLeg2;
	private final ModelPart woolLeg4;
	private final ModelPart headMid;
	private final ModelPart woolHeadMid;
	private final ModelPart noWoolHeadMid;
	private final ModelPart headRight;
	private final ModelPart woolHeadRight;
	private final ModelPart noWoolHeadRight;
	private final ModelPart headLeft;
	private final ModelPart woolHeadLeft;
	private final ModelPart noWoolHeadLeft;
	private final ModelPart bb_main;

	public TripleHeadedSheepiumModel() {
		texWidth = 64;
		texHeight = 64;

		bone = new ModelPart(this);
		bone.setPos(0.0F, 24.0F, 0.0F);
		

		noWoolBody = new ModelPart(this);
		noWoolBody.setPos(0.0F, 5.0F, 2.0F);
		setRotationAngle(noWoolBody, 1.5708F, 0.0F, 0.0F);
		noWoolBody.texOffs(28, 40).addBox(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, 0.0F, false);

		noWoolLeg1 = new ModelPart(this);
		noWoolLeg1.setPos(-3.0F, 12.0F, 7.0F);
		noWoolLeg1.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		noWoolLeg3 = new ModelPart(this);
		noWoolLeg3.setPos(-3.0F, 12.0F, -5.0F);
		noWoolLeg3.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		noWoolLeg2 = new ModelPart(this);
		noWoolLeg2.setPos(3.0F, 12.0F, 7.0F);
		noWoolLeg2.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		noWoolLeg4 = new ModelPart(this);
		noWoolLeg4.setPos(3.0F, 12.0F, -5.0F);
		noWoolLeg4.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		woolBody = new ModelPart(this);
		woolBody.setPos(0.0F, 5.0F, 2.0F);
		setRotationAngle(woolBody, 1.5708F, 0.0F, 0.0F);
		woolBody.texOffs(28, 8).addBox(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, 1.5F, false);

		woolLeg1 = new ModelPart(this);
		woolLeg1.setPos(-3.0F, 12.0F, 7.0F);
		woolLeg1.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.4F, false);

		woolLeg3 = new ModelPart(this);
		woolLeg3.setPos(-3.0F, 12.0F, -5.0F);
		woolLeg3.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.4F, false);

		woolLeg2 = new ModelPart(this);
		woolLeg2.setPos(3.0F, 12.0F, 7.0F);
		woolLeg2.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.4F, false);

		woolLeg4 = new ModelPart(this);
		woolLeg4.setPos(3.0F, 12.0F, -5.0F);
		woolLeg4.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.4F, false);

		headMid = new ModelPart(this);
		headMid.setPos(0.0F, 24.0F, 0.0F);
		

		woolHeadMid = new ModelPart(this);
		woolHeadMid.setPos(0.0F, -18.0F, -8.0F);
		headMid.addChild(woolHeadMid);
		woolHeadMid.texOffs(0, 0).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, 0.5F, false);

		noWoolHeadMid = new ModelPart(this);
		noWoolHeadMid.setPos(0.0F, -18.0F, -8.0F);
		headMid.addChild(noWoolHeadMid);
		noWoolHeadMid.texOffs(0, 32).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);

		headRight = new ModelPart(this);
		headRight.setPos(-7.0F, 25.0F, 0.0F);
		

		woolHeadRight = new ModelPart(this);
		woolHeadRight.setPos(0.0F, -18.0F, -8.0F);
		headRight.addChild(woolHeadRight);
		woolHeadRight.texOffs(0, 0).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, 0.5F, false);

		noWoolHeadRight = new ModelPart(this);
		noWoolHeadRight.setPos(0.0F, -18.0F, -8.0F);
		headRight.addChild(noWoolHeadRight);
		noWoolHeadRight.texOffs(0, 32).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);

		headLeft = new ModelPart(this);
		headLeft.setPos(7.0F, 25.0F, 0.0F);
		

		woolHeadLeft = new ModelPart(this);
		woolHeadLeft.setPos(0.0F, -18.0F, -8.0F);
		headLeft.addChild(woolHeadLeft);
		woolHeadLeft.texOffs(0, 0).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, 0.5F, false);

		noWoolHeadLeft = new ModelPart(this);
		noWoolHeadLeft.setPos(0.0F, -18.0F, -8.0F);
		headLeft.addChild(noWoolHeadLeft);
		noWoolHeadLeft.texOffs(0, 32).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);

		bb_main = new ModelPart(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(22, 46).addBox(-8.0F, -18.0F, -6.0F, 16.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(TripleHeadedSheepEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{
		float leg1 = (float) Math.sin(limbSwing)* limbSwingAmount, leg2 = (float) Math.sin(limbSwing - 180) * limbSwingAmount, leg3 = (float) Math.sin(limbSwing - 180) * limbSwingAmount, leg4 = (float) Math.sin(limbSwing) * limbSwingAmount;
		
		noWoolLeg1.xRot = leg1;
		woolLeg1.xRot = leg1;
		
		noWoolLeg2.xRot = leg2;
		woolLeg2.xRot = leg2;

		noWoolLeg3.xRot = leg3;
		woolLeg3.xRot = leg3;

		noWoolLeg4.xRot = leg4;
		woolLeg4.xRot = leg4;
		
		woolHeadMid.yRot = netHeadYaw * ((float)Math.PI / 180F);
		woolHeadMid.xRot = headPitch * ((float)Math.PI / 180f);
		noWoolHeadMid.yRot = netHeadYaw * ((float)Math.PI / 180F);
		noWoolHeadMid.xRot = headPitch * ((float)Math.PI / 180f);
		
		woolHeadLeft.yRot = netHeadYaw * ((float)Math.PI / 180F);
		woolHeadLeft.xRot = headPitch * ((float)Math.PI / 180f);
		noWoolHeadLeft.yRot = netHeadYaw * ((float)Math.PI / 180F);
		noWoolHeadLeft.xRot = headPitch * ((float)Math.PI / 180f);

		woolHeadRight.yRot = netHeadYaw * ((float)Math.PI / 180F);
		woolHeadRight.xRot = headPitch * ((float)Math.PI / 180f);
		noWoolHeadRight.yRot = netHeadYaw * ((float)Math.PI / 180F);
		noWoolHeadRight.xRot = headPitch * ((float)Math.PI / 180f);
	}

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha)
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

	public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}