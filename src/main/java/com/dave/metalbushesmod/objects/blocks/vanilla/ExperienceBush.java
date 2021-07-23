package com.dave.metalbushesmod.objects.blocks.vanilla;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.Init.ItemInit;
import com.dave.metalbushesmod.config.ConfigHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class ExperienceBush extends SweetBerryBushBlock {

    public static int xpPoints;

    public ExperienceBush(Properties properties, int xpPoints) {
        super(properties);
        this.xpPoints = xpPoints;
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(BlockInit.XP_BUSH.get());
    }

    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        int i = state.getValue(AGE);
        boolean flag = i == 3;
        if (!flag && player.getItemInHand(handIn).is(Items.BONE_MEAL)) {
            return InteractionResult.PASS;
        } else if (i == 2) {
            worldIn.addFreshEntity(new ExperienceOrb(worldIn, pos.getX(), pos.getY(), pos.getZ(), xpPoints));
            worldIn.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0f, 0.8F + worldIn.random.nextFloat() * 0.4F);
            worldIn.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);

            return InteractionResult.SUCCESS;
        } else if (i == 3) {
            worldIn.addFreshEntity(new ExperienceOrb(worldIn, pos.getX(), pos.getY(), pos.getZ(),  xpPoints + 2));
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
