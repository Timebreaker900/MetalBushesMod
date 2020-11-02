package com.dave.metalbushesmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigHandler {

    private static final ForgeConfigSpec.Builder ConfigBuilder = new ForgeConfigSpec.Builder();

    public static final General CONFIG = new General();

    public static final ForgeConfigSpec CONFIG_SPEC = ConfigBuilder.build();

    public static class General {

        public final ForgeConfigSpec.BooleanValue allowWorldGen;

        public final ForgeConfigSpec.BooleanValue allowCoalGen;
        public final ForgeConfigSpec.BooleanValue allowIronGen;
        public final ForgeConfigSpec.BooleanValue allowGoldGen;
        public final ForgeConfigSpec.BooleanValue allowRedstoneGen;
        public final ForgeConfigSpec.BooleanValue allowDiamondGen;
        public final ForgeConfigSpec.BooleanValue allowExperienceGen;

        private General() {
            ConfigBuilder.push("World Gen");
            allowWorldGen = ConfigBuilder
                    .define("Allow Bush World Generation", true);
            ConfigBuilder.pop();

            ConfigBuilder.comment("Make sure World Generation is on true").push("World Gen Specific");
            allowCoalGen = ConfigBuilder
                    .define("Coal Bush Gen", true);
            allowIronGen = ConfigBuilder
                    .define("Iron Bush Gen", true);
            allowGoldGen = ConfigBuilder
                    .define("Gold Bush Gen",true);
            allowRedstoneGen = ConfigBuilder
                    .define("Redstone Bush Gen", true);
            allowDiamondGen = ConfigBuilder
                    .define("Diamond Bush Gen", true);
            allowExperienceGen = ConfigBuilder
                    .define("Experience Bush Gen", true);
            ConfigBuilder.pop();
        }
    }
}
