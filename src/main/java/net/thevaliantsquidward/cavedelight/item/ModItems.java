package net.thevaliantsquidward.cavedelight.item;

import com.github.alexmodguy.alexscaves.server.potion.ACEffectRegistry;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.cavedelight.CaveDelight;
import net.thevaliantsquidward.cavedelight.block.ModBlocks;
import net.thevaliantsquidward.cavedelight.entity.ModEntities;
import net.thevaliantsquidward.cavedelight.item.custom.DrinkableBottleItem;
import net.thevaliantsquidward.cavedelight.item.custom.GrottoFeastItem;
import net.thevaliantsquidward.cavedelight.item.custom.ShishKebabItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CaveDelight.MOD_ID);


     public static final RegistryObject<Item> BOILED_DINO_EGG = ITEMS.register("boiled_dino_egg", () ->
             new Item(new Item.Properties().food(new FoodProperties.Builder()
                     .nutrition(1).saturationMod(0.4F)
                     .effect(new MobEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1F)
                     .build())));

     public static final RegistryObject<Item> COOKED_CURIOUS_INSECT = ITEMS.register("cooked_curious_insect", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(3).saturationMod(0.6F).meat()
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> COOKED_DINO_CUT = ITEMS.register("cooked_dino_cut", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(8).saturationMod(0.3F).meat()
                    .build())));

    public static final RegistryObject<Item> COOKED_TRILOCARIS_SLICE = ITEMS.register("cooked_trilocaris_slice", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(4).saturationMod(0.6F).meat()
                    .build())));

    public static final RegistryObject<Item> CURIOUS_INSECT = ITEMS.register("curious_insect", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(3).saturationMod(0.0F).meat()
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.HUNGER, 300, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> DINO_CHOP_PASTA = ITEMS.register("dino_chop_pasta", () ->
            new BowlFoodItem(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                    .nutrition(12).saturationMod(0.8F)
                    .effect(new MobEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> DINO_CUT_RICE = ITEMS.register("dino_cut_rice", () ->
            new BowlFoodItem(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                    .nutrition(18).saturationMod(0.7F)
                    .effect(new MobEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> FIDDLEHEAD_TEA = ITEMS.register("fiddlehead_tea", () ->
            new DrinkableBottleItem(new Item.Properties().food(new FoodProperties.Builder()
                    .alwaysEat()
                    .effect(new MobEffectInstance(ACEffectRegistry.RAGE.get(), 3600, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> FLYTRAP_TACO = ITEMS.register("flytrap_taco", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(0.6F)
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 1F)
                    .build())));
    public static final RegistryObject<Item> HONEY_GLAZED_DINO_NUGGET = ITEMS.register("honey_glazed_dino_nugget", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(3).saturationMod(1.3F)
                    .build())));
    public static final RegistryObject<Item> LUX_AND_HAM_SANDWICH = ITEMS.register("lux_and_ham_sandwich", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(0.8F)
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> PINE_AND_SAP_SANDWICH = ITEMS.register("pine_and_sap_sandwich", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(0.8F)
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> PLATE_OF_GROTTO_BURNT_ENDS = ITEMS.register("plate_of_grotto_burnt_ends", () ->
            new BowlFoodItem(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(14).saturationMod(0.8F)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1F)
                            .build())));

    public static final RegistryObject<Item> PLATE_OF_GROTTO_LEG = ITEMS.register("plate_of_grotto_leg", () ->
            new BowlFoodItem(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(20).saturationMod(0.5F)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1F)
                            .build())));

    public static final RegistryObject<Item> PLATE_OF_ROASTED_DINO_CHOP = ITEMS.register("plate_of_roasted_dino_chop", () ->
            new BowlFoodItem(new Item.Properties()
                    .craftRemainder(Items.BOWL)
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                    .nutrition(14).saturationMod(0.8F)
                    .effect(new MobEffectInstance(ACEffectRegistry.RAGE.get(), 2400, 0), 1F)
                    .effect(new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> PLATE_OF_TAIL_CUT = ITEMS.register("plate_of_tail_cut", () ->
            new BowlFoodItem(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(16).saturationMod(0.7F)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1F)
                            .build())));

    public static final RegistryObject<Item> PREHISTORIC_EGG_RICE = ITEMS.register("prehistoric_egg_rice", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(12).saturationMod(0.3F)
                    .effect(new MobEffectInstance(ModEffects.COMFORT.get(), 3600, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> RAW_DINO_CUT = ITEMS.register("raw_dino_cut", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(3).saturationMod(0.2F)
                    .build())));
    public static final RegistryObject<Item> RAW_TRILOCARIS_SLICE = ITEMS.register("raw_trilocaris_slice", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(2).saturationMod(0.2F)
                    .build())));

    public static final RegistryObject<Item> SHISH_KEBAB = ITEMS.register("shish_kebab", () ->
            new ShishKebabItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(0.8F)
                    .effect(new MobEffectInstance(ACEffectRegistry.RAGE.get(), 1200, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> SLICE_OF_PINENUT_PIE = ITEMS.register("slice_of_pinenut_pie", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(3).saturationMod(0.2F)
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> SLICE_OF_TECTONIC_CHEESECAKE = ITEMS.register("slice_of_tectonic_cheesecake", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(6).saturationMod(0.2F)
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> STAR_COOKIE = ITEMS.register("star_cookie", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(1).saturationMod(0.5F)
                    .fast()
                    .build())));

    public static final RegistryObject<Item> STUFFED_TRILO_TAILS = ITEMS.register("stuffed_trilo_tails", () ->
            new BowlFoodItem(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                    .nutrition(10).saturationMod(0.8F)
                    .effect(new MobEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> TECTONIC_PASTA = ITEMS.register("tectonic_pasta", () ->
            new BowlFoodItem(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(20).saturationMod(0.5F)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0), 1F)
                            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 12000, 0), 1F)
                            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 0), 1F)
                            .build())));

    public static final RegistryObject<Item> TRILOCARIS_NOODLES = ITEMS.register("trilocaris_noodles", () ->
            new BowlFoodItem(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(16).saturationMod(0.9F)
                            .effect(new MobEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1F)
                            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 6600, 0), 1F)
                            .build())));

    public static final RegistryObject<Item> TRILOCARIS_ROLL = ITEMS.register("trilocaris_roll", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder()
                            .nutrition(10).saturationMod(0.5F)
                            .build())));

    public static final RegistryObject<Item> VOLCANIC_CHOP = ITEMS.register("volcanic_chop", () ->
            new BowlFoodItem(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(16).saturationMod(0.9F)
                            .effect(new MobEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1F)
                            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1F)
                            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0), 1F)
                            .build())));

    public static final RegistryObject<Item> GROTTOCERATOPS_CARCASS = ITEMS.register("grottoceratops_carcass", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ROASTED_GROTTOCERATOPS = ITEMS.register("roasted_grottoceratops", () -> new GrottoFeastItem(new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}