package com.dave.metalbushesmod.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CoalNugget extends Item {

    public CoalNugget(Properties properties) {
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 200;
    }
}
