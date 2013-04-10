package civcraft.items.tools;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import civcraft.CivCraftBase;
import civcraft.enums.ToolsEnum;
import civcraft.items.BaseItem;
import civcraft.lib.ItemIDs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Tools {

	// Hammers
	public static Item hammerStone = new BaseItem(ItemIDs.STONE_HAMMER).setUnlocalizedName("hammerStone").setMaxDamage(131).setCreativeTab(CivCraftBase.tabsTools);
	public static Item hammerIron = new BaseItem(ItemIDs.IRON_HAMMER).setUnlocalizedName("hammerIron").setMaxDamage(250).setCreativeTab(CivCraftBase.tabsTools);
	public static Item hammerSteel = new BaseItem(ItemIDs.STEEL_HAMMER).setUnlocalizedName("hammerSteel").setMaxDamage(500).setCreativeTab(CivCraftBase.tabsTools);
	public static Item hammerCarbide = new BaseItem(ItemIDs.CARBIDE_HAMMER).setUnlocalizedName("hammerCarbide").setMaxDamage(1000).setCreativeTab(CivCraftBase.tabsTools);

	// Axes
	public static Item axeAluminum = new ItemAxeCC(ItemIDs.ALUMINUM_AXE, ToolsEnum.toolALUMINUM).setUnlocalizedName("axeAluminum").setCreativeTab(CivCraftBase.tabsTools);
	public static Item axeCopper = new ItemAxeCC(ItemIDs.COPPER_AXE, ToolsEnum.toolCOPPER).setUnlocalizedName("axeCopper").setCreativeTab(CivCraftBase.tabsTools);
	public static Item axeBronze = new ItemAxeCC(ItemIDs.BRONZE_AXE, ToolsEnum.toolBRONZE).setUnlocalizedName("axeBronze").setCreativeTab(CivCraftBase.tabsTools);
	public static Item axeSteel = new ItemAxeCC(ItemIDs.STEEL_AXE, ToolsEnum.toolSTEEL).setUnlocalizedName("axeSteel").setCreativeTab(CivCraftBase.tabsTools);
	public static Item axeTitanium = new ItemAxeCC(ItemIDs.TITANIUM_AXE, ToolsEnum.toolTITANIUM).setUnlocalizedName("axeTitanium").setCreativeTab(CivCraftBase.tabsTools);
	public static Item axeCarbide = new ItemAxeCC(ItemIDs.CARBIDE_AXE, ToolsEnum.toolCARBIDE).setUnlocalizedName("axeCarbide").setCreativeTab(CivCraftBase.tabsTools);
	public static Item axeDUranium = new ItemAxeCC(ItemIDs.DURANIUM_AXE, ToolsEnum.toolDURANIUM).setUnlocalizedName("axeDUranium").setCreativeTab(CivCraftBase.tabsTools);
	public static Item axeDCarbide = new ItemAxeCC(ItemIDs.DCARBIDE_AXE, ToolsEnum.toolDCARBIDE).setUnlocalizedName("axeDCarbide").setCreativeTab(CivCraftBase.tabsTools);

	// Hoes
	public static Item hoeAluminum = new ItemHoeCC(ItemIDs.ALUMINUM_HOE, ToolsEnum.toolALUMINUM).setUnlocalizedName("hoeAluminum").setCreativeTab(CivCraftBase.tabsTools);
	public static Item hoeCopper = new ItemHoeCC(ItemIDs.COPPER_HOE, ToolsEnum.toolCOPPER).setUnlocalizedName("hoeCopper").setCreativeTab(CivCraftBase.tabsTools);
	public static Item hoeBronze = new ItemHoeCC(ItemIDs.BRONZE_HOE, ToolsEnum.toolBRONZE).setUnlocalizedName("hoeBronze").setCreativeTab(CivCraftBase.tabsTools);
	public static Item hoeSteel = new ItemHoeCC(ItemIDs.STEEL_HOE, ToolsEnum.toolSTEEL).setUnlocalizedName("hoeSteel").setCreativeTab(CivCraftBase.tabsTools);
	public static Item hoeTitanium = new ItemHoeCC(ItemIDs.TITANIUM_HOE, ToolsEnum.toolTITANIUM).setUnlocalizedName("hoeTitanium").setCreativeTab(CivCraftBase.tabsTools);
	public static Item hoeCarbide = new ItemHoeCC(ItemIDs.CARBIDE_HOE, ToolsEnum.toolCARBIDE).setUnlocalizedName("hoeCarbide").setCreativeTab(CivCraftBase.tabsTools);
	public static Item hoeDUranium = new ItemHoeCC(ItemIDs.DURANIUM_HOE, ToolsEnum.toolDURANIUM).setUnlocalizedName("hoeDUranium").setCreativeTab(CivCraftBase.tabsTools);
	public static Item hoeDCarbide = new ItemHoeCC(ItemIDs.DCARBIDE_HOE, ToolsEnum.toolDCARBIDE).setUnlocalizedName("hoeDCarbide").setCreativeTab(CivCraftBase.tabsTools);

	// Shovels
	public static Item spadeAluminum = new ItemSpadeCC(ItemIDs.ALUMINUM_SPADE, ToolsEnum.toolALUMINUM).setUnlocalizedName("spadeAluminum").setCreativeTab(CivCraftBase.tabsTools);
	public static Item spadeCopper = new ItemSpadeCC(ItemIDs.COPPER_SPADE, ToolsEnum.toolCOPPER).setUnlocalizedName("spadeCopper").setCreativeTab(CivCraftBase.tabsTools);
	public static Item spadeBronze = new ItemSpadeCC(ItemIDs.BRONZE_SPADE, ToolsEnum.toolBRONZE).setUnlocalizedName("spadeBronze").setCreativeTab(CivCraftBase.tabsTools);
	public static Item spadeSteel = new ItemSpadeCC(ItemIDs.STEEL_SPADE, ToolsEnum.toolSTEEL).setUnlocalizedName("spadeSteel").setCreativeTab(CivCraftBase.tabsTools);
	public static Item spadeTitanium = new ItemSpadeCC(ItemIDs.TITANIUM_SPADE, ToolsEnum.toolTITANIUM).setUnlocalizedName("spadeTitanium").setCreativeTab(CivCraftBase.tabsTools);
	public static Item spadeCarbide = new ItemSpadeCC(ItemIDs.CARBIDE_SPADE, ToolsEnum.toolCARBIDE).setUnlocalizedName("spadeCarbide").setCreativeTab(CivCraftBase.tabsTools);
	public static Item spadeDUranium = new ItemSpadeCC(ItemIDs.DURANIUM_SPADE, ToolsEnum.toolDURANIUM).setUnlocalizedName("spadeDUranium").setCreativeTab(CivCraftBase.tabsTools);
	public static Item spadeDCarbide = new ItemSpadeCC(ItemIDs.DCARBIDE_SPADE, ToolsEnum.toolDCARBIDE).setUnlocalizedName("spadeDCarbide").setCreativeTab(CivCraftBase.tabsTools);

	// Picks
	public static Item pickaxeAluminum = new ItemPickaxeCC(ItemIDs.ALUMINUM_PICKAXE, ToolsEnum.toolALUMINUM).setUnlocalizedName("pickaxeAluminum").setCreativeTab(CivCraftBase.tabsTools);
	public static Item pickaxeCopper = new ItemPickaxeCC(ItemIDs.COPPER_PICKAXE, ToolsEnum.toolCOPPER).setUnlocalizedName("pickaxeCopper").setCreativeTab(CivCraftBase.tabsTools);
	public static Item pickaxeBronze = new ItemPickaxeCC(ItemIDs.BRONZE_PICKAXE, ToolsEnum.toolBRONZE).setUnlocalizedName("pickaxeBronze").setCreativeTab(CivCraftBase.tabsTools);
	public static Item pickaxeSteel = new ItemPickaxeCC(ItemIDs.STEEL_PICKAXE, ToolsEnum.toolSTEEL).setUnlocalizedName("pickaxeSteel").setCreativeTab(CivCraftBase.tabsTools);
	public static Item pickaxeTitanium = new ItemPickaxeCC(ItemIDs.TITANIUM_PICKAXE, ToolsEnum.toolTITANIUM).setUnlocalizedName("pickaxeTitanium").setCreativeTab(CivCraftBase.tabsTools);
	public static Item pickaxeCarbide = new ItemPickaxeCC(ItemIDs.CARBIDE_PICKAXE, ToolsEnum.toolCARBIDE).setUnlocalizedName("pickaxeCarbide").setCreativeTab(CivCraftBase.tabsTools);
	public static Item pickaxeDUranium = new ItemPickaxeCC(ItemIDs.DURANIUM_PICKAXE, ToolsEnum.toolDURANIUM).setUnlocalizedName("pickaxeDUranium").setCreativeTab(CivCraftBase.tabsTools);
	public static Item pickaxeDCarbide = new ItemPickaxeCC(ItemIDs.DCARBIDE_PICKAXE, ToolsEnum.toolDCARBIDE).setUnlocalizedName("pickaxeDCarbide").setCreativeTab(CivCraftBase.tabsTools);

	// Swords
	public static Item swordAluminum = new ItemSwordCC(ItemIDs.ALUMINUM_SWORD, ToolsEnum.toolALUMINUM).setUnlocalizedName("swordAluminum").setCreativeTab(CivCraftBase.tabsCombat);
	public static Item swordCopper = new ItemSwordCC(ItemIDs.COPPER_SWORD, ToolsEnum.toolCOPPER).setUnlocalizedName("swordCopper").setCreativeTab(CivCraftBase.tabsCombat);
	public static Item swordBronze = new ItemSwordCC(ItemIDs.BRONZE_SWORD, ToolsEnum.toolBRONZE).setUnlocalizedName("swordBronze").setCreativeTab(CivCraftBase.tabsCombat);
	public static Item swordSteel = new ItemSwordCC(ItemIDs.STEEL_SWORD, ToolsEnum.toolSTEEL).setUnlocalizedName("swordSteel").setCreativeTab(CivCraftBase.tabsCombat);
	public static Item swordTitanium = new ItemSwordCC(ItemIDs.TITANIUM_SWORD, ToolsEnum.toolTITANIUM).setUnlocalizedName("swordTitanium").setCreativeTab(CivCraftBase.tabsCombat);
	public static Item swordCarbide = new ItemSwordCC(ItemIDs.CARBIDE_SWORD, ToolsEnum.toolCARBIDE).setUnlocalizedName("swordCarbide").setCreativeTab(CivCraftBase.tabsCombat);
	public static Item swordDUranium = new ItemSwordCC(ItemIDs.DURANIUM_SWORD, ToolsEnum.toolDURANIUM).setUnlocalizedName("swordDUranium").setCreativeTab(CivCraftBase.tabsCombat);
	public static Item swordDCarbide = new ItemSwordCC(ItemIDs.DCARBIDE_SWORD, ToolsEnum.toolDCARBIDE).setUnlocalizedName("swordDCarbide").setCreativeTab(CivCraftBase.tabsCombat);

	public static void init() {

		// Hammers
		LanguageRegistry.addName(hammerStone, "Stone Hammer");
		LanguageRegistry.addName(hammerIron, "Iron Hammer");
		LanguageRegistry.addName(hammerSteel, "Steel Hammer");
		LanguageRegistry.addName(hammerCarbide, "Carbide Hammer");

		// Axes
		LanguageRegistry.addName(axeAluminum, "Aluminum Axe");
		LanguageRegistry.addName(axeCopper, "Copper Axe");
		LanguageRegistry.addName(axeSteel, "Steel Axe");
		LanguageRegistry.addName(axeBronze, "Bronze Axe");
		LanguageRegistry.addName(axeTitanium, "Titanium Axe");
		LanguageRegistry.addName(axeCarbide, "Carbide Axe");
		LanguageRegistry.addName(axeDUranium, "Depleted Uranium Axe");
		LanguageRegistry.addName(axeDCarbide, "Diamond-Carbide Axe");

		// Hoes
		LanguageRegistry.addName(hoeAluminum, "Aluminum Hoe");
		LanguageRegistry.addName(hoeCopper, "Copper Hoe");
		LanguageRegistry.addName(hoeSteel, "Steel Hoe");
		LanguageRegistry.addName(hoeBronze, "Bronze Hoe");
		LanguageRegistry.addName(hoeTitanium, "Titanium Hoe");
		LanguageRegistry.addName(hoeCarbide, "Carbide Hoe");
		LanguageRegistry.addName(hoeDUranium, "Depleted Uranium Hoe");
		LanguageRegistry.addName(hoeDCarbide, "Diamond-Carbide Hoe");

		// Shovels
		LanguageRegistry.addName(spadeAluminum, "Aluminum Shovel");
		LanguageRegistry.addName(spadeCopper, "Copper Shovel");
		LanguageRegistry.addName(spadeSteel, "Steel Shovel");
		LanguageRegistry.addName(spadeBronze, "Bronze Shovel");
		LanguageRegistry.addName(spadeTitanium, "Titanium Shovel");
		LanguageRegistry.addName(spadeCarbide, "Carbide Shovel");
		LanguageRegistry.addName(spadeDUranium, "Depleted Uranium Spade");
		LanguageRegistry.addName(spadeDCarbide, "Diamond-Carbide Spade");

		// Picks
		LanguageRegistry.addName(pickaxeAluminum, "Aluminum Pickaxe");
		LanguageRegistry.addName(pickaxeCopper, "Copper Pickaxe");
		LanguageRegistry.addName(pickaxeSteel, "Steel Pickaxe");
		LanguageRegistry.addName(pickaxeBronze, "Bronze Pickaxe");
		LanguageRegistry.addName(pickaxeTitanium, "Titanium Pickaxe");
		LanguageRegistry.addName(pickaxeCarbide, "Carbide Pickaxe");
		LanguageRegistry.addName(pickaxeDUranium, "Depleted Uranium Pickaxe");
		LanguageRegistry.addName(pickaxeDCarbide, "Diamond-Carbide Pickaxe");

		// Swords
		LanguageRegistry.addName(swordAluminum, "Aluminum Sword");
		LanguageRegistry.addName(swordCopper, "Copper Sword");
		LanguageRegistry.addName(swordSteel, "Steel Sword");
		LanguageRegistry.addName(swordBronze, "Bronze Sword");
		LanguageRegistry.addName(swordTitanium, "Titanium Sword");
		LanguageRegistry.addName(swordCarbide, "Carbide Sword");
		LanguageRegistry.addName(swordDUranium, "Depleted Uranium Sword");
		LanguageRegistry.addName(swordDCarbide, "Diamond-Carbide Sword");

		// Axes
		MinecraftForge.setToolClass(axeAluminum, "axe", 1);
		MinecraftForge.setToolClass(axeCopper, "axe", 1);
		MinecraftForge.setToolClass(axeBronze, "axe", 2);
		MinecraftForge.setToolClass(axeSteel, "axe", 2);
		MinecraftForge.setToolClass(axeTitanium, "axe", 3);
		MinecraftForge.setToolClass(axeCarbide, "axe", 3);
		MinecraftForge.setToolClass(axeDUranium, "axe", 3);
		MinecraftForge.setToolClass(axeDCarbide, "axe", 3);

		// Spades
		MinecraftForge.setToolClass(spadeAluminum, "shovel", 1);
		MinecraftForge.setToolClass(spadeCopper, "shovel", 1);
		MinecraftForge.setToolClass(spadeBronze, "shovel", 2);
		MinecraftForge.setToolClass(spadeSteel, "shovel", 2);
		MinecraftForge.setToolClass(spadeTitanium, "shovel", 3);
		MinecraftForge.setToolClass(spadeCarbide, "shovel", 3);
		MinecraftForge.setToolClass(spadeDUranium, "shovel", 3);
		MinecraftForge.setToolClass(spadeDCarbide, "shovel", 3);

		// Picks
		MinecraftForge.setToolClass(pickaxeAluminum, "pickaxe", 1);
		MinecraftForge.setToolClass(pickaxeCopper, "pickaxe", 1);
		MinecraftForge.setToolClass(pickaxeBronze, "pickaxe", 2);
		MinecraftForge.setToolClass(pickaxeSteel, "pickaxe", 2);
		MinecraftForge.setToolClass(pickaxeTitanium, "pickaxe", 3);
		MinecraftForge.setToolClass(pickaxeCarbide, "pickaxe", 3);
		MinecraftForge.setToolClass(pickaxeDUranium, "pickaxe", 3);
		MinecraftForge.setToolClass(pickaxeDCarbide, "pickaxe", 3);
	}
}
