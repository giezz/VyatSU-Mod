package vyatsu_mod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vyatsu_mod.VyatsuMod;
import vyatsu_mod.items.VyatsuItems;

import java.util.function.Supplier;

public class VyatsuBlocks {

    private static final CreativeModeTab TAB = VyatsuMod.VYATSU_MOD_TAB;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VyatsuMod.MOD_ID);

    public static final RegistryObject<Block> NOODLE_BLOCK = registryBlock("noodle_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(4f)), TAB);
    public static final RegistryObject<Block> TEST_BLOCK1 = registryBlock("test_block1",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(4f)), TAB);

    private static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> blockToRegister = BLOCKS.register(name, block);
        registerBlockItem(name, blockToRegister, tab);
        return blockToRegister;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return VyatsuItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
}
