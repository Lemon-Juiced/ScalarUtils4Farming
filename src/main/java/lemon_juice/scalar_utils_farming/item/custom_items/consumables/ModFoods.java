package lemon_juice.scalar_utils_farming.item.custom_items.consumables;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BUTTER = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).build();
    public static final FoodProperties CHEESE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).build();
    public static final FoodProperties CHEESECAKE = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.3F).build();
    public static final FoodProperties CHOCOLATE_CHEESECAKE = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.5F).build();
    public static final FoodProperties GRILLED_CHEESE = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.9F).build();
    public static final FoodProperties ICE_CREAM = stew(4).build();
    public static final FoodProperties RICE = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.2F).build();
    public static final FoodProperties RICE_BREAD = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();
    public static final FoodProperties STRAWBERRY = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.2F).build();
    public static final FoodProperties STRAWBERRY_CHEESECAKE = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.5F).build();
    public static final FoodProperties TOAST = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties YOGURT = stew(2).build();

    private static FoodProperties.Builder stew(int pNutrition) {
        return (new FoodProperties.Builder()).nutrition(pNutrition).saturationMod(0.6F);
    }
}
