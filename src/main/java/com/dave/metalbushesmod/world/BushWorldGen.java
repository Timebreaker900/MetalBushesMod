package com.dave.metalbushesmod.world;

import com.dave.metalbushesmod.Init.BlockInit;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.BlockStateProvidingFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class BushWorldGen  {

    private float bushRarity = 1.0F;

    //https://github.com/owmii/Powah/blob/1.16/src/main/java/owmii/powah/world/gen/WorldGen.java
    //https://github.com/DrunkBlood/Lucky-Ore/blob/f54857d13877bb447f944515f1d7cac9208ddfec/src/main/java/drunkblood/luckyore/world/gen/ModOres.java#L27
    public static void initBushes() {
        Registry.register(WorldGenRegistries.field_243653_e, BlockInit.XP_BUSH.get().getRegistryName(),
                Feature.FLOWER
                        .withConfiguration(init.XP_BUSH)
                        .withPlacement(Placement.field_242907_l
                                .configure(new TopSolidRangeConfig(5, 5, 128))
                        )
        );
    }
    public static void setupBushes() {
        for (Map.Entry<RegistryKey<Biome>, Biome> biome : WorldGenRegistries.field_243657_i.func_239659_c_()) {
            if (!biome.getValue().getCategory().equals(Biome.Category.NETHER) && !biome.getValue().getCategory().equals(Biome.Category.THEEND)) {
                addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.VEGETAL_DECORATION,
                        WorldGenRegistries.field_243653_e.getOrDefault(BlockInit.XP_BUSH.get().getRegistryName()));
            }
        }
    }

    public static class init {

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
        public static final BlockStateProvidingFeatureConfig NETHER_QUARTZ_BUSH = new BlockStateProvidingFeatureConfig(
                new SimpleBlockStateProvider(BlockInit.NETHER_QUARTZ_BUSH.get().getDefaultState()));
    }

    /* public static void overworldGeneration() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (!biome.getCategory().equals(Biome.Category.NETHER) && !biome.getCategory().equals(Biome.Category.THEEND)) {
                addFeatureToBiome(biome, GenerationStage.Decoration.VEGETAL_DECORATION, init.XP_BUSH);
            }
        }
    } */

    private static void addFeatureToBiome(Biome biome, GenerationStage.Decoration vegetalDecoration, ConfiguredFeature<?, ?> configuredFeature) {
        List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = new ArrayList<>(biome.func_242440_e().func_242498_c());
        while (biomeFeatures.size() <= vegetalDecoration.ordinal()) {
            biomeFeatures.add(Lists.newArrayList());
        }
        List<Supplier<ConfiguredFeature<?, ?>>> features = new ArrayList<>(biomeFeatures.get(vegetalDecoration.ordinal()));
        features.add(() -> configuredFeature);
        biomeFeatures.set(vegetalDecoration.ordinal(), features);

        ObfuscationReflectionHelper.setPrivateValue(BiomeGenerationSettings.class, biome.func_242440_e(), biomeFeatures,"field_242484_f");
    }


    //Mekanism
    /* public static class BiomeFeaturesMekanism {

        public static final BlockClusterFeatureConfig COPPER_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.COPPER_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build();

        public static final BlockClusterFeatureConfig TIN_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.TIN_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build();

        public static final BlockClusterFeatureConfig OSMIUM_BUSH = (new BlockClusterFeatureConfig.Builder(
                new SimpleBlockStateProvider(BlockInit.OSMIUM_BUSH.get().getDefaultState()),
                new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build();
    } */



    /* public static void generateBushesOverworld() {
         for(Biome biome : ForgeRegistries.BIOMES) {
             //.withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig((int)0.4F, 0F, 0)))
             //.withPlacement(Placement.CHANCE_HEIGHTMAP.configure(new ChanceConfig(1)))
             biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                     .withConfiguration(BiomeFeatures.XP_BUSH)
                     .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1)))
             );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeatures.COAL_BUSH)
                    .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1)))
            );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeatures.IRON_BUSH)
                    .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1)))
            );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeatures.GOLD_BUSH)
                    .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1)))
            );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeatures.REDSTONE_BUSH)
                    .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1)))
            );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeatures.DIAMOND_BUSH)
                    .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1)))
            );

        }

    } */

    /* public static void generateBushesNether() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            //if (biome.getCategory() == Biome.Category.NETHER) {
            //if (WorldHelper.biomeHasType(biome, BiomeDictionary.Type.NETHER)) {
            //if (biome == Biomes.NETHER_WASTES) {
                biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_236282_M_
                        .withConfiguration(BiomeFeatures.NETHER_QUARTZ_BUSH)
                        .withPlacement(Placement.COUNT_HEIGHTMAP.configure(new FrequencyConfig(1)))
                );
            //}
        }

    } */

    //Mekanism
    /* public static void generateBushesOverworldMekansim() {
        for (Biome biome : ForgeRegistries.BIOMES) {

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeaturesMekanism.COPPER_BUSH)
                    //.withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig((int)0.4F, 0.1F, 1)))
                    .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1)))
            );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeaturesMekanism.TIN_BUSH)
                    //.withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig((int)0.4F, 0.1F, 1)))
                    .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1)))
            );

            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                    .withConfiguration(BiomeFeaturesMekanism.OSMIUM_BUSH)
                    //.withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig((int)0.4F, 0.1F, 1)))
                    .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1)))
            );
        }

    } */
}
