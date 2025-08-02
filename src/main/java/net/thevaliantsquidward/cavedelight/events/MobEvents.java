package net.thevaliantsquidward.cavedelight.events;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.cavedelight.CaveDelight;
import net.thevaliantsquidward.cavedelight.registry.CaveDelightEntities;
import net.thevaliantsquidward.cavedelight.entities.RoastedGrottoceratops;

@Mod.EventBusSubscriber(modid = CaveDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MobEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(CaveDelightEntities.ROASTED_GROTTOCERATOPS.get(), RoastedGrottoceratops.createAttributes().build());
    }
}
