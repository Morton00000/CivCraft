package civcraft.recipes;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import civcraft.items.Items;
import civcraft.items.armor.Armor;

public class RecipesArmor {

	@SuppressWarnings("unchecked")
	public static void init() {

		// Heads
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.headAluminum, 1), new Object[] { "xxx", "x x", 'x', "ingotAluminum" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.headCopper, 1), new Object[] { "xxx", "x x", 'x', "ingotCopper" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.headBronze, 1), new Object[] { "xxx", "x x", 'x', "ingotBronze" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.headCarbide, 1), new Object[] { "xxx", "x x", 'x', "ingotCarbide" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.headSteel, 1), new Object[] { "xxx", "x x", 'x', "ingotSteel" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.headTitanium, 1), new Object[] { "xxx", "x x", 'x', "ingotTitanium" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.headDUranium, 1), new Object[] { "xxx", "x x", 'x', "ingotUranium" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.headKevlar, 1), new Object[] { "xxx", "x x", 'x', Items.kevlar }));

		// Chests
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.chestAluminum, 1), new Object[] { "x x", "xxx", "xxx", 'x', "ingotAluminum" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.chestCopper, 1), new Object[] { "x x", "xxx", "xxx", 'x', "ingotCopper" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.chestBronze, 1), new Object[] { "x x", "xxx", "xxx", 'x', "ingotBronze" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.chestCarbide, 1), new Object[] { "x x", "xxx", "xxx", 'x', "ingotCarbide" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.chestSteel, 1), new Object[] { "x x", "xxx", "xxx", 'x', "ingotSteel" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.chestTitanium, 1), new Object[] { "x x", "xxx", "xxx", 'x', "ingotTitanium" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.chestDUranium, 1), new Object[] { "x x", "xxx", "xxx", 'x', "ingotUranium" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.chestKevlar, 1), new Object[] { "x x", "xxx", "xxx", 'x', Items.kevlar }));

		// Legs
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.legsAluminum, 1), new Object[] { "xxx", "x x", "x x", 'x', "ingotAluminum" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.legsCopper, 1), new Object[] { "xxx", "x x", "x x", 'x', "ingotCopper" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.legsBronze, 1), new Object[] { "xxx", "x x", "x x", 'x', "ingotBronze" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.legsCarbide, 1), new Object[] { "xxx", "x x", "x x", 'x', "ingotCarbide" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.legsSteel, 1), new Object[] { "xxx", "x x", "x x", 'x', "ingotSteel" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.legsTitanium, 1), new Object[] { "xxx", "x x", "x x", 'x', "ingotTitanium" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.legsDUranium, 1), new Object[] { "xxx", "x x", "x x", 'x', "ingotUranium" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.legsKevlar, 1), new Object[] { "xxx", "x x", "x x", 'x', Items.kevlar }));

		// Boots
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.bootsAluminum, 1), new Object[] { "x x", "x x", 'x', "ingotAluminum" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.bootsCopper, 1), new Object[] { "x x", "x x", 'x', "ingotCopper" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.bootsBronze, 1), new Object[] { "x x", "x x", 'x', "ingotBronze" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.bootsCarbide, 1), new Object[] { "x x", "x x", 'x', "ingotCarbide" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.bootsSteel, 1), new Object[] { "x x", "x x", 'x', "ingotSteel" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.bootsTitanium, 1), new Object[] { "x x", "x x", 'x', "ingotTitanium" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.bootsDUranium, 1), new Object[] { "x x", "x x", 'x', "ingotUranium" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Armor.bootsKevlar, 1), new Object[] { "x x", "x x", 'x', Items.kevlar }));

	}
}