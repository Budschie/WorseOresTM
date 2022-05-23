package de.budschie.worseores.entity.rendering;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import de.budschie.worseores.entity.TripleHeadedSheepEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

//Made with Blockbench 3.8.4
//Exported for Minecraft version 1.15 - 1.16
//Paste this class into your mod and generate all required imports

public class TripleHeadedSheepiumModel extends EntityModel<TripleHeadedSheepEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart woolLeg4;
	private final ModelPart woolLeg3;
	private final ModelPart headRight;
	private final ModelPart woolLeg2;
	private final ModelPart woolLeg1;
	private final ModelPart noWoolBody;
	private final ModelPart noWoolLeg4;
	private final ModelPart bone;
	private final ModelPart woolBody;
	private final ModelPart noWoolLeg1;
	private final ModelPart noWoolLeg2;
	private final ModelPart noWoolLeg3;
	private final ModelPart headMid;
	private final ModelPart bb_main;
	private final ModelPart headLeft;
	private final ModelPart woolHeadMid;
	private final ModelPart noWoolHeadMid;
	private final ModelPart woolHeadLeft;
	private final ModelPart noWoolHeadLeft;
	private final ModelPart woolHeadRight;
	private final ModelPart noWoolHeadRight;

	public TripleHeadedSheepiumModel(ModelPart root) {
		this.woolLeg4 = root.getChild("woolLeg4");
		this.woolLeg3 = root.getChild("woolLeg3");
		this.headRight = root.getChild("headRight");
		this.woolLeg2 = root.getChild("woolLeg2");
		this.woolLeg1 = root.getChild("woolLeg1");
		this.noWoolBody = root.getChild("noWoolBody");
		this.noWoolLeg4 = root.getChild("noWoolLeg4");
		this.bone = root.getChild("bone");
		this.woolBody = root.getChild("woolBody");
		this.noWoolLeg1 = root.getChild("noWoolLeg1");
		this.noWoolLeg2 = root.getChild("noWoolLeg2");
		this.noWoolLeg3 = root.getChild("noWoolLeg3");
		this.headMid = root.getChild("headMid");
		this.bb_main = root.getChild("bb_main");
		this.headLeft = root.getChild("headLeft");
		this.woolHeadMid = headMid.getChild("woolHeadMid");
		this.noWoolHeadMid = headMid.getChild("noWoolHeadMid");
		this.woolHeadRight = headRight.getChild("woolHeadRight");
		this.noWoolHeadRight = headRight.getChild("noWoolHeadRight");
		this.woolHeadLeft = headLeft.getChild("woolHeadLeft");
		this.noWoolHeadLeft = headLeft.getChild("noWoolHeadLeft");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition woolLeg4 = partdefinition.addOrReplaceChild("woolLeg4", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(-3.0F, 12.0F, -5.0F));

		PartDefinition woolLeg3 = partdefinition.addOrReplaceChild("woolLeg3", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(3.0F, 12.0F, -5.0F));

		PartDefinition headRight = partdefinition.addOrReplaceChild("headRight", CubeListBuilder.create(), PartPose.offset(7.0F, 25.0F, 0.0F));

		PartDefinition woolHeadRight = headRight.addOrReplaceChild("woolHeadRight", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, -18.0F, -8.0F));

		PartDefinition noWoolHeadRight = headRight.addOrReplaceChild("noWoolHeadRight", CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, -8.0F));

		PartDefinition woolLeg2 = partdefinition.addOrReplaceChild("woolLeg2", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(-3.0F, 12.0F, 7.0F));

		PartDefinition woolLeg1 = partdefinition.addOrReplaceChild("woolLeg1", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(3.0F, 12.0F, 7.0F));

		PartDefinition noWoolBody = partdefinition.addOrReplaceChild("noWoolBody", CubeListBuilder.create().texOffs(28, 40).addBox(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition noWoolLeg4 = partdefinition.addOrReplaceChild("noWoolLeg4", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 12.0F, -5.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition woolBody = partdefinition.addOrReplaceChild("woolBody", CubeListBuilder.create().texOffs(28, 8).addBox(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, new CubeDeformation(1.5F)), PartPose.offsetAndRotation(0.0F, 5.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition noWoolLeg1 = partdefinition.addOrReplaceChild("noWoolLeg1", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 12.0F, 7.0F));

		PartDefinition noWoolLeg2 = partdefinition.addOrReplaceChild("noWoolLeg2", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 12.0F, 7.0F));

		PartDefinition noWoolLeg3 = partdefinition.addOrReplaceChild("noWoolLeg3", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 12.0F, -5.0F));

		PartDefinition headMid = partdefinition.addOrReplaceChild("headMid", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition woolHeadMid = headMid.addOrReplaceChild("woolHeadMid", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, -18.0F, -8.0F));

		PartDefinition noWoolHeadMid = headMid.addOrReplaceChild("noWoolHeadMid", CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, -8.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(22, 46).addBox(-8.0F, -18.0F, -6.0F, 16.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition headLeft = partdefinition.addOrReplaceChild("headLeft", CubeListBuilder.create(), PartPose.offset(-7.0F, 25.0F, 0.0F));

		PartDefinition woolHeadLeft = headLeft.addOrReplaceChild("woolHeadLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, -18.0F, -8.0F));

		PartDefinition noWoolHeadLeft = headLeft.addOrReplaceChild("noWoolHeadLeft", CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, -8.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		woolLeg4.render(poseStack, buffer, packedLight, packedOverlay);
		woolLeg3.render(poseStack, buffer, packedLight, packedOverlay);
		headRight.render(poseStack, buffer, packedLight, packedOverlay);
		woolLeg2.render(poseStack, buffer, packedLight, packedOverlay);
		woolLeg1.render(poseStack, buffer, packedLight, packedOverlay);
		noWoolBody.render(poseStack, buffer, packedLight, packedOverlay);
		noWoolLeg4.render(poseStack, buffer, packedLight, packedOverlay);
		bone.render(poseStack, buffer, packedLight, packedOverlay);
		woolBody.render(poseStack, buffer, packedLight, packedOverlay);
		noWoolLeg1.render(poseStack, buffer, packedLight, packedOverlay);
		noWoolLeg2.render(poseStack, buffer, packedLight, packedOverlay);
		noWoolLeg3.render(poseStack, buffer, packedLight, packedOverlay);
		headMid.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
		headLeft.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}