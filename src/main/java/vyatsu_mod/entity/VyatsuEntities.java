package vyatsu_mod.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vyatsu_mod.VyatsuMod;

public class VyatsuEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, VyatsuMod.MOD_ID);

    public static final RegistryObject<EntityType<GuardEntity>> GUARD = ENTITY_TYPES.register("guard",
            () -> EntityType.Builder.of(GuardEntity::new, MobCategory.CREATURE)
                    .sized(0.7F, 2F)
                    .build(new ResourceLocation(VyatsuMod.MOD_ID, "guard").toString()));
}
