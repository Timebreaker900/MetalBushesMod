package com.dave.metalbushesmod.data;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.Init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class RecipeBuilder extends RecipeProvider implements IConditionBuilder {

    //TIN
    private static final ResourceLocation TIN_INGOT_LOCATION = new ResourceLocation("forge", "ingots/tin");
    private static final ResourceLocation TIN_BLOCK_LOCATION = new ResourceLocation("forge", "storage_blocks/tin");
    private static final Tags.IOptionalNamedTag<Item> TIN_INGOT_TAG = ItemTags.createOptional(TIN_INGOT_LOCATION);
    private static final Tags.IOptionalNamedTag<Item> TIN_BLOCK_TAG = ItemTags.createOptional(TIN_BLOCK_LOCATION);

    //OSMIUM
    private static final ResourceLocation OSMIUM_INGOT_LOCATION = new ResourceLocation("forge", "ingots/osmium");
    private static final ResourceLocation OSMIUM_BLOCK_LOCATION = new ResourceLocation("forge", "storage_blocks/osmium");
    private static final Tags.IOptionalNamedTag<Item> OSMIUM_INGOT_TAG = ItemTags.createOptional(OSMIUM_INGOT_LOCATION);
    private static final Tags.IOptionalNamedTag<Item> OSMIUM_BLOCK_TAG = ItemTags.createOptional(OSMIUM_BLOCK_LOCATION);

    //ZINC
    private static final ResourceLocation ZINC_INGOT_LOCATION = new ResourceLocation("forge", "ingots/zinc");
    private static final ResourceLocation ZINC_BLOCK_LOCATION = new ResourceLocation("forge", "storage_blocks/zinc");
    private static final Tags.IOptionalNamedTag<Item> ZINC_INGOT_TAG = ItemTags.createOptional(ZINC_INGOT_LOCATION);
    private static final Tags.IOptionalNamedTag<Item> ZINC_BLOCK_TAG = ItemTags.createOptional(ZINC_BLOCK_LOCATION);

    //https://github.com/LotuxPunk/depthmeter/blob/2fd6ed9742db1a6d37ab73f60a7679dcfa052525/src/main/java/com/vandendaelen/depthmeter/data/RecipeBuilder.java#L30

    public RecipeBuilder(DataGenerator generatorIn) {
        super(generatorIn);
    }

    //@Override
    protected void registerRecipes(Consumer<FinishedRecipe> consumer) {

        ResourceLocation TIN_BUSH = new ResourceLocation("assets/metalbushesmod", "tin_bush");
        ResourceLocation OSMIUM_BUSH = new ResourceLocation("assets/metalbushesmod", "osmium_bush");
        ResourceLocation ZINC_BUSH = new ResourceLocation("assets/metalbushesmod", "zinc_bush");

        //Bush Base
        ShapedRecipeBuilder.shaped(ItemInit.BUSH_BASE.get(), 1)
                .pattern("GGG")
                .pattern("GSG")
                .pattern("GGG")
                .define('G', Blocks.GRASS)
                .define('S', Items.STICK)
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer);

        //Bush Wooden Base
        ShapedRecipeBuilder.shaped(ItemInit.BUSH_WOODEN_BASE.get(), 1)
                .pattern("GGG")
                .pattern("GSG")
                .pattern("GGG")
                .define('G', Items.STICK)
                .define('S', ItemInit.BUSH_BASE.get())
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer);

        //Nether bush Base
        ShapedRecipeBuilder.shaped(ItemInit.NETHER_BUSH_BASE.get(), 1)
                .pattern("GGG")
                .pattern("GSG")
                .pattern("GGG")
                .define('G', Blocks.NETHERRACK)
                .define('S', ItemInit.BUSH_BASE.get())
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer);

        /*
        ***********
        * VANILLA *
        * *********
        */
        //COPPPER BUSH
        ShapedRecipeBuilder
                .shaped(BlockInit.COPPER_BUSH.get(), 1)
                .pattern(" I ")
                .pattern("BSB")
                .pattern(" I ")
                .define('I', Items.COPPER_INGOT)
                .define('B', Blocks.COPPER_BLOCK)
                .define('S', ItemInit.BUSH_BASE.get())
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer);
        //COAL BUSH
        ShapedRecipeBuilder.shaped(BlockInit.COAL_BUSH.get(), 1)
                .pattern(" I ")
                .pattern("BSB")
                .pattern(" I ")
                .define('I', Items.COAL)
                .define('B', Blocks.COAL_BLOCK)
                .define('S', ItemInit.BUSH_BASE.get())
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer);
        //IRON BUSH
        ShapedRecipeBuilder.shaped(BlockInit.IRON_BUSH.get(), 1)
                .pattern(" I ")
                .pattern("BSB")
                .pattern(" I ")
                .define('I', Items.IRON_INGOT)
                .define('B', Blocks.IRON_BLOCK)
                .define('S', ItemInit.BUSH_BASE.get())
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer);
        //GOLD BUSH
        ShapedRecipeBuilder.shaped(BlockInit.GOLD_BUSH.get(), 1)
                .pattern(" I ")
                .pattern("BSB")
                .pattern(" I ")
                .define('I', Items.GOLD_INGOT)
                .define('B', Blocks.GOLD_BLOCK)
                .define('S', ItemInit.BUSH_BASE.get())
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer);
        //REDSTONE BUSH
        ShapedRecipeBuilder.shaped(BlockInit.REDSTONE_BUSH.get(), 1)
                .pattern(" I ")
                .pattern("BSB")
                .pattern(" I ")
                .define('I', Items.REDSTONE)
                .define('B', Blocks.REDSTONE_BLOCK)
                .define('S', ItemInit.BUSH_BASE.get())
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer);
        //DIAMOND BUSH
        ShapedRecipeBuilder.shaped(BlockInit.DIAMOND_BUSH.get(), 1)
                .pattern(" I ")
                .pattern("BSB")
                .pattern(" I ")
                .define('I', Items.DIAMOND)
                .define('B', Blocks.DIAMOND_BLOCK)
                .define('S', ItemInit.BUSH_BASE.get())
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer);
        //XP BUSH
        ShapedRecipeBuilder.shaped(BlockInit.XP_BUSH.get(), 1)
                .pattern("ICI")
                .pattern("BSB")
                .pattern("ICI")
                .define('I', Items.IRON_INGOT)
                .define('B', Items.GOLD_INGOT)
                .define('C', Items.COAL)
                .define('S', ItemInit.BUSH_BASE.get())
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer);
        //BLAZE BUSH
        ShapedRecipeBuilder.shaped(BlockInit.BLAZE_BUSH.get(), 1)
                .pattern(" I ")
                .pattern("BSB")
                .pattern(" I ")
                .define('I', Items.BLAZE_ROD)
                .define('B', Items.BLAZE_POWDER)
                .define('S', ItemInit.BUSH_WOODEN_BASE.get())
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer);

        /*
         **********
         * MODDED *
         * ********
         */
        //TIN BUSH
        ConditionalRecipe.builder()
                .addCondition(
                        modLoaded("mekanism")
                )
                .addRecipe(
                        ShapedRecipeBuilder
                                .shaped(BlockInit.TIN_BUSH.get(), 1)
                                .pattern(" I ")
                                .pattern("BSB")
                                .pattern(" I ")
                                .define('I', TIN_INGOT_TAG)
                                .define('B', TIN_BLOCK_TAG)
                                .define('S', ItemInit.BUSH_BASE.get())
                                .unlockedBy("has_dirt", has(Blocks.DIRT))::save
                )
                .generateAdvancement()
                .build(consumer, TIN_BUSH);

        //OSMIUM BUSH
        ConditionalRecipe.builder()
                .addCondition(
                        //or(modLoaded("mekanism"), modLoaded("create"))
                        modLoaded("mekanism")
                )
                .addRecipe(
                        ShapedRecipeBuilder
                                .shaped(BlockInit.OSMIUM_BUSH.get(), 1)
                                .pattern(" I ")
                                .pattern("BSB")
                                .pattern(" I ")
                                .define('I', OSMIUM_INGOT_TAG)
                                .define('B', OSMIUM_BLOCK_TAG)
                                .define('S', ItemInit.BUSH_BASE.get())
                                .unlockedBy("has_dirt", has(Blocks.DIRT))::save
                )
                .generateAdvancement()
                .build(consumer, OSMIUM_BUSH);

        //ZINC BUSH
        ConditionalRecipe.builder()
                .addCondition(
                        modLoaded("create")
                )
                .addRecipe(
                        ShapedRecipeBuilder
                                .shaped(BlockInit.ZINC_BUSH.get(), 1)
                                .pattern(" I ")
                                .pattern("BSB")
                                .pattern(" I ")
                                .define('I', ZINC_INGOT_TAG)
                                .define('B', ZINC_BLOCK_TAG)
                                .define('S', ItemInit.BUSH_BASE.get())
                                .unlockedBy("has_dirt", has(Blocks.DIRT))::save
                )
                .generateAdvancement()
                .build(consumer, ZINC_BUSH);
    }
}
