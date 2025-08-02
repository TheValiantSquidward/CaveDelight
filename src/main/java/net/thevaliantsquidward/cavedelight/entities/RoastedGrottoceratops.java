package net.thevaliantsquidward.cavedelight.entities;

import com.github.alexmodguy.alexscaves.server.item.ACItemRegistry;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.Vec3;
import net.thevaliantsquidward.cavedelight.registry.CaveDelightItems;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

public class RoastedGrottoceratops extends LivingEntity {

    private static final EntityDataAccessor<Integer> EATEDNESS = SynchedEntityData.defineId(RoastedGrottoceratops.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<Direction> FACING = SynchedEntityData.defineId(RoastedGrottoceratops.class, EntityDataSerializers.DIRECTION);

    public long lastHit;

    public RoastedGrottoceratops(EntityType<RoastedGrottoceratops> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.setRot(0, 0);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0D);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(EATEDNESS, 0);
        this.entityData.define(FACING, Direction.NORTH);
    }

    public void setFacting(Direction direction) {
        this.entityData.set(FACING, direction);
    }

    public Direction getFacing() {
        return this.entityData.get(FACING);
    }

    @Override
    public float getYRot() {
        if (getFacing() == Direction.SOUTH) {
            return 0;
        }
        if (getFacing() == Direction.NORTH) {
            return 180;
        }
        if (getFacing() == Direction.EAST) {
            return 90;
        }
        if (getFacing() == Direction.WEST) {
            return 270;
        }
        else return 0;
    }

    @Override
    public boolean shouldDiscardFriction() {
        return true;
    }

    @Override
    protected boolean isAffectedByFluids() {
        return false;
    }

    @Override
    public boolean displayFireAnimation() {
        return false;
    }

    @Override
    public boolean isFullyFrozen() {
        return false;
    }

    @Override
    public boolean canBeCollidedWith() {
        return true;
    }

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    public void push(Entity entity) {
    }

    @Override
    public PushReaction getPistonPushReaction() {
        return PushReaction.IGNORE;
    }

    @Override
    public HumanoidArm getMainArm() {
        return HumanoidArm.RIGHT;
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        this.setConsumptionStage(compoundTag.getInt("Eatedness"));
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        compoundTag.putInt("Eatedness", this.getConsumptionStage());
    }

    @Override
    public boolean isPickable() {
        return true;
    }

    public int getConsumptionStage() {
        return this.entityData.get(EATEDNESS);
    }

    public void setConsumptionStage(int eatedness) {
        this.entityData.set(EATEDNESS, Mth.clamp(eatedness, 0, 12));
    }

    public ItemStack getPickResult() {
        return new ItemStack(CaveDelightItems.ROASTED_GROTTOCERATOPS.get());
    }

    public void thunderHit(ServerLevel level, LightningBolt lightningBolt) {
    }

    public boolean isAffectedByPotions() {
        return false;
    }

    public boolean attackable() {
        return false;
    }

    public boolean skipAttackInteraction(Entity entity) {
        return entity instanceof Player && !this.level().mayInteract((Player) entity, this.blockPosition());
    }

    public void kill() {
        this.remove(RemovalReason.KILLED);
        this.gameEvent(GameEvent.ENTITY_DIE);
    }

    public void broken(DamageSource damageSource) {
        this.playBrokenSound();
    }

    private void showBreakingParticles() {
        if (this.level() instanceof ServerLevel) {
            ((ServerLevel) this.level()).sendParticles(new ItemParticleOption(ParticleTypes.ITEM, Items.BOWL.getDefaultInstance()), this.getX(), this.getY(0.6666666666666666), this.getZ(), 10, this.getBbWidth() / 4.0F, this.getBbHeight() / 4.0F, this.getBbWidth() / 4.0F, 0.05);
        }
    }

    public void handleEntityEvent(byte id) {
        if (id == 32) {
            if (this.level().isClientSide) {
                this.level().playLocalSound(this.getX(), this.getY(), this.getZ(), SoundEvents.WOOD_BREAK, this.getSoundSource(), 0.3F, 1.0F, false);
                this.lastHit = this.level().getGameTime();
            }
        } else {
            super.handleEntityEvent(id);
        }
    }

    @Override
    public Iterable<ItemStack> getArmorSlots() {
        return ImmutableList.of();
    }

    @Override
    public ItemStack getItemBySlot(EquipmentSlot equipmentSlot) {
        return ItemStack.EMPTY;
    }

    @Override
    public void setItemSlot(EquipmentSlot equipmentSlot, ItemStack itemStack) {
    }

