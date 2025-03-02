package net.normal.futuremod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.normal.futuremod.FutureMod;
import net.normal.futuremod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup FUTURE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FutureMod.MOD_ID, "future_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GEORGE))
                    .displayName(Text.translatable("itemgroup.futuremod.future_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.HAPPY_POTATO);
                        entries.add(ModItems.GEORGE);
                        entries.add(ModItems.GALENA);
                        entries.add(ModItems.LEAD_INGOT);
                        entries.add(ModItems.RAW_PLATINUM);
                        entries.add(ModItems.PLATINUM_INGOT);
                        entries.add(ModItems.RAW_SULFUR);
                        entries.add(ModItems.SULFUR_DUST);

                        entries.add(ModBlocks.IRON_NETHERITE_BLOCK);
                    })
                    .build());

    public static void registerItemGroups(){
        FutureMod.LOGGER.info("Registering item groups for " + FutureMod.MOD_ID);
    }

}
