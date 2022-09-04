package lemon_juice.scalar_utils_farming.item;

import lemon_juice.scalar_utils_farming.ModCreativeModeTab;
import lemon_juice.scalar_utils_farming.ScalarUtilsFarming;
import lemon_juice.scalar_utils_farming.item.custom_items.consumables.ChocolateMilkItem;
import lemon_juice.scalar_utils_farming.item.custom_items.consumables.FreshMilkItem;
import lemon_juice.scalar_utils_farming.item.custom_items.consumables.HotCocoaItem;
import lemon_juice.scalar_utils_farming.item.custom_items.consumables.ModFoods;
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
    //Ender Spores
    public static final RegistryObject<Item> ENDER_SPORES = ITEMS.register("ender_spores", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Flax
    public static final RegistryObject<Item> FLAX = ITEMS.register("flax", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Rice
    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new Item(new Item.Properties().food(ModFoods.RICE).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Strawberry
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));


    /* Custom Tools */
    public static final RegistryObject<Item> PAN = ITEMS.register("pan", () -> new CraftingToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> POT = ITEMS.register("pot", () -> new CraftingToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    /* Food */
    //Basic Foods
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> new Item(new Item.Properties().food(ModFoods.BUTTER).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().food(ModFoods.CHEESE).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Bread
    public static final RegistryObject<Item> RICE_BREAD = ITEMS.register("rice_bread", () -> new Item(new Item.Properties().food(ModFoods.RICE_BREAD).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> TOAST = ITEMS.register("toast", () -> new Item(new Item.Properties().food(ModFoods.TOAST).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Cheesecakes
    public static final RegistryObject<Item> CHEESECAKE = ITEMS.register("cheesecake", () -> new Item(new Item.Properties().food(ModFoods.CHEESECAKE).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_CHEESECAKE = ITEMS.register("strawberry_cheesecake", () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY_CHEESECAKE).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Grilled Cheese
    public static final RegistryObject<Item> GRILLED_CHEESE = ITEMS.register("grilled_cheese", () -> new Item(new Item.Properties().food(ModFoods.GRILLED_CHEESE).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Ice Cream
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = ITEMS.register("chocolate_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> NEOPOLITAN_ICE_CREAM = ITEMS.register("neopolitan_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM = ITEMS.register("strawberry_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> VANILLA_ICE_CREAM = ITEMS.register("vanilla_ice_cream", () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Milks
    public static final RegistryObject<Item> CHOCOLATE_MILK = ITEMS.register("chocolate_milk", () -> new ChocolateMilkItem(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> FRESH_MILK = ITEMS.register("fresh_milk", () -> new FreshMilkItem(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> HOT_COCOA = ITEMS.register("hot_cocoa", () -> new HotCocoaItem(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    //Yogurt
    public static final RegistryObject<Item> YOGURT = ITEMS.register("yogurt", () -> new Item(new Item.Properties().food(ModFoods.YOGURT).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
