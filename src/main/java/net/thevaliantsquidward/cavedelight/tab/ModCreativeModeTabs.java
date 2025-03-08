package net.thevaliantsquidward.cavedelight.tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.cavedelight.CaveDelight;
import net.thevaliantsquidward.cavedelight.block.ModBlocks;
import net.thevaliantsquidward.cavedelight.item.ModItems;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CaveDelight.MOD_ID);

    public static final RegistryObject<CreativeModeTab> UNUSUAL_HYBRID_TAB = CREATIVE_MODE_TABS.register("hybrid_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BOILED_DINO_EGG.get()))
                    .title(Component.translatable("creativetab.cavedelight"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.BOILED_DINO_EGG.get());
                        pOutput.accept(ModItems.COOKED_CURIOUS_INSECT.get());
                        pOutput.accept(ModItems.COOKED_DINO_CUT.get());
                        pOutput.accept(ModItems.COOKED_TRILOCARIS_SLICE.get());
                        pOutput.accept(ModItems.CURIOUS_INSECT.get());
                        pOutput.accept(ModItems.DINO_CHOP_PASTA.get());
                        pOutput.accept(ModItems.DINO_CUT_RICE.get());
                        pOutput.accept(ModItems.FIDDLEHEAD_TEA.get());
                        pOutput.accept(ModItems.FLYTRAP_TACO.get());
                        pOutput.accept(ModItems.HONEY_GLAZED_DINO_NUGGET.get());
                        pOutput.accept(ModItems.LUX_AND_HAM_SANDWICH.get());
                        pOutput.accept(ModItems.PINE_AND_SAP_SANDWICH.get());
                        pOutput.accept(ModItems.PLATE_OF_GROTTO_BURNT_ENDS.get());
                        pOutput.accept(ModItems.PLATE_OF_GROTTO_LEG.get());
                        pOutput.accept(ModItems.PLATE_OF_ROASTED_DINO_CHOP.get());
                        pOutput.accept(ModItems.PLATE_OF_TAIL_CUT.get());
                        pOutput.accept(ModItems.PREHISTORIC_EGG_RICE.get());
                        pOutput.accept(ModItems.RAW_DINO_CUT.get());
                        pOutput.accept(ModItems.RAW_TRILOCARIS_SLICE.get());
                        pOutput.accept(ModItems.SHISH_KEBAB.get());
                        pOutput.accept(ModItems.SLICE_OF_PINENUT_PIE.get());
                        pOutput.accept(ModItems.SLICE_OF_TECTONIC_CHEESECAKE.get());
                        pOutput.accept(ModItems.STAR_COOKIE.get());
                        pOutput.accept(ModItems.STUFFED_TRILO_TAILS.get());
                        pOutput.accept(ModItems.TECTONIC_PASTA.get());
                        pOutput.accept(ModItems.TRILOCARIS_NOODLES.get());
                        pOutput.accept(ModItems.TRILOCARIS_ROLL.get());
                        pOutput.accept(ModItems.VOLCANIC_CHOP.get());

                        pOutput.accept(ModBlocks.BOILED_TRILOCARIS.get());
                        pOutput.accept(ModBlocks.ROASTED_DINO_CHOP.get());
                        pOutput.accept(ModBlocks.PINENUT_PIE.get());
                        pOutput.accept(ModBlocks.TECTONIC_CHEESECAKE.get());

                        //pOutput.accept(ModBlocks.DINO_NUGGET_PLATTER.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
