package com.Mr_Gold832.vyatsu_mod.init.Items;

import com.Mr_Gold832.vyatsu_mod.client.event.ClientAccess;
import com.Mr_Gold832.vyatsu_mod.common.entity.GuardEntity;
import com.Mr_Gold832.vyatsu_mod.init.SoundInit;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;

import javax.annotation.Nullable;
import java.util.List;

public class StudakItem extends Item {
    public StudakItem(Properties properties) {
        super(properties);
    }

//*********************************************************************************************************************
// ЕСЛИ КОГДА НБ НАМ ПОНАДОБИТСЯ ПКМ В ВОЗДУХ СКОПИРУЕМ ОТСЮДА!!!
//    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand){
//        GuardEntity.resetFlag();
//        player.sendSystemMessage(Component.literal("Guard: You can pass, student "+GuardEntity.getFlag()));
//        return super.use(level, player, hand);
//    }
//*********************************************************************************************************************

//    @Override
//    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity guardEntity, InteractionHand hand) {
//        GuardEntity.setFlag();
//        guardEntity.playSound(SoundInit.GUARD_ENTITY_PASS.get());
//        player.sendSystemMessage(Component.literal("Guard: You can pass, student " + GuardEntity.getFlag()));
//        System.out.println("flag changed");
//        return super.interactLivingEntity(stack, player, guardEntity, hand);
//    }



//    @Override
//    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity guardEntity) {
//        GuardEntity.resetFlag();
//        player.sendSystemMessage(Component.literal("Guard: You click on me successful" + GuardEntity.getFlag()));
//        return super.onLeftClickEntity(stack, player, guardEntity);
//    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        super.appendHoverText(stack, level, components, flag);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> ClientAccess.advancedItemToolTip(components));
        //components.add(Component.translatable("Your pass into new world"));
    }
}
