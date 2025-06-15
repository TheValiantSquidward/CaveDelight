package net.thevaliantsquidward.cavedelight.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.thevaliantsquidward.cavedelight.entity.custom.RoastedGrottoceratops;

@OnlyIn(Dist.CLIENT)
@SuppressWarnings("FieldCanBeLocal, unused")
public class RoastedGrottoceratopsModel<T extends RoastedGrottoceratops> extends HierarchicalModel<T> {

	private final ModelPart grottoceratops;
	private final ModelPart grotto_body;
	private final ModelPart grotto_neck;
	private final ModelPart grotto_left_front_leg;
	private final ModelPart grotto_right_front_leg;
	private final ModelPart grotto_tail;
	private final ModelPart grotto_tail_segment;
	private final ModelPart meat_1;
	private final ModelPart meat_2;
	private final ModelPart meat_3;
	private final ModelPart meat_4;
	private final ModelPart meat_5;
	private final ModelPart grotto_left_hind_leg;
	private final ModelPart grotto_l_hind_leg_segment;
	private final ModelPart grotto_right_hind_leg;
	private final ModelPart grotto_R_hind_leg_segment;
	private final ModelPart grotto_head;
	private final ModelPart grotto_mouth;
	private final ModelPart bones;

	public RoastedGrottoceratopsModel(ModelPart root) {
		this.grottoceratops = root.getChild("grottoceratops");
		this.grotto_body = this.grottoceratops.getChild("grotto_body");
		this.grotto_neck = this.grotto_body.getChild("grotto_neck");
		this.grotto_left_front_leg = this.grotto_body.getChild("grotto_left_front_leg");
		this.grotto_right_front_leg = this.grotto_body.getChild("grotto_right_front_leg");
		this.grotto_tail = this.grotto_body.getChild("grotto_tail");
		this.grotto_tail_segment = this.grotto_tail.getChild("grotto_tail_segment");
		this.meat_1 = this.grotto_body.getChild("meat_1");
		this.meat_2 = this.grotto_body.getChild("meat_2");
		this.meat_3 = this.grotto_body.getChild("meat_3");
		this.meat_4 = this.grotto_body.getChild("meat_4");
		this.meat_5 = this.grotto_body.getChild("meat_5");
		this.grotto_left_hind_leg = this.grottoceratops.getChild("grotto_left_hind_leg");
		this.grotto_l_hind_leg_segment = this.grotto_left_hind_leg.getChild("grotto_l_hind_leg_segment");
		this.grotto_right_hind_leg = this.grottoceratops.getChild("grotto_right_hind_leg");
		this.grotto_R_hind_leg_segment = this.grotto_right_hind_leg.getChild("grotto_R_hind_leg_segment");
		this.grotto_head = this.grottoceratops.getChild("grotto_head");
		this.grotto_mouth = this.grottoceratops.getChild("grotto_mouth");
		this.bones = this.grottoceratops.getChild("bones");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition grottoceratops = partdefinition.addOrReplaceChild("grottoceratops", CubeListBuilder.create().texOffs(0, 0).addBox(-26.0F, -10.0F, -26.0F, 52.0F, 3.0F, 73.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, -13.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition grotto_body = grottoceratops.addOrReplaceChild("grotto_body", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 21.0F));
		PartDefinition grotto_neck = grotto_body.addOrReplaceChild("grotto_neck", CubeListBuilder.create().texOffs(150, 76).addBox(-5.0F, -7.0F, -11.0F, 10.0F, 14.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -21.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition grotto_left_front_leg = grotto_body.addOrReplaceChild("grotto_left_front_leg", CubeListBuilder.create().texOffs(223, 34).addBox(-3.0F, -4.0F, -4.5F, 6.0F, 25.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(60, 14).addBox(-3.0F, 16.0F, -7.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 0).addBox(-3.0F, 19.0F, -7.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, 6.0F, -17.5F, -1.3963F, 0.0F, 0.0F));
		PartDefinition grotto_right_front_leg = grotto_body.addOrReplaceChild("grotto_right_front_leg", CubeListBuilder.create().texOffs(177, 35).mirror().addBox(-3.0F, -4.0F, -4.5F, 6.0F, 25.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(177, 35).mirror().addBox(-3.0F, -4.0F, -4.5F, 6.0F, 25.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(236, 20).mirror().addBox(0.0F, 16.0F, -7.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(237, 9).mirror().addBox(0.0F, 19.0F, -7.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-14.0F, 6.0F, -17.5F, -1.3963F, 0.0F, 0.0F));
		PartDefinition grotto_tail = grotto_body.addOrReplaceChild("grotto_tail", CubeListBuilder.create().texOffs(0, 36).addBox(-6.0F, -6.0F, -3.0F, 12.0F, 12.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 10.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition grotto_tail_segment = grotto_tail.addOrReplaceChild("grotto_tail_segment", CubeListBuilder.create().texOffs(150, 110).addBox(-3.0F, -2.5F, 0.0F, 6.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(62, 59).addBox(0.0F, -6.5F, 0.0F, 0.0F, 7.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(62, 83).addBox(3.0F, -2.5F, 9.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 83).addBox(3.0F, -2.5F, 15.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 83).mirror().addBox(-10.0F, -2.5F, 9.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(62, 83).mirror().addBox(-10.0F, -2.5F, 15.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, 15.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition meat_1 = grotto_body.addOrReplaceChild("meat_1", CubeListBuilder.create().texOffs(143, 143).addBox(-11.0F, -15.0F, -24.0F, 22.0F, 30.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(0.0F, -20.0F, -27.0F, 0.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -1.0F));
		PartDefinition meat_2 = grotto_body.addOrReplaceChild("meat_2", CubeListBuilder.create().texOffs(58, 150).addBox(-11.0F, -15.0F, -27.0F, 22.0F, 30.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(45, 41).addBox(0.0F, -20.0F, -27.0F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 9.0F));
		PartDefinition meat_3 = grotto_body.addOrReplaceChild("meat_3", CubeListBuilder.create().texOffs(0, 126).addBox(-11.0F, -15.0F, -28.0F, 22.0F, 30.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(4, 204).addBox(0.0F, -20.0F, -27.0F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 17.0F));
		PartDefinition meat_4 = grotto_body.addOrReplaceChild("meat_4", CubeListBuilder.create().texOffs(92, 113).addBox(-11.0F, -15.0F, -29.0F, 22.0F, 30.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 43).addBox(0.0F, -20.0F, -27.0F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 25.0F));
		PartDefinition meat_5 = grotto_body.addOrReplaceChild("meat_5", CubeListBuilder.create().texOffs(92, 76).addBox(-11.0F, -19.0F, -29.0F, 22.0F, 30.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(14, 14).addBox(0.0F, -22.0F, -27.0F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 32.0F));
		PartDefinition grotto_left_hind_leg = grottoceratops.addOrReplaceChild("grotto_left_hind_leg", CubeListBuilder.create().texOffs(104, 175).addBox(0.0F, -6.0F, -6.0F, 9.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -19.0F, 21.0F, 1.1345F, 0.0F, 0.0F));
		PartDefinition grotto_l_hind_leg_segment = grotto_left_hind_leg.addOrReplaceChild("grotto_l_hind_leg_segment", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -1.0F, 6.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(186, 180).addBox(-3.0F, 11.0F, -3.0F, 8.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 8.0F, -2.0F, 0.3927F, 0.0F, 0.4363F));
		PartDefinition grotto_right_hind_leg = grottoceratops.addOrReplaceChild("grotto_right_hind_leg", CubeListBuilder.create().texOffs(61, 211).mirror().addBox(-9.0F, -6.0F, -6.0F, 9.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.0F, -19.0F, 21.0F, 1.1345F, 0.0F, 0.0F));
		PartDefinition grotto_R_hind_leg_segment = grotto_right_hind_leg.addOrReplaceChild("grotto_R_hind_leg_segment", CubeListBuilder.create().texOffs(106, 217).mirror().addBox(-2.0F, 1.0F, -1.0F, 6.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(136, 225).mirror().addBox(-3.0F, 14.0F, -3.0F, 8.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 8.0F, -2.0F, 0.4363F, 0.0F, -0.4363F));
		PartDefinition grotto_head = grottoceratops.addOrReplaceChild("grotto_head", CubeListBuilder.create().texOffs(0, 163).addBox(-11.0F, -19.0F, -3.0F, 22.0F, 18.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(177, 18).addBox(-7.0F, -7.0F, -10.0F, 14.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(56, 50).addBox(4.0F, -11.0F, -10.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 50).addBox(-7.0F, -11.0F, -10.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(146, 180).addBox(-6.0F, -18.0F, -20.0F, 12.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 76).addBox(-4.0F, 0.0F, -20.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 184).addBox(-4.0F, -7.0F, -20.0F, 8.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(56, 50).addBox(-7.0F, -11.0F, -10.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 50).addBox(4.0F, -11.0F, -10.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(146, 180).addBox(-6.0F, -18.0F, -20.0F, 12.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 76).addBox(-4.0F, 0.0F, -20.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 184).addBox(-4.0F, -7.0F, -20.0F, 8.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -21.0F, -8.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition grotto_mouth = grottoceratops.addOrReplaceChild("grotto_mouth", CubeListBuilder.create().texOffs(42, 0).addBox(-4.0F, 0.0F, -6.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(177, 0).addBox(-7.0F, 0.0F, 0.0F, 14.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(181, 110).addBox(-6.0F, -7.0F, 2.0F, 12.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 14).addBox(5.9F, -7.0F, 2.0F, 0.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(45, 36).addBox(-3.0F, -6.0F, -5.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 14).addBox(15.0F, 2.0F, -5.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 14).addBox(-24.0F, 2.0F, 48.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 14).addBox(6.0F, 2.0F, 58.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(45, 36).addBox(-24.0F, 2.0F, 15.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(45, 36).addBox(17.0F, 2.0F, 26.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, -18.0F));
		PartDefinition bones = grottoceratops.addOrReplaceChild("bones", CubeListBuilder.create().texOffs(0, 76).addBox(-8.0F, 2.0F, -15.0F, 16.0F, 20.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, 0.0F, -15.0F, 6.0F, 6.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -37.0F, 15.0F, -0.1745F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(RoastedGrottoceratops entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		this.grottoceratops.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return this.grottoceratops;
	}
}