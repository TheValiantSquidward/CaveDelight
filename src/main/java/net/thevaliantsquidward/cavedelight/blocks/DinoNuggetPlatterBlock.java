package net.thevaliantsquidward.cavedelight.blocks;

import com.github.alexmodguy.alexscaves.server.item.ACItemRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.thevaliantsquidward.cavedelight.registry.CaveDelightItems;
import vectorwing.farmersdelight.common.block.FeastBlock;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class DinoNuggetPlatterBlock extends FeastBlock {
    public static final IntegerProperty PLATTER_SERVINGS = IntegerProperty.create("servings", 0, 8);
    protected static final VoxelShape PLATE_SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 2.0, 15.0);
    protected static final VoxelShape FOOD_SHAPE;
    public final List<Supplier<Item>> platterServings;

    public int getMaxServings() {
        return 6;
    }
    public DinoNuggetPlatterBlock(BlockBehaviour.Properties properties) {
        super(properties, ACItemRegistry.DINOSAUR_NUGGET, true);
        this.platterServings = Arrays.asList(ACItemRegistry.DINOSAUR_NUGGET, ACItemRegistry.DINOSAUR_NUGGET, ACItemRegistry.DINOSAUR_NUGGET, CaveDelightItems.HONEY_GLAZED_DINO_NUGGET, CaveDelightItems.HONEY_GLAZED_DINO_NUGGET, CaveDelightItems.HONEY_GLAZED_DINO_NUGGET);
    }
    public ItemStack getServingItem(BlockState state) {
        return new ItemStack((ItemLike)((Supplier)this.platterServings.get((Integer)state.getValue(this.getServingsProperty()) - 1)).get());
    }

    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return (Integer)state.getValue(this.getServingsProperty()) == 0 ? PLATE_SHAPE : FOOD_SHAPE;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, PLATTER_SERVINGS});
    }

    static {
        FOOD_SHAPE = Shapes.joinUnoptimized(PLATE_SHAPE, Block.box(2.0, 2.0, 2.0, 14.0, 4.0, 14.0), BooleanOp.OR);
    }

}
