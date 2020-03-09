package com.dave.metalbushesmod.Init;

import com.dave.metalbushesmod.MetalBushesMod;
import com.dave.metalbushesmod.objects.blocks.GoldBush;
import com.dave.metalbushesmod.objects.blocks.IronBush;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister(ForgeRegistries.BLOCKS, MetalBushesMod.MODID);

    public static final RegistryObject<Block> DEF_BLOCK = BLOCKS.register(
            "def_block", () -> new Block(Block.Properties.create(Material.IRON)));

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

}
