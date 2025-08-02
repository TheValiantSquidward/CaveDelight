package net.thevaliantsquidward.cavedelight.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.thevaliantsquidward.cavedelight.CaveDelight;
import net.thevaliantsquidward.cavedelight.entities.RoastedGrottoceratops;
import net.thevaliantsquidward.cavedelight.registry.CaveDelightModelLayers;
import org.jetbrains.annotations.Nullable;

@OnlyIn(Dist.CLIENT)
public class RoastedGrottoceratopsRenderer extends LivingEntityRenderer<RoastedGrottoceratops, RoastedGrottoceratopsModel<RoastedGrottoceratops>> {

    private static final ResourceLocation STAGE1 = new ResourceLocation(CaveDelight.MOD_ID, "textures/entity/roasted_grottoceratops_stage_1.png");
    private static final ResourceLocation STAGE2 = new ResourceLocation(CaveDelight.MOD_ID, "textures/entity/roasted_grottoceratops_stage_2.png");
    private static final ResourceLocation STAGE3 = new ResourceLocation(CaveDelight.MOD_ID, "textures/entity/roasted_grottoceratops_stage_3.png");
    private static final ResourceLocation STAGE4 = new ResourceLocation(CaveDelight.MOD_ID, "textures/entity/roasted_grottoceratops_stage_4.png");
    private static final ResourceLocation STAGE5 = new ResourceLocation(CaveDelight.MOD_ID, "textures/entity/roasted_grottoceratops_stage_5.png");
    private static final ResourceLocation STAGE6 = new ResourceLocation(CaveDelight.MOD_ID, "textures/entity/roasted_grottoceratops_stage_6.png");
    private static final ResourceLocation STAGE7 = new ResourceLocation(CaveDelight.MOD_ID, "textures/entity/roasted_grottoceratops_stage_7.png");
    private static final ResourceLocation STAGE8 = new ResourceLocation(CaveDelight.MOD_ID, "textures/entity/roasted_grottoceratops_stage_8.png");
    private static final ResourceLocation STAGE9 = new ResourceLocation(CaveDelight.MOD_ID, "textures/entity/roasted_grottoceratops_stage_9.png");
    private static final ResourceLocation STAGE10 = new ResourceLocation(CaveDelight.MOD_ID, "textures/entity/roasted_grottoceratops_stage_10.png");
    private static final ResourceLocation STAGE11 = new ResourceLocation(CaveDelight.MOD_ID, "textures/entity/roasted_grottoceratops_stage_11.png");
    private static final ResourceLocation STAGE12 = new ResourceLocation(CaveDelight.MOD_ID, "textures/entity/roasted_grottoceratops_stage_12.png");
    private static final ResourceLocation STAGE13 = new ResourceLocation(CaveDelight.MOD_ID, "textures/entity/roasted_grottoceratops_stage_13.png");

    public RoastedGrottoceratopsRenderer(EntityRendererProvider.Context context) {
        super(context, new RoastedGrottoceratopsModel<>(context.bakeLayer(CaveDelightModelLayers.ROASTED_GROTTOCERATOPS_LAYER)), 0.0F);
    }

    @Override
    protected void setupRotations(RoastedGrottoceratops entity, PoseStack matrixStack, float f, float g, float h) {
        super.setupRotations(entity, matrixStack, f, g, h);
        matrixStack.translate(0, 1.5, 0);
        matrixStack.mulPose(Axis.ZP.rotationDegrees(180.0f));
    }

    protected boolean shouldShowName(RoastedGrottoceratops entity) {
        return false;
    }

    @Override
    public ResourceLocation getTextureLocation(RoastedGrottoceratops entity) {
        return switch (entity.getConsumptionStage()) {
            case 1 -> STAGE2;
            case 2 -> STAGE3;
            case 3 -> STAGE4;
            case 4 -> STAGE5;
            case 5 -> STAGE6;
            case 6 -> STAGE7;
            case 7 -> STAGE8;
            case 8 -> STAGE9;
            case 9 -> STAGE10;
            case 10 -> STAGE11;
            case 11 -> STAGE12;
            case 12 -> STAGE13;
            default -> STAGE1;
        };
    }

    @Override
    protected @Nullable RenderType getRenderType(RoastedGrottoceratops entity, boolean bodyVisible, boolean translucent, boolean glowing) {
        return RenderType.entityCutoutNoCull(new ResourceLocation(CaveDelight.MOD_ID,"textures/entity/roasted_grottoceratops_stage_" + (entity.getConsumptionStage() + 1) + ".png"));
    }
}
