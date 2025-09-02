package com.br2903.oresp;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OresPMod.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ORESP_TAB = TABS.register("oresp", () ->
            CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + OresPMod.MOD_ID + ".oresp"))
                    .icon(() -> new ItemStack(ModItems.SILVER_INGOT.get()))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.SILVER_ORE.get());
                        output.accept(ModItems.URANIUM_ORE.get());
                        output.accept(ModItems.TITANIUM_ORE.get());
                        output.accept(ModItems.LITHIUM_ORE.get());
                        output.accept(ModItems.TIN_ORE.get());
                        output.accept(ModItems.OIL_BLOCK.get());

                        output.accept(ModItems.SILVER_INGOT.get());
                        output.accept(ModItems.URANIUM_INGOT.get());
                        output.accept(ModItems.TITANIUM_INGOT.get());
                        output.accept(ModItems.LITHIUM_INGOT.get());
                        output.accept(ModItems.TIN_INGOT.get());
                    })
                    .build()
    );

    private ModCreativeTabs() {}
}