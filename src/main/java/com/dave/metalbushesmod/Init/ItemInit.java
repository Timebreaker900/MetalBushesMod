package com.dave.metalbushesmod.Init;

import com.dave.metalbushesmod.MetalBushesMod;
//import com.dave.metalbushesmod.config.MetalBushesConfig;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MetalBushesMod.MODID);

    public static final DeferredRegister<Item> ITEMS_FOR_MEKANISM = DeferredRegister.create(ForgeRegistries.ITEMS, MetalBushesMod.MODID);

    public static final RegistryObject<Item> BUSH_BASE = ITEMS.register(
            "bush_base", () -> new Item(
                    new Item.Properties().group(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> NETHER_BUSH_BASE = ITEMS.register(
            "nether_bush_base", () -> new Item(
                    new Item.Properties().group(MetalBushesMod.MetalBushesModItemGroup.instance)));
    
    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register(
            "diamond_nugget", () -> new Item(
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
