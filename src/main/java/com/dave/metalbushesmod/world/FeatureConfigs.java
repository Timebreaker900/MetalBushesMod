package com.dave.metalbushesmod.world;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.MetalBushesMod;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;

import static com.dave.metalbushesmod.MetalBushesMod.*;

public class FeatureConfigs {

    /*
    #############
    # Overworld #
    #############
     */
    //Vanilla
    public static final BlockClusterFeatureConfig XP_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.XP_BUSH.get().getDefaultState()),
            new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(1)
            .xSpread(25)
            .ySpread(25)
            .build();

    public static final BlockClusterFeatureConfig COAL_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.COAL_BUSH.get().getDefaultState()),
            new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(1)
            .xSpread(25)
            .ySpread(25)
            .build();

    public static final BlockClusterFeatureConfig IRON_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.IRON_BUSH.get().getDefaultState()),
            new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(1)
            .xSpread(25)
            .ySpread(25)
            .build();

    public static final BlockClusterFeatureConfig GOLD_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.GOLD_BUSH.get().getDefaultState()),
            new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(1)
            .xSpread(25)
            .ySpread(25)
            .build();

    public static final BlockClusterFeatureConfig REDSTONE_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.REDSTONE_BUSH.get().getDefaultState()),
            new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(1)
            .xSpread(25)
            .ySpread(25)
            .build();

    public static final BlockClusterFeatureConfig DIAMOND_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.DIAMOND_BUSH.get().getDefaultState()),
            new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(1)
            .xSpread(25)
            .ySpread(25)
            .build();


    /*
    ##########
    # Nether #
    ##########
     */
    /* public static final BlockClusterFeatureConfig NETHER_QUARTZ_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.NETHER_QUARTZ_BUSH.get().getDefaultState()),
            new SimpleBlockPlacer())).tries(1).build(); */




    /*
    #######################
    # Configured Features #
    #######################
     */
    //Vanilla
    public static ConfiguredFeature XP_BUSH_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            XP_BUSH);

    public static ConfiguredFeature COAL_BUSH_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            COAL_BUSH);

    public static ConfiguredFeature IRON_BUSH_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            IRON_BUSH);

    public static ConfiguredFeature GOLD_BUSH_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            GOLD_BUSH);

    public static ConfiguredFeature REDSTONE_BUSH_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            REDSTONE_BUSH);

    public static ConfiguredFeature DIAMOND_BUSH_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            DIAMOND_BUSH);

    //Nether
    /* public static ConfiguredFeature NETHER_QUARTZ_BUSH_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            NETHER_QUARTZ_BUSH); */

}

