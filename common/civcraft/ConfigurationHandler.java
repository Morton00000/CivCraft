package civcraft;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import civcraft.lib.BlockIDs;
import civcraft.lib.ItemIDs;
import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {

	public static Configuration configuration;

	public static void init(File configFile) {

		configuration = new Configuration(configFile);

		try {
			configuration.load();

			/* Block configs */
			BlockIDs.ORE = configuration.getBlock("ores", BlockIDs.DEFAULT_ORE).getInt(BlockIDs.DEFAULT_ORE);
			BlockIDs.ORE_SALTPETER = configuration.getBlock("oreSaltpeter", BlockIDs.DEFAULT_ORE_SALTPETER).getInt(BlockIDs.DEFAULT_ORE_SALTPETER);
			BlockIDs.ORE_SULFUR = configuration.getBlock("oreSulfur", BlockIDs.DEFAULT_ORE_SULFUR).getInt(BlockIDs.DEFAULT_ORE_SULFUR);
			BlockIDs.ORE_GRAPHITE = configuration.getBlock("oreGraphite", BlockIDs.DEFAULT_ORE_GRAPHITE).getInt(BlockIDs.DEFAULT_ORE_GRAPHITE);

			BlockIDs.BLOCK = configuration.getBlock("blocks", BlockIDs.DEFAULT_BLOCK).getInt(BlockIDs.DEFAULT_BLOCK);
			BlockIDs.BLOCK_PLASTIC = configuration.getBlock("blockPlastic", BlockIDs.DEFAULT_BLOCK_PLASTIC).getInt(BlockIDs.DEFAULT_BLOCK_PLASTIC);
			BlockIDs.BLOCK_GRAPHITE = configuration.getBlock("blockGraphite", BlockIDs.DEFAULT_BLOCK_GRAPHITE).getInt(BlockIDs.DEFAULT_BLOCK_GRAPHITE);

			// Other
			BlockIDs.COMPUTER_OFF = configuration.getBlock("computer-Off", BlockIDs.DEFAULT_COMPUTER_OFF).getInt(BlockIDs.DEFAULT_COMPUTER_OFF);
			BlockIDs.COMPUTER_ON = configuration.getBlock("computer-On", BlockIDs.DEFAULT_COMPUTER_ON).getInt(BlockIDs.DEFAULT_COMPUTER_ON);
			BlockIDs.LIGHT_OFF = configuration.getBlock("light-Off", BlockIDs.DEFAULT_LIGHT_OFF).getInt(BlockIDs.DEFAULT_LIGHT_OFF);
			BlockIDs.LIGHT_ON = configuration.getBlock("light-On", BlockIDs.DEFAULT_LIGHT_ON).getInt(BlockIDs.DEFAULT_LIGHT_ON);

			// Machines
			BlockIDs.FURNACE_BLAST_OFF = configuration.getBlock("furnaceBlast-Off", BlockIDs.DEFAULT_FURNACE_BLAST_OFF).getInt(BlockIDs.DEFAULT_FURNACE_BLAST_OFF);
			BlockIDs.FURNACE_BLAST_ON = configuration.getBlock("furnaceBlast-On", BlockIDs.DEFAULT_FURNACE_BLAST_ON).getInt(BlockIDs.DEFAULT_FURNACE_BLAST_ON);
			BlockIDs.FURNACE_IND_OFF = configuration.getBlock("furnaceInd-Off", BlockIDs.DEFAULT_FURNACE_IND_OFF).getInt(BlockIDs.DEFAULT_FURNACE_IND_OFF);
			BlockIDs.FURNACE_IND_ON = configuration.getBlock("furnaceInd-On", BlockIDs.DEFAULT_FURNACE_IND_ON).getInt(BlockIDs.DEFAULT_FURNACE_IND_ON);
			BlockIDs.FURNACE_MOLD_OFF = configuration.getBlock("furnaceMold-Off", BlockIDs.DEFAULT_FURNACE_MOLD_OFF).getInt(BlockIDs.DEFAULT_FURNACE_MOLD_OFF);
			BlockIDs.FURNACE_MOLD_ON = configuration.getBlock("furnaceMold-On", BlockIDs.DEFAULT_FURNACE_MOLD_ON).getInt(BlockIDs.DEFAULT_FURNACE_MOLD_ON);

			BlockIDs.PLASTIC_OVEN_OFF = configuration.getBlock("easyBake-Off", BlockIDs.DEFAULT_PLASTIC_OVEN_OFF).getInt(BlockIDs.DEFAULT_PLASTIC_OVEN_OFF);
			BlockIDs.PLASTIC_OVEN_ON = configuration.getBlock("easyBake-On", BlockIDs.DEFAULT_PLASTIC_OVEN_ON).getInt(BlockIDs.DEFAULT_PLASTIC_OVEN_ON);

			BlockIDs.CRUSHER_1_OFF = configuration.getBlock("crusher1-Off", BlockIDs.DEFAULT_CRUSHER_1_OFF).getInt(BlockIDs.DEFAULT_CRUSHER_1_OFF);
			BlockIDs.CRUSHER_1_ON = configuration.getBlock("crusher1-On", BlockIDs.DEFAULT_CRUSHER_1_ON).getInt(BlockIDs.DEFAULT_CRUSHER_1_ON);
			BlockIDs.CRUSHER_2_OFF = configuration.getBlock("crusher2-Off", BlockIDs.DEFAULT_CRUSHER_2_OFF).getInt(BlockIDs.DEFAULT_CRUSHER_2_OFF);
			BlockIDs.CRUSHER_2_ON = configuration.getBlock("crusher2-On", BlockIDs.DEFAULT_CRUSHER_2_ON).getInt(BlockIDs.DEFAULT_CRUSHER_2_ON);

			/* Item configs */
			ItemIDs.DUST = configuration.getItem("dusts", ItemIDs.DEFAULT_DUST).getInt(ItemIDs.DEFAULT_DUST);
			ItemIDs.DUST_SALTPETER = configuration.getItem("dustSaltpeter", ItemIDs.DEFAULT_DUST_SALTPETER).getInt(ItemIDs.DEFAULT_DUST_SALTPETER);
			ItemIDs.DUST_SULFUR = configuration.getItem("dustSulfur", ItemIDs.DEFAULT_DUST_SULFUR).getInt(ItemIDs.DEFAULT_DUST_SULFUR);
			ItemIDs.DUST_REDSILVER = configuration.getItem("dustRedSilver", ItemIDs.DEFAULT_DUST_REDSILVER).getInt(ItemIDs.DEFAULT_DUST_REDSILVER);
			ItemIDs.DUST_GRAPHITE = configuration.getItem("dustGraphite", ItemIDs.DEFAULT_DUST_GRAPHITE).getInt(ItemIDs.DEFAULT_DUST_GRAPHITE);

			ItemIDs.INGOT = configuration.getItem("ingots", ItemIDs.DEFAULT_INGOT).getInt(ItemIDs.DEFAULT_INGOT);
			ItemIDs.INGOT_REDSILVER = configuration.getItem("ingotRedSilver", ItemIDs.DEFAULT_INGOT_REDSILVER).getInt(ItemIDs.DEFAULT_INGOT_REDSILVER);

			ItemIDs.PLASTIC = configuration.getItem("plastic", ItemIDs.DEFAULT_PLASTIC).getInt(ItemIDs.DEFAULT_PLASTIC);
			ItemIDs.PLASTIC_GLOB = configuration.getItem("plasticGlob", ItemIDs.DEFAULT_PLASTIC_GLOB).getInt(ItemIDs.DEFAULT_PLASTIC_GLOB);

			// Misc
			ItemIDs.MISC = configuration.getItem("misc_items", ItemIDs.DEFAULT_MISC).getInt(ItemIDs.DEFAULT_MISC);
			ItemIDs.BUCKET_EMPTY = configuration.getItem("bucket", ItemIDs.DEFAULT_BUCKET_EMPTY).getInt(ItemIDs.DEFAULT_BUCKET_EMPTY);
			ItemIDs.BUCKET_WATER = configuration.getItem("bucket-water", ItemIDs.DEFAULT_BUCKET_WATER).getInt(ItemIDs.DEFAULT_BUCKET_WATER);
			ItemIDs.BUCKET_MILK = configuration.getItem("bucket-milk", ItemIDs.DEFAULT_BUCKET_MILK).getInt(ItemIDs.DEFAULT_BUCKET_MILK);

			// Tools
			ItemIDs.STONE_HAMMER = configuration.getItem("hammerStone", ItemIDs.DEFAULT_STONE_HAMMER).getInt(ItemIDs.DEFAULT_STONE_HAMMER);
			ItemIDs.IRON_HAMMER = configuration.getItem("hammerIron", ItemIDs.DEFAULT_IRON_HAMMER).getInt(ItemIDs.DEFAULT_IRON_HAMMER);
			ItemIDs.STEEL_HAMMER = configuration.getItem("hammerSteel", ItemIDs.DEFAULT_STEEL_HAMMER).getInt(ItemIDs.DEFAULT_STEEL_HAMMER);
			ItemIDs.CARBIDE_HAMMER = configuration.getItem("hammerCarbide", ItemIDs.DEFAULT_CARBIDE_HAMMER).getInt(ItemIDs.DEFAULT_CARBIDE_HAMMER);

			ItemIDs.ALUMINUM_AXE = configuration.getItem("axeAluminum", ItemIDs.DEFAULT_ALUMINUM_AXE).getInt(ItemIDs.DEFAULT_ALUMINUM_AXE);
			ItemIDs.ALUMINUM_HOE = configuration.getItem("hoeAluminum", ItemIDs.DEFAULT_ALUMINUM_HOE).getInt(ItemIDs.DEFAULT_ALUMINUM_HOE);
			ItemIDs.ALUMINUM_SPADE = configuration.getItem("spadeAluminum", ItemIDs.DEFAULT_ALUMINUM_SPADE).getInt(ItemIDs.DEFAULT_ALUMINUM_SPADE);
			ItemIDs.ALUMINUM_PICKAXE = configuration.getItem("pickaxeAluminum", ItemIDs.DEFAULT_ALUMINUM_PICKAXE).getInt(ItemIDs.DEFAULT_ALUMINUM_PICKAXE);
			ItemIDs.ALUMINUM_SWORD = configuration.getItem("swordAluminum", ItemIDs.DEFAULT_ALUMINUM_SWORD).getInt(ItemIDs.DEFAULT_ALUMINUM_SWORD);

			ItemIDs.COPPER_AXE = configuration.getItem("axeCopper", ItemIDs.DEFAULT_COPPER_AXE).getInt(ItemIDs.DEFAULT_COPPER_AXE);
			ItemIDs.COPPER_HOE = configuration.getItem("hoeCopper", ItemIDs.DEFAULT_COPPER_HOE).getInt(ItemIDs.DEFAULT_COPPER_HOE);
			ItemIDs.COPPER_SPADE = configuration.getItem("spadeCopper", ItemIDs.DEFAULT_COPPER_SPADE).getInt(ItemIDs.DEFAULT_COPPER_SPADE);
			ItemIDs.COPPER_PICKAXE = configuration.getItem("pickaxeCopper", ItemIDs.DEFAULT_COPPER_PICKAXE).getInt(ItemIDs.DEFAULT_COPPER_PICKAXE);
			ItemIDs.COPPER_SWORD = configuration.getItem("swordCopper", ItemIDs.DEFAULT_COPPER_SWORD).getInt(ItemIDs.DEFAULT_COPPER_SWORD);

			ItemIDs.BRONZE_AXE = configuration.getItem("axeBronze", ItemIDs.DEFAULT_BRONZE_AXE).getInt(ItemIDs.DEFAULT_BRONZE_AXE);
			ItemIDs.BRONZE_HOE = configuration.getItem("hoeBronze", ItemIDs.DEFAULT_BRONZE_HOE).getInt(ItemIDs.DEFAULT_BRONZE_HOE);
			ItemIDs.BRONZE_SPADE = configuration.getItem("spadeBronze", ItemIDs.DEFAULT_BRONZE_SPADE).getInt(ItemIDs.DEFAULT_BRONZE_SPADE);
			ItemIDs.BRONZE_PICKAXE = configuration.getItem("pickaxeBronze", ItemIDs.DEFAULT_BRONZE_PICKAXE).getInt(ItemIDs.DEFAULT_BRONZE_PICKAXE);
			ItemIDs.BRONZE_SWORD = configuration.getItem("swordBronze", ItemIDs.DEFAULT_BRONZE_SWORD).getInt(ItemIDs.DEFAULT_BRONZE_SWORD);

			ItemIDs.STEEL_AXE = configuration.getItem("axeSteel", ItemIDs.DEFAULT_STEEL_AXE).getInt(ItemIDs.DEFAULT_STEEL_AXE);
			ItemIDs.STEEL_HOE = configuration.getItem("hoeSteel", ItemIDs.DEFAULT_STEEL_HOE).getInt(ItemIDs.DEFAULT_STEEL_HOE);
			ItemIDs.STEEL_SPADE = configuration.getItem("spadeSteel", ItemIDs.DEFAULT_STEEL_SPADE).getInt(ItemIDs.DEFAULT_STEEL_SPADE);
			ItemIDs.STEEL_PICKAXE = configuration.getItem("pickaxeSteel", ItemIDs.DEFAULT_STEEL_PICKAXE).getInt(ItemIDs.DEFAULT_STEEL_PICKAXE);
			ItemIDs.STEEL_SWORD = configuration.getItem("swordSteel", ItemIDs.DEFAULT_STEEL_SWORD).getInt(ItemIDs.DEFAULT_STEEL_SWORD);

			ItemIDs.TITANIUM_AXE = configuration.getItem("axeTitanium", ItemIDs.DEFAULT_TITANIUM_AXE).getInt(ItemIDs.DEFAULT_TITANIUM_AXE);
			ItemIDs.TITANIUM_HOE = configuration.getItem("hoeTitanium", ItemIDs.DEFAULT_TITANIUM_HOE).getInt(ItemIDs.DEFAULT_TITANIUM_HOE);
			ItemIDs.TITANIUM_SPADE = configuration.getItem("spadeTitanium", ItemIDs.DEFAULT_TITANIUM_SPADE).getInt(ItemIDs.DEFAULT_TITANIUM_SPADE);
			ItemIDs.TITANIUM_PICKAXE = configuration.getItem("pickaxeTitanium", ItemIDs.DEFAULT_TITANIUM_PICKAXE).getInt(ItemIDs.DEFAULT_TITANIUM_PICKAXE);
			ItemIDs.TITANIUM_SWORD = configuration.getItem("swordTitanium", ItemIDs.DEFAULT_TITANIUM_SWORD).getInt(ItemIDs.DEFAULT_TITANIUM_SWORD);

			ItemIDs.CARBIDE_AXE = configuration.getItem("axeCarbide", ItemIDs.DEFAULT_CARBIDE_AXE).getInt(ItemIDs.DEFAULT_CARBIDE_AXE);
			ItemIDs.CARBIDE_HOE = configuration.getItem("hoeCarbide", ItemIDs.DEFAULT_CARBIDE_HOE).getInt(ItemIDs.DEFAULT_CARBIDE_HOE);
			ItemIDs.CARBIDE_SPADE = configuration.getItem("spadeCarbide", ItemIDs.DEFAULT_CARBIDE_SPADE).getInt(ItemIDs.DEFAULT_CARBIDE_SPADE);
			ItemIDs.CARBIDE_PICKAXE = configuration.getItem("pickaxeCarbide", ItemIDs.DEFAULT_CARBIDE_PICKAXE).getInt(ItemIDs.DEFAULT_CARBIDE_PICKAXE);
			ItemIDs.CARBIDE_SWORD = configuration.getItem("swordCarbide", ItemIDs.DEFAULT_CARBIDE_SWORD).getInt(ItemIDs.DEFAULT_CARBIDE_SWORD);

			ItemIDs.DURANIUM_AXE = configuration.getItem("axeDUranium", ItemIDs.DEFAULT_DURANIUM_AXE).getInt(ItemIDs.DEFAULT_DURANIUM_AXE);
			ItemIDs.DURANIUM_HOE = configuration.getItem("hoeDUranium", ItemIDs.DEFAULT_DURANIUM_HOE).getInt(ItemIDs.DEFAULT_DURANIUM_HOE);
			ItemIDs.DURANIUM_SPADE = configuration.getItem("spadeDUranium", ItemIDs.DEFAULT_DURANIUM_SPADE).getInt(ItemIDs.DEFAULT_DURANIUM_SPADE);
			ItemIDs.DURANIUM_PICKAXE = configuration.getItem("pickaxeDUranium", ItemIDs.DEFAULT_DURANIUM_PICKAXE).getInt(ItemIDs.DEFAULT_DURANIUM_PICKAXE);
			ItemIDs.DURANIUM_SWORD = configuration.getItem("swordDUranium", ItemIDs.DEFAULT_DURANIUM_SWORD).getInt(ItemIDs.DEFAULT_DURANIUM_SWORD);

			ItemIDs.DCARBIDE_AXE = configuration.getItem("axeDCarbide", ItemIDs.DEFAULT_DCARBIDE_AXE).getInt(ItemIDs.DEFAULT_DCARBIDE_AXE);
			ItemIDs.DCARBIDE_HOE = configuration.getItem("hoeDCarbide", ItemIDs.DEFAULT_DCARBIDE_HOE).getInt(ItemIDs.DEFAULT_DCARBIDE_HOE);
			ItemIDs.DCARBIDE_SPADE = configuration.getItem("spadeDCarbide", ItemIDs.DEFAULT_DCARBIDE_SPADE).getInt(ItemIDs.DEFAULT_DCARBIDE_SPADE);
			ItemIDs.DCARBIDE_PICKAXE = configuration.getItem("pickaxeDCarbide", ItemIDs.DEFAULT_DCARBIDE_PICKAXE).getInt(ItemIDs.DEFAULT_DCARBIDE_PICKAXE);
			ItemIDs.DCARBIDE_SWORD = configuration.getItem("swordDCarbide", ItemIDs.DEFAULT_DCARBIDE_SWORD).getInt(ItemIDs.DEFAULT_DCARBIDE_SWORD);

			// Armor
			ItemIDs.COPPER_HEAD = configuration.getItem("headCopper", ItemIDs.DEFAULT_COPPER_HEAD).getInt(ItemIDs.DEFAULT_COPPER_HEAD);
			ItemIDs.COPPER_CHEST = configuration.getItem("chestCopper", ItemIDs.DEFAULT_COPPER_CHEST).getInt(ItemIDs.DEFAULT_COPPER_CHEST);
			ItemIDs.COPPER_LEGS = configuration.getItem("legsCopper", ItemIDs.DEFAULT_COPPER_LEGS).getInt(ItemIDs.DEFAULT_COPPER_LEGS);
			ItemIDs.COPPER_FEET = configuration.getItem("feetCopper", ItemIDs.DEFAULT_COPPER_FEET).getInt(ItemIDs.DEFAULT_COPPER_FEET);

			ItemIDs.BRONZE_HEAD = configuration.getItem("headBronze", ItemIDs.DEFAULT_BRONZE_HEAD).getInt(ItemIDs.DEFAULT_BRONZE_HEAD);
			ItemIDs.BRONZE_CHEST = configuration.getItem("chestBronze", ItemIDs.DEFAULT_BRONZE_CHEST).getInt(ItemIDs.DEFAULT_BRONZE_CHEST);
			ItemIDs.BRONZE_LEGS = configuration.getItem("legsBronze", ItemIDs.DEFAULT_BRONZE_LEGS).getInt(ItemIDs.DEFAULT_BRONZE_LEGS);
			ItemIDs.BRONZE_FEET = configuration.getItem("feetBronze", ItemIDs.DEFAULT_BRONZE_FEET).getInt(ItemIDs.DEFAULT_BRONZE_FEET);

			ItemIDs.STEEL_HEAD = configuration.getItem("headSteel", ItemIDs.DEFAULT_STEEL_HEAD).getInt(ItemIDs.DEFAULT_STEEL_HEAD);
			ItemIDs.STEEL_CHEST = configuration.getItem("chestSteel", ItemIDs.DEFAULT_STEEL_CHEST).getInt(ItemIDs.DEFAULT_STEEL_CHEST);
			ItemIDs.STEEL_LEGS = configuration.getItem("legsSteel", ItemIDs.DEFAULT_STEEL_LEGS).getInt(ItemIDs.DEFAULT_STEEL_LEGS);
			ItemIDs.STEEL_FEET = configuration.getItem("feetSteel", ItemIDs.DEFAULT_STEEL_FEET).getInt(ItemIDs.DEFAULT_STEEL_FEET);

			ItemIDs.TITANIUM_HEAD = configuration.getItem("headTitainum", ItemIDs.DEFAULT_TITANIUM_HEAD).getInt(ItemIDs.DEFAULT_TITANIUM_HEAD);
			ItemIDs.TITANIUM_CHEST = configuration.getItem("chestTitainum", ItemIDs.DEFAULT_TITANIUM_CHEST).getInt(ItemIDs.DEFAULT_TITANIUM_CHEST);
			ItemIDs.TITANIUM_LEGS = configuration.getItem("legsTitainum", ItemIDs.DEFAULT_TITANIUM_LEGS).getInt(ItemIDs.DEFAULT_TITANIUM_LEGS);
			ItemIDs.TITANIUM_FEET = configuration.getItem("feetTitainum", ItemIDs.DEFAULT_TITANIUM_FEET).getInt(ItemIDs.DEFAULT_TITANIUM_FEET);

			ItemIDs.CARBIDE_HEAD = configuration.getItem("headCarbide", ItemIDs.DEFAULT_CARBIDE_HEAD).getInt(ItemIDs.DEFAULT_CARBIDE_HEAD);
			ItemIDs.CARBIDE_CHEST = configuration.getItem("chestCarbide", ItemIDs.DEFAULT_CARBIDE_CHEST).getInt(ItemIDs.DEFAULT_CARBIDE_CHEST);
			ItemIDs.CARBIDE_LEGS = configuration.getItem("legsCarbide", ItemIDs.DEFAULT_CARBIDE_LEGS).getInt(ItemIDs.DEFAULT_CARBIDE_LEGS);
			ItemIDs.CARBIDE_FEET = configuration.getItem("feetCarbide", ItemIDs.DEFAULT_CARBIDE_FEET).getInt(ItemIDs.DEFAULT_CARBIDE_FEET);

			ItemIDs.ALUMINUM_HEAD = configuration.getItem("headAluminum", ItemIDs.DEFAULT_ALUMINUM_HEAD).getInt(ItemIDs.DEFAULT_ALUMINUM_HEAD);
			ItemIDs.ALUMINUM_CHEST = configuration.getItem("chestAluminum", ItemIDs.DEFAULT_ALUMINUM_CHEST).getInt(ItemIDs.DEFAULT_ALUMINUM_CHEST);
			ItemIDs.ALUMINUM_LEGS = configuration.getItem("legsAluminum", ItemIDs.DEFAULT_ALUMINUM_LEGS).getInt(ItemIDs.DEFAULT_ALUMINUM_LEGS);
			ItemIDs.ALUMINUM_FEET = configuration.getItem("feetAluminum", ItemIDs.DEFAULT_ALUMINUM_FEET).getInt(ItemIDs.DEFAULT_ALUMINUM_FEET);

			ItemIDs.KEVLAR_HEAD = configuration.getItem("headKevlar", ItemIDs.DEFAULT_KEVLAR_HEAD).getInt(ItemIDs.DEFAULT_KEVLAR_HEAD);
			ItemIDs.KEVLAR_CHEST = configuration.getItem("chestKevlar", ItemIDs.DEFAULT_KEVLAR_CHEST).getInt(ItemIDs.DEFAULT_KEVLAR_CHEST);
			ItemIDs.KEVLAR_LEGS = configuration.getItem("legsKevlar", ItemIDs.DEFAULT_KEVLAR_LEGS).getInt(ItemIDs.DEFAULT_KEVLAR_LEGS);
			ItemIDs.KEVLAR_FEET = configuration.getItem("feetKevlar", ItemIDs.DEFAULT_KEVLAR_FEET).getInt(ItemIDs.DEFAULT_KEVLAR_FEET);

			// Molds
			ItemIDs.MOLD = configuration.getItem("molds", ItemIDs.DEFAULT_MOLD).getInt(ItemIDs.DEFAULT_MOLD);

			ItemIDs.MOLDF_AXE = configuration.getItem("firedAxeMold", ItemIDs.DEFAULT_MOLDF_AXE).getInt(ItemIDs.DEFAULT_MOLDF_AXE);
			ItemIDs.MOLDF_HOE = configuration.getItem("firedHoeMold", ItemIDs.DEFAULT_MOLDF_HOE).getInt(ItemIDs.DEFAULT_MOLDF_HOE);
			ItemIDs.MOLDF_SPADE = configuration.getItem("firedSpadeMold", ItemIDs.DEFAULT_MOLDF_SPADE).getInt(ItemIDs.DEFAULT_MOLDF_SPADE);
			ItemIDs.MOLDF_PICK = configuration.getItem("firedPickaxeMold", ItemIDs.DEFAULT_MOLDF_PICK).getInt(ItemIDs.DEFAULT_MOLDF_PICK);
			ItemIDs.MOLDF_SWORD = configuration.getItem("firedSwordMold", ItemIDs.DEFAULT_MOLDF_SWORD).getInt(ItemIDs.DEFAULT_MOLDF_SWORD);
			ItemIDs.MOLDF_HEAD = configuration.getItem("firedHeadMold", ItemIDs.DEFAULT_MOLDF_HEAD).getInt(ItemIDs.DEFAULT_MOLDF_HEAD);
			ItemIDs.MOLDF_CHEST = configuration.getItem("firedChestMold", ItemIDs.DEFAULT_MOLDF_CHEST).getInt(ItemIDs.DEFAULT_MOLDF_CHEST);
			ItemIDs.MOLDF_LEGS = configuration.getItem("firedLegsMold", ItemIDs.DEFAULT_MOLDF_LEGS).getInt(ItemIDs.DEFAULT_MOLDF_LEGS);
			ItemIDs.MOLDF_FEET = configuration.getItem("firedBootsMold", ItemIDs.DEFAULT_MOLDF_FEET).getInt(ItemIDs.DEFAULT_MOLDF_FEET);

			// Heads
			ItemIDs.HEAD_AXE = configuration.getItem("headsAxe", ItemIDs.DEFAULT_HEAD_AXE).getInt(ItemIDs.DEFAULT_HEAD_AXE);
			ItemIDs.HEAD_HOE = configuration.getItem("headsHoe", ItemIDs.DEFAULT_HEAD_HOE).getInt(ItemIDs.DEFAULT_HEAD_HOE);
			ItemIDs.HEAD_SPADE = configuration.getItem("headsSpade", ItemIDs.DEFAULT_HEAD_SPADE).getInt(ItemIDs.DEFAULT_HEAD_SPADE);
			ItemIDs.HEAD_PICK = configuration.getItem("headsPickaxe", ItemIDs.DEFAULT_HEAD_PICK).getInt(ItemIDs.DEFAULT_HEAD_PICK);
			ItemIDs.HEAD_SWORD = configuration.getItem("headsSword", ItemIDs.DEFAULT_HEAD_SWORD).getInt(ItemIDs.DEFAULT_HEAD_SWORD);

		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, "CivCraft has had a problem loading its configuration");
		} finally {
			configuration.save();
		}
	}

	public static void set(String categoryName, String propertyName, String newValue) {

		configuration.load();
		if (configuration.getCategoryNames().contains(categoryName)) {
			if (configuration.getCategory(categoryName).containsKey(propertyName)) {
				configuration.getCategory(categoryName).get(propertyName).set(newValue);
			}
		}
		configuration.save();
	}
}
