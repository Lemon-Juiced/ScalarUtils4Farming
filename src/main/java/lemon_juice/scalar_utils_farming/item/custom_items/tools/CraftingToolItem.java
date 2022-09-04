package lemon_juice.scalar_utils_farming.item.custom_items.tools;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class CraftingToolItem extends Item {

    public CraftingToolItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return itemStack.copy();
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }
}
