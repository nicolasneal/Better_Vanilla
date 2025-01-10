package net.nicolas.bettervanilla.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.nicolas.bettervanilla.BetterVanilla;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item HIDE = registerItem("hide", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterVanilla.MOD_ID, "hide")))));
    public static final Item SQUID = registerItem("squid", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterVanilla.MOD_ID, "squid"))).food(ModFoodComponents.SQUID)));
    public static final Item CALAMARI = registerItem("calamari", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterVanilla.MOD_ID, "calamari"))).food(ModFoodComponents.CALAMARI)));
    public static final Item BEAR = registerItem("bear", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterVanilla.MOD_ID, "bear"))).food(ModFoodComponents.BEAR)));
    public static final Item COOKED_BEAR = registerItem("cooked_bear", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterVanilla.MOD_ID, "cooked_bear"))).food(ModFoodComponents.COOKED_BEAR)));
    public static final Item FROG_LEGS = registerItem("frog_legs", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterVanilla.MOD_ID, "frog_legs"))).food(ModFoodComponents.FROG_LEGS)));
    public static final Item COOKED_FROG_LEGS = registerItem("cooked_frog_legs", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterVanilla.MOD_ID, "cooked_frog_legs"))).food(ModFoodComponents.COOKED_FROG_LEGS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BetterVanilla.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterVanilla.LOGGER.info("Registering Mod Items for " + BetterVanilla.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(SQUID);
            entries.add(CALAMARI);
            entries.add(BEAR);
            entries.add(COOKED_BEAR);
            entries.add(FROG_LEGS);
            entries.add(COOKED_FROG_LEGS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(HIDE);
        });
    }
}