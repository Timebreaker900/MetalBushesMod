package com.dave.metalbushesmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MetalBushesConfig {

    public static ForgeConfigSpec.BooleanValue globalBushGen;
    public static ForgeConfigSpec.BooleanValue mekanism_support;

    public static void init(ForgeConfigSpec.Builder config) {

        config.comment("Metal Bushes Config");

        globalBushGen = config
                .define("globalBushGen.globalBushGen", true);

        mekanism_support = config
                .define("otherModSupport.mekanism_support", false);
    }
}
