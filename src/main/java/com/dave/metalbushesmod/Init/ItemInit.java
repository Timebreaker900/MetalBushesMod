package com.dave.metalbushesmod.Init;

import com.dave.metalbushesmod.MetalBushesMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MetalBushesMod.MODID);

    public static final DeferredRegister<Item> ITEMS_MODDED = DeferredRegister.create(ForgeRegistries.ITEMS, MetalBushesMod.MODID);

    public static final RegistryObject<Item> BUSH_BASE = ITEMS.register(
            "bush_base", () -> new Item(
                    new Item.Properties().tab(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> BUSH_WOODEN_BASE = ITEMS.register(
            "bush_wooden_base", () -> new Item(
                    new Item.Properties().tab(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> NETHER_BUSH_BASE = ITEMS.register(
            "nether_bush_base", () -> new Item(
                    new Item.Properties().tab(MetalBushesMod.MetalBushesModItemGroup.instance)));





    public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register(
            "coal_nugget", () -> new Item(
                    new Item.Properties().tab(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register(
            "diamond_nugget", () -> new Item(
                    new Item.Properties().tab(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> TINY_BLAZE_POWDER = ITEMS.register(
            "tiny_blaze_powder", () -> new Item(
                    new Item.Properties().tab(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> SLIME_CHUNK = ITEMS.register(
            "slime_chunk", () -> new Item(
                    new Item.Properties().tab(MetalBushesMod.MetalBushesModItemGroup.instance)));


    //Modded
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS_MODDED.register(
            "copper_nugget", () -> new Item(
                    new Item.Properties().tab(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> TIN_NUGGET = ITEMS_MODDED.register(
            "tin_nugget", () -> new Item(
                    new Item.Properties().tab(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS_MODDED.register(
            "osmium_nugget", () -> new Item(
                    new Item.Properties().tab(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS_MODDED.register(
            "zinc_nugget", () -> new Item(
                    new Item.Properties().tab(MetalBushesMod.MetalBushesModItemGroup.instance)));

}
