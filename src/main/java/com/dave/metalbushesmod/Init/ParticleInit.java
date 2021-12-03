package com.dave.metalbushesmod.Init;

import com.dave.metalbushesmod.MetalBushesMod;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ParticleInit {

    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MetalBushesMod.MODID);

    public static final RegistryObject<SimpleParticleType> BLAZE_BUSH_PARTICLE = PARTICLES.register(
            "blaze_bush_particle", () -> new SimpleParticleType(true)
    );
}
