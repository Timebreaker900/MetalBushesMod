package com.dave.metalbushesmod.Init;

import com.dave.metalbushesmod.MetalBushesMod;
import com.dave.metalbushesmod.objects.blocks.modded.CopperBush;
import com.dave.metalbushesmod.objects.blocks.modded.OsmiumBush;
import com.dave.metalbushesmod.objects.blocks.modded.TinBush;
import com.dave.metalbushesmod.objects.blocks.modded.ZincBush;
import com.dave.metalbushesmod.objects.blocks.vanilla.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MetalBushesMod.MODID);

    public static final DeferredRegister<Block> BLOCKS_MODDED = DeferredRegister.create(ForgeRegistries.BLOCKS, MetalBushesMod.MODID);

    public static final RegistryObject<ExperienceBush> XP_BUSH =  BLOCKS.register(
            "xp_bush", () -> new ExperienceBush(AbstractBlock.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT),
                    4
            )
    );

    public static final RegistryObject<CoalBush> COAL_BUSH =  BLOCKS.register(
            "coal_bush", () -> new CoalBush(AbstractBlock.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );

    public static final RegistryObject<IronBush> IRON_BUSH =  BLOCKS.register(
            "iron_bush", () -> new IronBush(AbstractBlock.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );

    public static final RegistryObject<GoldBush> GOLD_BUSH =  BLOCKS.register(
            "gold_bush", () -> new GoldBush(AbstractBlock.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );

    public static final RegistryObject<RedstoneBush> REDSTONE_BUSH =  BLOCKS.register(
            "redstone_bush", () -> new RedstoneBush(AbstractBlock.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );

    public static final RegistryObject<DiamondBush> DIAMOND_BUSH =  BLOCKS.register(
            "diamond_bush", () -> new DiamondBush(AbstractBlock.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );

    public static final RegistryObject<BlazeBush> BLAZE_BUSH = BLOCKS.register(
            "blaze_bush", () -> new BlazeBush(AbstractBlock.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );


    public static final RegistryObject<NetherQuartzBush> NETHER_QUARTZ_BUSH =  BLOCKS.register(
            "nether_quartz_bush", () -> new NetherQuartzBush(AbstractBlock.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );


    //Modded
    public static final RegistryObject<CopperBush> COPPER_BUSH =  BLOCKS_MODDED.register(
            "copper_bush", () -> new CopperBush(AbstractBlock.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );

    public static final RegistryObject<TinBush> TIN_BUSH =  BLOCKS_MODDED.register(
            "tin_bush", () -> new TinBush(AbstractBlock.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );

    public static final RegistryObject<OsmiumBush> OSMIUM_BUSH =  BLOCKS_MODDED.register(
            "osmium_bush", () -> new OsmiumBush(AbstractBlock.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );

    //Create
    public static final RegistryObject<ZincBush> ZINC_BUSH =  BLOCKS_MODDED.register(
            "zinc_bush", () -> new ZincBush(AbstractBlock.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT)
            )
    );
}
