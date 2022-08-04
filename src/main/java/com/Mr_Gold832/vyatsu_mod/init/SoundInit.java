package com.Mr_Gold832.vyatsu_mod.init;

import com.Mr_Gold832.vyatsu_mod.VyatsuMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class SoundInit {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
            VyatsuMod.MODID);

    public static final RegistryObject<SoundEvent> EXAMPLE_ENTITY_AMBIENT = SOUNDS.register(
            "entity.example_entity.ambient",
            () -> new SoundEvent(new ResourceLocation(VyatsuMod.MODID, "entity.example_entity.death")));

    public static final RegistryObject<SoundEvent> EXAMPLE_ENTITY_HURT = SOUNDS.register(
            "entity.example_entity.hurt",
            () -> new SoundEvent(new ResourceLocation(VyatsuMod.MODID, "entity.example_entity.hurt")));

    public static final RegistryObject<SoundEvent> EXAMPLE_ENTITY_DEATH = SOUNDS.register(
            "entity.example_entity.death",
            () -> new SoundEvent(new ResourceLocation(VyatsuMod.MODID, "entity.example_entity.death")));


    private SoundInit(){
    }
}