package net.thevaliantsquidward.cavedelight.events;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.thevaliantsquidward.cavedelight.CaveDelight;
import net.thevaliantsquidward.cavedelight.registry.CaveDelightItems;

@Mod.EventBusSubscriber(modid = CaveDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ClientEvents {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent e) {
        ItemProperties.register(CaveDelightItems.HONEY_GLAZED_DINO_NUGGET.get(), new ResourceLocation(CaveDelight.MOD_ID, "nugget"), (stack, level, living, j) -> (stack.getCount() % 4) / 4F);
    }
}