package net.thevaliantsquidward.cavedelight;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.thevaliantsquidward.cavedelight.block.ModBlocks;
import net.thevaliantsquidward.cavedelight.entity.ModEntities;
import net.thevaliantsquidward.cavedelight.item.ModItems;
import net.thevaliantsquidward.cavedelight.tab.ModCreativeModeTabs;

@Mod(CaveDelight.MOD_ID)
public class CaveDelight {

    public static final String MOD_ID = "cavedelight";

    public CaveDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        ModEntities.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
