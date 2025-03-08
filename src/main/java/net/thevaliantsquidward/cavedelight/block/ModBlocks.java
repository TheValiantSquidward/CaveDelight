package net.thevaliantsquidward.cavedelight.block;

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
import net.thevaliantsquidward.cavedelight.block.custom.BoiledTrilocarisBlock;
import net.thevaliantsquidward.cavedelight.block.custom.DinoNuggetPlatterBlock;
import net.thevaliantsquidward.cavedelight.block.custom.RoastedDinoChopBlock;
import net.thevaliantsquidward.cavedelight.item.ModItems;
import vectorwing.farmersdelight.common.block.PieBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            CaveDelight.MOD_ID);

    public static final RegistryObject<Block> BOILED_TRILOCARIS = registerBlock("boiled_trilocaris",
            () -> new BoiledTrilocarisBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), ACItemRegistry.COOKED_TRILOCARIS_TAIL, true));
    public static final RegistryObject<Block> ROASTED_DINO_CHOP = registerBlock("roasted_dino_chop",
            () -> new RoastedDinoChopBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), ModItems.PLATE_OF_ROASTED_DINO_CHOP, true));


    public static final RegistryObject<Block> TECTONIC_CHEESECAKE = registerBlock("tectonic_cheesecake",
            () -> new PieBlock(Block.Properties.copy(Blocks.CAKE), ModItems.SLICE_OF_TECTONIC_CHEESECAKE));

    public static final RegistryObject<Block> PINENUT_PIE = registerBlock("pinenut_pie",
            () -> new PieBlock(Block.Properties.copy(Blocks.CAKE), ModItems.SLICE_OF_PINENUT_PIE));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(1)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
