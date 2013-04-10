package civcraft.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import civcraft.items.tools.Tools;

public class RecipesTools {

	@SuppressWarnings("unchecked")
	public static void init() {

		// Hammer
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hammerStone, 1), new Object[] { "xyx", "xyx", " y ", 'x', Block.cobblestone, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hammerIron, 1), new Object[] { "xyx", "xyx", " y ", 'x', Item.ingotIron, 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hammerSteel, 1), new Object[] { "xyx", "xyx", " y ", 'x', "ingotSteel", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hammerCarbide, 1), new Object[] { "xyx", "xyx", " y ", 'x', "ingotCarbide", 'y', "stickWood" }));

		// Axe
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeAluminum, 1), new Object[] { "xx", "xy", " y", 'x', "ingotAluminum", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeCarbide, 1), new Object[] { "xx", "xy", " y", 'x', "ingotCarbide", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeSteel, 1), new Object[] { "xx", "xy", " y", 'x', "ingotSteel", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeCopper, 1), new Object[] { "xx", "xy", " y", 'x', "ingotCopper", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeBronze, 1), new Object[] { "xx", "xy", " y", 'x', "ingotBronze", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeTitanium, 1), new Object[] { "xx", "xy", " y", 'x', "ingotTitanium", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeDUranium, 1), new Object[] { "xx", "xy", " y", 'x', "ingotUranium", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeDCarbide, 1), new Object[] { "xz", "xz", " y", 'x', Item.diamond, 'y', "stickWood", 'z', "ingotCarbide" }));

		// Reverse
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeAluminum, 1), new Object[] { "xx", "yx", "y ", 'x', "ingotAluminum", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeCarbide, 1), new Object[] { "xx", "yx", "y ", 'x', "ingotCarbide", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeSteel, 1), new Object[] { "xx", "yx", "y ", 'x', "ingotSteel", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeCopper, 1), new Object[] { "xx", "yx", "y ", 'x', "ingotCopper", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeBronze, 1), new Object[] { "xx", "yx", "y ", 'x', "ingotBronze", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeTitanium, 1), new Object[] { "xx", "yx", "y ", 'x', "ingotTitanium", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeDUranium, 1), new Object[] { "xx", "yx", "y ", 'x', "ingotUranium", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.axeDCarbide, 1), new Object[] { "zx", "zx", "y ", 'x', Item.diamond, 'y', "stickWood", 'z', "ingotCarbide" }));

		// Hoe
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeAluminum, 1), new Object[] { "xx", " y", " y", 'x', "ingotAluminum", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeCarbide, 1), new Object[] { "xx", " y", " y", 'x', "ingotCarbide", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeSteel, 1), new Object[] { "xx", " y", " y", 'x', "ingotSteel", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeCopper, 1), new Object[] { "xx", " y", " y", 'x', "ingotCopper", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeBronze, 1), new Object[] { "xx", " y", " y", 'x', "ingotBronze", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeTitanium, 1), new Object[] { "xx", " y", " y", 'x', "ingotTitanium", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeDUranium, 1), new Object[] { "xx", " y", " y", 'x', "ingotUranium", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeDCarbide, 1), new Object[] { "xz", " y", " y", 'x', Item.diamond, 'y', "stickWood", 'z', "ingotCarbide" }));

		// Reverse
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeAluminum, 1), new Object[] { "xx", "y ", "y ", 'x', "ingotAluminum", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeCarbide, 1), new Object[] { "xx", "y ", "y ", 'x', "ingotCarbide", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeSteel, 1), new Object[] { "xx", "y ", "y ", 'x', "ingotSteel", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeCopper, 1), new Object[] { "xx", "y ", "y ", 'x', "ingotCopper", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeBronze, 1), new Object[] { "xx", "y ", "y ", 'x', "ingotBronze", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeTitanium, 1), new Object[] { "xx", "y ", "y ", 'x', "ingotTitanium", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeDUranium, 1), new Object[] { "xx", "y ", "y ", 'x', "ingotUranium", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.hoeDCarbide, 1), new Object[] { "zx", "y ", "y ", 'x', Item.diamond, 'y', "stickWood", 'z', "ingotCarbide" }));

		// Shovels
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeAluminum, 1), new Object[] { "x", "y", "y", 'x', "ingotAluminum", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeCarbide, 1), new Object[] { "x", "y", "y", 'x', "ingotCarbide", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeSteel, 1), new Object[] { "x", "y", "y", 'x', "ingotSteel", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeCopper, 1), new Object[] { "x", "y", "y", 'x', "ingotCopper", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeBronze, 1), new Object[] { "x", "y", "y", 'x', "ingotBronze", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeTitanium, 1), new Object[] { "x", "y", "y", 'x', "ingotTitanium", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeDUranium, 1), new Object[] { "x", "y", "y", 'x', "ingotUranium", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.spadeDCarbide, 1), new Object[] { "x", "z", "y", 'x', Item.diamond, 'y', "stickWood", 'z', "ingotCarbide" }));

		// Pickaxe
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeAluminum, 1), new Object[] { "xxx", " y ", " y ", 'x', "ingotAluminum", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeCarbide, 1), new Object[] { "xxx", " y ", " y ", 'x', "ingotCarbide", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeSteel, 1), new Object[] { "xxx", " y ", " y ", 'x', "ingotSteel", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeCopper, 1), new Object[] { "xxx", " y ", " y ", 'x', "ingotCopper", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeBronze, 1), new Object[] { "xxx", " y ", " y ", 'x', "ingotBronze", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeTitanium, 1), new Object[] { "xxx", " y ", " y ", 'x', "ingotTitanium", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeDUranium, 1), new Object[] { "xxx", " y ", " y ", 'x', "ingotUranium", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.pickaxeDCarbide, 1), new Object[] { "zzz", "xyx", " y ", 'x', Item.diamond, 'y', "stickWood", 'z', "ingotCarbide" }));

		// Swords
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordAluminum, 1), new Object[] { "x", "x", "y", 'x', "ingotAluminum", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordCarbide, 1), new Object[] { "x", "x", "y", 'x', "ingotCarbide", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordSteel, 1), new Object[] { "x", "x", "y", 'x', "ingotSteel", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordCopper, 1), new Object[] { "x", "x", "y", 'x', "ingotCopper", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordBronze, 1), new Object[] { "x", "x", "y", 'x', "ingotBronze", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordTitanium, 1), new Object[] { "x", "x", "y", 'x', "ingotTitanium", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordDUranium, 1), new Object[] { "x", "x", "y", 'x', "ingotUranium", 'y', "stickWood" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Tools.swordDCarbide, 1), new Object[] { "xzx", "xzx", " y ", 'x', Item.diamond, 'y', "stickWood", 'z', "ingotCarbide" }));

	}
}