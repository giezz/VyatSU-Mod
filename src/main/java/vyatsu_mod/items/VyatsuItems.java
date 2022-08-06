package vyatsu_mod.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vyatsu_mod.VyatsuMod;

import javax.annotation.Nullable;

public class VyatsuItems {
    private static final CreativeModeTab TAB = VyatsuMod.VYATSU_MOD_TAB;
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VyatsuMod.MOD_ID);

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(defaultBuilder()));
    public static final RegistryObject<Item> STUDAK = ITEMS.register("studak",
            () -> new StudakItem(defaultBuilder()) {
                @Override
                public int getBurnTime(ItemStack item, @Nullable RecipeType<?> recipeType) {
                    return 200;
                }
            }
    );
    public static final RegistryObject<Item> DIPLOMA = ITEMS.register("diploma",
            () -> new Item(defaultBuilder()) {
                @Override
                public int getBurnTime(ItemStack item, @Nullable RecipeType<?> recipeType) {
                    return 200;
                }
            });
    public static final RegistryObject<Item> LABA = ITEMS.register("laba",
            () -> new Item(defaultBuilder()));
    public static final RegistryObject<Item> DONELABA = ITEMS.register("donelaba",
            () -> new Item(defaultBuilder()));
    public static final RegistryObject<Item> SPRAVKA = ITEMS.register("spravka",
            () -> new Item(defaultBuilder()));
    public static final RegistryObject<Item> INSTANT_NOODLES = ITEMS.register("instant_noodles",
            () -> new Item(new Item.Properties().tab(TAB).food(Foods.NOODLES_FOOD_PROPS)));

    public static final RegistryObject<Item> COOKED_NOODLES = ITEMS.register("cooked_noodles",
            () -> new BowlFoodItem(defaultBuilder().stacksTo(1).food(Foods.COOKED_NOODLES_FOOD_PROPS)));

    public static Item.Properties defaultBuilder() {
        return new Item.Properties().tab(TAB);
    }

    public static class Foods {
        public static final FoodProperties NOODLES_FOOD_PROPS = new FoodProperties.Builder()
                .nutrition(3)
                .saturationMod(0.6f)
                .meat()
                .fast()
                .build();
        public static final FoodProperties COOKED_NOODLES_FOOD_PROPS = new FoodProperties.Builder()
                .nutrition(5)
                .saturationMod(3f)
                .meat()
                .fast()
                .build();
    }
}
