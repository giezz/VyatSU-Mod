package com.Mr_Gold832.vyatsu_mod.init;

import com.Mr_Gold832.vyatsu_mod.VyatsuMod;
import com.Mr_Gold832.vyatsu_mod.init.Items.StudakItem;
import com.Mr_Gold832.vyatsu_mod.init.Items.BlockInit;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VyatsuMod.MODID);

    //Items
    public static final RegistryObject<Item> DIPLOMA_ITEM = ITEMS.register("diploma_item",
            () -> new Item(new Item.Properties().tab(VyatsuMod.STU_TAB)) {
        @Override
        public int getBurnTime(ItemStack item, @Nullable RecipeType<?> recipeType) {
            return 200;
        }
    });

    public static final RegistryObject<StudakItem> STUDAK_ITEM = ITEMS.register("studak_item", () -> new StudakItem(new Item.Properties().tab(VyatsuMod.STU_TAB)) {
        @Override
        public int getBurnTime(ItemStack item, @Nullable RecipeType<?> recipeType) {
            return 100;
        }
    });

    public static final RegistryObject<Item> LABA_ITEM = ITEMS.register("laba_item",
            () -> new Item(new Item.Properties().tab(VyatsuMod.STU_TAB)));

    public static final RegistryObject<Item> DONELABA_ITEM = ITEMS.register("donelaba_item",
            () -> new Item(new Item.Properties().tab(VyatsuMod.STU_TAB)));

    public static final RegistryObject<Item> SPRAVKA_ITEM = ITEMS.register("spravka_item",
            () -> new Item(new Item.Properties().tab(VyatsuMod.STU_TAB)));

    //Items.Foods
    public static final RegistryObject<Item> INSTANT_NOODLES_ITEM = ITEMS.register("instant_noodles_item",
            () -> new Item(new Item.Properties().tab(VyatsuMod.STU_TAB).food(Foods.INSTANT_NOODLES_PROPERTIES)));

    public static final RegistryObject<Item> COOKED_NOODLES_ITEM = ITEMS.register("cooked_noodles_item",
            () -> new BowlFoodItem(new Item.Properties().tab(VyatsuMod.STU_TAB).food(Foods.COOKED_NOODLES_PROPERTIES)));

    //Items.SpawnEggs
    public static final RegistryObject<ForgeSpawnEggItem> EXAMPLE_ENTITY_SPAWN_EGG = ITEMS.register("example_entity_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.EXAMPLE_ENTITY, 0x1E51ED, 0x34BD27, new Item.Properties().tab(VyatsuMod.STU_TAB)));

    //Blocks
    public static final RegistryObject<BlockItem> DOSHIK_BLOCK_ITEM = ITEMS.register("noodle_block",
            () -> new BlockItem(BlockInit.DOSHIK_BLOCK.get(), new Item.Properties().tab(VyatsuMod.STU_TAB)));

    public static class Foods {
        public static final FoodProperties INSTANT_NOODLES_PROPERTIES = new FoodProperties.Builder()
                .nutrition(3)
                .saturationMod(0.6f)
                .meat()
                .fast()
                .build();
        public static final FoodProperties COOKED_NOODLES_PROPERTIES = new FoodProperties.Builder()
                .nutrition(5)
                .saturationMod(3f)
                .meat()
                .fast()
                .build();
    }
}
