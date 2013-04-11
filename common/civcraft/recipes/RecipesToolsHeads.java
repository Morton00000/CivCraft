package civcraft.recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import civcraft.items.toolheads.ToolHeads;
import civcraft.items.tools.Tools;

public class RecipesToolsHeads {

	@SuppressWarnings("unchecked")
	public static void init() {

		// Axe
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeAluminum, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadAluminum, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadCarbide, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeSteel, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadSteel, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeCopper, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadCopper, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeBronze, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadBronze, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeTitanium, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadTitanium, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeDUranium, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadDUranium, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeDCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadDCarbide, 'y', "stickWood" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.axeIron, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadIron, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.axeGold, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadGold, 'y', "stickWood" }));

		// Hoe
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeAluminum, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadAluminum, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadCarbide, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeSteel, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadSteel, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeCopper, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadCopper, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeBronze, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadBronze, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeTitanium, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadTitanium, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeDUranium, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadDUranium, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeDCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadDCarbide, 'y', "stickWood" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.hoeIron, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadIron, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.hoeGold, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadGold, 'y', "stickWood" }));

		// Shovels
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeAluminum, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadAluminum, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadCarbide, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeSteel, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadSteel, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeCopper, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadCopper, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeBronze, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadBronze, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeTitanium, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadTitanium, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeDUranium, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadDUranium, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeDCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadDCarbide, 'y', "stickWood" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.shovelIron, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadIron, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.shovelGold, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadGold, 'y', "stickWood" }));

		// Pickaxe
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeAluminum, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadAluminum, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadCarbide, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeSteel, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadSteel, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeCopper, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadCopper, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeBronze, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadBronze, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeTitanium, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadTitanium, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeDUranium, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadDUranium, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeDCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadDCarbide, 'y', "stickWood" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.pickaxeIron, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadIron, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.pickaxeGold, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadGold, 'y', "stickWood" }));

		// Swords
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordAluminum, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadAluminum, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadCarbide, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordSteel, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadSteel, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordCopper, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadCopper, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordBronze, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadBronze, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordTitanium, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadTitanium, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordDUranium, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadDUranium, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordDCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadDCarbide, 'y', "stickWood" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.swordIron, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadIron, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.swordGold, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadGold, 'y', "stickWood" }));

	}
}