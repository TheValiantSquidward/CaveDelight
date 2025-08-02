package net.thevaliantsquidward.cavedelight.registry;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.cavedelight.CaveDelight;
import net.thevaliantsquidward.cavedelight.entities.RoastedGrottoceratops;


public class CaveDelightEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CaveDelight.MOD_ID);

    public static final RegistryObject<EntityType<RoastedGrottoceratops>> ROASTED_GROTTOCERATOPS = ENTITY_TYPES.register(
            "roasted_grottoceratops", () ->
            EntityType.Builder.<RoastedGrottoceratops>of(RoastedGrottoceratops::new, MobCategory.MISC)
                    .sized(3, 2.25F)
                    .build("roasted_grottoceratops")
    );

 //   public static final RegistryObject<EntityType<UmbradoughEntity>> UMBRADOUGH =
 //           ENTITY_TYPES.register("umbradough",
 //                   () -> EntityType.Builder.<UmbradoughEntity>of(UmbradoughEntity::new, MobCategory.MISC)
 //                           .sized(1.0f, 1.0f)
 //                           .build("umbradough"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}