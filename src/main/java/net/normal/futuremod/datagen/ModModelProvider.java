package net.normal.futuremod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.normal.futuremod.block.ModBlocks;
import net.normal.futuremod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRON_NETHERITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GALENA_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.HAPPY_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.GEORGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GALENA, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PLATINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SULFUR, Models.GENERATED);
        itemModelGenerator.register(ModItems.SULFUR_DUST, Models.GENERATED);
    }
}
