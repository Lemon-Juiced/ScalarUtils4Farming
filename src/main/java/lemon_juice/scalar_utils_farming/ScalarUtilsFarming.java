package lemon_juice.scalar_utils_farming;

import com.mojang.logging.LogUtils;
import lemon_juice.scalar_utils_farming.block.ModBlocks;
import lemon_juice.scalar_utils_farming.block.entity.ModBlockEntities;
import lemon_juice.scalar_utils_farming.item.ModItems;
import lemon_juice.scalar_utils_farming.loot.ModLootModifiers;
import lemon_juice.scalar_utils_farming.screen.ModMenuTypes;
import lemon_juice.scalar_utils_farming.screen.OakFermentationBarrelScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.MenuProvider;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ScalarUtilsFarming.MOD_ID)
public class ScalarUtilsFarming {
    public static final String MOD_ID = "scalar_utils_farming";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ScalarUtilsFarming() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModLootModifiers.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MenuScreens.register(ModMenuTypes.OAK_FERMENTATION_BARREL_MENU.get(), OakFermentationBarrelScreen::new);
        }
    }
}
