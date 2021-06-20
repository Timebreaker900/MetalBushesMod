package com.dave.metalbushesmod.objects.blocks.vanilla;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.config.ConfigHandler;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class NetherQuartzBush extends SweetBerryBushBlock {

    public NetherQuartzBush(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockState blockstate = worldIn.getBlockState(pos.down());
        Block block = blockstate.getBlock();
        if (block != Blocks.NETHERRACK) {
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
        return state.isIn(Blocks.NETHERRACK);
    }

    @Override
    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(BlockInit.NETHER_QUARTZ_BUSH.get());
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        int i = state.get(AGE);
        boolean flag = i == 3;
        if(!flag && player.getHeldItem(handIn).getItem() == Items.BONE_MEAL) {
            return ActionResultType.PASS;
        } else if (i == 2) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.QUARTZ, 1));
            worldIn.playSound((PlayerEntity) null, pos, SoundEvents.ITEM_SWEET_BERRIES_PICK_FROM_BUSH, SoundCategory.BLOCKS, 1.0f, 0.8F + worldIn.rand.nextFloat() * 0.4F);
            worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(1)), 2);

            return ActionResultType.SUCCESS;
        } else if (i == 3) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.QUARTZ, 2));
            worldIn.playSound((PlayerEntity) null, pos, SoundEvents.ITEM_SWEET_BERRIES_PICK_FROM_BUSH, SoundCategory.BLOCKS, 1.0f, 0.8F + worldIn.rand.nextFloat() * 0.4F);
            worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(1)), 2);

            return ActionResultType.SUCCESS;
        } else {
            return ActionResultType.PASS;
        }
    }

    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        if(ConfigHandler.CONFIG.allowCollision.get()== true){
            super.onEntityCollision(state, worldIn, pos, entityIn);
        }
    }


}
