package net.normal.futuremod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.normal.futuremod.datagen.ModBlockTagProvider;
import net.normal.futuremod.datagen.ModLootTableProvider;
import net.normal.futuremod.datagen.ModModelProvider;
import net.normal.futuremod.datagen.ModRecipeProvider;

public class FutureModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
