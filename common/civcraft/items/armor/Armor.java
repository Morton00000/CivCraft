package civcraft.items.armor;

import net.minecraft.item.Item;
import civcraft.enums.ArmorEnum;
import civcraft.lib.ItemIDs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Armor {

	// Heads
	public static Item headAluminium = new ItemArmorCC(ItemIDs.ALUMINIUM_HEAD, ArmorEnum.armorALUMINIUM, 0, 0).setUnlocalizedName("headAluminium");
	public static Item headCopper = new ItemArmorCC(ItemIDs.COPPER_HEAD, ArmorEnum.armorCOPPER, 0, 0).setUnlocalizedName("headCopper");
	public static Item headBronze = new ItemArmorCC(ItemIDs.BRONZE_HEAD, ArmorEnum.armorBRONZE, 0, 0).setUnlocalizedName("headBronze");
	public static Item headCarbide = new ItemArmorCC(ItemIDs.CARBIDE_HEAD, ArmorEnum.armorCARBIDE, 0, 0).setUnlocalizedName("headCarbide");
	public static Item headSteel = new ItemArmorCC(ItemIDs.STEEL_HEAD, ArmorEnum.armorSTEEL, 0, 0).setUnlocalizedName("headSteel");
	public static Item headTitanium = new ItemArmorCC(ItemIDs.TITANIUM_HEAD, ArmorEnum.armorTITANIUM, 0, 0).setUnlocalizedName("headTitanium");
	public static Item headDUranium = new ItemArmorCC(ItemIDs.DURANIUM_HEAD, ArmorEnum.armorDURANIUM, 0, 0).setUnlocalizedName("headDUranium");
	public static Item headKevlar = new ItemArmorCC(ItemIDs.KEVLAR_HEAD, ArmorEnum.armorKEVLAR, 0, 0).setUnlocalizedName("headKevlar");

	// Chests
	public static Item chestAluminium = new ItemArmorCC(ItemIDs.ALUMINIUM_CHEST, ArmorEnum.armorALUMINIUM, 0, 1).setUnlocalizedName("chestAluminium");
	public static Item chestCopper = new ItemArmorCC(ItemIDs.COPPER_CHEST, ArmorEnum.armorCOPPER, 0, 1).setUnlocalizedName("chestCopper");
	public static Item chestBronze = new ItemArmorCC(ItemIDs.BRONZE_CHEST, ArmorEnum.armorBRONZE, 0, 1).setUnlocalizedName("chestBronze");
	public static Item chestCarbide = new ItemArmorCC(ItemIDs.CARBIDE_CHEST, ArmorEnum.armorCARBIDE, 0, 1).setUnlocalizedName("chestCarbide");
	public static Item chestSteel = new ItemArmorCC(ItemIDs.STEEL_CHEST, ArmorEnum.armorSTEEL, 0, 1).setUnlocalizedName("chestSteel");
	public static Item chestTitanium = new ItemArmorCC(ItemIDs.TITANIUM_CHEST, ArmorEnum.armorTITANIUM, 0, 1).setUnlocalizedName("chestTitanium");
	public static Item chestDUranium = new ItemArmorCC(ItemIDs.DURANIUM_CHEST, ArmorEnum.armorDURANIUM, 0, 1).setUnlocalizedName("chestDUranium");
	public static Item chestKevlar = new ItemArmorCC(ItemIDs.KEVLAR_CHEST, ArmorEnum.armorKEVLAR, 0, 1).setUnlocalizedName("chestKevlar");

	// Legs
	public static Item legsAluminium = new ItemArmorCC(ItemIDs.ALUMINIUM_LEGS, ArmorEnum.armorALUMINIUM, 0, 2).setUnlocalizedName("legsAluminium");
	public static Item legsCopper = new ItemArmorCC(ItemIDs.COPPER_LEGS, ArmorEnum.armorCOPPER, 0, 2).setUnlocalizedName("legsCopper");
	public static Item legsBronze = new ItemArmorCC(ItemIDs.BRONZE_LEGS, ArmorEnum.armorBRONZE, 0, 2).setUnlocalizedName("legsBronze");
	public static Item legsCarbide = new ItemArmorCC(ItemIDs.CARBIDE_LEGS, ArmorEnum.armorCARBIDE, 0, 2).setUnlocalizedName("legsCarbide");
	public static Item legsSteel = new ItemArmorCC(ItemIDs.STEEL_LEGS, ArmorEnum.armorSTEEL, 0, 2).setUnlocalizedName("legsSteel");
	public static Item legsTitanium = new ItemArmorCC(ItemIDs.TITANIUM_LEGS, ArmorEnum.armorTITANIUM, 0, 2).setUnlocalizedName("legsTitanium");
	public static Item legsDUranium = new ItemArmorCC(ItemIDs.DURANIUM_LEGS, ArmorEnum.armorDURANIUM, 0, 2).setUnlocalizedName("legsDUranium");
	public static Item legsKevlar = new ItemArmorCC(ItemIDs.KEVLAR_LEGS, ArmorEnum.armorKEVLAR, 0, 2).setUnlocalizedName("legsKevlar");

	// Boots
	public static Item bootsAluminium = new ItemArmorCC(ItemIDs.ALUMINIUM_FEET, ArmorEnum.armorALUMINIUM, 0, 3).setUnlocalizedName("bootsAluminium");
	public static Item bootsCopper = new ItemArmorCC(ItemIDs.COPPER_FEET, ArmorEnum.armorCOPPER, 0, 3).setUnlocalizedName("bootsCopper");
	public static Item bootsBronze = new ItemArmorCC(ItemIDs.BRONZE_FEET, ArmorEnum.armorBRONZE, 0, 3).setUnlocalizedName("bootsBronze");
	public static Item bootsCarbide = new ItemArmorCC(ItemIDs.CARBIDE_FEET, ArmorEnum.armorCARBIDE, 0, 3).setUnlocalizedName("bootsCarbide");
	public static Item bootsSteel = new ItemArmorCC(ItemIDs.STEEL_FEET, ArmorEnum.armorSTEEL, 0, 3).setUnlocalizedName("bootsSteel");
	public static Item bootsTitanium = new ItemArmorCC(ItemIDs.TITANIUM_FEET, ArmorEnum.armorTITANIUM, 0, 3).setUnlocalizedName("bootsTitanium");
	public static Item bootsDUranium = new ItemArmorCC(ItemIDs.DURANIUM_FEET, ArmorEnum.armorDURANIUM, 0, 3).setUnlocalizedName("bootsDUranium");
	public static Item bootsKevlar = new ItemArmorCC(ItemIDs.KEVLAR_FEET, ArmorEnum.armorKEVLAR, 0, 3).setUnlocalizedName("bootsKevlar");

	public static void init() {

		// Heads
		LanguageRegistry.addName(headAluminium, "Aluminium Helmet");
		LanguageRegistry.addName(headCopper, "Copper Helmet");
		LanguageRegistry.addName(headBronze, "Bronze Helmet");
		LanguageRegistry.addName(headSteel, "Steel Helmet");
		LanguageRegistry.addName(headCarbide, "Carbide Helmet");
		LanguageRegistry.addName(headDUranium, "Depleted Uranium Helmet");
		LanguageRegistry.addName(headTitanium, "Titanium Helmet");
		LanguageRegistry.addName(headKevlar, "Kevlar Helmet");

		// Chests
		LanguageRegistry.addName(chestAluminium, "Aluminium Chestplate");
		LanguageRegistry.addName(chestCopper, "Copper Chestplate");
		LanguageRegistry.addName(chestBronze, "Bronze Chestplate");
		LanguageRegistry.addName(chestSteel, "Steel Chestplate");
		LanguageRegistry.addName(chestCarbide, "Carbide Chestplate");
		LanguageRegistry.addName(chestDUranium, "Depeted Uranium Chestplate");
		LanguageRegistry.addName(chestTitanium, "Titanium Chestplate");
		LanguageRegistry.addName(chestKevlar, "Kevlar Chestplate");

		// Legs
		LanguageRegistry.addName(legsAluminium, "Aluminium Greeves");
		LanguageRegistry.addName(legsCopper, "Copper Greeves");
		LanguageRegistry.addName(legsBronze, "Bronze Greeves");
		LanguageRegistry.addName(legsSteel, "Steel Greeves");
		LanguageRegistry.addName(legsCarbide, "Carbide Greeves");
		LanguageRegistry.addName(legsDUranium, "Depleted Uranium Greeves");
		LanguageRegistry.addName(legsTitanium, "Titanium Greeves");
		LanguageRegistry.addName(legsKevlar, "Kevlar Greeves");

		// Feet
		LanguageRegistry.addName(bootsAluminium, "Aluminium Boots");
		LanguageRegistry.addName(bootsCopper, "Copper Boots");
		LanguageRegistry.addName(bootsBronze, "Bronze Boots");
		LanguageRegistry.addName(bootsSteel, "Steel Boots");
		LanguageRegistry.addName(bootsCarbide, "Carbide Boots");
		LanguageRegistry.addName(bootsDUranium, "Depleted Uranium Boots");
		LanguageRegistry.addName(bootsTitanium, "Titanium Boots");
		LanguageRegistry.addName(bootsKevlar, "Kevlar Boots");

	}
}
