package civcraft.recipes.machines;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import civcraft.blocks.Blocks;
import civcraft.items.materials.Materials;

public class RecipesCrusher1 {
	private static final RecipesCrusher1 smeltingBase = new RecipesCrusher1();

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
	public static final RecipesCrusher1 smelting() {
		return smeltingBase;
	}

	private RecipesCrusher1() {
		this.addSmelting(Blocks.oreTin.itemID, 0, new ItemStack(Materials.dust, 2, 0), 0.0F);
		this.addSmelting(Blocks.oreCopper.itemID, 1, new ItemStack(Materials.dust, 2, 1), 0.0F);
		this.addSmelting(Blocks.orePlatinum.itemID, 2, new ItemStack(Materials.dust, 2, 2), 0.0F);
		this.addSmelting(Blocks.oreSilver.itemID, 3, new ItemStack(Materials.dust, 2, 3), 0.0F);
		this.addSmelting(Blocks.oreAluminum.itemID, 4, new ItemStack(Materials.dust, 2, 4), 0.0F);
		this.addSmelting(Blocks.oreMercury.itemID, 7, new ItemStack(Materials.dust, 2, 7), 0.0F);
		this.addSmelting(Blocks.oreZinc.itemID, 8, new ItemStack(Materials.dust, 2, 8), 0.0F);

		this.addSmelting(Block.oreGold.blockID, new ItemStack(Materials.dust, 2, 17), 0.0F);
		this.addSmelting(Block.oreIron.blockID, new ItemStack(Materials.dust, 2, 18), 0.0F);

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
