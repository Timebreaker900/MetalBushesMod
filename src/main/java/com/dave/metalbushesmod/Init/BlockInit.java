package com.dave.metalbushesmod.Init;

import com.dave.metalbushesmod.MetalBushesMod;
import com.dave.metalbushesmod.objects.blocks.vanilla.CopperBush;
import com.dave.metalbushesmod.objects.blocks.modded.OsmiumBush;
import com.dave.metalbushesmod.objects.blocks.modded.TinBush;
import com.dave.metalbushesmod.objects.blocks.modded.ZincBush;
import com.dave.metalbushesmod.objects.blocks.vanilla.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MetalBushesMod.MODID);

    public static final DeferredRegister<Block> BLOCKS_MODDED = DeferredRegister.create(ForgeRegistries.BLOCKS, MetalBushesMod.MODID);

    public static final RegistryObject<ExperienceBush> XP_BUSH =  BLOCKS.register(
            "xp_bush", () -> new ExperienceBush(BlockBehaviour.Properties
                    .copy(Blocks.SWEET_BERRY_BUSH),
                    /* .of(Material.PLANT)
                    .harvestLevel(0)
                    .noCollission()
                    .randomTicks()
                    .sound(SoundType.SWEET_BERRY_BUSH), */
                    4
            )
    );

    public static final RegistryObject<CopperBush> COPPER_BUSH =  BLOCKS_MODDED.register(
            "copper_bush", () -> new CopperBush(BlockBehaviour.Properties
                    .copy(Blocks.SWEET_BERRY_BUSH)
                    /* .of(Material.PLANT)
                    .harvestLevel(0)
                    .noCollission()
                    .randomTicks()
                    .sound(SoundType.SWEET_BERRY_BUSH) */
            )
    );

    public static final RegistryObject<CoalBush> COAL_BUSH =  BLOCKS.register(
            "coal_bush", () -> new CoalBush(BlockBehaviour.Properties
                    .copy(Blocks.SWEET_BERRY_BUSH)
                    /* .of(Material.PLANT)
                    .harvestLevel(0)
                    .noCollission()
                    .randomTicks()
                    .sound(SoundType.SWEET_BERRY_BUSH) */
            )
    );

    public static final RegistryObject<IronBush> IRON_BUSH =  BLOCKS.register(
            "iron_bush", () -> new IronBush(BlockBehaviour.Properties
                    .copy(Blocks.SWEET_BERRY_BUSH)
                    /* .of(Material.PLANT)
                    .harvestLevel(0)
                    .noCollission()
                    .randomTicks()
                    .sound(SoundType.SWEET_BERRY_BUSH) */
            )
    );

    public static final RegistryObject<GoldBush> GOLD_BUSH =  BLOCKS.register(
            "gold_bush", () -> new GoldBush(BlockBehaviour.Properties
                    .copy(Blocks.SWEET_BERRY_BUSH)
                    /* .of(Material.PLANT)
                    .harvestLevel(0)
                    .noCollission()
                    .randomTicks()
                    .sound(SoundType.SWEET_BERRY_BUSH) */
            )
    );

    public static final RegistryObject<RedstoneBush> REDSTONE_BUSH =  BLOCKS.register(
            "redstone_bush", () -> new RedstoneBush(BlockBehaviour.Properties
                    .copy(Blocks.SWEET_BERRY_BUSH)
                    /* .of(Material.PLANT)
                    .harvestLevel(0)
                    .noCollission()
                    .randomTicks()
                    .sound(SoundType.SWEET_BERRY_BUSH) */
            )
    );

    public static final RegistryObject<DiamondBush> DIAMOND_BUSH =  BLOCKS.register(
            "diamond_bush", () -> new DiamondBush(BlockBehaviour.Properties
                    .copy(Blocks.SWEET_BERRY_BUSH)
                    /* .of(Material.PLANT)
                    .harvestLevel(0)
                    .noCollission()
                    .randomTicks()
                    .sound(SoundType.SWEET_BERRY_BUSH) */
            )
    );

    public static final RegistryObject<BlazeBush> BLAZE_BUSH = BLOCKS.register(
            "blaze_bush", () -> new BlazeBush(BlockBehaviour.Properties
                    .copy(Blocks.SWEET_BERRY_BUSH)
                    /* .of(Material.PLANT)
                    .harvestLevel(0)
                    .noCollission()
                    .randomTicks()
                    .sound(SoundType.SWEET_BERRY_BUSH) */
            )
    );

    public static final RegistryObject<SlimeBush> SLIME_BUSH = BLOCKS.register(
            "slime_bush", () -> new SlimeBush(BlockBehaviour.Properties
                    .copy(Blocks.SWEET_BERRY_BUSH)
            )
    );


    public static final RegistryObject<NetherQuartzBush> NETHER_QUARTZ_BUSH =  BLOCKS.register(
            "nether_quartz_bush", () -> new NetherQuartzBush(BlockBehaviour.Properties
                    .copy(Blocks.SWEET_BERRY_BUSH)
                    /* .of(Material.PLANT)
                    .harvestLevel(0)
                    .noCollission()
                    .randomTicks()
                    .sound(SoundType.SWEET_BERRY_BUSH) */
            )
    );


    //Modded
    public static final RegistryObject<TinBush> TIN_BUSH =  BLOCKS_MODDED.register(
            "tin_bush", () -> new TinBush(BlockBehaviour.Properties
                    .copy(Blocks.SWEET_BERRY_BUSH)
                    /* .of(Material.PLANT)
                    .harvestLevel(0)
                    .noCollission()
                    .randomTicks()
                    .sound(SoundType.SWEET_BERRY_BUSH) */
            )
    );

    public static final RegistryObject<OsmiumBush> OSMIUM_BUSH =  BLOCKS_MODDED.register(
            "osmium_bush", () -> new OsmiumBush(BlockBehaviour.Properties
                    .copy(Blocks.SWEET_BERRY_BUSH)
                    /* .of(Material.PLANT)
                    .harvestLevel(0)
                    .noCollission()
                    .randomTicks()
                    .sound(SoundType.SWEET_BERRY_BUSH) */
            )
    );

    //Create
    public static final RegistryObject<ZincBush> ZINC_BUSH =  BLOCKS_MODDED.register(
            "zinc_bush", () -> new ZincBush(BlockBehaviour.Properties
                    .copy(Blocks.SWEET_BERRY_BUSH)
                    /* .of(Material.PLANT)
                    .harvestLevel(0)
                    .noCollission()
                    .randomTicks()
                    .sound(SoundType.SWEET_BERRY_BUSH) */
            )
    );

}
