package net.thevaliantsquidward.cavedelight.registry;

import com.github.alexmodguy.alexscaves.server.item.RadiationRemovingFoodItem;
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
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CaveDelightItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CaveDelight.MOD_ID);
    public static List<RegistryObject<? extends Item>> AUTO_TRANSLATE = new ArrayList<>();

    public static final RegistryObject<Item> BOILED_DINO_EGG = registerItem("boiled_dino_egg", () -> new Item(foodItem(CaveDelightFoodValues.BOILED_DINO_EGG)));
    public static final RegistryObject<Item> COOKED_CURIOUS_INSECT = registerItem("cooked_curious_insect", () -> new Item(foodItem(CaveDelightFoodValues.COOKED_CURIOUS_INSECT)));
    public static final RegistryObject<Item> COOKED_DINO_CUT = registerItem("cooked_dino_cut", () -> new Item(foodItem(CaveDelightFoodValues.COOKED_DINO_CUT)));
    public static final RegistryObject<Item> COOKED_TRILOCARIS_SLICE = registerItem("cooked_trilocaris_slice", () -> new Item(foodItem(CaveDelightFoodValues.COOKED_TRILOCARIS_SLICE)));
    public static final RegistryObject<Item> CURIOUS_INSECT = registerItem("curious_insect", () -> new Item(foodItem(CaveDelightFoodValues.CURIOUS_INSECT)));
    public static final RegistryObject<Item> DINO_CHOP_PASTA = registerItem("dino_chop_pasta", () -> new BowlFoodItem(foodItem(CaveDelightFoodValues.DINO_CHOP_PASTA).stacksTo(16)));
    public static final RegistryObject<Item> DINO_CUT_RICE = registerItem("dino_cut_rice", () -> new BowlFoodItem(foodItem(CaveDelightFoodValues.DINO_CUT_RICE).stacksTo(16)));
    public static final RegistryObject<Item> FIDDLEHEAD_TEA = registerItem("fiddlehead_tea", () -> new DrinkableItem(foodItem(CaveDelightFoodValues.FIDDLEHEAD_TEA)));
    public static final RegistryObject<Item> FLYTRAP_TACO = registerItem("flytrap_taco", () -> new Item(foodItem(CaveDelightFoodValues.FLYTRAP_TACO)));
    public static final RegistryObject<Item> HONEY_GLAZED_DINO_NUGGET = registerItem("honey_glazed_dino_nugget", () -> new Item(foodItem(CaveDelightFoodValues.HONEY_GLAZED_DINO_NUGGET)));
    public static final RegistryObject<Item> LUX_AND_HAM_SANDWICH = registerItem("lux_and_ham_sandwich", () -> new Item(foodItem(CaveDelightFoodValues.LUX_AND_HAM_SANDWICH)));
    public static final RegistryObject<Item> PINE_AND_SAP_SANDWICH = registerItem("pine_and_sap_sandwich", () -> new Item(foodItem(CaveDelightFoodValues.PINE_AND_SAP_SANDWICH)));
    public static final RegistryObject<Item> PLATE_OF_GROTTO_BURNT_ENDS = registerItem("plate_of_grotto_burnt_ends", () -> new BowlFoodItem(foodItem(CaveDelightFoodValues.PLATE_OF_GROTTO_BURNT_ENDS).craftRemainder(Items.BOWL).stacksTo(16)));
    public static final RegistryObject<Item> PLATE_OF_GROTTO_LEG = registerItem("plate_of_grotto_leg", () -> new BowlFoodItem(foodItem(CaveDelightFoodValues.PLATE_OF_GROTTO_LEG).craftRemainder(Items.BOWL).stacksTo(16)));
    public static final RegistryObject<Item> PLATE_OF_ROASTED_DINO_CHOP = registerItem("plate_of_roasted_dino_chop", () -> new BowlFoodItem(foodItem(CaveDelightFoodValues.PLATE_OF_ROASTED_DINO_CHOP).craftRemainder(Items.BOWL).stacksTo(16)));
    public static final RegistryObject<Item> PLATE_OF_TAIL_CUT = registerItem("plate_of_tail_cut", () -> new BowlFoodItem(foodItem(CaveDelightFoodValues.PLATE_OF_TAIL_CUT).craftRemainder(Items.BOWL).stacksTo(16)));
    public static final RegistryObject<Item> PREHISTORIC_EGG_RICE = registerItem("prehistoric_egg_rice", () -> new Item(foodItem(CaveDelightFoodValues.PREHISTORIC_EGG_RICE)));
    public static final RegistryObject<Item> RAW_DINO_CUT = registerItem("raw_dino_cut", () -> new Item(foodItem(CaveDelightFoodValues.RAW_DINO_CUT)));
    public static final RegistryObject<Item> RAW_TRILOCARIS_SLICE = registerItem("raw_trilocaris_slice", () -> new Item(foodItem(CaveDelightFoodValues.RAW_TRILOCARIS_SLICE)));
    public static final RegistryObject<Item> SHISH_KEBAB = registerItem("shish_kebab", () -> new Item(foodItem(CaveDelightFoodValues.SHISH_KEBAB)));
    public static final RegistryObject<Item> SLICE_OF_PINENUT_PIE = registerItem("slice_of_pinenut_pie", () -> new Item(foodItem(CaveDelightFoodValues.SLICE_OF_PINENUT_PIE)));
    public static final RegistryObject<Item> SLICE_OF_TECTONIC_CHEESECAKE = registerItem("slice_of_tectonic_cheesecake", () -> new Item(foodItem(CaveDelightFoodValues.SLICE_OF_TECTONIC_CHEESECAKE)));
    public static final RegistryObject<Item> STAR_COOKIE = registerItem("star_cookie", () -> new Item(foodItem(CaveDelightFoodValues.STAR_COOKIE)));
    public static final RegistryObject<Item> STUFFED_TRILO_TAILS = registerItem("stuffed_trilo_tails", () -> new BowlFoodItem(foodItem(CaveDelightFoodValues.STUFFED_TRILO_TAILS).stacksTo(16)));
    public static final RegistryObject<Item> TECTONIC_PASTA = registerItem("tectonic_pasta", () -> new BowlFoodItem(foodItem(CaveDelightFoodValues.TECTONIC_PASTA).stacksTo(16)));
    public static final RegistryObject<Item> TRILOCARIS_NOODLES = registerItem("trilocaris_noodles", () -> new BowlFoodItem(foodItem(CaveDelightFoodValues.TRILOCARIS_NOODLES).stacksTo(16)));
    public static final RegistryObject<Item> TRILOCARIS_ROLL = registerItem("trilocaris_roll", () -> new Item(foodItem(CaveDelightFoodValues.TRILOCARIS_ROLL)));
    public static final RegistryObject<Item> VOLCANIC_CHOP = registerItem("volcanic_chop", () -> new BowlFoodItem(foodItem(CaveDelightFoodValues.VOLCANIC_CHOP).stacksTo(16)));

    public static final RegistryObject<Item> GROTTOCERATOPS_CARCASS = registerItem("grottoceratops_carcass", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ROASTED_GROTTOCERATOPS = registerItem("roasted_grottoceratops", () -> new GrottoFeastItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> RADPOP = registerItem("radpop", () -> new DrinkableItem(drinkItem().food(CaveDelightFoodValues.RADPOP), true));
    public static final RegistryObject<Item> SPELUNKIE_PUDDING = registerItem("spelunkie_pudding", () -> new RadiationRemovingConsumableItem(foodItem(CaveDelightFoodValues.SPELUNKIE_PUDDING).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> BOTTLE_OF_GREEN_SOYLENT = registerItem("bottle_of_green_soylent", () -> new RadiationRemovingDrinkableItem(drinkItem().food(CaveDelightFoodValues.GREEN_SOYLENT_BOTTLE), false));
    public static final RegistryObject<Item> NUTRIENT_BAR = registerItem("nutrient_bar", () -> new RadiationRemovingConsumableItem(foodItem(CaveDelightFoodValues.NUTRIENT_BAR)));
    public static final RegistryObject<Item> SLAM_BURGER = registerItem("slam_burger", () -> new RadiationRemovingConsumableItem(foodItem(CaveDelightFoodValues.SLAM_BURGER), true));
    public static final RegistryObject<Item> SLAM_SLICE = registerItem("slam_slice", () -> new RadiationRemovingConsumableItem(foodItem(CaveDelightFoodValues.SLAM_SLICE), true));
    public static final RegistryObject<Item> COOKED_SLAM_SLICE = registerItem("cooked_slam_slice", () -> new RadiationRemovingConsumableItem(foodItem(CaveDelightFoodValues.COOKED_SLAM_SLICE), true));
    public static final RegistryObject<Item> MUSUBI = registerItem("musubi", () -> new RadiationRemovingConsumableItem(foodItem(CaveDelightFoodValues.MUSUBI), true));
    public static final RegistryObject<Item> SLAM_ON_A_STICK = registerItem("slam_on_a_stick", () -> new RadiationRemovingConsumableItem(foodItem(CaveDelightFoodValues.SLAM_ON_A_STICK), true));
    public static final RegistryObject<Item> SLAM_BREAKFAST = registerItem("slam_breakfast", () -> new RadiationRemovingConsumableItem(bowlFoodItem(CaveDelightFoodValues.SLAM_BREAKFAST), true));
    public static final RegistryObject<Item> FRIED_SLAM_RICE = registerItem("fried_slam_rice", () -> new ConsumableItem(bowlFoodItem(CaveDelightFoodValues.FRIED_SLAM_RICE), true));
    public static final RegistryObject<Item> SLAM_RAMEN = registerItem("slam_ramen", () -> new ConsumableItem(bowlFoodItem(CaveDelightFoodValues.SLAM_RAMEN), true));
    public static final RegistryObject<Item> RADGILL_SLICE = registerItem("radgill_slice", () -> new ConsumableItem(foodItem(CaveDelightFoodValues.RADGILL_SLICE), true));
    public static final RegistryObject<Item> COOKED_RADGILL_SLICE = registerItem("cooked_radgill_slice", () -> new ConsumableItem(foodItem(CaveDelightFoodValues.COOKED_RADGILL_SLICE), true));
    public static final RegistryObject<Item> RADGILL_ROLL = registerItem("radgill_roll", () -> new ConsumableItem(foodItem(CaveDelightFoodValues.RADGILL_ROLL), true));
    public static final RegistryObject<Item> GAMMA_SPAGHETTI = registerItem("gamma_spaghetti", () -> new ConsumableItem(bowlFoodItem(CaveDelightFoodValues.GAMMA_SPAGHETTI), true));
    public static final RegistryObject<Item> RADGILL_STEW = registerItem("radgill_stew", () -> new ConsumableItem(bowlFoodItem(CaveDelightFoodValues.RADGILL_STEW), true));
    public static final RegistryObject<Item> TOXIC_SOUP = registerItem("toxic_soup", () -> new ConsumableItem(bowlFoodItem(CaveDelightFoodValues.TOXIC_SOUP), true));
    public static final RegistryObject<Item> SLICE_OF_SPELUNKIE_CAKE = registerItem("slice_of_spelunkie_cake", () -> new RadiationRemovingConsumableItem(foodItem(CaveDelightFoodValues.SLICE_OF_SPELUNKIE_CAKE)));

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

    public static Item.Properties drinkItem() {
        return (new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }

    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food);
    }

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return (new Item.Properties()).food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }
}