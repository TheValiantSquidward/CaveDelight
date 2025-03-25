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

    private static final ResourceLocation TEXTURE = new ResourceLocation("cavedelight", "textures/entity/roasted_grotto.png");
    private static final ResourceLocation TEXTURE1 = new ResourceLocation("cavedelight", "textures/entity/roasted_grotto1.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation("cavedelight", "textures/entity/roasted_grotto2.png");
    private static final ResourceLocation TEXTURE3 = new ResourceLocation("cavedelight", "textures/entity/roasted_grotto3.png");
    private static final ResourceLocation TEXTURE4 = new ResourceLocation("cavedelight", "textures/entity/roasted_grotto4.png");
    private static final ResourceLocation TEXTURE5 = new ResourceLocation("cavedelight", "textures/entity/roasted_grotto5.png");
    private static final ResourceLocation TEXTURE6 = new ResourceLocation("cavedelight", "textures/entity/roasted_grotto6.png");
    private static final ResourceLocation TEXTURE7 = new ResourceLocation("cavedelight", "textures/entity/roasted_grotto7.png");
    private static final ResourceLocation TEXTURE8 = new ResourceLocation("cavedelight", "textures/entity/roasted_grotto8.png");
    private static final ResourceLocation TEXTURE9 = new ResourceLocation("cavedelight", "textures/entity/roasted_grotto9.png");
    private static final ResourceLocation TEXTURE10 = new ResourceLocation("cavedelight", "textures/entity/roasted_grotto10.png");
    private static final ResourceLocation TEXTURE11 = new ResourceLocation("cavedelight", "textures/entity/roasted_grotto11.png");
    private static final ResourceLocation TEXTURE12 = new ResourceLocation("cavedelight", "textures/entity/roasted_grotto12.png");


    private final RoastedGrottoceratopsModel model;

    public RoastedGrottoceratopsRenderer(EntityRendererProvider.Context context) {
        super(context);

        this.model = new RoastedGrottoceratopsModel(context.bakeLayer(ModModelLayers.ROASTED_GROTTOCERATOPS_LAYER));
    }

   // @Override
   // public void render(RoastedGrottoceratopsEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
   //     poseStack.pushPose();
   //     poseStack.translate(0.0D, 1.5D, 0.0D);
   //     poseStack.scale(1.0F, -1.0F, 1.0F);
   //     VertexConsumer vertexConsumer = buffer.getBuffer(model.renderType(getTextureLocation(entity)));
   //     model.renderToBuffer(poseStack, vertexConsumer, packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
   //     poseStack.popPose();
   //     super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
   // }

    @Override
    public void render(RoastedGrottoceratopsEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        VertexConsumer vertexConsumer = pBuffer.getBuffer(model.renderType(getTextureLocation(pEntity)));
        model.renderToBuffer(pMatrixStack, vertexConsumer, pPackedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

    @Override
    public ResourceLocation getTextureLocation(RoastedGrottoceratopsEntity entity) {
        return switch (entity.getConsumptionStage()) {
            case 1 -> TEXTURE1;
            case 2 -> TEXTURE2;
            case 3 -> TEXTURE3;
            case 4 -> TEXTURE4;
            case 5 -> TEXTURE5;
            case 6 -> TEXTURE6;
            case 7 -> TEXTURE7;
            case 8 -> TEXTURE8;
            case 9 -> TEXTURE9;
            case 10 -> TEXTURE10;
            case 11 -> TEXTURE11;
            case 12 -> TEXTURE12;
            default -> TEXTURE;
        };
    }
}
