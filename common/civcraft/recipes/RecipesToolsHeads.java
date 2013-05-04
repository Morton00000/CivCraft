package civcraft.recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import civcraft.items.Items;
import civcraft.items.toolheads.ToolHeads;
import civcraft.items.tools.Tools;

public class RecipesToolsHeads {

	@SuppressWarnings("unchecked")
	public static void init() {

		// Axe
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeAluminium, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadAluminium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadCarbide, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeSteel, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadSteel, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeCopper, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadCopper, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeBronze, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadBronze, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeTitanium, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadTitanium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeDUranium, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadDUranium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeDCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadDCarbide, 'y', Items.handle }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.axeIron, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadIron, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.axeGold, 1), new Object[] { "x", "y", 'x', ToolHeads.axeHeadGold, 'y', Items.handle }));

		// Hoe
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeAluminium, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadAluminium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadCarbide, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeSteel, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadSteel, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeCopper, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadCopper, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeBronze, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadBronze, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeTitanium, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadTitanium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeDUranium, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadDUranium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeDCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadDCarbide, 'y', Items.handle }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.hoeIron, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadIron, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.hoeGold, 1), new Object[] { "x", "y", 'x', ToolHeads.hoeHeadGold, 'y', Items.handle }));

		// Shovels
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeAluminium, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadAluminium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadCarbide, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeSteel, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadSteel, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeCopper, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadCopper, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeBronze, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadBronze, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeTitanium, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadTitanium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeDUranium, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadDUranium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeDCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadDCarbide, 'y', Items.handle }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.shovelIron, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadIron, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.shovelGold, 1), new Object[] { "x", "y", 'x', ToolHeads.spadeHeadGold, 'y', Items.handle }));

		// Pickaxe
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeAluminium, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadAluminium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadCarbide, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeSteel, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadSteel, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeCopper, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadCopper, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeBronze, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadBronze, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeTitanium, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadTitanium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeDUranium, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadDUranium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeDCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadDCarbide, 'y', Items.handle }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.pickaxeIron, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadIron, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.pickaxeGold, 1), new Object[] { "x", "y", 'x', ToolHeads.pickHeadGold, 'y', Items.handle }));

		// Swords
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordAluminium, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadAluminium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadCarbide, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordSteel, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadSteel, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordCopper, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadCopper, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordBronze, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadBronze, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordTitanium, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadTitanium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordDUranium, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadDUranium, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordDCarbide, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadDCarbide, 'y', Items.handle }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.swordIron, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadIron, 'y', Items.handle }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.swordGold, 1), new Object[] { "x", "y", 'x', ToolHeads.swordHeadGold, 'y', Items.handle }));

	}
}