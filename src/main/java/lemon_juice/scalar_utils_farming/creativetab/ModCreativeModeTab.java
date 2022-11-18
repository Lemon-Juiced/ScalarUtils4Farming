package lemon_juice.scalar_utils_farming.creativetab;

import lemon_juice.scalar_utils_farming.block.ModBlocks;
import lemon_juice.scalar_utils_farming.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CROPS_TAB = new CreativeModeTab("cropsTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FLAX.get());
        }
    };

    public static final CreativeModeTab FERMENTATION_TAB = new CreativeModeTab("fermentationTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.OAK_FERMENTATION_BARREL.get());
        }
    };
}
