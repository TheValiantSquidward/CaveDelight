package net.thevaliantsquidward.cavedelight.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.cavedelight.entity.custom.RoastedGrottoceratopsEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;


public class RoastedGrottoceratopsRenderer extends EntityRenderer<RoastedGrottoceratopsEntity> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("cavedelight", "textures/entity/roasted_grottoceratops.png");

    private final RoastedGrottoceratopsModel model;

    public RoastedGrottoceratopsRenderer(EntityRendererProvider.Context context) {
        super(context);

        this.model = new RoastedGrottoceratopsModel(context.bakeLayer(ModModelLayers.ROASTED_GROTTOCERATOPS_LAYER));
    }

    @Override
    public void render(RoastedGrottoceratopsEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        poseStack.pushPose();
        poseStack.translate(0.0D, 1.5D, 0.0D);
        poseStack.scale(1.0F, -1.0F, 1.0F);
        VertexConsumer vertexConsumer = buffer.getBuffer(model.renderType(getTextureLocation(entity)));
        model.renderToBuffer(poseStack, vertexConsumer, packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        poseStack.popPose();
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }

    @Override
    public ResourceLocation getTextureLocation(RoastedGrottoceratopsEntity entity) {
        return TEXTURE;
    }
}
