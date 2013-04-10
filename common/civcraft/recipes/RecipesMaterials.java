package civcraft.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import civcraft.blocks.Blocks;
import civcraft.items.Items;
import civcraft.items.materials.Materials;
import civcraft.items.tools.Tools;

public class RecipesMaterials {

	@SuppressWarnings("unchecked")
	public static void init() {

		// Crafting
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Items.misc, 2, 8), "dustSulfur", new ItemStack(Item.coal, 1, 1), "logWood"));

		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.ingotMercury, "dustMercury"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustMercury, "ingotMercury"));

		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.dust, 4, 12), "dustCopper", "dustCopper", "dustCopper", "dustTin"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.dust, 4, 13), "dustCopper", "dustCopper", "dustCopper", "dustZinc"));

		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.plasticGlob, 2), new ItemStack(Tools.hammerIron, 1, -1), new ItemStack(Item.coal, 1, 1), new ItemStack(Item.coal, 1, 1), Block.sand, Block.sand));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Materials.dustRedSilver, 2), "dustSilver", "dustSilver", Item.redstone));

		// *Stone Hammer*
		// Ore to dust
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustTin, new ItemStack(Tools.hammerStone, 1, -1), "oreTin"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustCopper, new ItemStack(Tools.hammerStone, 1, -1), "oreCopper"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustSilver, new ItemStack(Tools.hammerStone, 1, -1), "oreSilver"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustAluminum, new ItemStack(Tools.hammerStone, 1, -1), "oreAluminum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustMercury, new ItemStack(Tools.hammerStone, 1, -1), "oreMercury"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustZinc, new ItemStack(Tools.hammerStone, 1, -1), "oreZinc"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustUranium, new ItemStack(Tools.hammerStone, 1, -1), "oreUranium"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustGold, new ItemStack(Tools.hammerStone, 1, -1), Block.oreGold));

		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustGraphite, new ItemStack(Tools.hammerStone, 1, -1), "oreGraphite"));

		// Ingot to dust
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustTin, new ItemStack(Tools.hammerStone, 1, -1), "ingotTin"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustCopper, new ItemStack(Tools.hammerStone, 1, -1), "ingotCopper"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustSilver, new ItemStack(Tools.hammerStone, 1, -1), "ingotSilver"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustAluminum, new ItemStack(Tools.hammerStone, 1, -1), "ingotAluminum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustZinc, new ItemStack(Tools.hammerStone, 1, -1), "ingotZinc"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustGold, new ItemStack(Tools.hammerStone, 1, -1), Item.ingotGold));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustBrass, new ItemStack(Tools.hammerStone, 1, -1), "ingotBrass"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustRedSilver, new ItemStack(Tools.hammerStone, 1, -1), Materials.ingotRedSilver));

		// *Iron Hammer*
		// Ore to dust
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustTin, new ItemStack(Tools.hammerIron, 1, -1), "oreTin"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustCopper, new ItemStack(Tools.hammerIron, 1, -1), "oreCopper"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustPlatinum, new ItemStack(Tools.hammerIron, 1, -1), "orePlatinum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustSilver, new ItemStack(Tools.hammerIron, 1, -1), "oreSilver"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustAluminum, new ItemStack(Tools.hammerIron, 1, -1), "oreAluminum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustLead, new ItemStack(Tools.hammerIron, 1, -1), "oreLead"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustMercury, new ItemStack(Tools.hammerIron, 1, -1), "oreMercury"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustZinc, new ItemStack(Tools.hammerIron, 1, -1), "oreZinc"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustUranium, new ItemStack(Tools.hammerIron, 1, -1), "oreUranium"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustGold, new ItemStack(Tools.hammerIron, 1, -1), Block.oreGold));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustIron, new ItemStack(Tools.hammerIron, 1, -1), Block.oreIron));

		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustGraphite, new ItemStack(Tools.hammerIron, 1, -1), "oreGraphite"));

		// Ingot to dust
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustTin, new ItemStack(Tools.hammerIron, 1, -1), "ingotTin"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustCopper, new ItemStack(Tools.hammerIron, 1, -1), "ingotCopper"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustPlatinum, new ItemStack(Tools.hammerIron, 1, -1), "ingotPlatinum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustSilver, new ItemStack(Tools.hammerIron, 1, -1), "ingotSilver"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustAluminum, new ItemStack(Tools.hammerIron, 1, -1), "ingotAluminum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustLead, new ItemStack(Tools.hammerIron, 1, -1), "ingotLead"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustZinc, new ItemStack(Tools.hammerIron, 1, -1), "ingotZinc"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustGold, new ItemStack(Tools.hammerIron, 1, -1), Item.ingotGold));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustIron, new ItemStack(Tools.hammerIron, 1, -1), Item.ingotIron));

		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustBronze, new ItemStack(Tools.hammerIron, 1, -1), "ingotBronze"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustBrass, new ItemStack(Tools.hammerIron, 1, -1), "ingotBrass"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustYellowCake, new ItemStack(Tools.hammerIron, 1, -1), "ingotUranium"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustRedSilver, new ItemStack(Tools.hammerIron, 1, -1), Materials.ingotRedSilver));

		// *Steel Hammer*
		// Ore to dust
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustTin, new ItemStack(Tools.hammerSteel, 1, -1), "oreTin"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustCopper, new ItemStack(Tools.hammerSteel, 1, -1), "oreCopper"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustPlatinum, new ItemStack(Tools.hammerSteel, 1, -1), "orePlatinum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustSilver, new ItemStack(Tools.hammerSteel, 1, -1), "oreSilver"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustAluminum, new ItemStack(Tools.hammerSteel, 1, -1), "oreAluminum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustTitanium, new ItemStack(Tools.hammerSteel, 1, -1), "oreTitanium"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustLead, new ItemStack(Tools.hammerSteel, 1, -1), "oreLead"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustMercury, new ItemStack(Tools.hammerSteel, 1, -1), "oreMercury"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustZinc, new ItemStack(Tools.hammerSteel, 1, -1), "oreZinc"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustUranium, new ItemStack(Tools.hammerSteel, 1, -1), "oreUranium"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustGold, new ItemStack(Tools.hammerSteel, 1, -1), Block.oreGold));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustIron, new ItemStack(Tools.hammerSteel, 1, -1), Block.oreIron));

		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustGraphite, new ItemStack(Tools.hammerSteel, 1, -1), "oreGraphite"));

		// Ingot to dust
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustTin, new ItemStack(Tools.hammerSteel, 1, -1), "ingotTin"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustCopper, new ItemStack(Tools.hammerSteel, 1, -1), "ingotCopper"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustPlatinum, new ItemStack(Tools.hammerSteel, 1, -1), "ingotPlatinum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustSilver, new ItemStack(Tools.hammerSteel, 1, -1), "ingotSilver"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustAluminum, new ItemStack(Tools.hammerSteel, 1, -1), "ingotAluminum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustTitanium, new ItemStack(Tools.hammerSteel, 1, -1), "ingotTitanium"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustLead, new ItemStack(Tools.hammerSteel, 1, -1), "ingotLead"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustZinc, new ItemStack(Tools.hammerSteel, 1, -1), "ingotZinc"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustGold, new ItemStack(Tools.hammerSteel, 1, -1), Item.ingotGold));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustIron, new ItemStack(Tools.hammerSteel, 1, -1), Item.ingotIron));

		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustBronze, new ItemStack(Tools.hammerSteel, 1, -1), "ingotBronze"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustBrass, new ItemStack(Tools.hammerSteel, 1, -1), "ingotBrass"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustSteel, new ItemStack(Tools.hammerSteel, 1, -1), "ingotSteel"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustSilicon, new ItemStack(Tools.hammerSteel, 1, -1), "ingotSilicon"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustYellowCake, new ItemStack(Tools.hammerSteel, 1, -1), "ingotUranium"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustRedSilver, new ItemStack(Tools.hammerSteel, 1, -1), Materials.ingotRedSilver));

		// *Carbide Hammer*
		// Ore to dust
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustTin, new ItemStack(Tools.hammerCarbide, 1, -1), "oreTin"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustCopper, new ItemStack(Tools.hammerCarbide, 1, -1), "oreCopper"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustPlatinum, new ItemStack(Tools.hammerCarbide, 1, -1), "orePlatinum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustSilver, new ItemStack(Tools.hammerCarbide, 1, -1), "oreSilver"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustAluminum, new ItemStack(Tools.hammerCarbide, 1, -1), "oreAluminum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustTitanium, new ItemStack(Tools.hammerCarbide, 1, -1), "oreTitanium"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustLead, new ItemStack(Tools.hammerCarbide, 1, -1), "oreLead"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustMercury, new ItemStack(Tools.hammerCarbide, 1, -1), "oreMercury"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustZinc, new ItemStack(Tools.hammerCarbide, 1, -1), "oreZinc"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustTungsten, new ItemStack(Tools.hammerCarbide, 1, -1), "oreTungsten"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustUranium, new ItemStack(Tools.hammerCarbide, 1, -1), "oreUranium"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustGold, new ItemStack(Tools.hammerCarbide, 1, -1), Block.oreGold));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustIron, new ItemStack(Tools.hammerCarbide, 1, -1), Block.oreIron));

		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustGraphite, new ItemStack(Tools.hammerCarbide, 1, -1), "oreGraphite"));

		// Ingot to dust
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustTin, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotTin"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustCopper, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotCopper"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustPlatinum, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotPlatinum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustSilver, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotSilver"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustAluminum, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotAluminum"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustTitanium, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotTitanium"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustLead, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotLead"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustZinc, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotZinc"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustTungsten, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotTungsten"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustGold, new ItemStack(Tools.hammerCarbide, 1, -1), Item.ingotGold));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustIron, new ItemStack(Tools.hammerCarbide, 1, -1), Item.ingotIron));

		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustBronze, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotBronze"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustBrass, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotBrass"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustSteel, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotSteel"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustCarbide, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotCarbide"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustSilicon, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotSilicon"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustYellowCake, new ItemStack(Tools.hammerCarbide, 1, -1), "ingotUranium"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Materials.dustRedSilver, new ItemStack(Tools.hammerCarbide, 1, -1), Materials.ingotRedSilver));

		// Smelting
		FurnaceRecipes.smelting().addSmelting(Materials.plasticGlob.itemID, new ItemStack(Materials.plastic, 2), 0.5F);

		FurnaceRecipes.smelting().addSmelting(Blocks.oreTin.itemID, 0, Materials.ingotTin, 0.7F);
		FurnaceRecipes.smelting().addSmelting(Blocks.oreCopper.itemID, 1, Materials.ingotCopper, 0.7F);
		FurnaceRecipes.smelting().addSmelting(Blocks.oreSilver.itemID, 3, Materials.ingotSilver, 1.0F);
		FurnaceRecipes.smelting().addSmelting(Blocks.oreAluminum.itemID, 4, Materials.ingotAluminum, 0.7F);
		FurnaceRecipes.smelting().addSmelting(Blocks.oreLead.itemID, 6, Materials.ingotLead, 0.7F);
		FurnaceRecipes.smelting().addSmelting(Blocks.oreZinc.itemID, 8, Materials.ingotZinc, 0.7F);

		FurnaceRecipes.smelting().addSmelting(Materials.dustTin.itemID, 0, Materials.ingotTin, 0.7F);
		FurnaceRecipes.smelting().addSmelting(Materials.dustCopper.itemID, 1, Materials.ingotCopper, 0.7F);
		FurnaceRecipes.smelting().addSmelting(Materials.dustSilver.itemID, 3, Materials.ingotSilver, 1.0F);
		FurnaceRecipes.smelting().addSmelting(Materials.dustAluminum.itemID, 4, Materials.ingotAluminum, 0.7F);
		FurnaceRecipes.smelting().addSmelting(Materials.dustLead.itemID, 6, Materials.ingotLead, 0.7F);
		FurnaceRecipes.smelting().addSmelting(Materials.dustZinc.itemID, 8, Materials.ingotZinc, 0.7F);

		FurnaceRecipes.smelting().addSmelting(Materials.dustBronze.itemID, 11, Materials.ingotBronze, 0.7F);
		FurnaceRecipes.smelting().addSmelting(Materials.dustBrass.itemID, 12, Materials.ingotBrass, 0.7F);

		FurnaceRecipes.smelting().addSmelting(Materials.dustGold.itemID, 17, new ItemStack(Item.ingotGold), 1.0F);
		FurnaceRecipes.smelting().addSmelting(Materials.dustIron.itemID, 18, new ItemStack(Item.ingotIron), 0.7F);
	}
}