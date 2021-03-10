package com.dave.metalbushesmod.Init;

import com.dave.metalbushesmod.MetalBushesMod;
import com.dave.metalbushesmod.config.ConfigHandler;
import com.dave.metalbushesmod.objects.items.CoalNugget;
import net.minecraft.item.Item;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.core.util.Loader;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MetalBushesMod.MODID);

    public static final DeferredRegister<Item> ITEMS_FOR_MEKANISM = DeferredRegister.create(ForgeRegistries.ITEMS, MetalBushesMod.MODID);

    public static final RegistryObject<Item> BUSH_BASE = ITEMS.register(
            "bush_base", () -> new Item(
                    new Item.Properties().group(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> BUSH_WOODEN_BASE = ITEMS.register(
            "bush_wooden_base", () -> new Item(
                    new Item.Properties().group(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> NETHER_BUSH_BASE = ITEMS.register(
            "nether_bush_base", () -> new Item(
                    new Item.Properties().group(MetalBushesMod.MetalBushesModItemGroup.instance)));





    public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register(
            "coal_nugget", () -> new CoalNugget(
                    new Item.Properties().group(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register(
            "diamond_nugget", () -> new Item(
                    new Item.Properties().group(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> TINY_BLAZE_POWDER = ITEMS.register(
            "tiny_blaze_powder", () -> new Item(
                    new Item.Properties().group(MetalBushesMod.MetalBushesModItemGroup.instance)));


    //Mekanism
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS_FOR_MEKANISM.register(
            "copper_nugget", () -> new Item(
                    new Item.Properties().group(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> TIN_NUGGET = ITEMS_FOR_MEKANISM.register(
            "tin_nugget", () -> new Item(
                    new Item.Properties().group(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS_FOR_MEKANISM.register(
            "osmium_nugget", () -> new Item(
                    new Item.Properties().group(MetalBushesMod.MetalBushesModItemGroup.instance)));


}
