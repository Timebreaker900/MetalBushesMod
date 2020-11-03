package com.dave.metalbushesmod.util;

import com.dave.metalbushesmod.Init.ParticleInit;
import com.dave.metalbushesmod.MetalBushesMod;
import com.dave.metalbushesmod.objects.particles.BlazeBushParticle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MetalBushesMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ParticleUtil {

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerParticles(ParticleFactoryRegisterEvent event) {
        Minecraft.getInstance().particles.registerFactory(ParticleInit.BLAZE_BUSH_PARTICLE.get(), BlazeBushParticle.Factory::new);
    }
}
