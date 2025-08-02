package net.thevaliantsquidward.cavedelight;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.cavedelight.registry.CaveDelightBlocks;
import net.thevaliantsquidward.cavedelight.registry.CaveDelightItems;

public class CaveDelightCreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CaveDelight.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CAVE_DELIGHT_TAB = CREATIVE_MODE_TABS.register("cavedelight_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CaveDelightItems.ROASTED_GROTTOCERATOPS.get()))
                    .title(Component.translatable("creativetab.cavedelight"))
                    .displayItems((pParameters, output) -> {

                        output.accept(CaveDelightItems.BOILED_DINO_EGG.get());
                        output.accept(CaveDelightItems.COOKED_CURIOUS_INSECT.get());
                        output.accept(CaveDelightItems.COOKED_DINO_CUT.get());
                        output.accept(CaveDelightItems.COOKED_TRILOCARIS_SLICE.get());
                        output.accept(CaveDelightItems.CURIOUS_INSECT.get());
                        output.accept(CaveDelightItems.DINO_CHOP_PASTA.get());
                        output.accept(CaveDelightItems.DINO_CUT_RICE.get());
                        output.accept(CaveDelightItems.FIDDLEHEAD_TEA.get());
                        output.accept(CaveDelightItems.FLYTRAP_TACO.get());
                        output.accept(CaveDelightItems.HONEY_GLAZED_DINO_NUGGET.get());
                        output.accept(CaveDelightItems.LUX_AND_HAM_SANDWICH.get());
                        output.accept(CaveDelightItems.PINE_AND_SAP_SANDWICH.get());
                        output.accept(CaveDelightItems.PLATE_OF_GROTTO_BURNT_ENDS.get());
                        output.accept(CaveDelightItems.PLATE_OF_GROTTO_LEG.get());
                        output.accept(CaveDelightItems.PLATE_OF_ROASTED_DINO_CHOP.get());
                        output.accept(CaveDelightItems.PLATE_OF_TAIL_CUT.get());
                        output.accept(CaveDelightItems.PREHISTORIC_EGG_RICE.get());
                        output.accept(CaveDelightItems.RAW_DINO_CUT.get());
                        output.accept(CaveDelightItems.RAW_TRILOCARIS_SLICE.get());
                        output.accept(CaveDelightItems.SHISH_KEBAB.get());
                        output.accept(CaveDelightItems.SLICE_OF_PINENUT_PIE.get());
                        output.accept(CaveDelightItems.SLICE_OF_TECTONIC_CHEESECAKE.get());
                        output.accept(CaveDelightItems.STAR_COOKIE.get());
                        output.accept(CaveDelightItems.STUFFED_TRILO_TAILS.get());
                        output.accept(CaveDelightItems.TECTONIC_PASTA.get());
                        output.accept(CaveDelightItems.TRILOCARIS_NOODLES.get());
                        output.accept(CaveDelightItems.TRILOCARIS_ROLL.get());
                        output.accept(CaveDelightItems.VOLCANIC_CHOP.get());

                        output.accept(CaveDelightBlocks.BOILED_TRILOCARIS.get());
                        output.accept(CaveDelightBlocks.ROASTED_DINO_CHOP.get());
                        output.accept(CaveDelightBlocks.PINENUT_PIE.get());
                        output.accept(CaveDelightBlocks.TECTONIC_CHEESECAKE.get());

                        output.accept(CaveDelightItems.GROTTOCERATOPS_CARCASS.get());
                        output.accept(CaveDelightItems.ROASTED_GROTTOCERATOPS.get());

                        output.accept(CaveDelightItems.RADPOP.get());
                        output.accept(CaveDelightItems.SPELUNKIE_PUDDING.get());
                        output.accept(CaveDelightItems.BOTTLE_OF_GREEN_SOYLENT.get());
                        output.accept(CaveDelightItems.NUTRIENT_BAR.get());
                        output.accept(CaveDelightItems.SLAM_BURGER.get());
                        output.accept(CaveDelightItems.SLAM_SLICE.get());
                        output.accept(CaveDelightItems.COOKED_SLAM_SLICE.get());
                        output.accept(CaveDelightItems.MUSUBI.get());
                        output.accept(CaveDelightItems.SLAM_ON_A_STICK.get());
                        output.accept(CaveDelightItems.SLAM_BREAKFAST.get());
                        output.accept(CaveDelightItems.FRIED_SLAM_RICE.get());
                        output.accept(CaveDelightItems.SLAM_RAMEN.get());
                        output.accept(CaveDelightItems.RADGILL_SLICE.get());
                        output.accept(CaveDelightItems.COOKED_RADGILL_SLICE.get());
                        output.accept(CaveDelightItems.RADGILL_ROLL.get());
                        output.accept(CaveDelightItems.GAMMA_SPAGHETTI.get());
                        output.accept(CaveDelightItems.RADGILL_STEW.get());
                        output.accept(CaveDelightItems.TOXIC_SOUP.get());
                        output.accept(CaveDelightItems.SLICE_OF_SPELUNKIE_CAKE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
