package com.dave.metalbushesmod.objects.blocks.vanilla;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.config.ConfigHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class NetherQuartzBush extends SweetBerryBushBlock {

    public NetherQuartzBush(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return state.is(Blocks.NETHERRACK);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader worldIn, BlockPos pos) {
        BlockState blockstate = worldIn.getBlockState(pos.below());
        Block block = blockstate.getBlock();
        if(block != Blocks.NETHERRACK) {
            if (!blockstate.isAir()) {
                return false;
            }
            else {
                boolean flag = false;

                for(Direction direction : Direction.Plane.HORIZONTAL) {
                    BlockState blockstate1 = worldIn.getBlockState(pos.above());
                    if (!blockstate1.isAir()) {
                        return false;
                    }
                }

                return flag;
            }
        } else {
            return true;
        }

        /* BlockPos blockpos = pos.below();
        if (state.getBlock() == this) //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
            return worldIn.getBlockState(blockpos).canSustainPlant(worldIn, blockpos, Direction.UP, this);
        return this.mayPlaceOn(worldIn.getBlockState(blockpos), worldIn, blockpos); */
    }




    @Override
    public ItemStack getCloneItemStack(BlockGetter worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(BlockInit.NETHER_QUARTZ_BUSH.get());
    }

    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        int i = state.getValue(AGE);
        boolean flag = i == 3;
        if (!flag && player.getItemInHand(handIn).is(Items.BONE_MEAL)) {
            return InteractionResult.PASS;
        } else if (i == 2) {
            popResource(worldIn, pos, new ItemStack(Items.QUARTZ, 1));
            worldIn.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0f, 0.8F + worldIn.random.nextFloat() * 0.4F);
            worldIn.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);

            return InteractionResult.SUCCESS;
        } else if (i == 3) {
            popResource(worldIn, pos, new ItemStack(Items.QUARTZ, 2));
            worldIn.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0f, 0.8F + worldIn.random.nextFloat() * 0.4F);
            worldIn.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);

            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.PASS;
        }
    }

    @Override
    public void entityInside(BlockState state, Level worldIn, BlockPos pos, Entity entityIn) {
        if(ConfigHandler.CONFIG.allowCollision.get()== true){
            super.entityInside(state, worldIn, pos, entityIn);
        }
    }


}
