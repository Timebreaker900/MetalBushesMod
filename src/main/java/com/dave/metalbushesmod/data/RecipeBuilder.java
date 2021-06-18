package com.dave.metalbushesmod.data;

import com.dave.metalbushesmod.Init.BlockInit;
import com.dave.metalbushesmod.Init.ItemInit;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.ModList;

import java.util.function.Consumer;

public class RecipeBuilder extends RecipeProvider implements IConditionBuilder {

    //COPPER
    private static final ResourceLocation COPPER_INGOT_LOCATION = new ResourceLocation("forge", "ingots/copper");
    private static final ResourceLocation COPPER_BLOCK_LOCATION = new ResourceLocation("forge", "storage_blocks/copper");
    private static final Tags.IOptionalNamedTag<Item> COPPER_INGOT_TAG = ItemTags.createOptional(COPPER_INGOT_LOCATION);
    private static final Tags.IOptionalNamedTag<Item> COPPER_BLOCK_TAG = ItemTags.createOptional(COPPER_BLOCK_LOCATION);

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

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {

        ResourceLocation COPPER_BUSH = new ResourceLocation("metalbushesmod", "copper_bush");
        ResourceLocation TIN_BUSH = new ResourceLocation("metalbushesmod", "tin_bush");
        ResourceLocation OSMIUM_BUSH = new ResourceLocation("metalbushesmod", "osmium_bush");
        ResourceLocation ZINC_BUSH = new ResourceLocation("metalbushesmod", "zinc_bush");

        //Bush Base
        ShapedRecipeBuilder.shapedRecipe(ItemInit.BUSH_BASE.get(), 1)
                .patternLine("GGG")
                .patternLine("GSG")
                .patternLine("GGG")
                .key('G', Blocks.GRASS)
                .key('S', Items.STICK)
                .addCriterion("has_dirt", hasItem(Blocks.DIRT))
                .build(consumer);

        //Bush Wooden Base
        ShapedRecipeBuilder.shapedRecipe(ItemInit.BUSH_WOODEN_BASE.get(), 1)
                .patternLine("GGG")
                .patternLine("GSG")
                .patternLine("GGG")
                .key('G', Items.STICK)
                .key('S', ItemInit.BUSH_BASE.get())
                .addCriterion("has_dirt", hasItem(Blocks.DIRT))
                .build(consumer);

        //Nether bush Base
        ShapedRecipeBuilder.shapedRecipe(ItemInit.NETHER_BUSH_BASE.get(), 1)
                .patternLine("GGG")
                .patternLine("GSG")
                .patternLine("GGG")
                .key('G', Blocks.NETHERRACK)
                .key('S', ItemInit.BUSH_BASE.get())
                .addCriterion("has_dirt", hasItem(Blocks.DIRT))
                .build(consumer);

        /*
        ***********
        * VANILLA *
        * *********
        */
        //COAL BUSH
        ShapedRecipeBuilder.shapedRecipe(BlockInit.COAL_BUSH.get(), 1)
                .patternLine(" I ")
                .patternLine("BSB")
                .patternLine(" I ")
                .key('I', Items.COAL)
                .key('B', Blocks.COAL_BLOCK)
                .key('S', ItemInit.BUSH_BASE.get())
                .addCriterion("has_dirt", hasItem(Blocks.DIRT))
                .build(consumer);
        //IRON BUSH
        ShapedRecipeBuilder.shapedRecipe(BlockInit.IRON_BUSH.get(), 1)
                .patternLine(" I ")
                .patternLine("BSB")
                .patternLine(" I ")
                .key('I', Items.IRON_INGOT)
                .key('B', Blocks.IRON_BLOCK)
                .key('S', ItemInit.BUSH_BASE.get())
                .addCriterion("has_dirt", hasItem(Blocks.DIRT))
                .build(consumer);
        //GOLD BUSH
        ShapedRecipeBuilder.shapedRecipe(BlockInit.GOLD_BUSH.get(), 1)
                .patternLine(" I ")
                .patternLine("BSB")
                .patternLine(" I ")
                .key('I', Items.GOLD_INGOT)
                .key('B', Blocks.GOLD_BLOCK)
                .key('S', ItemInit.BUSH_BASE.get())
                .addCriterion("has_dirt", hasItem(Blocks.DIRT))
                .build(consumer);
        //REDSTONE BUSH
        ShapedRecipeBuilder.shapedRecipe(BlockInit.REDSTONE_BUSH.get(), 1)
                .patternLine(" I ")
                .patternLine("BSB")
                .patternLine(" I ")
                .key('I', Items.REDSTONE)
                .key('B', Blocks.REDSTONE_BLOCK)
                .key('S', ItemInit.BUSH_BASE.get())
                .addCriterion("has_dirt", hasItem(Blocks.DIRT))
                .build(consumer);
        //DIAMOND BUSH
        ShapedRecipeBuilder.shapedRecipe(BlockInit.DIAMOND_BUSH.get(), 1)
                .patternLine(" I ")
                .patternLine("BSB")
                .patternLine(" I ")
                .key('I', Items.DIAMOND)
                .key('B', Blocks.DIAMOND_BLOCK)
                .key('S', ItemInit.BUSH_BASE.get())
                .addCriterion("has_dirt", hasItem(Blocks.DIRT))
                .build(consumer);
        //XP BUSH
        ShapedRecipeBuilder.shapedRecipe(BlockInit.XP_BUSH.get(), 1)
                .patternLine("ICI")
                .patternLine("BSB")
                .patternLine("ICI")
                .key('I', Items.IRON_INGOT)
                .key('B', Items.GOLD_INGOT)
                .key('C', Items.COAL)
                .key('S', ItemInit.BUSH_BASE.get())
                .addCriterion("has_dirt", hasItem(Blocks.DIRT))
                .build(consumer);
        //BLAZE BUSH
        ShapedRecipeBuilder.shapedRecipe(BlockInit.BLAZE_BUSH.get(), 1)
                .patternLine(" I ")
                .patternLine("BSB")
                .patternLine(" I ")
                .key('I', Items.BLAZE_ROD)
                .key('B', Items.BLAZE_POWDER)
                .key('S', ItemInit.BUSH_WOODEN_BASE.get())
                .addCriterion("has_dirt", hasItem(Blocks.DIRT))
                .build(consumer);

        /*
         **********
         * MODDED *
         * ********
         */
        //COPPPER BUSH
        ConditionalRecipe.builder()
                .addCondition(
                    //modLoaded("mekanism")
                        or(modLoaded("mekanism"), modLoaded("create"))
                )
                .addRecipe(
                        ShapedRecipeBuilder
                                .shapedRecipe(BlockInit.COPPER_BUSH.get(), 1)
                                .patternLine(" I ")
                                .patternLine("BSB")
                                .patternLine(" I ")
                                .key('I', COPPER_INGOT_TAG)
                                .key('B', COPPER_BLOCK_TAG)
                                .key('S', ItemInit.BUSH_BASE.get())
                                .addCriterion("has_dirt", hasItem(Blocks.DIRT))::build
                )
                .generateAdvancement()
                .build(consumer, COPPER_BUSH);

        //TIN BUSH
        ConditionalRecipe.builder()
                .addCondition(
                        modLoaded("mekanism")
                )
                .addRecipe(
                        ShapedRecipeBuilder
                                .shapedRecipe(BlockInit.TIN_BUSH.get(), 1)
                                .patternLine(" I ")
                                .patternLine("BSB")
                                .patternLine(" I ")
                                .key('I', TIN_INGOT_TAG)
                                .key('B', TIN_BLOCK_TAG)
                                .key('S', ItemInit.BUSH_BASE.get())
                                .addCriterion("has_dirt", hasItem(Blocks.DIRT))::build
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
                                .shapedRecipe(BlockInit.OSMIUM_BUSH.get(), 1)
                                .patternLine(" I ")
                                .patternLine("BSB")
                                .patternLine(" I ")
                                .key('I', OSMIUM_INGOT_TAG)
                                .key('B', OSMIUM_BLOCK_TAG)
                                .key('S', ItemInit.BUSH_BASE.get())
                                .addCriterion("has_dirt", hasItem(Blocks.DIRT))::build
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
                                .shapedRecipe(BlockInit.ZINC_BUSH.get(), 1)
                                .patternLine(" I ")
                                .patternLine("BSB")
                                .patternLine(" I ")
                                .key('I', ZINC_INGOT_TAG)
                                .key('B', ZINC_BLOCK_TAG)
                                .key('S', ItemInit.BUSH_BASE.get())
                                .addCriterion("has_dirt", hasItem(Blocks.DIRT))::build
                )
                .generateAdvancement()
                .build(consumer, ZINC_BUSH);
    }
}
