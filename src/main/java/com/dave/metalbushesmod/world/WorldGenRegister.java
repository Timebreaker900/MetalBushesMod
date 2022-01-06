package com.dave.metalbushesmod.world;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.MetalBushesMod;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockPileConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NetherForestVegetationConfig;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.NoiseThresholdProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

import java.rmi.registry.Registry;
import java.util.List;

public class WorldGenRegister {

    public static ConfiguredFeature<?, ?> getConfiguredFeature(BlockState currentBush){
        return Feature.FLOWER.configured(
                new RandomPatchConfiguration(7, 25, 25, () -> {
                    return Feature.SIMPLE_BLOCK.configured(
                            new SimpleBlockConfiguration(
                                    new NoiseThresholdProvider(
                                            2345L,
                                            new NormalNoise.NoiseParameters(0, 1.0D),
                                            0.005F,
                                            -0.8F,
                                            0.33333334F,
                                            currentBush,
                                            List.of(currentBush),
                                            List.of(currentBush)
                                    )
                            )
                    ).onlyWhenEmpty();
                })
        );
    }

    /* public static ConfiguredFeature<?, ?> getConfiguredFeatureNether(BlockState currentBush){
        return Feature.NETHER_FOREST_VEGETATION.configured(
                new NetherForestVegetationConfig(new SimpleStateProvider(currentBush), 25, 25)
        );
    } */

