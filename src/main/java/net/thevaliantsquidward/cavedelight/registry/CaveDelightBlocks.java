package net.thevaliantsquidward.cavedelight.registry;

import com.github.alexmodguy.alexscaves.server.item.ACItemRegistry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.cavedelight.CaveDelight;
import net.thevaliantsquidward.cavedelight.blocks.BoiledTrilocarisBlock;
import net.thevaliantsquidward.cavedelight.blocks.RoastedDinoChopBlock;
import net.thevaliantsquidward.cavedelight.blocks.SpelunkieCakeBlock;
import net.thevaliantsquidward.cavedelight.blocks.TectonicPieBlock;
import vectorwing.farmersdelight.common.block.PieBlock;

import java.util.function.Supplier;

public class CaveDelightBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            CaveDelight.MOD_ID);

    public static final RegistryObject<Block> BOILED_TRILOCARIS = registerBlock("boiled_trilocaris",
            () -> new BoiledTrilocarisBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), ACItemRegistry.COOKED_TRILOCARIS_TAIL, true));
    public static final RegistryObject<Block> ROASTED_DINO_CHOP = registerBlock("roasted_dino_chop",
            () -> new RoastedDinoChopBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), CaveDelightItems.PLATE_OF_ROASTED_DINO_CHOP, true));


    public static final RegistryObject<Block> TECTONIC_CHEESECAKE = registerPieBlock("tectonic_cheesecake",
            () -> new TectonicPieBlock(Block.Properties.copy(Blocks.CAKE), CaveDelightItems.SLICE_OF_TECTONIC_CHEESECAKE));

    public static final RegistryObject<Block> PINENUT_PIE = registerPieBlock("pinenut_pie",
            () -> new PieBlock(Block.Properties.copy(Blocks.CAKE), CaveDelightItems.SLICE_OF_PINENUT_PIE));

    public static final RegistryObject<Block> SPELUNKIE_CAKE = registerPieBlock("spelunkie_cake",
            () -> new SpelunkieCakeBlock(Block.Properties.copy(Blocks.CAKE), CaveDelightItems.SLICE_OF_SPELUNKIE_CAKE));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerPieBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockPieItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return CaveDelightItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(1)));
    }

    private static <T extends Block> RegistryObject<Item> registerBlockPieItem(String name, RegistryObject<T> block) {
        return CaveDelightItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(64)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
