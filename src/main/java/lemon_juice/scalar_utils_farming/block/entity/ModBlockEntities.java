package lemon_juice.scalar_utils_farming.block.entity;

import lemon_juice.scalar_utils_farming.ScalarUtilsFarming;
import lemon_juice.scalar_utils_farming.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ScalarUtilsFarming.MOD_ID);

    //public static final RegistryObject<BlockEntityType<OakFermentationBarrelBlockEntity>> ACACIA_FERMENTATION_BARREL = BLOCK_ENTITIES.register("acacia_fermenation_barrel", () -> BlockEntityType.Builder.of(OakFermentationBarrelBlockEntity::new, ModBlocks.ACACIA_FERMENTATION_BARREL.get()).build(null));
    //public static final RegistryObject<BlockEntityType<OakFermentationBarrelBlockEntity>> BIRCH_FERMENTATION_BARREL = BLOCK_ENTITIES.register("birch_fermenation_barrel", () -> BlockEntityType.Builder.of(OakFermentationBarrelBlockEntity::new, ModBlocks.BIRCH_FERMENTATION_BARREL.get()).build(null));
    //public static final RegistryObject<BlockEntityType<OakFermentationBarrelBlockEntity>> CRIMSON_FERMENTATION_BARREL = BLOCK_ENTITIES.register("crimson_fermenation_barrel", () -> BlockEntityType.Builder.of(OakFermentationBarrelBlockEntity::new, ModBlocks.CRIMSON_FERMENTATION_BARREL.get()).build(null));
    //public static final RegistryObject<BlockEntityType<OakFermentationBarrelBlockEntity>> DARK_OAK_FERMENTATION_BARREL = BLOCK_ENTITIES.register("dark_oak_fermenation_barrel", () -> BlockEntityType.Builder.of(OakFermentationBarrelBlockEntity::new, ModBlocks.DARK_OAK_FERMENTATION_BARREL.get()).build(null));
    //public static final RegistryObject<BlockEntityType<OakFermentationBarrelBlockEntity>> JUNGLE_FERMENTATION_BARREL = BLOCK_ENTITIES.register("jungle_fermenation_barrel", () -> BlockEntityType.Builder.of(OakFermentationBarrelBlockEntity::new, ModBlocks.JUNGLE_FERMENTATION_BARREL.get()).build(null));
    //public static final RegistryObject<BlockEntityType<OakFermentationBarrelBlockEntity>> MANGROVE_FERMENTATION_BARREL = BLOCK_ENTITIES.register("mangrove_fermenation_barrel", () -> BlockEntityType.Builder.of(OakFermentationBarrelBlockEntity::new, ModBlocks.MANGROVE_FERMENTATION_BARREL.get()).build(null));
    public static final RegistryObject<BlockEntityType<OakFermentationBarrelBlockEntity>> OAK_FERMENTATION_BARREL = BLOCK_ENTITIES.register("oak_fermenation_barrel", () -> BlockEntityType.Builder.of(OakFermentationBarrelBlockEntity::new, ModBlocks.OAK_FERMENTATION_BARREL.get()).build(null));
    //public static final RegistryObject<BlockEntityType<OakFermentationBarrelBlockEntity>> SPRUCE_FERMENTATION_BARREL = BLOCK_ENTITIES.register("spruce_fermenation_barrel", () -> BlockEntityType.Builder.of(OakFermentationBarrelBlockEntity::new, ModBlocks.SPRUCE_FERMENTATION_BARREL.get()).build(null));
    //public static final RegistryObject<BlockEntityType<OakFermentationBarrelBlockEntity>> WARPED_FERMENTATION_BARREL = BLOCK_ENTITIES.register("warped_fermenation_barrel", () -> BlockEntityType.Builder.of(OakFermentationBarrelBlockEntity::new, ModBlocks.WARPED_FERMENTATION_BARREL.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
