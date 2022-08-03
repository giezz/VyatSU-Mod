package com.Mr_Gold832.vyatsu_mod.init;

import com.Mr_Gold832.vyatsu_mod.VyatsuMod;
import com.Mr_Gold832.vyatsu_mod.common.entity.GuardEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.Mr_Gold832.vyatsu_mod.common.entity.ExampleEntity;

public class EntityInit {

    private EntityInit() {
    }

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, VyatsuMod.MODID);

    public static final RegistryObject<EntityType<ExampleEntity>> EXAMPLE_ENTITY = ENTITIES.register("example_entity",
            () -> EntityType.Builder.of(ExampleEntity::new, MobCategory.CREATURE).sized(0.8f,0.6f)
                    .build(new ResourceLocation(VyatsuMod.MODID, "example_entity").toString()));

    public static final RegistryObject<EntityType<GuardEntity>> GUARD_ENTITY = ENTITIES.register("guard_entity",
            () -> EntityType.Builder.of(GuardEntity::new, MobCategory.CREATURE).sized(0.7f,2f)
                    .build(new ResourceLocation(VyatsuMod.MODID, "guard_entity").toString()));
}
