package civcraft.recipes.machines;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import civcraft.blocks.Blocks;
import civcraft.items.materials.Materials;

public class RecipesFurnaceInd {
	private static final RecipesFurnaceInd smeltingBase = new RecipesFurnaceInd();

	/** The list of smelting results. */
	@SuppressWarnings("rawtypes")
	private Map smeltingList = new HashMap();
	@SuppressWarnings("rawtypes")
	private Map experienceList = new HashMap();
	private HashMap<List<Integer>, ItemStack> metaSmeltingList = new HashMap<List<Integer>, ItemStack>();
	private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

	/**
	 * Used to call methods addSmelting and getSmeltingResult.
	 */
	public static final RecipesFurnaceInd smelting() {
		return smeltingBase;
	}

	private RecipesFurnaceInd() {
		this.addSmelting(Block.oreIron.blockID, new ItemStack(Item.ingotIron), 0.7F);
		this.addSmelting(Block.oreGold.blockID, new ItemStack(Item.ingotGold), 1.0F);
		this.addSmelting(Block.oreDiamond.blockID, new ItemStack(Item.diamond), 1.0F);
		this.addSmelting(Block.sand.blockID, new ItemStack(Block.glass), 0.1F);
		this.addSmelting(Block.cobblestone.blockID, new ItemStack(Block.stone), 0.1F);
		this.addSmelting(Item.clay.itemID, new ItemStack(Item.brick), 0.3F);
		this.addSmelting(Block.cactus.blockID, new ItemStack(Item.dyePowder, 1, 2), 0.2F);
		this.addSmelting(Block.wood.blockID, new ItemStack(Item.coal, 1, 1), 0.15F);
		this.addSmelting(Block.oreEmerald.blockID, new ItemStack(Item.emerald), 1.0F);
		this.addSmelting(Block.netherrack.blockID, new ItemStack(Item.netherrackBrick), 0.1F);
		this.addSmelting(Block.oreCoal.blockID, new ItemStack(Item.coal), 0.1F);
		this.addSmelting(Block.oreRedstone.blockID, new ItemStack(Item.redstone), 0.7F);
		this.addSmelting(Block.oreLapis.blockID, new ItemStack(Item.dyePowder, 1, 4), 0.2F);
		this.addSmelting(Block.oreNetherQuartz.blockID, new ItemStack(Item.netherQuartz), 0.2F);

		this.addSmelting(Materials.plasticGlob.itemID, new ItemStack(Materials.plastic, 2), 0.5F);

		this.addSmelting(Blocks.oreTin.itemID, 0, Materials.ingotTin, 0.7F);
		this.addSmelting(Blocks.oreCopper.itemID, 1, Materials.ingotCopper, 0.7F);
		this.addSmelting(Blocks.orePlatinum.itemID, 2, Materials.ingotPlatinum, 1.0F);
		this.addSmelting(Blocks.oreSilver.itemID, 3, Materials.ingotSilver, 1.0F);
		this.addSmelting(Blocks.oreAluminum.itemID, 4, Materials.ingotAluminum, 0.7F);
		this.addSmelting(Blocks.oreTitanium.itemID, 5, Materials.ingotTitanium, 1.0F);
		this.addSmelting(Blocks.oreLead.itemID, 6, Materials.ingotLead, 0.7F);

		this.addSmelting(Blocks.oreZinc.itemID, 8, Materials.ingotZinc, 0.7F);
		this.addSmelting(Blocks.oreTungsten.itemID, 9, Materials.ingotTungsten, 1.0F);

		this.addSmelting(Materials.dustTin.itemID, 0, Materials.ingotTin, 0.7F);
		this.addSmelting(Materials.dustCopper.itemID, 1, Materials.ingotCopper, 0.7F);
		this.addSmelting(Materials.dustPlatinum.itemID, 2, Materials.ingotPlatinum, 1.0F);
		this.addSmelting(Materials.dustSilver.itemID, 3, Materials.ingotSilver, 1.0F);
		this.addSmelting(Materials.dustAluminum.itemID, 4, Materials.ingotAluminum, 0.7F);
		this.addSmelting(Materials.dustTitanium.itemID, 5, Materials.ingotTitanium, 1.0F);
		this.addSmelting(Materials.dustLead.itemID, 6, Materials.ingotLead, 0.7F);

		this.addSmelting(Materials.dustZinc.itemID, 8, Materials.ingotZinc, 0.7F);
		this.addSmelting(Materials.dustTungsten.itemID, 9, Materials.ingotTungsten, 1.0F);

		this.addSmelting(Materials.dustBronze.itemID, 11, Materials.ingotBronze, 0.7F);
		this.addSmelting(Materials.dustBrass.itemID, 12, Materials.ingotBrass, 0.7F);
		this.addSmelting(Materials.dustSteel.itemID, 13, Materials.ingotSteel, 1.0F);
		this.addSmelting(Materials.dustCarbide.itemID, 14, Materials.ingotCarbide, 1.0F);
		this.addSmelting(Materials.dustSilicon.itemID, 15, Materials.ingotSilicon, 1.0F);

		this.addSmelting(Materials.dustGold.itemID, 17, new ItemStack(Item.ingotGold), 1.0F);
		this.addSmelting(Materials.dustIron.itemID, 18, new ItemStack(Item.ingotIron), 0.7F);

		this.addSmelting(Materials.dustUranium.itemID, 10, Materials.dustYellowCake, 1.0F);
		this.addSmelting(Materials.dustYellowCake.itemID, 16, Materials.ingotUranium, 1.0F);
		this.addSmelting(Materials.dustRedSilver.itemID, new ItemStack(Materials.ingotRedSilver), 1.0F);

		this.addSmelting(Materials.ingotTungsten.itemID, 9, Materials.ingotCarbide, 1.0F);

	}