    /*  public static ConfiguredFeature<?, ?> BUSHES =  Feature.FLOWER.configured(
            //new RandomPatchConfiguration(64, 6, 2, () -> {
            new RandomPatchConfiguration(20, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(
                        new SimpleBlockConfiguration(

                                new NoiseThresholdProvider(
                                        2345L,
                                        new NormalNoise.NoiseParameters(0, 1.0D),
                                        0.005F,
                                        -0.8F,
                                        0.33333334F,
                                        BlockInit.XP_BUSH.get().defaultBlockState(),
                                        List.of(

                                        ),
                                        List.of(
                                                BlockInit.COPPER_BUSH.get().defaultBlockState(),
                                                BlockInit.IRON_BUSH.get().defaultBlockState(),
                                                BlockInit.REDSTONE_BUSH.get().defaultBlockState(),
                                                BlockInit.DIAMOND_BUSH.get().defaultBlockState()
                                        )
                                )
                        )
                ).onlyWhenEmpty();
            })
    );

    public static ConfiguredFeature<?, ?> BUSHES_FOREST =  Feature.FLOWER.configured(
            //new RandomPatchConfiguration(64, 6, 2, () -> {
            new RandomPatchConfiguration(20, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(
                        new SimpleBlockConfiguration(
                                new NoiseThresholdProvider(
                                        2345L,
                                        new NormalNoise.NoiseParameters(0, 1.0D),
                                        0.005F,
                                        -0.8F,
                                        0.33333334F,
                                        BlockInit.XP_BUSH.get().defaultBlockState(),
                                        List.of(

                                        ),
                                        List.of(
                                                BlockInit.COAL_BUSH.get().defaultBlockState(),
                                                BlockInit.IRON_BUSH.get().defaultBlockState(),
                                                BlockInit.GOLD_BUSH.get().defaultBlockState(),
                                                BlockInit.REDSTONE_BUSH.get().defaultBlockState(),
                                                BlockInit.DIAMOND_BUSH.get().defaultBlockState()
                                        )
                                )
                        )
                ).onlyWhenEmpty();
            })
    );

    public static ConfiguredFeature<?, ?> BUSHES_SAVANNA =  Feature.FLOWER.configured(
            //new RandomPatchConfiguration(64, 6, 2, () -> {
            new RandomPatchConfiguration(20, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(
                        new SimpleBlockConfiguration(
                                new NoiseThresholdProvider(
                                        2345L,
                                        new NormalNoise.NoiseParameters(0, 1.0D),
                                        0.005F,
                                        -0.8F,
                                        0.33333334F,
                                        BlockInit.XP_BUSH.get().defaultBlockState(),
                                        List.of(

                                        ),
                                        List.of(
                                                BlockInit.COPPER_BUSH.get().defaultBlockState(),
                                                BlockInit.IRON_BUSH.get().defaultBlockState(),
                                                BlockInit.GOLD_BUSH.get().defaultBlockState()
                                        )
                                )
                        )
                ).onlyWhenEmpty();
            })
    );

    public static ConfiguredFeature<?, ?> BUSHES_TAIGA =  Feature.FLOWER.configured(
            //new RandomPatchConfiguration(64, 6, 2, () -> {
            new RandomPatchConfiguration(20, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(
                        new SimpleBlockConfiguration(
                                new NoiseThresholdProvider(
                                        2345L,
                                        new NormalNoise.NoiseParameters(0, 1.0D),
                                        0.005F,
                                        -0.8F,
                                        0.33333334F,
                                        BlockInit.COAL_BUSH.get().defaultBlockState(),
                                        List.of(

                                        ),
                                        List.of(
                                                BlockInit.IRON_BUSH.get().defaultBlockState()
                                        )
                                )
                        )
                ).onlyWhenEmpty();
            })
    );

    public static ConfiguredFeature<?, ?> BUSHES_EXTREME_HILLS =  Feature.FLOWER.configured(
            //new RandomPatchConfiguration(64, 6, 2, () -> {
            new RandomPatchConfiguration(20, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(
                        new SimpleBlockConfiguration(
                                new NoiseThresholdProvider(
                                        2345L,
                                        new NormalNoise.NoiseParameters(0, 1.0D),
                                        0.005F,
                                        -0.8F,
                                        0.33333334F,
                                        BlockInit.COAL_BUSH.get().defaultBlockState(),
                                        List.of(

                                        ),
                                        List.of(

                                        )
                                )
                        )
                ).onlyWhenEmpty();
            })
    );

    public static ConfiguredFeature<?, ?> BUSHES_ICY =  Feature.FLOWER.configured(
            //new RandomPatchConfiguration(64, 6, 2, () -> {
            new RandomPatchConfiguration(20, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(
                        new SimpleBlockConfiguration(
                                new NoiseThresholdProvider(
                                        2345L,
                                        new NormalNoise.NoiseParameters(0, 1.0D),
                                        0.005F,
                                        -0.8F,
                                        0.33333334F,
                                        BlockInit.COAL_BUSH.get().defaultBlockState(),
                                        List.of(

                                        ),
                                        List.of(

                                        )
                                )
                        )
                ).onlyWhenEmpty();
            })
    );

    public static ConfiguredFeature<?, ?> BUSHES_DESERT =  Feature.FLOWER.configured(
            //new RandomPatchConfiguration(64, 6, 2, () -> {
            new RandomPatchConfiguration(20, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(
                        new SimpleBlockConfiguration(
                                new NoiseThresholdProvider(
                                        2345L,
                                        new NormalNoise.NoiseParameters(0, 1.0D),
                                        0.005F,
                                        -0.8F,
                                        0.33333334F,
                                        BlockInit.BLAZE_BUSH.get().defaultBlockState(),
                                        List.of(

                                        ),
                                        List.of(

                                        )
                                )
                        )
                ).onlyWhenEmpty();
            })
    );

    public static ConfiguredFeature<?, ?> BUSHES_SWAMP =  Feature.FLOWER.configured(
            //new RandomPatchConfiguration(64, 6, 2, () -> {
            new RandomPatchConfiguration(20, 3, 2, () -> {
                return Feature.SIMPLE_BLOCK.configured(
                        new SimpleBlockConfiguration(
                                new NoiseThresholdProvider(
                                        2345L,
                                        new NormalNoise.NoiseParameters(0, 1.0D),
                                        0.005F,
                                        -0.8F,
                                        0.33333334F,
                                        BlockInit.SLIME_BUSH.get().defaultBlockState(),
                                        List.of(

                                        ),
                                        List.of(

                                        )
                                )
                        )
                ).onlyWhenEmpty();
            })
    ); */



    /* public static void setup(){
        Registry<ConfiguredFeature<?, ?>> r = BuiltinRegistries.CONFIGURED_FEATURE;
        BuiltinRegistries.register(r, new ResourceLocation(MetalBushesMod.MODID, "xp_bush"), BUSHES);
    } */
}
