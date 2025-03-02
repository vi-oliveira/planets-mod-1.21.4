package net.normal.futuremod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.normal.futuremod.FutureMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item HAPPY_POTATO = registerItem("happy_potato", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FutureMod.MOD_ID,"happy_potato")))));

    public static final Item GEORGE = registerItem("george", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FutureMod.MOD_ID,"george")))));

    public static final Item GALENA = registerItem("galena", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FutureMod.MOD_ID,"galena")))));

    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FutureMod.MOD_ID,"lead_ingot")))));

    public static final Item RAW_PLATINUM = registerItem("raw_platinum", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FutureMod.MOD_ID,"raw_platinum")))));

    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FutureMod.MOD_ID,"platinum_ingot")))));

    public static final Item RAW_SULFUR = registerItem("raw_sulfur", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FutureMod.MOD_ID,"raw_sulfur")))));

    public static final Item SULFUR_DUST = registerItem("sulfur_dust", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FutureMod.MOD_ID,"sulfur_dust")))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(FutureMod.MOD_ID, name), item);

    }

    public static void registerModItems(){
        FutureMod.LOGGER.info("Registering Mod Items for " + FutureMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
           entries.add(HAPPY_POTATO);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GEORGE);
        });
    }
}