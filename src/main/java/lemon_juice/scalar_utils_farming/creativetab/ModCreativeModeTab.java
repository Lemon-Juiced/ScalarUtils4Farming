package lemon_juice.scalar_utils_farming.creativetab;

import lemon_juice.scalar_utils_farming.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SCALAR_UTILS_TAB = new CreativeModeTab("farmingTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FLAX.get());
        }
    };
}