    private void playBrokenSound() {
        this.level().playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.WOOD_BREAK, this.getSoundSource(), 0.8F, 0.8F);
    }

    @Override
    public boolean hurt(DamageSource damageSource, float amount) {
        if (!this.level().isClientSide && !this.isRemoved()) {
            if (damageSource.is(DamageTypeTags.BYPASSES_INVULNERABILITY)) {
                this.kill();
                return false;
            }
            else if (!this.isInvulnerableTo(damageSource)) {
                if (damageSource.is(DamageTypeTags.IS_EXPLOSION)) {
                    this.broken(damageSource);
                    this.kill();
                    return false;
                }
                else {
                    boolean flag = damageSource.getDirectEntity() instanceof AbstractArrow;
                    boolean flag1 = flag && ((AbstractArrow) damageSource.getDirectEntity()).getPierceLevel() > 0;
                    boolean flag2 = "player".equals(damageSource.getMsgId());
                    if (!flag2 && !flag) {
                        return false;
                    }
                    else {
                        Entity entity = damageSource.getEntity();
                        if (entity instanceof Player) {
                            Player player = (Player)entity;
                            if (!player.getAbilities().mayBuild) {
                                return false;
                            }
                        }

                        if (damageSource.isCreativePlayer()) {
                            this.playBrokenSound();
                            this.showBreakingParticles();
                            this.kill();
                            return flag1;
                        }
                        else {
                            long i = this.level().getGameTime();
                            if (i - this.lastHit > 5L && !flag) {
                                this.level().broadcastEntityEvent(this, (byte) 32);
                                this.gameEvent(GameEvent.ENTITY_DAMAGE, damageSource.getEntity());
                                this.lastHit = i;
                            }
                            else {
                                this.broken(damageSource);
                                this.showBreakingParticles();
                                this.kill();
                            }
                            return true;
                        }
                    }
                }
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public @NotNull InteractionResult interact(@Nonnull Player player, @Nonnull InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
//        if (itemStack.isEmpty() && hand == InteractionHand.MAIN_HAND) {
//            if (player.isShiftKeyDown()) {
//                if (this.getFacing() == Direction.NORTH) {
//                    setFacting(Direction.WEST);
//                }
//                if (this.getFacing() == Direction.WEST) {
//                    setFacting(Direction.SOUTH);
//                }
//                if (this.getFacing() == Direction.SOUTH) {
//                    setFacting(Direction.EAST);
//                }
//                if (this.getFacing() == Direction.EAST) {
//                    setFacting(Direction.NORTH);
//                }
//            }
//            return InteractionResult.SUCCESS;
//        }
        if (getConsumptionStage() < 11 && itemStack.getItem() == Items.BOWL) {
            if (getConsumptionStage() >= 0 && getConsumptionStage() <= 3) {
                if(!player.addItem(new ItemStack(CaveDelightItems.PLATE_OF_GROTTO_LEG.get()))){player.spawnAtLocation(CaveDelightItems.PLATE_OF_GROTTO_LEG.get());}
                this.playSound(SoundEvents.ARMOR_EQUIP_GENERIC, 1.0F, 1.0F);
                itemStack.shrink(1);
            }
            if (getConsumptionStage() >= 4 && getConsumptionStage() <= 5) {
                if(!player.addItem(new ItemStack(CaveDelightItems.PLATE_OF_TAIL_CUT.get()))){player.spawnAtLocation(CaveDelightItems.PLATE_OF_TAIL_CUT.get());}
                this.playSound(SoundEvents.ARMOR_EQUIP_GENERIC, 1.0F, 1.0F);
                itemStack.shrink(1);
            }
            if (getConsumptionStage() >= 6 && getConsumptionStage() <= 10) {
                if(!player.addItem(new ItemStack(CaveDelightItems.PLATE_OF_GROTTO_BURNT_ENDS.get()))){player.spawnAtLocation(CaveDelightItems.PLATE_OF_GROTTO_BURNT_ENDS.get());}
                this.playSound(SoundEvents.ARMOR_EQUIP_GENERIC, 1.0F, 1.0F);
                itemStack.shrink(1);
            }
            this.setConsumptionStage(getConsumptionStage() + 1);
            return InteractionResult.SUCCESS;
        }
        else if (getConsumptionStage() == 11) {

            if (!player.addItem(new ItemStack(ACItemRegistry.HEAVY_BONE.get()))) {
                player.spawnAtLocation(ACItemRegistry.HEAVY_BONE.get());
            }

            if (!player.addItem(new ItemStack(ACItemRegistry.HEAVY_BONE.get()))) {
                player.spawnAtLocation(ACItemRegistry.HEAVY_BONE.get());
            }

            if (!player.addItem(new ItemStack(ACItemRegistry.HEAVY_BONE.get()))) {
                player.spawnAtLocation(ACItemRegistry.HEAVY_BONE.get());
            }

            if (!player.addItem(new ItemStack(ACItemRegistry.TOUGH_HIDE.get()))){
                player.spawnAtLocation(ACItemRegistry.HEAVY_BONE.get());
            }

            this.playSound(SoundEvents.BONE_BLOCK_BREAK, 0.8F, 0.8F);
            this.setConsumptionStage(getConsumptionStage() + 1);
            return InteractionResult.SUCCESS;
        }
        else if (getConsumptionStage() == 12) {
            this.spawnAtLocation(Items.BOWL);
            this.playBrokenSound();
            this.showBreakingParticles();
            this.discard();
            return InteractionResult.SUCCESS;
        }
        else return InteractionResult.FAIL;
    }

    @Override
    public void tick() {
        super.tick();

        if (!this.onGround()) {
            double gravity = 0.5;
            double maxFallSpeed = -0.5;

            Vec3 velocity = this.getDeltaMovement();
            double newYVelocity = Math.max(velocity.y - gravity, maxFallSpeed);

            this.setDeltaMovement(velocity.x, newYVelocity, velocity.z);
        }
    }
}
