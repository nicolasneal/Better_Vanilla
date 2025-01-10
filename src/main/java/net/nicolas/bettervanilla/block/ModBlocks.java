package net.nicolas.bettervanilla.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.nicolas.bettervanilla.BetterVanilla;

public class ModBlocks {

    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "polished_stone")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new StairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "polished_stone_stairs")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "polished_stone_slab")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "smooth_stone_stairs")))
                    .strength(2F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "andesite_bricks")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            new StairsBlock(ModBlocks.ANDESITE_BRICKS.getDefaultState(), AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "andesite_bricks_stairs")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "andesite_bricks_slab")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block CHISELED_ANDESITE = registerBlock("chiseled_andesite",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "chiseled_andesite")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "granite_bricks")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            new StairsBlock(ModBlocks.GRANITE_BRICKS.getDefaultState(), AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "granite_brick_stairs")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "granite_brick_slab")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block CHISELED_GRANITE = registerBlock("chiseled_granite",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "chiseled_granite")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "diorite_bricks")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            new StairsBlock(ModBlocks.DIORITE_BRICKS.getDefaultState(), AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "diorite_brick_stairs")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "diorite_brick_slab")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block CHISELED_DIORITE = registerBlock("chiseled_diorite",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterVanilla.MOD_ID, "chiseled_diorite")))
                    .strength(1.5F, 6.0F)
                    .requiresTool()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BetterVanilla.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BetterVanilla.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterVanilla.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }

    public static void registerModBlocks() {
        BetterVanilla.LOGGER.info("Registering Mod Blocks for " + BetterVanilla.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(POLISHED_STONE);
            entries.add(POLISHED_STONE_STAIRS);
            entries.add(POLISHED_STONE_SLAB);
            entries.add(SMOOTH_STONE_STAIRS);
            entries.add(ANDESITE_BRICKS);
            entries.add(ANDESITE_BRICK_STAIRS);
            entries.add(ANDESITE_BRICK_SLAB);
            entries.add(CHISELED_ANDESITE);
            entries.add(GRANITE_BRICKS);
            entries.add(GRANITE_BRICK_STAIRS);
            entries.add(GRANITE_BRICK_SLAB);
            entries.add(CHISELED_GRANITE);
            entries.add(DIORITE_BRICKS);
            entries.add(DIORITE_BRICK_STAIRS);
            entries.add(DIORITE_BRICK_SLAB);
            entries.add(CHISELED_DIORITE);
        });
    }

}
