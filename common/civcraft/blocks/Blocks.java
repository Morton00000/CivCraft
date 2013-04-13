package civcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import civcraft.CivCraftBase;
import civcraft.lib.BlockIDs;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {

	// Ore
	public static final Block ore = new BlockOre(BlockIDs.ORE);

	public static final String[] oreNames = { "Tin Ore", "Copper Ore", "Platinum Ore", "Silver Ore", "Bauxite Ore", "Titanium Ore", "Lead Ore", "Cinnibar Ore", "Zinc Ore", "Tungsten Ore", "Uranium Ore" };

	// Block
	public static final Block block = new BlockBlock(BlockIDs.BLOCK);

	public static final String[] blockNames = { "Tin Block", "Copper Block", "Platinum Block", "Silver Block", "Aluminium Block", "Titanium Block", "Lead Block", "Mercury Block", "Zinc Block", "Tungsten Block", "Uranium Block", "Bronze Block", "Brass Block", "Steel Block", "Carbide Block", "Silicon Block" };

	// Ore Reference List
	public static ItemStack oreTin = new ItemStack(ore, 1, 0);
	public static ItemStack oreCopper = new ItemStack(ore, 1, 1);
	public static ItemStack orePlatinum = new ItemStack(ore, 1, 2);
	public static ItemStack oreSilver = new ItemStack(ore, 1, 3);
	public static ItemStack oreAluminium = new ItemStack(ore, 1, 4);
	public static ItemStack oreTitanium = new ItemStack(ore, 1, 5);
	public static ItemStack oreLead = new ItemStack(ore, 1, 6);
	public static ItemStack oreMercury = new ItemStack(ore, 1, 7);
	public static ItemStack oreZinc = new ItemStack(ore, 1, 8);
	public static ItemStack oreTungsten = new ItemStack(ore, 1, 9);
	public static ItemStack oreUranium = new ItemStack(ore, 1, 10);

	// Block Reference List
	public static ItemStack blockTin = new ItemStack(block, 1, 0);
	public static ItemStack blockCopper = new ItemStack(block, 1, 1);
	public static ItemStack blockPlatinum = new ItemStack(block, 1, 2);
	public static ItemStack blockSilver = new ItemStack(block, 1, 3);
	public static ItemStack blockAluminium = new ItemStack(block, 1, 4);
	public static ItemStack blockTitanium = new ItemStack(block, 1, 5);
	public static ItemStack blockLead = new ItemStack(block, 1, 6);
	public static ItemStack blockMercury = new ItemStack(block, 1, 7);
	public static ItemStack blockZinc = new ItemStack(block, 1, 8);
	public static ItemStack blockTungsten = new ItemStack(block, 1, 9);
	public static ItemStack blockUranium = new ItemStack(block, 1, 10);
	public static ItemStack blockBronze = new ItemStack(block, 1, 11);
	public static ItemStack blockBrass = new ItemStack(block, 1, 12);
	public static ItemStack blockSteel = new ItemStack(block, 1, 13);
	public static ItemStack blockCarbide = new ItemStack(block, 1, 14);
	public static ItemStack blockSilicon = new ItemStack(block, 1, 15);

	public static Block blockPlastic = new BaseBlock(BlockIDs.BLOCK_PLASTIC, Material.iron).setUnlocalizedName("blockPlastic").setHardness(2F).setCreativeTab(CivCraftBase.tabsBlock);
	public static Block blockGraphite = new BaseBlock(BlockIDs.BLOCK_GRAPHITE, Material.iron).setUnlocalizedName("blockGraphite").setHardness(3F).setCreativeTab(CivCraftBase.tabsBlock);

	public static Block oreGraphite = new BaseBlock(BlockIDs.ORE_GRAPHITE, Material.iron).setUnlocalizedName("oreGraphite").setHardness(3F).setCreativeTab(CivCraftBase.tabsBlock);
	public static Block oreSaltpeter = new BaseBlock(BlockIDs.ORE_SALTPETER, Material.iron).setUnlocalizedName("oreSaltpeter").setHardness(3F).setCreativeTab(CivCraftBase.tabsBlock);
	public static Block oreSulfur = new BaseBlock(BlockIDs.ORE_SULFUR, Material.iron).setUnlocalizedName("oreSulfur").setHardness(3F).setCreativeTab(CivCraftBase.tabsBlock);

	public static void init() {

		GameRegistry.registerBlock(blockPlastic, "blockPlastic");
		LanguageRegistry.addName(blockPlastic, "Plastic Block");

		GameRegistry.registerBlock(blockGraphite, "blockGraphite");
		LanguageRegistry.addName(blockGraphite, "Graphite Block");

		GameRegistry.registerBlock(oreGraphite, "oreGraphite");
		LanguageRegistry.addName(oreGraphite, "Graphite Ore");

		GameRegistry.registerBlock(oreSaltpeter, "oreSaltpeter");
		LanguageRegistry.addName(oreSaltpeter, "Saltpeter Ore");

		GameRegistry.registerBlock(oreSulfur, "oreSulfur");
		LanguageRegistry.addName(oreSulfur, "Sulfur Ore");

		// Sets the required harvest level and tool
		// 0 is wood
		// 1 is stone
		// 2 is iron
		// 3 is diamond

		MinecraftForge.setBlockHarvestLevel(ore, 0, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(ore, 1, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(ore, 2, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(ore, 3, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(ore, 4, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(ore, 5, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(ore, 6, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(ore, 7, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(ore, 8, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(ore, 9, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(ore, 10, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(oreGraphite, 0, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(oreSaltpeter, 0, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(oreSulfur, 0, "pickaxe", 2);

		initOreDict();
	}

	public static void initOreDict() {

		// Ore
		OreDictionary.registerOre("oreTin", oreTin);
		OreDictionary.registerOre("oreCopper", oreCopper);
		OreDictionary.registerOre("orePlatinum", orePlatinum);
		OreDictionary.registerOre("oreSilver", oreSilver);
		OreDictionary.registerOre("oreAluminium", oreAluminium);
		OreDictionary.registerOre("oreBauxite", oreAluminium);
		OreDictionary.registerOre("oreTitanium", oreTitanium);
		OreDictionary.registerOre("oreLead", oreLead);
		OreDictionary.registerOre("oreMercury", oreMercury);
		OreDictionary.registerOre("oreCinnibar", oreMercury);
		OreDictionary.registerOre("oreZinc", oreZinc);
		OreDictionary.registerOre("oreTungsten", oreTungsten);
		OreDictionary.registerOre("oreUranium", oreUranium);

		OreDictionary.registerOre("oreGraphite", oreGraphite);
		OreDictionary.registerOre("oreSaltpeter", oreSaltpeter);
		OreDictionary.registerOre("oreSulfur", oreSulfur);
		OreDictionary.registerOre("oreSulphur", oreSulfur);

		// Block
		OreDictionary.registerOre("blockTin", blockTin);
		OreDictionary.registerOre("blockCopper", blockCopper);
		OreDictionary.registerOre("blockPlatinum", blockPlatinum);
		OreDictionary.registerOre("blockSilver", blockSilver);
		OreDictionary.registerOre("blockAluminium", blockAluminium);
		OreDictionary.registerOre("blockTitanium", blockTitanium);
		OreDictionary.registerOre("blockLead", blockLead);
		OreDictionary.registerOre("blockMercury", blockMercury);
		OreDictionary.registerOre("blockQuicksilver", blockMercury);
		OreDictionary.registerOre("blockZinc", blockZinc);
		OreDictionary.registerOre("blockTungsten", blockTungsten);
		OreDictionary.registerOre("blockUranium", blockUranium);
		OreDictionary.registerOre("blockBronze", blockBronze);
		OreDictionary.registerOre("blockBrass", blockBrass);
		OreDictionary.registerOre("blockSteel", blockSteel);
		OreDictionary.registerOre("blockCarbide", blockCarbide);
		OreDictionary.registerOre("blockSilicon", blockSilicon);

		OreDictionary.registerOre("blockPlastic", blockPlastic);
		OreDictionary.registerOre("blockGraphite", blockGraphite);
	}
}
