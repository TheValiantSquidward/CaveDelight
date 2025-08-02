package net.thevaliantsquidward.cavedelight;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.thevaliantsquidward.cavedelight.registry.CaveDelightBlocks;
import net.thevaliantsquidward.cavedelight.registry.CaveDelightEntities;
import net.thevaliantsquidward.cavedelight.registry.CaveDelightItems;

@Mod(CaveDelight.MOD_ID)
public class CaveDelight {

    public static final String MOD_ID = "cavedelight";

    public CaveDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CaveDelightItems.register(modEventBus);

        CaveDelightEntities.register(modEventBus);
        CaveDelightCreativeTab.register(modEventBus);
        CaveDelightBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
