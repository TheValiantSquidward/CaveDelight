package net.thevaliantsquidward.cavedelight.registry;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.cavedelight.CaveDelight;
import net.thevaliantsquidward.cavedelight.items.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CaveDelightItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CaveDelight.MOD_ID);
    public static List<RegistryObject<? extends Item>> AUTO_TRANSLATE = new ArrayList<>();

    public static final RegistryObject<Item> BOILED_DINO_EGG = registerItem("boiled_dino_egg", () -> new Item(registerFoodValue(CaveDelightFoodValues.BOILED_DINO_EGG)));
    public static final RegistryObject<Item> COOKED_CURIOUS_INSECT = registerItem("cooked_curious_insect", () -> new Item(registerFoodValue(CaveDelightFoodValues.COOKED_CURIOUS_INSECT)));
    public static final RegistryObject<Item> COOKED_DINO_CUT = registerItem("cooked_dino_cut", () -> new Item(registerFoodValue(CaveDelightFoodValues.COOKED_DINO_CUT)));
    public static final RegistryObject<Item> COOKED_TRILOCARIS_SLICE = registerItem("cooked_trilocaris_slice", () -> new Item(registerFoodValue(CaveDelightFoodValues.COOKED_TRILOCARIS_SLICE)));
    public static final RegistryObject<Item> CURIOUS_INSECT = registerItem("curious_insect", () -> new Item(registerFoodValue(CaveDelightFoodValues.CURIOUS_INSECT)));
    public static final RegistryObject<Item> DINO_CHOP_PASTA = registerItem("dino_chop_pasta", () -> new BowlFoodItem(registerFoodValue(CaveDelightFoodValues.DINO_CHOP_PASTA).stacksTo(16)));
    public static final RegistryObject<Item> DINO_CUT_RICE = registerItem("dino_cut_rice", () -> new BowlFoodItem(registerFoodValue(CaveDelightFoodValues.DINO_CUT_RICE).stacksTo(16)));
    public static final RegistryObject<Item> FIDDLEHEAD_TEA = registerItem("fiddlehead_tea", () -> new DrinkableBottleItem(registerFoodValue(CaveDelightFoodValues.FIDDLEHEAD_TEA)));
    public static final RegistryObject<Item> FLYTRAP_TACO = registerItem("flytrap_taco", () -> new Item(registerFoodValue(CaveDelightFoodValues.FLYTRAP_TACO)));
    public static final RegistryObject<Item> HONEY_GLAZED_DINO_NUGGET = registerItem("honey_glazed_dino_nugget", () -> new Item(registerFoodValue(CaveDelightFoodValues.HONEY_GLAZED_DINO_NUGGET)));
    public static final RegistryObject<Item> LUX_AND_HAM_SANDWICH = registerItem("lux_and_ham_sandwich", () -> new Item(registerFoodValue(CaveDelightFoodValues.LUX_AND_HAM_SANDWICH)));
    public static final RegistryObject<Item> PINE_AND_SAP_SANDWICH = registerItem("pine_and_sap_sandwich", () -> new Item(registerFoodValue(CaveDelightFoodValues.PINE_AND_SAP_SANDWICH)));
    public static final RegistryObject<Item> PLATE_OF_GROTTO_BURNT_ENDS = registerItem("plate_of_grotto_burnt_ends", () -> new BowlFoodItem(registerFoodValue(CaveDelightFoodValues.PLATE_OF_GROTTO_BURNT_ENDS).craftRemainder(Items.BOWL).stacksTo(16)));
    public static final RegistryObject<Item> PLATE_OF_GROTTO_LEG = registerItem("plate_of_grotto_leg", () -> new BowlFoodItem(registerFoodValue(CaveDelightFoodValues.PLATE_OF_GROTTO_LEG).craftRemainder(Items.BOWL).stacksTo(16)));
    public static final RegistryObject<Item> PLATE_OF_ROASTED_DINO_CHOP = registerItem("plate_of_roasted_dino_chop", () -> new BowlFoodItem(registerFoodValue(CaveDelightFoodValues.PLATE_OF_ROASTED_DINO_CHOP).craftRemainder(Items.BOWL).stacksTo(16)));
    public static final RegistryObject<Item> PLATE_OF_TAIL_CUT = registerItem("plate_of_tail_cut", () -> new BowlFoodItem(registerFoodValue(CaveDelightFoodValues.PLATE_OF_TAIL_CUT).craftRemainder(Items.BOWL).stacksTo(16)));
    public static final RegistryObject<Item> PREHISTORIC_EGG_RICE = registerItem("prehistoric_egg_rice", () -> new Item(registerFoodValue(CaveDelightFoodValues.PREHISTORIC_EGG_RICE)));
    public static final RegistryObject<Item> RAW_DINO_CUT = registerItem("raw_dino_cut", () -> new Item(registerFoodValue(CaveDelightFoodValues.RAW_DINO_CUT)));
    public static final RegistryObject<Item> RAW_TRILOCARIS_SLICE = registerItem("raw_trilocaris_slice", () -> new Item(registerFoodValue(CaveDelightFoodValues.RAW_TRILOCARIS_SLICE)));
    public static final RegistryObject<Item> SHISH_KEBAB = registerItem("shish_kebab", () -> new Item(registerFoodValue(CaveDelightFoodValues.SHISH_KEBAB)));
    public static final RegistryObject<Item> SLICE_OF_PINENUT_PIE = registerItem("slice_of_pinenut_pie", () -> new Item(registerFoodValue(CaveDelightFoodValues.SLICE_OF_PINENUT_PIE)));
    public static final RegistryObject<Item> SLICE_OF_TECTONIC_CHEESECAKE = registerItem("slice_of_tectonic_cheesecake", () -> new Item(registerFoodValue(CaveDelightFoodValues.SLICE_OF_TECTONIC_CHEESECAKE)));
    public static final RegistryObject<Item> STAR_COOKIE = registerItem("star_cookie", () -> new Item(registerFoodValue(CaveDelightFoodValues.STAR_COOKIE)));
    public static final RegistryObject<Item> STUFFED_TRILO_TAILS = registerItem("stuffed_trilo_tails", () -> new BowlFoodItem(registerFoodValue(CaveDelightFoodValues.STUFFED_TRILO_TAILS).stacksTo(16)));
    public static final RegistryObject<Item> TECTONIC_PASTA = registerItem("tectonic_pasta", () -> new BowlFoodItem(registerFoodValue(CaveDelightFoodValues.TECTONIC_PASTA).stacksTo(16)));
    public static final RegistryObject<Item> TRILOCARIS_NOODLES = registerItem("trilocaris_noodles", () -> new BowlFoodItem(registerFoodValue(CaveDelightFoodValues.TRILOCARIS_NOODLES).stacksTo(16)));
    public static final RegistryObject<Item> TRILOCARIS_ROLL = registerItem("trilocaris_roll", () -> new Item(registerFoodValue(CaveDelightFoodValues.TRILOCARIS_ROLL)));
    public static final RegistryObject<Item> VOLCANIC_CHOP = registerItem("volcanic_chop", () -> new BowlFoodItem(registerFoodValue(CaveDelightFoodValues.VOLCANIC_CHOP).stacksTo(16)));

    public static final RegistryObject<Item> GROTTOCERATOPS_CARCASS = registerItem("grottoceratops_carcass", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ROASTED_GROTTOCERATOPS = registerItem("roasted_grottoceratops", () -> new GrottoFeastItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> RADPOP = registerItem("radpop", () -> new DrinkableBottleItem(registerFoodValue(CaveDelightFoodValues.RADPOP)));
    public static final RegistryObject<Item> SPELUNKIE_PUDDING = registerItem("spelunkie_pudding", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOTTLE_OF_GREEN_SOYLENT = registerItem("bottle_of_green_soylent", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUTRIENT_BAR = registerItem("nutrient_bar", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SLAM_BURGER = registerItem("slam_burger", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SLAM_SLICE = ITEMS.register("slam_slice", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COOKED_SLAM_SLICE = ITEMS.register("cooked_slam_slice", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MUSUBI = ITEMS.register("musubi", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SLAM_ON_A_STICK = ITEMS.register("slam_on_a_stick", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SLAM_BREAKFAST = ITEMS.register("slam_breakfast", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FRIED_SLAM_RICE = ITEMS.register("fried_slam_rice", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SLAM_RAMEN = ITEMS.register("slam_ramen", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADGILL_SLICE = ITEMS.register("radgill_slice", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COOKED_RADGILL_SLICE = ITEMS.register("cooked_radgill_slice", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADGILL_ROLL = ITEMS.register("radgill_roll", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GAMMA_SPAGHETTI = ITEMS.register("gamma_spaghetti", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADGILL_STEW = ITEMS.register("radgill_stew", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOXIC_SOUP = ITEMS.register("toxic_soup", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SLICE_OF_SPELUNKIE_CAKE = ITEMS.register("slice_of_spelunkie_cake", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private static <I extends Item> RegistryObject<I> registerItem(String name, Supplier<? extends I> supplier) {
        RegistryObject<I> item = ITEMS.register(name, supplier);
        AUTO_TRANSLATE.add(item);
        return item;
    }

    private static <I extends Item> RegistryObject<I> registerItemNoLang(String name, Supplier<? extends I> supplier) {
        RegistryObject<I> item = ITEMS.register(name, supplier);
        return item;
    }

    public static Item.Properties registerFoodValue(FoodProperties food) {
        return new Item.Properties().food(food);
    }
}