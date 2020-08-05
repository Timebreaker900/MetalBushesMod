package com.dave.metalbushesmod.util;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

public class WorldHelper {

    public static boolean biomeHasType(Biome biome, BiomeDictionary.Type... types) {
        for (BiomeDictionary.Type type : types) {
            if (BiomeDictionary.hasType(biome, type)) {
                return true;
            }
        }
        return false;
    }
}
