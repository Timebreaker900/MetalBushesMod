package com.dave.metalbushesmod.Init;

import com.dave.metalbushesmod.MetalBushesMod;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ParticleInit {

    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MetalBushesMod.MODID);

    public static final RegistryObject<BasicParticleType> BLAZE_BUSH_PARTICLE = PARTICLES.register(
            "blaze_bush_particle", () -> new BasicParticleType(true)
    );
}
