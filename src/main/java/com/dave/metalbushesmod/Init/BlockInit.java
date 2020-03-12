package com.dave.metalbushesmod.Init;

import com.dave.metalbushesmod.MetalBushesMod;
import com.dave.metalbushesmod.objects.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister(ForgeRegistries.BLOCKS, MetalBushesMod.MODID);

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

}
