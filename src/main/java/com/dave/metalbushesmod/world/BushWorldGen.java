package com.dave.metalbushesmod.world;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.MetalBushesMod;
import com.dave.metalbushesmod.config.ConfigHandler;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
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

        Biome.Category bc = biome.getCategory();

        //XP BUSH
        if(bc == Biome.Category.PLAINS || bc == Biome.Category.SAVANNA || bc == Biome.Category.FOREST) {
            if(ConfigHandler.CONFIG.allowExperienceGen.get() == true) {
                biome.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FeatureConfigs.XP_BUSH_Configured
                );
            }
        }


        //COAL BUSH
        if(bc == Biome.Category.TAIGA || bc == Biome.Category.EXTREME_HILLS || bc == Biome.Category.ICY || bc == Biome.Category.FOREST) {
            if (ConfigHandler.CONFIG.allowCoalGen.get() == true) {
                biome.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FeatureConfigs.COAL_BUSH_Configured
                );
            }
        }


        //IRON BUSH
        if(bc == Biome.Category.PLAINS || bc == Biome.Category.TAIGA || bc == Biome.Category.SAVANNA || bc == Biome.Category.FOREST) {
            if (ConfigHandler.CONFIG.allowIronGen.get() == true) {
                biome.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FeatureConfigs.IRON_BUSH_Configured
                );
            }
        }

        //GOLD BUSH
        if(bc == Biome.Category.SAVANNA || bc == Biome.Category.FOREST) {
            if (ConfigHandler.CONFIG.allowGoldGen.get() == true) {
                biome.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FeatureConfigs.GOLD_BUSH_Configured
                );
            }
        }

        //REDSTONE BUSH & DIAMOND BUSH
        if(bc == Biome.Category.PLAINS || bc == Biome.Category.FOREST) {

            if (ConfigHandler.CONFIG.allowRedstoneGen.get() == true) {
                biome.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FeatureConfigs.REDSTONE_BUSH_Configured
                );
            }

            if(ConfigHandler.CONFIG.allowDiamondGen.get() == true) {
                biome.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FeatureConfigs.DIAMOND_BUSH_Configured
                );
            }
        }

        //BLAZE BUSH
        if(bc == Biome.Category.DESERT){
            biome.getGeneration().withFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    FeatureConfigs.BLAZE_BUSH_Configured
            );
        }

        //COPPER BUSH
        if (MetalBushesMod.mekanismLoaded == true) {
            if(bc == Biome.Category.PLAINS || bc == Biome.Category.SAVANNA) {
                if (ConfigHandler.CONFIG.allowCopperGen.get() == true) {
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
                }
            }
            //OSMIUM BUSH
            if(bc == Biome.Category.TAIGA || bc == Biome.Category.ICY) {
                if (ConfigHandler.CONFIG.allowOsmiumGen.get() == true) {
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
                }
            }

            //TIN BUSH
            if(bc == Biome.Category.PLAINS || bc == Biome.Category.FOREST) {
                if (ConfigHandler.CONFIG.allowTinGen.get() == true) {
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
        }
    }

    private static void addBushesToNether(BiomeLoadingEvent biome){
        //Vanilla
        biome.getGeneration().withFeature(
                GenerationStage.Decoration.VEGETAL_DECORATION,
                //new ConfiguredFeature(
                        Feature.NETHER_FOREST_VEGETATION
                        .withConfiguration(
                                new BlockStateProvidingFeatureConfig(
                                        new SimpleBlockStateProvider(BlockInit.NETHER_QUARTZ_BUSH.get().getDefaultState())
                                )
                        )
                        .withPlacement(
                                Placement.COUNT_MULTILAYER.configure(new FeatureSpreadConfig(1))
                        )
                        //)
                        /* (new BlockClusterFeatureConfig.Builder(
                                new SimpleBlockStateProvider(BlockInit.NETHER_QUARTZ_BUSH.get().getDefaultState()),
                                new SimpleBlockPlacer())
                        ).whitelist(ImmutableSet.of(Blocks.NETHERRACK)).tries(1).build() */
        );

    }

}
