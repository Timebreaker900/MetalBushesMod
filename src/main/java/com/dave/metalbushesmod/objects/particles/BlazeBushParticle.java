package com.dave.metalbushesmod.objects.particles;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class BlazeBushParticle extends TextureSheetParticle {


    protected BlazeBushParticle(ClientLevel world, double x, double y, double z, double motionX, double motionY, double motionZ) {
        super(world, x, y, z, motionX, motionY, motionZ);

        float f = this.random.nextFloat() * 1.0f;
        this.rCol = f;
        this.gCol = f;
        this.bCol = f;

        this.setSize(0.02f, 0.02f);
        //this.particleScale *= this.rand.nextFloat() * 1.1f;
        this.xd *= (double)0.05f;
        this.yd *= (double)0.05f;
        this.zd *= (double)0.05f;
        this.lifetime = (int)(50.0D/* / (Math.random() * 1.0D)*/);
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        if(this.lifetime-- <= 0){
            this.remove();
        } else {
            this.move(this.xd, this.yd, this.zd);
            this.xd *= 1.0D;
            this.yd *= 1.0D;
            this.zd *= 1.0D;
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static class Factory implements ParticleProvider<SimpleParticleType> {

        private final SpriteSet spriteSet;

        public Factory(SpriteSet sprite) {
            this.spriteSet = sprite;
        }


        @Nullable
        @Override
        public Particle createParticle(SimpleParticleType typeIn, ClientLevel levelIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            BlazeBushParticle blazeBushParticle = new BlazeBushParticle(levelIn, x, y, z, xSpeed, ySpeed, zSpeed);
            blazeBushParticle.setColor(1.0f, 1.0f, 1.0f); //Same Brightness as the texture File
            blazeBushParticle.pickSprite(this.spriteSet);
            return blazeBushParticle;
        }
    }
}
