package com.dave.metalbushesmod;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.Init.ItemInit;
import com.dave.metalbushesmod.Init.ParticleInit;
import com.dave.metalbushesmod.config.ConfigHandler;
import com.dave.metalbushesmod.data.RecipeBuilder;
import com.dave.metalbushesmod.world.BushWorldGen;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.logging.ConsoleHandler;

@Mod("metalbushesmod")
@EventBusSubscriber(modid = MetalBushesMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class MetalBushesMod
{
    //TAGS
    //https://github.com/MinecraftForge/MinecraftForge/tree/1.16.x/src/generated/resources/data/forge/tags

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "metalbushesmod";
    public static MetalBushesMod instance;

    public static boolean mekanismLoaded = false;
    public static boolean immersiveEngineeringLoaded = false;
    public static boolean createLoaded = false;

    public MetalBushesMod() {
        instance = this;
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //Recipes
        modEventBus.addListener(this::onGatherData);

        //Config
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHandler.CONFIG_SPEC);

        //Mod Loaded?
        mekanismLoaded = ModList.get().isLoaded("mekanism");
        LOGGER.debug("mekanismLoaded: " + mekanismLoaded);

        immersiveEngineeringLoaded = ModList.get().isLoaded("immersiveengineering");
        LOGGER.debug("immersiveengineeringLoaded: " + immersiveEngineeringLoaded);

        createLoaded = ModList.get().isLoaded("create");
        LOGGER.debug("createLoaded: " + createLoaded);

        modEventBus.addListener(this::doClientStuff);

        //Particles
        ParticleInit.PARTICLES.register(modEventBus);

        //Vanilla
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);

        //Modded
        ItemInit.ITEMS_MODDED.register(modEventBus);
        BlockInit.BLOCKS_MODDED.register(modEventBus);


        if (ConfigHandler.CONFIG.allowWorldGen.get() == true) {
            MinecraftForge.EVENT_BUS.addListener(BushWorldGen::addFeaturesToBiomes);
        }

        MinecraftForge.EVENT_BUS.register(this);
    }


    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(MetalBushesModItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        //Mekanism
        //if (MetalBushesConfig.mekanism_support.get() == true) {
            //if (mekanismLoaded == true) {
                LOGGER.debug("Mekanism Loaded " + mekanismLoaded);

                BlockInit.BLOCKS_MODDED.getEntries().stream().map(RegistryObject::get).forEach(block -> {
                    final Item.Properties properties = new Item.Properties().group(MetalBushesModItemGroup.instance);
                    final BlockItem blockItem = new BlockItem(block, properties);
                    blockItem.setRegistryName(block.getRegistryName());
                    registry.register(blockItem);
                });
            //}
        //}

        LOGGER.debug("Registered BlockItems!");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        //Overworld
        RenderTypeLookup.setRenderLayer(BlockInit.XP_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.COAL_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.IRON_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.GOLD_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.REDSTONE_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.DIAMOND_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLAZE_BUSH.get(), RenderType.getCutout());
        //Nether
        RenderTypeLookup.setRenderLayer(BlockInit.NETHER_QUARTZ_BUSH.get(), RenderType.getCutout());

        //Mekanism
        //if (MetalBushesConfig.mekanism_support.get() == true) {
            //if (mekanismLoaded == true) {
                RenderTypeLookup.setRenderLayer(BlockInit.COPPER_BUSH.get(), RenderType.getCutout());
                RenderTypeLookup.setRenderLayer(BlockInit.TIN_BUSH.get(), RenderType.getCutout());
                RenderTypeLookup.setRenderLayer(BlockInit.OSMIUM_BUSH.get(), RenderType.getCutout());
                RenderTypeLookup.setRenderLayer(BlockInit.ZINC_BUSH.get(), RenderType.getCutout());
            //}
        //}
    }

    private void onGatherData(GatherDataEvent e) {
        DataGenerator generator = e.getGenerator();
        generator.addProvider(new RecipeBuilder(generator));
    }

    public static class MetalBushesModItemGroup extends ItemGroup {

        public static final MetalBushesModItemGroup instance = new MetalBushesModItemGroup(ItemGroup.GROUPS.length, "metalbushesmodtab");
        public MetalBushesModItemGroup(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.BUSH_BASE.get());
        }

    }

}
