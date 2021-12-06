package com.dave.metalbushesmod.world;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.Init.ItemInit;
import com.dave.metalbushesmod.MetalBushesMod;
import com.google.common.collect.ImmutableSet;
import net.minecraft.core.BlockPos;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.server.level.WorldGenRegion;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.*;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class FeatureConfigs {


    /*
    #############
    # Overworld #
    #############
     */
    public static final PlacedFeature FEATURE_BUSHES = PlacementUtils.register("feature_bushes",
            WorldGenRegister.BUSHES.placed(
                    NoiseThresholdCountPlacement.of(-0.8D, 15, 4),
                    RarityFilter.onAverageOnceEvery(32),
                    InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP, BiomeFilter.biome()
            )
    );


    //Vanilla
    /* public static final RandomPatchConfiguration XP_BUSH = (new RandomPatchConfiguration.GrassConfigurationBuilder(
            new SimpleStateProvider(BlockInit.XP_BUSH.get().defaultBlockState()),
            new SimpleBlockPlacer()))
            .whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(1)
            .xspread(25)
            .yspread(25)
            .build(); */

    /* public static final RandomPatchConfiguration COPPER_BUSH = (new RandomPatchConfiguration.GrassConfigurationBuilder(
            new SimpleStateProvider(BlockInit.COPPER_BUSH.get().defaultBlockState()),
            new SimpleBlockPlacer()))
            .whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(1)
            .xspread(25)
            .yspread(25)
            .build();

    public static final RandomPatchConfiguration COAL_BUSH = (new RandomPatchConfiguration.GrassConfigurationBuilder(
            new SimpleStateProvider(BlockInit.COAL_BUSH.get().defaultBlockState()),
            new SimpleBlockPlacer()))
            .whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(1)
            .xspread(25)
            .yspread(25)
            .build();

    public static final RandomPatchConfiguration IRON_BUSH = (new RandomPatchConfiguration.GrassConfigurationBuilder(
            new SimpleStateProvider(BlockInit.IRON_BUSH.get().defaultBlockState()),
            new SimpleBlockPlacer()))
            .whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(1)
            .xspread(25)
            .yspread(25)
            .build();

    public static final RandomPatchConfiguration GOLD_BUSH = (new RandomPatchConfiguration.GrassConfigurationBuilder(
            new SimpleStateProvider(BlockInit.GOLD_BUSH.get().defaultBlockState()),
            new SimpleBlockPlacer()))
            .whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(1)
            .xspread(25)
            .yspread(25)
            .build();

    public static final RandomPatchConfiguration REDSTONE_BUSH = (new RandomPatchConfiguration.GrassConfigurationBuilder(
            new SimpleStateProvider(BlockInit.REDSTONE_BUSH.get().defaultBlockState()),
            new SimpleBlockPlacer()))
            .whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(1)
            .xspread(25)
            .yspread(25)
            .build();

    public static final RandomPatchConfiguration DIAMOND_BUSH = (new RandomPatchConfiguration.GrassConfigurationBuilder(
            new SimpleStateProvider(BlockInit.DIAMOND_BUSH.get().defaultBlockState()),
            new SimpleBlockPlacer()))
            .whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(1)
            .xspread(25)
            .yspread(25)
            .build();

    public static final RandomPatchConfiguration BLAZE_BUSH = (new RandomPatchConfiguration.GrassConfigurationBuilder(
            new SimpleStateProvider(BlockInit.BLAZE_BUSH.get().defaultBlockState()),
            new SimpleBlockPlacer()))
            .whitelist(ImmutableSet.of(Blocks.SAND))
            .tries(2)
            .xspread(25)
            .yspread(25)
            .build();

    public static final RandomPatchConfiguration SLIME_BUSH = (new RandomPatchConfiguration.GrassConfigurationBuilder(
            new SimpleStateProvider(BlockInit.SLIME_BUSH.get().defaultBlockState()),
            new SimpleBlockPlacer()))
            .whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(2)
            .xspread(25)
            .yspread(25)
            .build();


     */


    /*
    ##########
    # Nether #
    ##########
     */
    /* public static final RandomPatchConfiguration NETHER_QUARTZ_BUSH = (new RandomPatchConfiguration.GrassConfigurationBuilder(
            new SimpleStateProvider(BlockInit.NETHER_QUARTZ_BUSH.get().defaultBlockState()),
            new SimpleBlockPlacer()))
            .whitelist(ImmutableSet.of(Blocks.NETHERRACK))
            .tries(1)
            .xspread(25)
            .yspread(25)
            .build();


     */



    /*
    #######################
    # Configured Features #
    #######################
     */
    //Vanilla
    /* public static ConfiguredFeature XP_BUSH_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            XP_BUSH);

    public static ConfiguredFeature COPPER_BUSH_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            COPPER_BUSH);

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

    public static ConfiguredFeature BLAZE_BUSH_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            BLAZE_BUSH);

    public static ConfiguredFeature SLIME_BUSH_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            SLIME_BUSH);

    //Nether
    public static ConfiguredFeature NETHER_QUARTZ_BUSH_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            NETHER_QUARTZ_BUSH);

     */



}

