package com.dave.metalbushesmod.objects.items;

import net.minecraft.util.datafix.fixes.ItemStackEnchantmentNamesFix;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class CoalNugget extends Item {

    public CoalNugget(Properties properties) {
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 200;
    }
}
