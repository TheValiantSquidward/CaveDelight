package net.thevaliantsquidward.cavedelight.registry.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.thevaliantsquidward.cavedelight.CaveDelight;


public class CaveDelightTags {

    public static final TagKey<Item> SMALL_DINOSAUR_EGGS = registerItemTag("small_dinosaur_egg");
    public static final TagKey<Item> BIG_DINOSAUR_EGGS = registerItemTag("big_dinosaur_egg");
    public static final TagKey<Item> SOYLENT = registerItemTag("soylent");

    private static TagKey<Item> registerItemTag(String name) {
        return TagKey.create(Registries.ITEM, new ResourceLocation(CaveDelight.MOD_ID, name));
    }

}