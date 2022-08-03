package com.Mr_Gold832.vyatsu_mod.painting;

import com.Mr_Gold832.vyatsu_mod.VyatsuMod;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PaintingInit {
    public static final DeferredRegister<PaintingVariant> PAINTINGS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, VyatsuMod.MODID);

    public static final RegistryObject<PaintingVariant> SHMAKOVA_PAINT = PAINTINGS.register("shmakova_paint",
            () -> new PaintingVariant(32,32));

    public static final RegistryObject<PaintingVariant> VOVAR_PAINT = PAINTINGS.register("vovar_paint",
            () -> new PaintingVariant(32,32));

    public static final RegistryObject<PaintingVariant> EGOR_PAINT = PAINTINGS.register("egor_paint",
            () -> new PaintingVariant(16,32));

    public static final RegistryObject<PaintingVariant> NIGRITOS_PAINT = PAINTINGS.register("nigritos_paint",
            () -> new PaintingVariant(32,32));

    public static final RegistryObject<PaintingVariant> NIKITA_PAINT = PAINTINGS.register("nikita_paint",
            () -> new PaintingVariant(32,32));

    public static final RegistryObject<PaintingVariant> LEGENDARY_PAINT = PAINTINGS.register("legendary_paint",
            () -> new PaintingVariant(64,48));

    public static void register (IEventBus eventBus){
            PAINTINGS.register(eventBus);
    }
}
