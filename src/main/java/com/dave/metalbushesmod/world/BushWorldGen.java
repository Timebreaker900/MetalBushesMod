package com.dave.metalbushesmod.world;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.MetalBushesMod;
import com.dave.metalbushesmod.config.ConfigHandler;
import com.google.common.collect.ImmutableSet;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockPileConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.CountConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.ArrayList;


public class BushWorldGen {


    public static void addFeaturesToBiomes(BiomeLoadingEvent biome) {


        if (biome.getCategory() != Biome.BiomeCategory.NETHER && biome.getCategory() != Biome.BiomeCategory.THEEND) {
            addBushToOverworld(biome);
        }

        if (biome.getCategory() == Biome.BiomeCategory.NETHER) {
            addBushesToNether(biome);
        }
    }

    private static void addBushToOverworld(BiomeLoadingEvent biome) {

        Biome.BiomeCategory bc = biome.getCategory();

        //float bt = biome.getClimate().temperature;

        //XP BUSH
        if(bc == Biome.BiomeCategory.PLAINS || bc == Biome.BiomeCategory.SAVANNA || bc == Biome.BiomeCategory.FOREST) {
            if(ConfigHandler.CONFIG.allowExperienceGen.get() == true) {
                biome.getGeneration().addFeature(
                        GenerationStep.Decoration.VEGETAL_DECORATION,
                        FeatureConfigs.getFeatureBushes(BlockInit.XP_BUSH.get().defaultBlockState())
                );
            }
        }

        //COPPER BUSH
        if (bc == Biome.BiomeCategory.PLAINS || bc == Biome.BiomeCategory.SAVANNA) {
            if (ConfigHandler.CONFIG.allowCopperGen.get() == true) {
                if (ConfigHandler.CONFIG.allowCoalGen.get() == true) {
                    biome.getGeneration().addFeature(
                            GenerationStep.Decoration.VEGETAL_DECORATION,
                            FeatureConfigs.getFeatureBushes(BlockInit.COPPER_BUSH.get().defaultBlockState())
                    );
                }
            }
        }


        //COAL BUSH
        //Snowy & cold
        //if(bt >=  -0.5 && bt <= 0.3) {
        if(bc == Biome.BiomeCategory.TAIGA || bc == Biome.BiomeCategory.EXTREME_HILLS || bc == Biome.BiomeCategory.ICY || bc == Biome.BiomeCategory.FOREST) {
            if (ConfigHandler.CONFIG.allowCoalGen.get() == true) {
                biome.getGeneration().addFeature(
                        GenerationStep.Decoration.VEGETAL_DECORATION,
                        FeatureConfigs.getFeatureBushes(BlockInit.COAL_BUSH.get().defaultBlockState())
                );
            }
        }


        //IRON BUSH
        if(bc == Biome.BiomeCategory.PLAINS || bc == Biome.BiomeCategory.TAIGA || bc == Biome.BiomeCategory.SAVANNA || bc == Biome.BiomeCategory.FOREST) {
            if (ConfigHandler.CONFIG.allowIronGen.get() == true) {
                biome.getGeneration().addFeature(
                        GenerationStep.Decoration.VEGETAL_DECORATION,
                        FeatureConfigs.getFeatureBushes(BlockInit.IRON_BUSH.get().defaultBlockState())
                );
            }
        }

        //GOLD BUSH
        if(bc == Biome.BiomeCategory.SAVANNA || bc == Biome.BiomeCategory.FOREST) {
            if (ConfigHandler.CONFIG.allowGoldGen.get() == true) {
                biome.getGeneration().addFeature(
                        GenerationStep.Decoration.VEGETAL_DECORATION,
                        FeatureConfigs.getFeatureBushes(BlockInit.GOLD_BUSH.get().defaultBlockState())
                );
            }
        }

        //REDSTONE BUSH & DIAMOND BUSH
        if(bc == Biome.BiomeCategory.PLAINS || bc == Biome.BiomeCategory.FOREST) {

            if (ConfigHandler.CONFIG.allowRedstoneGen.get() == true) {
                biome.getGeneration().addFeature(
                        GenerationStep.Decoration.VEGETAL_DECORATION,
                        FeatureConfigs.getFeatureBushes(BlockInit.REDSTONE_BUSH.get().defaultBlockState())
                );
            }

            if(ConfigHandler.CONFIG.allowDiamondGen.get() == true) {
                biome.getGeneration().addFeature(
                        GenerationStep.Decoration.VEGETAL_DECORATION,
                        FeatureConfigs.getFeatureBushes(BlockInit.DIAMOND_BUSH.get().defaultBlockState())
                );
            }
        }

        //BLAZE BUSH
        if(bc == Biome.BiomeCategory.DESERT){
            if(ConfigHandler.CONFIG.allowExperienceGen.get() == true) {
                biome.getGeneration().addFeature(
                        GenerationStep.Decoration.VEGETAL_DECORATION,
                        FeatureConfigs.getFeatureBushes(BlockInit.BLAZE_BUSH.get().defaultBlockState())
                );
            }
        }

        //SLIME BUSH
        if(bc == Biome.BiomeCategory.SWAMP){
            if(ConfigHandler.CONFIG.allowSlimeGen.get() == true) {
                biome.getGeneration().addFeature(
                        GenerationStep.Decoration.VEGETAL_DECORATION,
                        FeatureConfigs.getFeatureBushes(BlockInit.SLIME_BUSH.get().defaultBlockState())
                );
            }
        }


        if (MetalBushesMod.mekanismLoaded == true) {
            //OSMIUM BUSH
            if(bc == Biome.BiomeCategory.TAIGA || bc == Biome.BiomeCategory.ICY) {
                if (ConfigHandler.CONFIG.allowOsmiumGen.get() == true) {
                    biome.getGeneration().addFeature(
                            GenerationStep.Decoration.VEGETAL_DECORATION,
                            FeatureConfigs.getFeatureBushes(BlockInit.OSMIUM_BUSH.get().defaultBlockState())
                    );
                }
            }

            //TIN BUSH
            if(bc == Biome.BiomeCategory.PLAINS || bc == Biome.BiomeCategory.FOREST) {
                if (ConfigHandler.CONFIG.allowTinGen.get() == true) {
                    biome.getGeneration().addFeature(
                            GenerationStep.Decoration.VEGETAL_DECORATION,
                            FeatureConfigs.getFeatureBushes(BlockInit.TIN_BUSH.get().defaultBlockState())
                    );
                }
            }
        }
        //Create
        if (MetalBushesMod.createLoaded == true) {
            //ZINC BUSH
            if (bc == Biome.BiomeCategory.PLAINS || bc == Biome.BiomeCategory.SAVANNA || bc == Biome.BiomeCategory.FOREST) {
                if (ConfigHandler.CONFIG.allowZincGen.get() == true) {
                    biome.getGeneration().addFeature(
                            GenerationStep.Decoration.VEGETAL_DECORATION,
                            FeatureConfigs.getFeatureBushes(BlockInit.ZINC_BUSH.get().defaultBlockState())
                    );
                }
            }
        }
    }

    /* private static void addBushesToNether(BiomeLoadingEvent biome){
        //Vanilla
        if (ConfigHandler.CONFIG.allowBlazeGen.get() == true) {
            biome.getGeneration().addFeature(
                    GenerationStep.Decoration.VEGETAL_DECORATION,
                    FeatureConfigs.getFeatureBushes(BlockInit.NETHER_QUARTZ_BUSH.get().defaultBlockState())
                    //new ConfiguredFeature(
                    Feature.NETHER_FOREST_VEGETATION
                            .configured(
                                    new BlockPileConfiguration(
                                            new SimpleStateProvider(BlockInit.NETHER_QUARTZ_BUSH.get().defaultBlockState())
                                    )
                            )
                            .decorated(
                                    Spread32Decorator.COUNT_MULTILAYER.configured(new CountConfiguration(1))
                                    //Placement.COUNT_MULTILAYER.configure(new FeatureSpreadConfig(1))
                            )

            );
        }
    } */

}
