package com.dave.metalbushesmod.objects.blocks.vanilla;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.Init.ItemInit;
import com.dave.metalbushesmod.Init.ParticleInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class BlazeBush extends SweetBerryBushBlock {

    public BlazeBush(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockState blockstate = worldIn.getBlockState(pos.down());
        Block block = blockstate.getBlock();
        if (block != Blocks.SAND) {
            if (!blockstate.isAir(worldIn, pos.down())) {
                return false;
            } else {
                boolean flag = false;

                for(Direction direction : Direction.Plane.HORIZONTAL) {
                    BlockState blockstate1 = worldIn.getBlockState(pos.offset(direction));
                    if (!blockstate1.isAir(worldIn, pos.offset(direction))) {
                        return false;
                    }
                }

                return flag;
            }
        } else {
            return true;
        }
    }

    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.isIn(Blocks.SAND);
    }

    @Override
    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(BlockInit.BLAZE_BUSH.get());
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        int i = state.get(AGE);
        boolean flag = i == 3;
        if(!flag && player.getHeldItem(handIn).getItem() == Items.BONE_MEAL) {
            return ActionResultType.PASS;
        } else if (i > 1) {
            spawnAsEntity(worldIn, pos, new ItemStack(ItemInit.TINY_BLAZE_POWDER.get(), 1));
            worldIn.playSound((PlayerEntity) null, pos, SoundEvents.ITEM_SWEET_BERRIES_PICK_FROM_BUSH, SoundCategory.BLOCKS, 1.0f, 0.8F + worldIn.rand.nextFloat() * 0.4F);
            worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(1)), 2);

            return ActionResultType.SUCCESS;
        } else {
            return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
        }
    }

    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        super.onEntityCollision(state, worldIn, pos, entityIn);
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        if (stateIn.get(AGE) > 2) {
            double d0 = (double) pos.getX() + 0.5D; // Breite
            double d1 = (double) pos.getY() + 0.5D; // Höhe
            double d2 = (double) pos.getZ() + 0.5D; // Länge
            worldIn.addParticle(ParticleTypes.SMOKE, d0, d1, d2, 0.0D, 0.0D, 0.0D);
            worldIn.addParticle(ParticleInit.BLAZE_BUSH_PARTICLE.get(), d0, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }
}