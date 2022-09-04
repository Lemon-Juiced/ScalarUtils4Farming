package lemon_juice.scalar_utils_farming.block.crops;

import lemon_juice.scalar_utils_farming.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class StrawberryPlantBlock extends CropBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

    public StrawberryPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    protected ItemLike getBaseSeedId()  {
        return ModItems.STRAWBERRY_SEEDS.get();
    }
}
