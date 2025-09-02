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

@Mod(OresPMod.MOD_ID)
public class OresPMod {
    public static final String MOD_ID = "orespmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public OresPMod(IEventBus modEventBus, ModContainer modContainer) {
        // Registros principales
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.TABS.register(modEventBus); // <- tu pestaña creativa

        modEventBus.addListener(this::commonSetup);

        // Si SOLO quieres tu pestaña personalizada, puedes eliminar esta línea y el método addCreative.
        modEventBus.addListener(this::addCreative);

        NeoForge.EVENT_BUS.register(this);

        // Config (si la usas)
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("OresPMod: common setup");
    }

    // Opcional: para añadir tus ítems a pestañas vanilla además de tu pestaña personalizada.
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // Vacío o elimina este método si no lo necesitas.
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