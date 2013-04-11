package civcraft.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import civcraft.blocks.Blocks;
import civcraft.items.Items;

public class RecipesItems {

	@SuppressWarnings("unchecked")
	public static void init() {

		// Vanilla Items
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.gunpowder, 2), "dustSaltpeter", "dustSaltpeter", "dustSulfur", new ItemStack(Item.coal, 1, 1)));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Block.tnt, 3), new Object[] { "yxy", "xyx", "yxy", 'x', Blocks.blockPlastic, 'y', Item.gunpowder }));

		// Buckets
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.bucketEmpty, 1), new Object[] { "x x", " x ", 'x', "ingotAluminum" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.bucketEmpty, 1), new Object[] { "x x", " x ", 'x', "ingotCopper" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.bucketEmpty, 2), new Object[] { "x x", " x ", 'x', "ingotSteel" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.bucketEmpty, 2), new Object[] { "x x", " x ", 'x', "ingotBronze" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.bucketEmpty, 3), new Object[] { "x x", " x ", 'x', "ingotTitanium" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.bucketEmpty, 3), new Object[] { "x x", " x ", 'x', "ingotCarbide" }));

		// Mod Items
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Items.bucketPlasticEmpty, 2), new Object[] { "x x", " x ", 'x', "plastic" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Items.bellows, new Object[] { " xy", "z x", " xy", 'x', Item.leather, 'y', "stickWood", 'z', Item.ingotIron }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Items.bellows, new Object[] { "yx ", "x z", "yx ", 'x', Item.leather, 'y', "stickWood", 'z', Item.ingotIron }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Items.heatingCoil, new Object[] { "xyx", "y y", "xyx", 'x', "ingotCopper", 'y', "ingotLead" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Items.heatingCoil, new Object[] { "xyx", "y y", "xyx", 'y', "ingotCopper", 'x', "ingotLead" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Items.kevlar, Item.netherQuartz, "dustSulfur", "dustSulfur", "plastic", "plastic"));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Items.handle, new Object[] { "x", "x", 'x', "stickWood" }));

		// Computer
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Items.misc, 3, 0), new Object[] { "x x", "yyy", "x x", 'x', "ingotAluminum", 'y', "ingotSilicon" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Items.misc, 6, 1), new Object[] { "xxx", "yyy", "xxx", 'x', "plastic", 'y', "ingotCopper" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Items.motherBoard, new Object[] { "xyx", "ysy", "xyx", 'x', Items.wire, 'y', Items.chip, 's', "ingotSilicon" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Items.motherBoard, new Object[] { "xyx", "ysy", "xyx", 'y', Items.wire, 'x', Items.chip, 's', "ingotSilicon" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Items.hardDrive, new Object[] { "xyx", "yzd", "xyx", 'x', "ingotPlatinum", 'd', Item.diamond, 'z', Items.chip, 'y', Items.wire }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Items.hardDrive, new Object[] { "xyx", "dzy", "xyx", 'x', "ingotPlatinum", 'd', Item.diamond, 'z', Items.chip, 'y', Items.wire }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Items.misc, 2, 4), new Object[] { "xxx", "yyy", "xxx", 'x', Items.wire, 'y', Items.chip }));

	}
}