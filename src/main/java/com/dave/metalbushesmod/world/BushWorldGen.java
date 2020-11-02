package com.dave.metalbushesmod.world;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.MetalBushesMod;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.BlockStateProvidingFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.event.world.BiomeLoadingEvent;


public class BushWorldGen {


    public static void addFeaturesToBiomes(BiomeLoadingEvent biome) {

        if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
            addBushToOverworld(biome);
        }

        if (biome.getCategory() == Biome.Category.NETHER) {
            addBushesToNether(biome);
        }
    }

    private static void addBushToOverworld(BiomeLoadingEvent biome) {

        if(biome.getCategory() == Biome.Category.PLAINS) {

        }

        //Overworld
        biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, FeatureConfigs.XP_BUSH_Configured);
        biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, FeatureConfigs.COAL_BUSH_Configured);
        biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, FeatureConfigs.IRON_BUSH_Configured);
        biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, FeatureConfigs.GOLD_BUSH_Configured);
        biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, FeatureConfigs.REDSTONE_BUSH_Configured);
        biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, FeatureConfigs.DIAMOND_BUSH_Configured);

        if (MetalBushesMod.mekanismLoaded == true) {
            biome.getGeneration().withFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    new ConfiguredFeature(
                            Feature.RANDOM_PATCH,
                            (new BlockClusterFeatureConfig.Builder(
                                    new SimpleBlockStateProvider(BlockInit.COPPER_BUSH.get().getDefaultState()),
                                    new SimpleBlockPlacer())
                            ).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build()
                    )
            );
            biome.getGeneration().withFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    new ConfiguredFeature(
                            Feature.RANDOM_PATCH,
                            (new BlockClusterFeatureConfig.Builder(
                                    new SimpleBlockStateProvider(BlockInit.OSMIUM_BUSH.get().getDefaultState()),
                                    new SimpleBlockPlacer())
                            ).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build()
                    )
            );
            biome.getGeneration().withFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    new ConfiguredFeature(
                            Feature.RANDOM_PATCH,
                            (new BlockClusterFeatureConfig.Builder(
                                    new SimpleBlockStateProvider(BlockInit.TIN_BUSH.get().getDefaultState()),
                                    new SimpleBlockPlacer())
                            ).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).tries(1).build()
                    )
            );
        }
    }

    private static void addBushesToNether(BiomeLoadingEvent biome){
        //Vanilla
        biome.getGeneration().withFeature(
                GenerationStage.Decoration.VEGETAL_DECORATION,
                new ConfiguredFeature(
                        Feature.RANDOM_PATCH,
                        (new BlockClusterFeatureConfig.Builder(
                                new SimpleBlockStateProvider(BlockInit.NETHER_QUARTZ_BUSH.get().getDefaultState()),
                                new SimpleBlockPlacer())
                        ).whitelist(ImmutableSet.of(Blocks.NETHERRACK)).tries(1).build()
                )
        );
    }

}
