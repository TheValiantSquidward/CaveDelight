package net.thevaliantsquidward.cavedelight.entity.custom;

import com.github.alexmodguy.alexscaves.server.item.ACItemRegistry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.thevaliantsquidward.cavedelight.item.ModItems;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

public class RoastedGrottoceratopsEntity extends Entity {
    private static final EntityDataAccessor<Integer> EATEDNESS = SynchedEntityData.defineId(RoastedGrottoceratopsEntity.class, EntityDataSerializers.INT);

    public RoastedGrottoceratopsEntity(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void defineSynchedData() {
        this.entityData.define(EATEDNESS, 0);
    }

    @Override
    public boolean canBeCollidedWith() {
        return true;
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag pCompound) {
        pCompound.putInt("Eatedness", this.getConsumptionStage());
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag compoundTag) {
        this.setConsumptionStage(compoundTag.getInt("Eatedness"));
    }

    @Override
    public boolean isPickable() {
        return true;
    }

    public int getConsumptionStage() {
        return this.entityData.get(EATEDNESS);
    }

    public void setConsumptionStage(int eatedness) {
        this.entityData.set(EATEDNESS, Integer.valueOf(eatedness));
    }


    public @NotNull InteractionResult interact(@Nonnull Player player, @Nonnull InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if(getConsumptionStage() < 11 && itemstack.getItem() == Items.BOWL) {
            if (getConsumptionStage() >= 0 && getConsumptionStage() <= 3) {
                if(!player.addItem(new ItemStack(ModItems.PLATE_OF_GROTTO_LEG.get()))){player.spawnAtLocation(ModItems.PLATE_OF_GROTTO_LEG.get());}
                this.playSound(SoundEvents.ARMOR_EQUIP_GENERIC, 1.0F, 1.0F);
                itemstack.shrink(1);
        }
            if (getConsumptionStage() >= 4 && getConsumptionStage() <= 5) {
                if(!player.addItem(new ItemStack(ModItems.PLATE_OF_TAIL_CUT.get()))){player.spawnAtLocation(ModItems.PLATE_OF_TAIL_CUT.get());}
                this.playSound(SoundEvents.ARMOR_EQUIP_GENERIC, 1.0F, 1.0F);
                itemstack.shrink(1);
            }             if (getConsumptionStage() >= 6 && getConsumptionStage() <= 10) {
                if(!player.addItem(new ItemStack(ModItems.PLATE_OF_GROTTO_BURNT_ENDS.get()))){player.spawnAtLocation(ModItems.PLATE_OF_GROTTO_BURNT_ENDS.get());}
                this.playSound(SoundEvents.ARMOR_EQUIP_GENERIC, 1.0F, 1.0F);
                itemstack.shrink(1);
            }
            this.setConsumptionStage(getConsumptionStage() + 1);
            return InteractionResult.SUCCESS;
        } else if(getConsumptionStage() == 11){
            if(!player.addItem(new ItemStack(ACItemRegistry.HEAVY_BONE.get()))){player.spawnAtLocation(ACItemRegistry.HEAVY_BONE.get());}
            if(!player.addItem(new ItemStack(ACItemRegistry.HEAVY_BONE.get()))){player.spawnAtLocation(ACItemRegistry.HEAVY_BONE.get());}
            if(!player.addItem(new ItemStack(ACItemRegistry.HEAVY_BONE.get()))){player.spawnAtLocation(ACItemRegistry.HEAVY_BONE.get());}
            if(!player.addItem(new ItemStack(ACItemRegistry.TOUGH_HIDE.get()))){player.spawnAtLocation(ACItemRegistry.HEAVY_BONE.get());}
            this.playSound(SoundEvents.BONE_BLOCK_BREAK, 0.8F, 0.8F);
            this.setConsumptionStage(getConsumptionStage() + 1);
            return InteractionResult.SUCCESS;
        } else if(getConsumptionStage() == 12){
            this.spawnAtLocation(Items.BOWL);
            this.playSound(SoundEvents.WOOD_BREAK, 0.8F, 0.8F);
            this.discard();
            return InteractionResult.SUCCESS;
        }else
        return InteractionResult.FAIL;
    }

    @Override
    public void tick() {
        super.tick();


        if (!this.onGround()) {
            double gravity = 0.04;
            double maxFallSpeed = -0.5;

            Vec3 velocity = this.getDeltaMovement();
            double newYVelocity = Math.max(velocity.y - gravity, maxFallSpeed);

            this.setDeltaMovement(velocity.x, newYVelocity, velocity.z);
        }

        this.move(MoverType.SELF, this.getDeltaMovement());

        if (this.onGround()) {
            Vec3 velocity = this.getDeltaMovement();
            this.setDeltaMovement(velocity.multiply(0.9, 1, 0.9)); // Reduce X/Z speed slightly
        }
    }
}
