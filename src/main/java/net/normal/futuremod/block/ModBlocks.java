package net.normal.futuremod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.normal.futuremod.FutureMod;

public class ModBlocks {

    public static final Block IRON_NETHERITE_BLOCK = registerBlock("iron_netherite_block",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FutureMod.MOD_ID, "iron_netherite_block")))
                    .strength(25.0f, 10.0f).requiresTool().sounds(BlockSoundGroup.METAL).mapColor(MapColor.IRON_GRAY)));

    public static final Block GALENA_ORE = registerBlock("galena_ore",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FutureMod.MOD_ID, "galena_ore")))
                    .strength(3.0f, 3.0f).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FutureMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(FutureMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FutureMod.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }

    public static void registerModBlocks(){
        FutureMod.LOGGER.info("Registering mod blocks for " + FutureMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.IRON_NETHERITE_BLOCK);
        });
    }
}
