package net.normal.futuremod.world.dimension;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;
import net.normal.futuremod.FutureMod;

import java.util.OptionalLong;

public class ModDimensions {
    public static final RegistryKey<DimensionOptions> CRYONIA_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            Identifier.of(FutureMod.MOD_ID, "cryonia"));
    public static final RegistryKey<World> CRYONIA_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            Identifier.of(FutureMod.MOD_ID, "cryonia"));
    public static final RegistryKey<DimensionType> CRYONIA_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            Identifier.of(FutureMod.MOD_ID, "cryonia_type"));
}
