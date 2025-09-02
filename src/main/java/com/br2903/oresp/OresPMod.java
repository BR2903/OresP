package com.br2903.oresp;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import net.minecraft.world.item.CreativeModeTabs;

// El valor aquí debe coincidir con el modid del archivo neoforge.mods.toml
@Mod(OresPMod.MOD_ID)
public class OresPMod {
    public static final String MOD_ID = "orespmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public OresPMod(IEventBus modEventBus, ModContainer modContainer) {
        // Registros principales
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        // Si luego agregas worldgen o tabs personalizados, regístralos aquí también.
        // ModWorldGen.register(modEventBus);
        // ModCreativeTab.TABS.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        NeoForge.EVENT_BUS.register(this);

        // Registro de config si la usas
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("OresPMod: common setup");
    }

    // Agrega tus ítems/bloques a pestañas creativas vanilla
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // Bloques de mena en NATURAL_BLOCKS
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModItems.SILVER_ORE.get());
            event.accept(ModItems.URANIUM_ORE.get());
            event.accept(ModItems.TITANIUM_ORE.get());
            event.accept(ModItems.LITHIUM_ORE.get());
            event.accept(ModItems.TIN_ORE.get());
            event.accept(ModItems.OIL_BLOCK.get());
        }

        // Lingotes y materiales en INGREDIENTS
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.SILVER_INGOT.get());
            event.accept(ModItems.URANIUM_INGOT.get());
            event.accept(ModItems.TITANIUM_INGOT.get());
            event.accept(ModItems.LITHIUM_INGOT.get());
            event.accept(ModItems.TIN_INGOT.get());
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Código al iniciar el servidor, si lo necesitas
    }

    @EventBusSubscriber(modid = OresPMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Código solo para cliente
        }
    }
}