package lemon_juice.scalar_utils_farming.block;

import lemon_juice.scalar_utils_farming.ScalarUtilsFarming;
import lemon_juice.scalar_utils_farming.block.crops.EnderSporesPlantBlock;
import lemon_juice.scalar_utils_farming.block.crops.FlaxPlantBlock;
import lemon_juice.scalar_utils_farming.block.crops.RicePlantBlock;
import lemon_juice.scalar_utils_farming.block.crops.StrawberryPlantBlock;
import lemon_juice.scalar_utils_farming.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ScalarUtilsFarming.MOD_ID);

    //Crops
    public static final RegistryObject<Block> ENDER_SPORES_PLANT = registerBlockWithoutBlockItem("ender_spore_plant", () -> new EnderSporesPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> FLAX_PLANT = registerBlockWithoutBlockItem("flax_plant", () -> new FlaxPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> RICE_PLANT = registerBlockWithoutBlockItem("rice_plant", () -> new RicePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> STRAWBERRY_PLANT = registerBlockWithoutBlockItem("strawberry_plant", () -> new StrawberryPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    /* Registry Methods */
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
