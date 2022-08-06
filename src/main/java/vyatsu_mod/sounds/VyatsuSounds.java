package vyatsu_mod.sounds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vyatsu_mod.VyatsuMod;

public class VyatsuSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, VyatsuMod.MOD_ID);

    public static final RegistryObject<SoundEvent> VYATSU_SONG = registrySoundEvent("vyatsu_song");

    private static RegistryObject<SoundEvent> registrySoundEvent(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(VyatsuMod.MOD_ID, name)));
    }
}
