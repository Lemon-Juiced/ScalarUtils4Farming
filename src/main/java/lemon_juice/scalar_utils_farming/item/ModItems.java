package lemon_juice.scalar_utils_farming.item;

import lemon_juice.scalar_utils_farming.creativetab.ModCreativeModeTab;
import lemon_juice.scalar_utils_farming.ScalarUtilsFarming;
import lemon_juice.scalar_utils_farming.block.ModBlocks;
import lemon_juice.scalar_utils_farming.item.custom_items.consumables.*;
import lemon_juice.scalar_utils_farming.item.custom_items.tools.CraftingToolItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtilsFarming.MOD_ID);

    /* Crops */
    //Corn
    public static final RegistryObject<Item> CORN = ITEMS.register("corn", () -> new Item(new Item.Properties().food(ModFoods.CORN).tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds", () -> new ItemNameBlockItem(ModBlocks.CORN_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.CROPS_TAB)));
    //Ender Spores
    public static final RegistryObject<Item> ENDER_SPORES = ITEMS.register("ender_spores", () -> new ItemNameBlockItem(ModBlocks.ENDER_SPORES_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.CROPS_TAB)));
    //Flax
    public static final RegistryObject<Item> FLAX = ITEMS.register("flax", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> FLAX_SEEDS = ITEMS.register("flax_seeds", () -> new ItemNameBlockItem(ModBlocks.FLAX_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.CROPS_TAB)));
    //Rice
    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new ItemNameBlockItem(ModBlocks.RICE_PLANT.get(), new Item.Properties().food(ModFoods.RICE).tab(ModCreativeModeTab.CROPS_TAB)));
    //Soybean
    public static final RegistryObject<Item> SOYBEAN = ITEMS.register("soybean", () -> new Item(new Item.Properties().food(ModFoods.SOYBEAN).tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> SOYBEAN_SEEDS = ITEMS.register("soybean_seeds", () -> new ItemNameBlockItem(ModBlocks.SOYBEAN_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.CROPS_TAB)));
    //Strawberry
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY).tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds", () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.CROPS_TAB)));
    //Tomato
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().food(ModFoods.TOMATO).tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds", () -> new ItemNameBlockItem(ModBlocks.TOMATO_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.CROPS_TAB)));

    /* Custom Tools */
    public static final RegistryObject<Item> JUICER = ITEMS.register("juicer", () -> new CraftingToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> PAN = ITEMS.register("pan", () -> new CraftingToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> POT = ITEMS.register("pot", () -> new CraftingToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.CROPS_TAB)));

    /* Crafted Foods */
    //Basic Foods
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> new Item(new Item.Properties().food(ModFoods.BUTTER).tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().food(ModFoods.CHEESE).tab(ModCreativeModeTab.CROPS_TAB)));
    //Bread
    public static final RegistryObject<Item> RICE_BREAD = ITEMS.register("rice_bread", () -> new Item(new Item.Properties().food(ModFoods.RICE_BREAD).tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> TOAST = ITEMS.register("toast", () -> new Item(new Item.Properties().food(ModFoods.TOAST).tab(ModCreativeModeTab.CROPS_TAB)));
    //Cheesecakes
    public static final RegistryObject<Item> CHEESECAKE = ITEMS.register("cheesecake", () -> new Item(new Item.Properties().food(ModFoods.CHEESECAKE).tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> CHOCOLATE_CHEESECAKE = ITEMS.register("chocolate_cheesecake", () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_CHEESECAKE).tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_CHEESECAKE = ITEMS.register("strawberry_cheesecake", () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY_CHEESECAKE).tab(ModCreativeModeTab.CROPS_TAB)));
    //Grilled Cheese
    public static final RegistryObject<Item> GRILLED_CHEESE = ITEMS.register("grilled_cheese", () -> new Item(new Item.Properties().food(ModFoods.GRILLED_CHEESE).tab(ModCreativeModeTab.CROPS_TAB)));
    //Ice Cream
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = ITEMS.register("chocolate_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> NEOPOLITAN_ICE_CREAM = ITEMS.register("neopolitan_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM = ITEMS.register("strawberry_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> VANILLA_ICE_CREAM = ITEMS.register("vanilla_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTab.CROPS_TAB)));
    //Juices
    public static final RegistryObject<Item> STRAWBERRY_JUICE = ITEMS.register("strawberry_juice", () -> new Item(new Item.Properties().food(ModFoods.JUICE).tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> TOMATO_JUICE = ITEMS.register("tomato_juice", () -> new Item(new Item.Properties().food(ModFoods.JUICE).tab(ModCreativeModeTab.CROPS_TAB)));
    //Milks
    public static final RegistryObject<Item> CHOCOLATE_MILK = ITEMS.register("chocolate_milk", () -> new ChocolateMilkItem(new Item.Properties().tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> FRESH_MILK = ITEMS.register("fresh_milk", () -> new FreshMilkItem(new Item.Properties().tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> HOT_COCOA = ITEMS.register("hot_cocoa", () -> new HotCocoaItem(new Item.Properties().tab(ModCreativeModeTab.CROPS_TAB)));
    public static final RegistryObject<Item> SOY_MILK = ITEMS.register("soy_milk", () -> new FreshMilkItem(new Item.Properties().tab(ModCreativeModeTab.CROPS_TAB)));
    //Smoothie
    public static final RegistryObject<Item> STRAWBERRY_SMOOTHIE = ITEMS.register("strawberry_smoothie", () -> new Item(new Item.Properties().food(ModFoods.SMOOTHIE).tab(ModCreativeModeTab.CROPS_TAB)));
    //Yogurt
    public static final RegistryObject<Item> YOGURT = ITEMS.register("yogurt", () -> new Item(new Item.Properties().food(ModFoods.YOGURT).tab(ModCreativeModeTab.CROPS_TAB)));

    /* Fermentation */
    public static final RegistryObject<Item> MEAD = ITEMS.register("mead", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FERMENTATION_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
