package com.dave.metalbushesmod.world;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.Init.ItemInit;
import com.google.common.collect.ImmutableSet;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.blockplacers.BlockPlacer;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProviderType;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;

import java.util.Random;

public class FeatureConfigs {

    /*
    #############
    # Overworld #
    #############
     */
    //Vanilla
    public static final RandomPatchConfiguration XP_BUSH = (new RandomPatchConfiguration.GrassConfigurationBuilder(
            new SimpleStateProvider(BlockInit.XP_BUSH.get().defaultBlockState()),
            new SimpleBlockPlacer()))
            .whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(1)
            .xspread(25)
            .yspread(25)
            .build();

    public static final RandomPatchConfiguration COPPER_BUSH = (new RandomPatchConfiguration.GrassConfigurationBuilder(
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


    /*
    ##########
    # Nether #
    ##########
     */
    public static final RandomPatchConfiguration NETHER_QUARTZ_BUSH = (new RandomPatchConfiguration.GrassConfigurationBuilder(
            new SimpleStateProvider(BlockInit.NETHER_QUARTZ_BUSH.get().defaultBlockState()),
            new SimpleBlockPlacer()))
            .whitelist(ImmutableSet.of(Blocks.NETHERRACK))
            .tries(1)
            .xspread(25)
            .yspread(25)
            .build();




    /*
    #######################
    # Configured Features #
    #######################
     */
    //Vanilla
    public static ConfiguredFeature XP_BUSH_Configured = new ConfiguredFeature(
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

    //Nether
    public static ConfiguredFeature NETHER_QUARTZ_BUSH_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            NETHER_QUARTZ_BUSH);

}

