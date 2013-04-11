package civcraft.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import civcraft.blocks.Blocks;
import civcraft.blocks.Machines;
import civcraft.items.Items;
import civcraft.items.materials.Materials;

public class RecipesBlocks {

	@SuppressWarnings("unchecked")
	public static void init() {

		// Ingots to Blocks
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockTin, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotTin" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockCopper, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotCopper" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockPlatinum, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotPlatinum" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockSilver, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotSilver" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockAluminum, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotAluminum" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockTitanium, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotTitanium" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockLead, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotLead" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockMercury, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotMercury" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockZinc, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotZinc" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockTungsten, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotTungsten" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockUranium, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotUranium" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockBronze, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotBronze" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockBrass, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotBrass" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockSteel, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotSteel" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockCarbide, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotCarbide" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockSilicon, new Object[] { "xxx", "xxx", "xxx", 'x', "ingotSilicon" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockPlastic, new Object[] { "xxx", "xxx", "xxx", 'x', "plastic" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Blocks.blockGraphite, new Object[] { "xxx", "xxx", "xxx", 'x', "dustGraphite" }));

		// Blocks to Ingots
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 0), "blockTin"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 1), "blockCopper"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 2), "blockPlatinum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 3), "blockSilver"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 4), "blockAluminum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 5), "blockTitanium"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 6), "blockLead"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 7), "blockMercury"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 8), "blockZinc"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 9), "blockTungsten"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 10), "blockUranium"));

		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 11), "blockBronze"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 12), "blockBrass"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 13), "blockSteel"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 14), "blockCarbide"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.ingot, 9, 15), "blockSilicon"));

		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.plastic, 9), "blockPlastic"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.dustGraphite, 9), "blockGraphite"));

		// Machines
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Machines.furnaceBlastOff, new Object[] { "xcx", "yzy", "bcb", 'x', Block.blockIron, 'y', Items.bellows, 'z', Block.furnaceIdle, 'c', Items.heatingCoil, 'b', Block.brick }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Machines.furnaceIndOff, new Object[] { "xcx", "yzy", "bvb", 'x', "blockSteel", 'y', Items.bellows, 'z', Machines.furnaceBlastOff, 'c', Items.heatingCoil, 'b', Block.brick, 'v', Machines.computerOff }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Machines.furnaceMoldOff, new Object[] { "xxx", "x x", "xxx", 'x', Block.brick }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Machines.plasticOvenOff, new Object[] { "xxx", "x x", "xxx", 'x', "plastic" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Machines.crusher1Off, new Object[] { "sss", "x x", "ycy", 'x', Item.ingotIron, 'y', Materials.ingotRedSilver, 'c', Machines.computerOff, 's', "ingotSteel" }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Machines.crusher2Off, new Object[] { "sss", "x x", "ycy", 'x', "ingotSteel", 'y', Materials.ingotRedSilver, 'c', Machines.computerOff, 's', "ingotCarbide" }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Machines.computerOff, new Object[] { "xxx", "pyx", "zdz", 'x', "plastic", 'y', Items.motherBoard, 'z', Items.ram, 'd', Items.hardDrive, 'p', Block.thinGlass }));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Machines.computerOff, new Object[] { "xxx", "xyp", "zdz", 'x', "plastic", 'y', Items.motherBoard, 'z', Items.ram, 'd', Items.hardDrive, 'p', Block.thinGlass }));

		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(Machines.lightOff, new Object[] { "xzx", "xyx", "xrx", 'x', Block.thinGlass, 'y', "ingotTungsten", 'z', Item.lightStoneDust, 'r', Item.redstone }));

	}
}