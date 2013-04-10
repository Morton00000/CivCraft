package civcraft.recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import civcraft.items.toolheads.Molds;

public class RecipesMolds {

	@SuppressWarnings("unchecked")
	public static void init() {

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Molds.moldAxe, new Object[] { "xx", " x", 'x', Item.clay }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Molds.moldAxe, new Object[] { "xx", "x ", 'x', Item.clay }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Molds.moldHoe, new Object[] { "xx", 'x', Item.clay }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Molds.moldSpade, new Object[] { "x", 'x', Item.clay }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Molds.moldPick, new Object[] { "xxx", 'x', Item.clay }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Molds.moldSword, new Object[] { "x", "x", 'x', Item.clay }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Molds.moldHead, new Object[] { "xxx", "x x", 'x', Item.clay }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Molds.moldChest, new Object[] { "x x", "xxx", "xxx", 'x', Item.clay }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Molds.moldLegs, new Object[] { "xxx", "x x", "x x", 'x', Item.clay }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Molds.moldFeet, new Object[] { "x x", "x x", 'x', Item.clay }));

		// Smelting
		FurnaceRecipes.smelting().addSmelting(Molds.moldAxe.itemID, 0, new ItemStack(Molds.moldfAxe), 0.0F);
		FurnaceRecipes.smelting().addSmelting(Molds.moldHoe.itemID, 1, new ItemStack(Molds.moldfHoe), 0.0F);
		FurnaceRecipes.smelting().addSmelting(Molds.moldSpade.itemID, 2, new ItemStack(Molds.moldfSpade), 0.0F);
		FurnaceRecipes.smelting().addSmelting(Molds.moldPick.itemID, 3, new ItemStack(Molds.moldfPick), 0.0F);
		FurnaceRecipes.smelting().addSmelting(Molds.moldSword.itemID, 4, new ItemStack(Molds.moldfSword), 0.0F);

		FurnaceRecipes.smelting().addSmelting(Molds.moldHead.itemID, 5, new ItemStack(Molds.moldfHead), 0.0F);
		FurnaceRecipes.smelting().addSmelting(Molds.moldChest.itemID, 6, new ItemStack(Molds.moldfChest), 0.0F);
		FurnaceRecipes.smelting().addSmelting(Molds.moldLegs.itemID, 7, new ItemStack(Molds.moldfLegs), 0.0F);
		FurnaceRecipes.smelting().addSmelting(Molds.moldFeet.itemID, 8, new ItemStack(Molds.moldfFeet), 0.0F);

	}
}