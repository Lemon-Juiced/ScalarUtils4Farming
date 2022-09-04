package lemon_juice.scalar_utils_farming.item;

import lemon_juice.ModCreativeModeTab;
import lemon_juice.scalar_utils_farming.ScalarUtilsFarming;
import lemon_juice.scalar_utils_farming.item.custom_items.tools.CraftingToolItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtilsFarming.MOD_ID);

    //Custom Tools
    public static final RegistryObject<Item> PAN = ITEMS.register("pan", () -> new CraftingToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> POT = ITEMS.register("pot", () -> new CraftingToolItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Non-Edible Crop Drops
    public static final RegistryObject<Item> ENDER_SPORES = ITEMS.register("ender_spores", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> FLAX = ITEMS.register("flax", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
