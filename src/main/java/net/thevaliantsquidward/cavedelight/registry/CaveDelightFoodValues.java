package net.thevaliantsquidward.cavedelight.registry;

import com.github.alexmodguy.alexscaves.server.potion.ACEffectRegistry;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class CaveDelightFoodValues {

    public static final FoodProperties BOILED_DINO_EGG = (new FoodProperties.Builder())
            .nutrition(1).saturationMod(0.4F)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1F)
            .build();

    public static final FoodProperties COOKED_CURIOUS_INSECT = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 1F)
            .build();

    public static final FoodProperties COOKED_DINO_CUT = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.3F)
            .build();

    public static final FoodProperties COOKED_TRILOCARIS_SLICE = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.6F)
            .build();

    public static final FoodProperties CURIOUS_INSECT = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 300, 0), 1F)
            .build();

    public static final FoodProperties DINO_CHOP_PASTA = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1F)
            .build();

    public static final FoodProperties DINO_CUT_RICE = (new FoodProperties.Builder())
            .nutrition(18).saturationMod(0.7F)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1F)
            .build();

    public static final FoodProperties FIDDLEHEAD_TEA = (new FoodProperties.Builder())
            .alwaysEat()
            .effect(() -> new MobEffectInstance(ACEffectRegistry.RAGE.get(), 3600, 0), 1F)
            .build();

    public static final FoodProperties FLYTRAP_TACO = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 1F)
            .build();

    public static final FoodProperties HONEY_GLAZED_DINO_NUGGET = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(1.3F)
            .build();

    public static final FoodProperties LUX_AND_HAM_SANDWICH = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 0), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 1F)
            .build();

    public static final FoodProperties PINE_AND_SAP_SANDWICH = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1F)
            .build();

    public static final FoodProperties PLATE_OF_GROTTO_BURNT_ENDS = (new FoodProperties.Builder())
            .nutrition(14).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1F)
            .build();

    public static final FoodProperties PLATE_OF_GROTTO_LEG = (new FoodProperties.Builder())
            .nutrition(20).saturationMod(0.5F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1F)
            .build();

    public static final FoodProperties PLATE_OF_ROASTED_DINO_CHOP = (new FoodProperties.Builder())
            .nutrition(14).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(ACEffectRegistry.RAGE.get(), 2400, 0), 1F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1F)
            .build();

    public static final FoodProperties PLATE_OF_TAIL_CUT = (new FoodProperties.Builder())
            .nutrition(16).saturationMod(0.7F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1F)
            .build();

    public static final FoodProperties PREHISTORIC_EGG_RICE = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(0.3F)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 3600, 0), 1F)
            .build();

    public static final FoodProperties RAW_DINO_CUT = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.2F)
            .build();

    public static final FoodProperties RAW_TRILOCARIS_SLICE = (new FoodProperties.Builder())
            .nutrition(2).saturationMod(0.2F)
            .build();

    public static final FoodProperties SHISH_KEBAB = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(ACEffectRegistry.RAGE.get(), 1200, 0), 1F)
            .build();

    public static final FoodProperties SLICE_OF_PINENUT_PIE = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1F)
            .build();

    public static final FoodProperties SLICE_OF_TECTONIC_CHEESECAKE = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1F)
            .build();

    public static final FoodProperties STAR_COOKIE = (new FoodProperties.Builder())
            .nutrition(1).saturationMod(0.5F)
            .fast()
            .build();

    public static final FoodProperties STUFFED_TRILO_TAILS = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0), 1F)
            .build();

    public static final FoodProperties TECTONIC_PASTA = (new FoodProperties.Builder())
            .nutrition(20).saturationMod(0.5F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 12000, 0), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 0), 1F)
            .build();

    public static final FoodProperties TRILOCARIS_NOODLES = (new FoodProperties.Builder())
            .nutrition(16).saturationMod(0.9F)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 6600, 0), 1F)
            .build();

    public static final FoodProperties TRILOCARIS_ROLL = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.5F)
            .build();

    public static final FoodProperties VOLCANIC_CHOP = (new FoodProperties.Builder())
            .nutrition(16).saturationMod(0.9F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0), 1F)
            .build();

    // toxic
    public static final FoodProperties RADPOP = (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 0), 1F)
            .effect(() -> new MobEffectInstance(ACEffectRegistry.IRRADIATED.get(), 400, 0), 1F)
            .alwaysEat()
            .build();

    public static final FoodProperties SPELUNKIE_PUDDING = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.6F)
            .build();

    public static final FoodProperties GREEN_SOYLENT_BOTTLE = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.6F)
            .build();

    public static final FoodProperties NUTRIENT_BAR = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.9F)
            .build();

    public static final FoodProperties SLAM_BURGER = (new FoodProperties.Builder())
            .nutrition(11).saturationMod(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 0), 1F)
            .build();

    public static final FoodProperties SLAM_SLICE = (new FoodProperties.Builder())
            .nutrition(2).saturationMod(0.5F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0), 1F)
            .fast()
            .build();

    public static final FoodProperties COOKED_SLAM_SLICE = (new FoodProperties.Builder())
            .nutrition(2).saturationMod(0.9F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0), 1F)
            .fast()
            .build();

    public static final FoodProperties MUSUBI = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 0), 1F)
            .build();

    public static final FoodProperties SLAM_ON_A_STICK = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.75F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 800, 0), 1F)
            .build();

    public static final FoodProperties SLAM_BREAKFAST = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.6F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 1), 1F)
            .build();

    public static final FoodProperties FRIED_SLAM_RICE = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0), 1F)
            .build();

    public static final FoodProperties SLAM_RAMEN = (new FoodProperties.Builder())
            .nutrition(14).saturationMod(0.75F)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 1), 1F)
            .build();

    public static final FoodProperties RADGILL_SLICE = (new FoodProperties.Builder())
            .nutrition(1).saturationMod(0.1F)
            .effect(() -> new MobEffectInstance(ACEffectRegistry.IRRADIATED.get(), 1000, 0), 1F)
            .fast()
            .build();

    public static final FoodProperties COOKED_RADGILL_SLICE = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.5F)
            .effect(() -> new MobEffectInstance(ACEffectRegistry.IRRADIATED.get(), 1000, 0), 0.1F)
            .fast()
            .build();

    public static final FoodProperties RADGILL_ROLL = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(0.6F)
            .effect(() -> new MobEffectInstance(ACEffectRegistry.IRRADIATED.get(), 1000, 0), 0.1F)
            .build();

    public static final FoodProperties GAMMA_SPAGHETTI = (new FoodProperties.Builder())
            .nutrition(14).saturationMod(0.75F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1F)
            .effect(() -> new MobEffectInstance(ACEffectRegistry.IRRADIATED.get(), 1200, 0), 0.1F)
            .build();

    public static final FoodProperties RADGILL_STEW = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1F)
            .effect(() -> new MobEffectInstance(ACEffectRegistry.IRRADIATED.get(), 1000, 0), 0.1F)
            .build();

    public static final FoodProperties TOXIC_SOUP = (new FoodProperties.Builder())
            .nutrition(14).saturationMod(0.75F)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1F)
            .effect(() -> new MobEffectInstance(ACEffectRegistry.IRRADIATED.get(), 1800, 0), 0.5F)
            .build();

    public static final FoodProperties SLICE_OF_SPELUNKIE_CAKE = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1F)
            .fast()
            .build();

}
