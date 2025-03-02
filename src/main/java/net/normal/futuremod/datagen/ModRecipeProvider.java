package net.normal.futuremod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.normal.futuremod.block.ModBlocks;
import net.normal.futuremod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);

                createShaped(RecipeCategory.MISC, ModBlocks.IRON_NETHERITE_BLOCK, 1)
                        .pattern("ini")
                        .pattern("nin")
                        .pattern("ini")
                        .input('i', Items.IRON_INGOT)
                        .input('n', Items.NETHERITE_INGOT)
                        .group("multi_bench")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(ModBlocks.IRON_NETHERITE_BLOCK))
                        .offerTo(exporter);

                offerSmelting(
                        List.of(ModItems.GALENA), // Inputs
                        RecipeCategory.MISC, // Category
                        ModItems.LEAD_INGOT, // Output
                        1.0f, // Experience
                        300, // Cooking time
                        "lead_ingot" // group
                );

                offerBlasting(
                        List.of(ModItems.GALENA),
                        RecipeCategory.MISC,
                        ModItems.LEAD_INGOT,
                        1.0f,
                        150,
                        "lead_ingot"
                );
            }
        };
    }

    @Override
    public String getName() {
        return "ModRecipeProvider";
    }
}
