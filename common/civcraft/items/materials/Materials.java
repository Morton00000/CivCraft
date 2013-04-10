package civcraft.items.materials;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import civcraft.CivCraftBase;
import civcraft.items.BaseItem;
import civcraft.lib.ItemIDs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Materials {

	// Dust
	public static final Item dust = new MaterialDust(ItemIDs.DUST);

	public static final String[] dustNames = { "Tin Dust", "Copper Dust", "Platinum Dust", "Silver Dust", "Aluminum Dust", "Titanium Dust", "Lead Dust", "Cinnibar Dust", "Zinc Dust", "Tungsten Dust", "Uranium Dust", "Bronze Dust", "Brass Dust", "Steel Dust", "Carbide Dust", "Silicon Dust", "Yellow Cake Dust", "Gold Dust", "Iron Dust" };

	// Ingot
	public static final Item ingot = new MaterialIngot(ItemIDs.INGOT);

	public static final String[] ingotNames = { "Tin Ingot", "Copper Ingot", "Platinum Ingot", "Silver Ingot", "Aluminum Ingot", "Titanium Ingot", "Lead Ingot", "Mercury Glob", "Zinc Ingot", "Tungsten Ingot", "Uranium Ingot", "Bronze Ingot", "Brass Ingot", "Steel Ingot", "Carbide Ingot", "Silicon Ingot" };

	// Dust Reference List
	public static ItemStack dustTin = new ItemStack(dust, 1, 0);
	public static ItemStack dustCopper = new ItemStack(dust, 1, 1);
	public static ItemStack dustPlatinum = new ItemStack(dust, 1, 2);
	public static ItemStack dustSilver = new ItemStack(dust, 1, 3);
	public static ItemStack dustAluminum = new ItemStack(dust, 1, 4);
	public static ItemStack dustTitanium = new ItemStack(dust, 1, 5);
	public static ItemStack dustLead = new ItemStack(dust, 1, 6);
	public static ItemStack dustMercury = new ItemStack(dust, 1, 7);
	public static ItemStack dustZinc = new ItemStack(dust, 1, 8);
	public static ItemStack dustTungsten = new ItemStack(dust, 1, 9);
	public static ItemStack dustUranium = new ItemStack(dust, 1, 10);
	public static ItemStack dustBronze = new ItemStack(dust, 1, 11);
	public static ItemStack dustBrass = new ItemStack(dust, 1, 12);
	public static ItemStack dustSteel = new ItemStack(dust, 1, 13);
	public static ItemStack dustCarbide = new ItemStack(dust, 1, 14);
	public static ItemStack dustSilicon = new ItemStack(dust, 1, 15);
	public static ItemStack dustYellowCake = new ItemStack(dust, 1, 16);
	public static ItemStack dustGold = new ItemStack(dust, 1, 17);
	public static ItemStack dustIron = new ItemStack(dust, 1, 18);

	// Ingot Reference List
	public static ItemStack ingotTin = new ItemStack(ingot, 1, 0);
	public static ItemStack ingotCopper = new ItemStack(ingot, 1, 1);
	public static ItemStack ingotPlatinum = new ItemStack(ingot, 1, 2);
	public static ItemStack ingotSilver = new ItemStack(ingot, 1, 3);
	public static ItemStack ingotAluminum = new ItemStack(ingot, 1, 4);
	public static ItemStack ingotTitanium = new ItemStack(ingot, 1, 5);
	public static ItemStack ingotLead = new ItemStack(ingot, 1, 6);
	public static ItemStack ingotMercury = new ItemStack(ingot, 1, 7);
	public static ItemStack ingotZinc = new ItemStack(ingot, 1, 8);
	public static ItemStack ingotTungsten = new ItemStack(ingot, 1, 9);
	public static ItemStack ingotUranium = new ItemStack(ingot, 1, 10);
	public static ItemStack ingotBronze = new ItemStack(ingot, 1, 11);
	public static ItemStack ingotBrass = new ItemStack(ingot, 1, 12);
	public static ItemStack ingotSteel = new ItemStack(ingot, 1, 13);
	public static ItemStack ingotCarbide = new ItemStack(ingot, 1, 14);
	public static ItemStack ingotSilicon = new ItemStack(ingot, 1, 15);

	public static Item plastic = new BaseItem(ItemIDs.PLASTIC).setUnlocalizedName("plastic").setCreativeTab(CivCraftBase.tabsMaterials);;
	public static Item plasticGlob = new BaseItem(ItemIDs.PLASTIC_GLOB).setUnlocalizedName("plasticGlob").setCreativeTab(CivCraftBase.tabsMaterials);

	public static Item dustGraphite = new BaseItem(ItemIDs.DUST_GRAPHITE).setUnlocalizedName("dustGraphite").setCreativeTab(CivCraftBase.tabsMaterials);
	public static Item dustSaltpeter = new BaseItem(ItemIDs.DUST_SALTPETER).setUnlocalizedName("dustSaltpeter").setCreativeTab(CivCraftBase.tabsMaterials);
	public static Item dustSulfur = new BaseItem(ItemIDs.DUST_SULFUR).setUnlocalizedName("dustSulfur").setCreativeTab(CivCraftBase.tabsMaterials);

	public static Item dustRedSilver = new BaseItem(ItemIDs.DUST_REDSILVER).setUnlocalizedName("dustRedSilver").setCreativeTab(CivCraftBase.tabsMaterials);
	public static Item ingotRedSilver = new BaseItem(ItemIDs.INGOT_REDSILVER).setUnlocalizedName("ingotRedSilver").setCreativeTab(CivCraftBase.tabsMaterials);

	public static void init() {

		LanguageRegistry.addName(plastic, "Plastic");
		LanguageRegistry.addName(plasticGlob, "Plastic Glob");

		LanguageRegistry.addName(dustGraphite, "Graphite Dust");
		LanguageRegistry.addName(dustSaltpeter, "Saltpeter Dust");
		LanguageRegistry.addName(dustSulfur, "Sulfur Dust");

		LanguageRegistry.addName(dustRedSilver, "RedSilver Dust");
		LanguageRegistry.addName(ingotRedSilver, "RedSilver Ingot");

		// *Ore Dictionary*
		OreDictionary.registerOre("plastic", plastic);

		OreDictionary.registerOre("dustGraphite", dustGraphite);
		OreDictionary.registerOre("dustSaltpeter", dustSaltpeter);
		OreDictionary.registerOre("dustSulfur", dustSulfur);
		OreDictionary.registerOre("dustSulphur", dustSulfur);

		// Dust
		OreDictionary.registerOre("dustTin", dustTin);
		OreDictionary.registerOre("dustCopper", dustCopper);
		OreDictionary.registerOre("dustPlatinum", dustPlatinum);
		OreDictionary.registerOre("dustSilver", dustSilver);
		OreDictionary.registerOre("dustAluminum", dustAluminum);
		OreDictionary.registerOre("dustTitanium", dustTitanium);
		OreDictionary.registerOre("dustLead", dustLead);
		OreDictionary.registerOre("dustMercury", dustMercury);
		OreDictionary.registerOre("dustCinnibar", dustMercury);
		OreDictionary.registerOre("dustZinc", dustZinc);
		OreDictionary.registerOre("dustTungsten", dustTungsten);
		OreDictionary.registerOre("dustUranium", dustUranium);
		OreDictionary.registerOre("dustBronze", dustBronze);
		OreDictionary.registerOre("dustBrass", dustBrass);
		OreDictionary.registerOre("dustSteel", dustSteel);
		OreDictionary.registerOre("dustCarbide", dustCarbide);
		OreDictionary.registerOre("dustSilicon", dustSilicon);
		OreDictionary.registerOre("dustGold", dustGold);
		OreDictionary.registerOre("dustIron", dustIron);

		// Ingot
		OreDictionary.registerOre("ingotTin", ingotTin);
		OreDictionary.registerOre("ingotCopper", ingotCopper);
		OreDictionary.registerOre("ingotPlatinum", ingotPlatinum);
		OreDictionary.registerOre("ingotSilver", ingotSilver);
		OreDictionary.registerOre("ingotAluminum", ingotAluminum);
		OreDictionary.registerOre("ingotTitanium", ingotTitanium);
		OreDictionary.registerOre("ingotLead", ingotLead);
		OreDictionary.registerOre("ingotMercury", ingotMercury);
		OreDictionary.registerOre("Quicksilver", ingotMercury);
		OreDictionary.registerOre("ingotZinc", ingotZinc);
		OreDictionary.registerOre("ingotTungsten", ingotTungsten);
		OreDictionary.registerOre("ingotUranium", ingotUranium);
		OreDictionary.registerOre("ingotBronze", ingotBronze);
		OreDictionary.registerOre("ingotBrass", ingotBrass);
		OreDictionary.registerOre("ingotSteel", ingotSteel);
		OreDictionary.registerOre("ingotCarbide", ingotCarbide);
		OreDictionary.registerOre("ingotSilicon", ingotSilicon);

	}
}