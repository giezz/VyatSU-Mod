package com.Mr_Gold832.vyatsu_mod.client.renderer;

import com.Mr_Gold832.vyatsu_mod.VyatsuMod;
import com.Mr_Gold832.vyatsu_mod.client.renderer.model.ExampleEntityModel;
import com.Mr_Gold832.vyatsu_mod.common.entity.ExampleEntity;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

//import javax.naming.Context;


public class ExampleEntityRenderer<Type extends ExampleEntity> extends MobRenderer<Type, ExampleEntityModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(VyatsuMod.MODID,
            "textures/entities/example_entity.png");

    public ExampleEntityRenderer(Context context) {
        super(context, new ExampleEntityModel<>(context.bakeLayer(ExampleEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
