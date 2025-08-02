package net.thevaliantsquidward.cavedelight.items;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.thevaliantsquidward.cavedelight.registry.CaveDelightEntities;
import net.thevaliantsquidward.cavedelight.entities.RoastedGrottoceratops;

import java.util.Objects;

public class GrottoFeastItem extends Item {

    public GrottoFeastItem(Properties properties) {
        super(properties);
    }

    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        Player player = context.getPlayer();
        RoastedGrottoceratops roastedGrottoceratops = CaveDelightEntities.ROASTED_GROTTOCERATOPS.get().create(world);

        if (!world.isClientSide) {
            ItemStack itemstack = context.getItemInHand();
            BlockPos blockpos = context.getClickedPos();
            Direction direction = context.getClickedFace();
            BlockState blockstate = world.getBlockState(blockpos);

            BlockPos blockpos1;
            if (blockstate.getCollisionShape(world, blockpos).isEmpty()) {
                blockpos1 = blockpos;
            } else {
                blockpos1 = blockpos.relative(direction);
            }

            CaveDelightEntities.ROASTED_GROTTOCERATOPS.get().spawn((ServerLevel) world, itemstack, player, blockpos1, MobSpawnType.MOB_SUMMONED, false, !Objects.equals(blockpos, blockpos1) && direction == Direction.UP);

            if (player != null && !player.getAbilities().instabuild) {
                if (roastedGrottoceratops != null) {
                    roastedGrottoceratops.setConsumptionStage(0);
                }
                itemstack.shrink(1);
            }
        }
        return InteractionResult.SUCCESS;
    }
}
