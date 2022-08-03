package com.Mr_Gold832.vyatsu_mod.client.event;

import com.Mr_Gold832.vyatsu_mod.VyatsuMod;
import com.Mr_Gold832.vyatsu_mod.client.renderer.ExampleEntityRenderer;
import com.Mr_Gold832.vyatsu_mod.client.renderer.GuardEntityRenderer;
import com.Mr_Gold832.vyatsu_mod.client.renderer.model.ExampleEntityModel;
import com.Mr_Gold832.vyatsu_mod.client.renderer.model.GuardEntityModel;
import com.Mr_Gold832.vyatsu_mod.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = VyatsuMod.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    private ClientModEvents() {

    }

    @SubscribeEvent
    public static void clientSetup(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ExampleEntityModel.LAYER_LOCATION, ExampleEntityModel::createBodyLayer);
        event.registerLayerDefinition(GuardEntityModel.LAYER_LOCATION, GuardEntityModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.EXAMPLE_ENTITY.get(), ExampleEntityRenderer::new);
        event.registerEntityRenderer(EntityInit.GUARD_ENTITY.get(), GuardEntityRenderer::new);
    }
}
