package net.normal.futuremod;

import net.fabricmc.api.ModInitializer;

import net.normal.futuremod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FutureMod implements ModInitializer {
	public static final String MOD_ID = "futuremod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}