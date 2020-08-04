package com.dave.metalbushesmod.world;

import com.dave.metalbushesmod.Init.BlockInit;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.registries.ForgeRegistries;

public class BushWorldGen  {

    private float bushRarity = 1.0F;

    public static class BiomeFeatures {
        //Overworld
        public static final BlockClusterFeatureConfig XP_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.XP_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build();

        public static final BlockClusterFeatureConfig COAL_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.COAL_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build();

        public static final BlockClusterFeatureConfig IRON_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.IRON_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build();

        public static final BlockClusterFeatureConfig GOLD_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.GOLD_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build();

        public static final BlockClusterFeatureConfig REDSTONE_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.REDSTONE_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build();

        public static final BlockClusterFeatureConfig DIAMOND_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.DIAMOND_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build();

        //Nether
        public static final BlockClusterFeatureConfig NETHER_QUARTZ_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.NETHER_QUARTZ_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.NETHERRACK)).tries(1).build();




    }

    //Mekanism
    public static class BiomeFeaturesMekanism {

        public static final BlockClusterFeatureConfig COPPER_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.COPPER_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build();

        public static final BlockClusterFeatureConfig TIN_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.TIN_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build();

        public static final BlockClusterFeatureConfig OSMIUM_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.OSMIUM_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build();
    }


    public static void generateBushesOverworld() {
         for(Biome biome : ForgeRegistries.BIOMES) {
             //.withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig((int)0.4F, 0F, 0)))
             //.withPlacement(Placement.CHANCE_HEIGHTMAP.configure(new ChanceConfig(1)))
             biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                     .withConfiguration(BiomeFeatures.XP_BUSH)
                     .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(10)))
             );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeatures.COAL_BUSH)
                    .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(10)))
            );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeatures.IRON_BUSH)
                    .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(10)))
            );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeatures.GOLD_BUSH)
                    .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(10)))
            );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeatures.REDSTONE_BUSH)
                    .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(10)))
            );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeatures.DIAMOND_BUSH)
                    .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(10)))
            );

        }

    }
    public static void generateBushesNether() {
        /* for(Biome biome : ForgeRegistries.BIOMES) {
            if(biome == Biomes.NETHER) {
                Biomes.NETHER.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                        .withConfiguration(BiomeFeatures.NETHER_QUARTZ_BUSH)
                        .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(30)))
                );
            }
        }*/
    }

    //Mekanism
    public static void generateBushesOverworldMekansim() {
        for(Biome biome : ForgeRegistries.BIOMES) {

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeaturesMekanism.COPPER_BUSH)
                    .withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig((int)0.4F, 0.1F, 1)))
            );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeaturesMekanism.TIN_BUSH)
                    .withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig((int)0.4F, 0.1F, 1)))
            );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeaturesMekanism.OSMIUM_BUSH)
                    .withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig((int)0.4F, 0.1F, 1)))
            );
        }
    }
}
