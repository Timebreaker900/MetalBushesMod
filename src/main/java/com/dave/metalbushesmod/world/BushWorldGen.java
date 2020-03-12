package com.dave.metalbushesmod.world;

import com.dave.metalbushesmod.Init.BlockInit;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import sun.java2d.pipe.SpanShapeRenderer;

import java.util.Random;
import java.util.function.Function;

public class BushWorldGen  {

    /* public static class BiomeFeatures {
        public static final BlockClusterFeatureConfig XP_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.XP_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).func_227316_a_(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build();

        public static final BlockClusterFeatureConfig COAL_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.COAL_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).func_227316_a_(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build();
    }


    public static void generateBushes() {
        for(Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeatures.XP_BUSH)
                    .withPlacement(Placement.COUNT_HEIGHTMAP.configure(new FrequencyConfig(1)))
            );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeatures.COAL_BUSH)
                    .withPlacement(Placement.COUNT_HEIGHTMAP.configure(new FrequencyConfig(1)))
            );
        }
    } */

}