	/**
	 * Adds a smelting recipe.
	 */
	@SuppressWarnings("unchecked")
	public void addSmelting(int par1, ItemStack par2ItemStack, float par3) {
		smeltingList.put(Integer.valueOf(par1), par2ItemStack);
		experienceList.put(Integer.valueOf(par2ItemStack.itemID), Float.valueOf(par3));
	}

	/**
	 * Returns the smelting result of an item. Deprecated in favor of a metadata
	 * sensitive version
	 */
	@Deprecated
	public ItemStack getSmeltingResult(int par1) {
		return (ItemStack) smeltingList.get(Integer.valueOf(par1));
	}

	@SuppressWarnings("rawtypes")
	public Map getSmeltingList() {
		return smeltingList;
	}

	@Deprecated
	// In favor of ItemStack sensitive version
	public float getExperience(int par1) {
		return experienceList.containsKey(Integer.valueOf(par1)) ? ((Float) experienceList.get(Integer.valueOf(par1))).floatValue() : 0.0F;
	}

	/**
	 * A metadata sensitive version of adding a furnace recipe.
	 */
	public void addSmelting(int itemID, int metadata, ItemStack itemstack, float experience) {
		metaSmeltingList.put(Arrays.asList(itemID, metadata), itemstack);
		metaExperience.put(Arrays.asList(itemID, metadata), experience);
	}

	/**
	 * Used to get the resulting ItemStack form a source ItemStack
	 * 
	 * @param item
	 *            The Source ItemStack
	 * @return The result ItemStack
	 */
	public ItemStack getSmeltingResult(ItemStack item) {
		if (item == null)
			return null;
		ItemStack ret = metaSmeltingList.get(Arrays.asList(item.itemID, item.getItemDamage()));
		if (ret != null)
			return ret;
		return (ItemStack) smeltingList.get(Integer.valueOf(item.itemID));
	}

	/**
	 * Grabs the amount of base experience for this item to give when pulled
	 * from the furnace slot.
	 */
	public float getExperience(ItemStack item) {
		if (item == null || item.getItem() == null)
			return 0;
		float ret = item.getItem().getSmeltingExperience(item);
		if (ret < 0 && metaExperience.containsKey(Arrays.asList(item.itemID, item.getItemDamage()))) {
			ret = metaExperience.get(Arrays.asList(item.itemID, item.getItemDamage()));
		}
		if (ret < 0 && experienceList.containsKey(item.itemID)) {
			ret = ((Float) experienceList.get(item.itemID)).floatValue();
		}
		return ret < 0 ? 0 : ret;
	}

	public Map<List<Integer>, ItemStack> getMetaSmeltingList() {
		return metaSmeltingList;
	}
}
