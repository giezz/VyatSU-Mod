package com.Mr_Gold832.vyatsu_mod;

import com.Mr_Gold832.vyatsu_mod.init.EntityInit;
import com.Mr_Gold832.vyatsu_mod.init.ItemInit;
import com.Mr_Gold832.vyatsu_mod.init.Items.BlockInit;
import com.Mr_Gold832.vyatsu_mod.init.SoundInit;
import com.Mr_Gold832.vyatsu_mod.painting.PaintingInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;



@Mod(VyatsuMod.MODID)
public class VyatsuMod
{
    public static final String MODID = "vyatsu_mod";

    public VyatsuMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        SoundInit.SOUNDS.register(bus);
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        EntityInit.ENTITIES.register(bus);
        PaintingInit.PAINTINGS.register(bus);
    }

    public static final CreativeModeTab STU_TAB = new CreativeModeTab(MODID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return ItemInit.DIPLOMA_ITEM.get().getDefaultInstance();
        }
    };
}
