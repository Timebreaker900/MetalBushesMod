package com.dave.metalbushesmod.Init;

import com.dave.metalbushesmod.MetalBushesMod;
import com.dave.metalbushesmod.objects.blocks.ExperienceBush;
import com.dave.metalbushesmod.objects.blocks.MaterialBush;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.Item;
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

    public static final RegistryObject<MaterialBush> COAL_BUSH =  BLOCKS.register(
            "coal_bush", () -> new MaterialBush(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT),
                    Items.COAL
            )
    );

    public static final RegistryObject<MaterialBush> IRON_BUSH =  BLOCKS.register(
            "iron_bush", () -> new MaterialBush(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT),
                    Items.IRON_NUGGET
            )
    );

    public static final RegistryObject<MaterialBush> GOLD_BUSH =  BLOCKS.register(
            "gold_bush", () -> new MaterialBush(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT),
                    Items.GOLD_NUGGET
            )
    );

    public static final RegistryObject<MaterialBush> REDSTONE_BUSH =  BLOCKS.register(
            "redstone_bush", () -> new MaterialBush(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(0f)
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.PLANT),
                    Items.REDSTONE
            )
    );

}
