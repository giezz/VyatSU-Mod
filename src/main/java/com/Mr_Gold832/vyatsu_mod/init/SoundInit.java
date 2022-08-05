package com.Mr_Gold832.vyatsu_mod.init;

import com.Mr_Gold832.vyatsu_mod.VyatsuMod;
import cpw.mods.util.Lazy;
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

    public static final RegistryObject<SoundEvent> GUARD_ENTITY_AMBIENT = SOUNDS.register(
            "entity.guard_entity.ambient",
            () -> new SoundEvent(new ResourceLocation(VyatsuMod.MODID, "entity.guard_entity.ambient")));

    public static final RegistryObject<SoundEvent> GUARD_ENTITY_HURT = SOUNDS.register(
            "entity.guard_entity.hurt",
            () -> new SoundEvent(new ResourceLocation(VyatsuMod.MODID, "entity.guard_entity.hurt")));

    public static final RegistryObject<SoundEvent> GUARD_ENTITY_PASS = SOUNDS.register(
            "entity.guard_entity.pass",
            () -> new SoundEvent(new ResourceLocation(VyatsuMod.MODID, "entity.guard_entity.pass")));

    public static final RegistryObject<SoundEvent> GUARD_ENTITY_ANGRY = SOUNDS.register(
            "entity.guard_entity.angry",
            () -> new SoundEvent(new ResourceLocation(VyatsuMod.MODID, "entity.guard_entity.angry")));

//    public static final RegistryObject<SoundEvent> GUARD_ENTITY_DEATH = SOUNDS.register(
//            "entity.guard_entity.death",
//            () -> new SoundEvent(new ResourceLocation(VyatsuMod.MODID, "entity.guard_entity.death")));

    public static final RegistryObject<SoundEvent> MUSIC_DISC_VYATSU = SOUNDS.register(
            "sound.vyatsu_song",
            () -> new SoundEvent(new ResourceLocation(VyatsuMod.MODID, "sound.vyatsu_song")));

//**************************************************************************************************************
    //ПОПЫТКА ДОБАВИТЬ ДИСК
//    public static final Lazy<SoundEvent> LAZY_PROMISES_MUSIC = Lazy
//            .of(() -> new SoundEvent(new ResourceLocation(VyatsuMod.MODID, "disc.promises")));
//
//    public static final RegistryObject<SoundEvent> PROMISES_MUSIC = SOUNDS.register("promises_music",
//            LAZY_PROMISES_MUSIC);
//**************************************************************************************************************


    private SoundInit(){
    }
}