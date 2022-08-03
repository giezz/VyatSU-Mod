package com.Mr_Gold832.vyatsu_mod.init.Items;

import com.Mr_Gold832.vyatsu_mod.VyatsuMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.*;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VyatsuMod.MODID);
    public static final RegistryObject<Block> DOSHIK_BLOCK  = BLOCKS.register("noodle_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(1f)));

}
