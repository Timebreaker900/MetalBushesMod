package com.dave.metalbushesmod.Init;

import com.dave.metalbushesmod.MetalBushesMod;
import com.dave.metalbushesmod.objects.blocks.mekanism.CopperBush;
import com.dave.metalbushesmod.objects.blocks.mekanism.OsmiumBush;
import com.dave.metalbushesmod.objects.blocks.mekanism.TinBush;
import com.dave.metalbushesmod.objects.blocks.vanilla.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MetalBushesMod.MODID);

    public static final DeferredRegister<Block> BLOCKS_FOR_MEKANISM = DeferredRegister.create(ForgeRegistries.BLOCKS, MetalBushesMod.MODID);

    public static final RegistryObject<ExperienceBush> XP_BUSH =  BLOCKS.register(
            "xp_bush", () -> new ExperienceBush(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT),
                    4
            )
    );

    public static final RegistryObject<CoalBush> COAL_BUSH =  BLOCKS.register(
            "coal_bush", () -> new CoalBush(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );

    public static final RegistryObject<IronBush> IRON_BUSH =  BLOCKS.register(
            "iron_bush", () -> new IronBush(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );

    public static final RegistryObject<GoldBush> GOLD_BUSH =  BLOCKS.register(
            "gold_bush", () -> new GoldBush(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );

    public static final RegistryObject<RedstoneBush> REDSTONE_BUSH =  BLOCKS.register(
            "redstone_bush", () -> new RedstoneBush(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );

    public static final RegistryObject<DiamondBush> DIAMOND_BUSH =  BLOCKS.register(
            "diamond_bush", () -> new DiamondBush(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );


    public static final RegistryObject<NetherQuartzBush> NETHER_QUARTZ_BUSH =  BLOCKS.register(
            "nether_quartz_bush", () -> new NetherQuartzBush(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );


    //Mekanism
    public static final RegistryObject<CopperBush> COPPER_BUSH =  BLOCKS_FOR_MEKANISM.register(
            "copper_bush", () -> new CopperBush(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );

    public static final RegistryObject<TinBush> TIN_BUSH =  BLOCKS_FOR_MEKANISM.register(
            "tin_bush", () -> new TinBush(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );

    public static final RegistryObject<OsmiumBush> OSMIUM_BUSH =  BLOCKS_FOR_MEKANISM.register(
            "osmium_bush", () -> new OsmiumBush(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );
}
