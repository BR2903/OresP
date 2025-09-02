package com.br2903.oresp;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(OresPMod.MOD_ID);

    // Durezas aproximadas y resistencia a explosiones (hardness, resistance)
    public static final DeferredBlock<Block> SILVER_ORE = BLOCKS.register("silver_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> URANIUM_ORE = BLOCKS.register("uranium_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)
                    .mapColor(MapColor.COLOR_GREEN)
                    .strength(5.0F, 6.0F)));
    public static final DeferredBlock<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(5.0F, 6.0F)));
    public static final DeferredBlock<Block> LITHIUM_ORE = BLOCKS.register("lithium_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> TIN_ORE = BLOCKS.register("tin_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> OIL_BLOCK = BLOCKS.register("oil_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SLIME_BLOCK)
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(0.5F, 0.5F)));

    private ModBlocks() {}
}