package vyatsu_mod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;
import vyatsu_mod.block.VyatsuBlocks;
import vyatsu_mod.entity.VyatsuEntities;
import vyatsu_mod.items.VyatsuItems;
import vyatsu_mod.sounds.VyatsuSounds;
import vyatsu_mod.world.structure.ModStructures;

@Mod(VyatsuMod.MOD_ID)
public class VyatsuMod {
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "vyatsu_mod";

    public VyatsuMod() {
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
//        MinecraftForge.EVENT_BUS.register(this);
        GeckoLib.initialize();

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        VyatsuItems.ITEMS.register(bus);
        VyatsuBlocks.BLOCKS.register(bus);
        VyatsuEntities.ENTITY_TYPES.register(bus);
        VyatsuSounds.SOUNDS.register(bus);
        ModStructures.register(bus);
    }

//    private void setup(final FMLCommonSetupEvent event) {
//        // some preinit code
//        LOGGER.info("HELLO FROM PREINIT");
//        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
//    }

    public static final CreativeModeTab VYATSU_MOD_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(VyatsuItems.STUDAK.get());
        }
    };
}
