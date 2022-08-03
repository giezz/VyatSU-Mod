package com.Mr_Gold832.vyatsu_mod.client.renderer;

import com.Mr_Gold832.vyatsu_mod.VyatsuMod;
import com.Mr_Gold832.vyatsu_mod.client.renderer.model.GuardEntityModel;
import com.Mr_Gold832.vyatsu_mod.common.entity.GuardEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

//import javax.naming.Context;


public class GuardEntityRenderer<Type extends GuardEntity> extends MobRenderer<Type, GuardEntityModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(VyatsuMod.MODID,
            "textures/entities/guard_entity.png");

    public GuardEntityRenderer(Context context) {
        super(context, new GuardEntityModel<>(context.bakeLayer(GuardEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}