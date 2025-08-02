package net.thevaliantsquidward.cavedelight.registry;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.cavedelight.CaveDelight;

public class CaveDelightModelLayers {

    public static final ModelLayerLocation ROASTED_GROTTOCERATOPS_LAYER = main("roasted_grottoceratops");

    private static ModelLayerLocation main(String id) {
        return register(id, "main");
    }

    private static ModelLayerLocation register(String id, String name) {
        return new ModelLayerLocation(new ResourceLocation(CaveDelight.MOD_ID, id), name);
    }
}