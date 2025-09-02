package com.br2903.oresp;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OresPMod.MOD_ID);

    // BlockItems para que los bloques existan como ítems (y puedan dropear)
    public static final DeferredItem<BlockItem> SILVER_ORE = ITEMS.register("silver_ore",
            () -> new BlockItem(ModBlocks.SILVER_ORE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> URANIUM_ORE = ITEMS.register("uranium_ore",
            () -> new BlockItem(ModBlocks.URANIUM_ORE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> TITANIUM_ORE = ITEMS.register("titanium_ore",
            () -> new BlockItem(ModBlocks.TITANIUM_ORE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> LITHIUM_ORE = ITEMS.register("lithium_ore",
            () -> new BlockItem(ModBlocks.LITHIUM_ORE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> TIN_ORE = ITEMS.register("tin_ore",
            () -> new BlockItem(ModBlocks.TIN_ORE.get(), new Item.Properties()));
    public static final DeferredItem<BlockItem> OIL_BLOCK = ITEMS.register("oil_block",
            () -> new BlockItem(ModBlocks.OIL_BLOCK.get(), new Item.Properties()));

    // Ítems de ejemplo (opcional)
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_INGOT = ITEMS.register("lithium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));

    private ModItems() {}
}