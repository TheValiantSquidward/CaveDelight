package net.thevaliantsquidward.cavedelight.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.cavedelight.CaveDelight;
import net.thevaliantsquidward.cavedelight.entity.ModEntities;
import net.thevaliantsquidward.cavedelight.entity.client.ModModelLayers;
import net.thevaliantsquidward.cavedelight.entity.client.RoastedGrottoceratopsModel;
import net.thevaliantsquidward.cavedelight.entity.client.RoastedGrottoceratopsRenderer;

@Mod.EventBusSubscriber(modid = CaveDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEventBusEvents {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.ROASTED_GROTTOCERATOPS.get(), RoastedGrottoceratopsRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.ROASTED_GROTTOCERATOPS_LAYER, RoastedGrottoceratopsModel::createBodyLayer);
    }
}