package com.dave.metalbushesmod.config;

import com.dave.metalbushesmod.MetalBushesMod;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

import java.io.File;

@Mod.EventBusSubscriber
public class Config {
    /* private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec config;

    static {
        MetalBushesConfig.init(builder);

        config = builder.build();
    }

    public static void loadConfig(ForgeConfigSpec config, String path){

        MetalBushesMod.LOGGER.info("Loading Config: " + path);
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        MetalBushesMod.LOGGER.info("Built Config: " + path);
        file.load();
        MetalBushesMod.LOGGER.info("Loaded Config: " + path);
        config.setConfig(file);
    } */
}
