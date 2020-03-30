package com.dave.metalbushesmod.Init;

import com.dave.metalbushesmod.MetalBushesMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister(ForgeRegistries.ITEMS, MetalBushesMod.MODID);

    public static final RegistryObject<Item> BUSH_BASE = ITEMS.register(
            "bush_base", () -> new Item(
                    new Item.Properties().group(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> NETHER_BUSH_BASE = ITEMS.register(
            "nether_bush_base", () -> new Item(
                    new Item.Properties().group(MetalBushesMod.MetalBushesModItemGroup.instance)));

    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register(
            "diamond_nugget", () -> new Item(
                    new Item.Properties().group(MetalBushesMod.MetalBushesModItemGroup.instance)));
}
