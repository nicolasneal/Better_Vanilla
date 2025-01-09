package net.nicolas.bettervanilla;

import net.fabricmc.api.ModInitializer;

import net.nicolas.bettervanilla.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterVanilla implements ModInitializer {
	public static final String MOD_ID = "bettervanilla";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}