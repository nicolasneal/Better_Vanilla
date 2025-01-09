package net.nicolas.bettervanilla.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.nicolas.bettervanilla.BetterVanilla;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item HIDE = registerItem("hide", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BetterVanilla.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterVanilla.LOGGER.info("Registering Mod Items for " + BetterVanilla.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(HIDE);
            entries.add(RAW_PINK_GARNET);
        });
    }
}