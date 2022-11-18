package lemon_juice.scalar_utils_farming.block;

import lemon_juice.scalar_utils_farming.ScalarUtilsFarming;
import lemon_juice.scalar_utils_farming.block.crops.*;
import lemon_juice.scalar_utils_farming.creativetab.ModCreativeModeTab;
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
    public static final RegistryObject<Block> CORN_PLANT = registerBlockWithoutBlockItem("corn_plant", () -> new CornPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> ENDER_SPORES_PLANT = registerBlockWithoutBlockItem("ender_spores_plant", () -> new EnderSporesPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> FLAX_PLANT = registerBlockWithoutBlockItem("flax_plant", () -> new FlaxPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> RICE_PLANT = registerBlockWithoutBlockItem("rice_plant", () -> new RicePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> SOYBEAN_PLANT = registerBlockWithoutBlockItem("soybean_plant", () -> new SoybeanPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> STRAWBERRY_PLANT = registerBlockWithoutBlockItem("strawberry_plant", () -> new StrawberryPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> TOMATO_PLANT = registerBlockWithoutBlockItem("tomato_plant", () -> new TomatoPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    //Fermentation Barrels
    public static final RegistryObject<Block> ACACIA_FERMENTATION_BARREL = registerBlock("acacia_fermentation_barrel", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG)), ModCreativeModeTab.FERMENTATION_TAB);
    public static final RegistryObject<Block> BIRCH_FERMENTATION_BARREL = registerBlock("birch_fermentation_barrel", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG)), ModCreativeModeTab.FERMENTATION_TAB);
    public static final RegistryObject<Block> CRIMSON_FERMENTATION_BARREL = registerBlock("crimson_fermentation_barrel", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE)), ModCreativeModeTab.FERMENTATION_TAB);
    public static final RegistryObject<Block> DARK_OAK_FERMENTATION_BARREL = registerBlock("dark_oak_fermentation_barrel", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG)), ModCreativeModeTab.FERMENTATION_TAB);
    public static final RegistryObject<Block> JUNGLE_FERMENTATION_BARREL = registerBlock("jungle_fermentation_barrel", () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG)), ModCreativeModeTab.FERMENTATION_TAB);
    public static final RegistryObject<Block> MANGROVE_FERMENTATION_BARREL = registerBlock("mangrove_fermentation_barrel", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG)), ModCreativeModeTab.FERMENTATION_TAB);
    public static final RegistryObject<Block> OAK_FERMENTATION_BARREL = registerBlock("oak_fermentation_barrel", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.FERMENTATION_TAB);
    public static final RegistryObject<Block> SPRUCE_FERMENTATION_BARREL = registerBlock("spruce_fermentation_barrel", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG)), ModCreativeModeTab.FERMENTATION_TAB);
    public static final RegistryObject<Block> WARPED_FERMENTATION_BARREL = registerBlock("warped_fermentation_barrel", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_HYPHAE)), ModCreativeModeTab.FERMENTATION_TAB);

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
