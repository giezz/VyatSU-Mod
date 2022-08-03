package com.Mr_Gold832.vyatsu_mod.event;

import com.Mr_Gold832.vyatsu_mod.VyatsuMod;
import com.Mr_Gold832.vyatsu_mod.common.entity.ExampleEntity;
import com.Mr_Gold832.vyatsu_mod.common.entity.GuardEntity;
import com.Mr_Gold832.vyatsu_mod.init.EntityInit;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = VyatsuMod.MODID, bus = Bus.MOD)
public class CommonModEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.EXAMPLE_ENTITY.get(), ExampleEntity.createAttributes().build());
        event.put(EntityInit.GUARD_ENTITY.get(), GuardEntity.createAttributes().build());
    }
}
