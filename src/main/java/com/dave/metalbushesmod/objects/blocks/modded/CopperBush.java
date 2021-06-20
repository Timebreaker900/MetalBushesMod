package com.dave.metalbushesmod.objects.blocks.modded;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.Init.ItemInit;
import com.dave.metalbushesmod.config.ConfigHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.Tags;

public class CopperBush extends SweetBerryBushBlock {

    private static final ResourceLocation COPPER_NUGGETS_LOCATION = new ResourceLocation("forge", "nuggets/copper");
    private static final Tags.IOptionalNamedTag<Item> COPPER_NUGGETS_TAG = ItemTags.createOptional(COPPER_NUGGETS_LOCATION);

    public CopperBush(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(BlockInit.COPPER_BUSH.get());
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        int i = state.get(AGE);
        boolean flag = i == 3;
        if(!flag && player.getHeldItem(handIn).getItem() == Items.BONE_MEAL) {
            return ActionResultType.PASS;
        } else if (i == 2) {
            spawnAsEntity(worldIn, pos, new ItemStack(ItemInit.COPPER_NUGGET.get(), 1));
            worldIn.playSound((PlayerEntity) null, pos, SoundEvents.ITEM_SWEET_BERRIES_PICK_FROM_BUSH, SoundCategory.BLOCKS, 1.0f, 0.8F + worldIn.rand.nextFloat() * 0.4F);
            worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(1)), 2);

            return ActionResultType.SUCCESS;
        } else if (i == 3) {
            spawnAsEntity(worldIn, pos, new ItemStack(ItemInit.COPPER_NUGGET.get(), 2));
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
