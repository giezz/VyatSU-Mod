package com.Mr_Gold832.vyatsu_mod.common.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.state.BlockState;

public class GuardEntity extends Monster {
    private static boolean STUDAK_FLAG = false;
    public GuardEntity(EntityType<GuardEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(3, new GuardEntity.AttackGoal(this));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new GuardEntity.GuardTargetGoal<>(this, Player.class));
    }

    public void tick() {
        super.tick();
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.MOVEMENT_SPEED, 1.0D)
                .add(Attributes.ATTACK_DAMAGE, 0.5D);
    }

    @Override
    protected void playStepSound(BlockPos p_29492_, BlockState p_29493_) {
        this.playSound(SoundEvents.PIG_STEP, 0.15F, 1.0F);
    }

    static class AttackGoal extends MeleeAttackGoal {
        public AttackGoal(GuardEntity p_33822_) {
            super(p_33822_, 1.5D, true);
        }

        public boolean canContinueToUse() {

           if (STUDAK_FLAG) {
               this.mob.setTarget((LivingEntity)null);
               return false;
           } else {
               return super.canContinueToUse();
           }
       }
    }

    static class GuardTargetGoal<T extends LivingEntity> extends NearestAttackableTargetGoal<T> {
        public GuardTargetGoal(GuardEntity p_33832_, Class<T> p_33833_) {super(p_33832_, p_33833_, true);}
    }

    public static void setFlag(){
    STUDAK_FLAG = !STUDAK_FLAG;
    }

    public static void resetFlag(){
        STUDAK_FLAG = false;
    }
    public static boolean getFlag(){
        return STUDAK_FLAG;
    }
}
