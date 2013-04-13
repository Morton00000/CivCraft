package civcraft.blocks;

import net.minecraft.block.Block;
import civcraft.CivCraftBase;
import civcraft.blocks.machines.Crusher1;
import civcraft.blocks.machines.Crusher2;
import civcraft.blocks.machines.FurnaceBlast;
import civcraft.blocks.machines.FurnaceInd;
import civcraft.blocks.machines.FurnaceMold;
import civcraft.blocks.machines.PlasticOven;
import civcraft.lib.BlockIDs;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Machines {

	// once the gui works make the other furnace/crusher blocks
	// Furnaces
	public static Block furnaceBlastOff = new FurnaceBlast(BlockIDs.FURNACE_BLAST_OFF, false).setUnlocalizedName("furnaceBlast").setHardness(3F).setCreativeTab(CivCraftBase.tabsBlock);
	public static Block furnaceBlastOn = new FurnaceBlast(BlockIDs.FURNACE_BLAST_ON, true).setUnlocalizedName("furnaceBlast").setHardness(3F).setLightValue(0.875F);

	public static Block furnaceIndOff = new FurnaceInd(BlockIDs.FURNACE_IND_OFF, false).setUnlocalizedName("furnaceInd").setHardness(3F).setCreativeTab(CivCraftBase.tabsBlock);
	public static Block furnaceIndOn = new FurnaceInd(BlockIDs.FURNACE_IND_ON, true).setUnlocalizedName("furnaceInd").setHardness(3F).setLightValue(0.875F);

	public static Block furnaceMoldOff = new FurnaceMold(BlockIDs.FURNACE_MOLD_OFF, false).setUnlocalizedName("furnaceMold").setHardness(3F).setCreativeTab(CivCraftBase.tabsBlock);
	public static Block furnaceMoldOn = new FurnaceMold(BlockIDs.FURNACE_MOLD_ON, true).setUnlocalizedName("furnaceMold").setHardness(3F).setLightValue(0.875F);

	public static Block plasticOvenOff = new PlasticOven(BlockIDs.PLASTIC_OVEN_OFF, false).setUnlocalizedName("furnacePlastic").setHardness(3F).setCreativeTab(CivCraftBase.tabsBlock);
	public static Block plasticOvenOn = new PlasticOven(BlockIDs.PLASTIC_OVEN_ON, true).setUnlocalizedName("furnacePlastic").setHardness(3F).setLightValue(0.875F);

	public static Block crusher1Off = new Crusher1(BlockIDs.CRUSHER_1_OFF, false).setUnlocalizedName("crusher1").setHardness(3F).setCreativeTab(CivCraftBase.tabsBlock);
	public static Block crusher1On = new Crusher1(BlockIDs.CRUSHER_1_ON, true).setUnlocalizedName("crusher1").setHardness(3F).setLightValue(0.875F);

	public static Block crusher2Off = new Crusher2(BlockIDs.CRUSHER_2_OFF, false).setUnlocalizedName("crusher2").setHardness(3F).setCreativeTab(CivCraftBase.tabsBlock);
	public static Block crusher2On = new Crusher2(BlockIDs.CRUSHER_2_ON, true).setUnlocalizedName("crusher2").setHardness(3F).setLightValue(0.875F);

	// Other
	public static Block computerOff = new BlockComputer(BlockIDs.COMPUTER_OFF, false).setUnlocalizedName("computer").setHardness(3F).setCreativeTab(CivCraftBase.tabsBlock);
	public static Block computerOn = new BlockComputer(BlockIDs.COMPUTER_ON, true).setUnlocalizedName("computer").setHardness(3F).setLightValue(0.875F);

	public static Block lightOff = new BlockLight(BlockIDs.LIGHT_OFF, false).setUnlocalizedName("light").setHardness(3F).setCreativeTab(CivCraftBase.tabsBlock);
	public static Block lightOn = new BlockLight(BlockIDs.LIGHT_ON, true).setUnlocalizedName("light").setHardness(3F).setLightValue(0.875F);

	public static void init() {

		// Names
		GameRegistry.registerBlock(furnaceBlastOff, "furnaceBlastOff");
		LanguageRegistry.addName(furnaceBlastOff, "Blast Furnace");

		GameRegistry.registerBlock(furnaceIndOff, "furnaceIndOff");
		LanguageRegistry.addName(furnaceIndOff, "Industrial Furnace");

		GameRegistry.registerBlock(furnaceMoldOff, "furnaceMoldOff");
		LanguageRegistry.addName(furnaceMoldOff, "Mold Furnace");

		GameRegistry.registerBlock(plasticOvenOff, "plasticOvenOff");
		LanguageRegistry.addName(plasticOvenOff, "Easy Bake Oven");

		GameRegistry.registerBlock(crusher1Off, "crusher1Off");
		LanguageRegistry.addName(crusher1Off, "Crusher mk1");

		GameRegistry.registerBlock(crusher2Off, "crusher2Off");
		LanguageRegistry.addName(crusher2Off, "Crusher mk2");

		GameRegistry.registerBlock(computerOff, "computerOff");
		LanguageRegistry.addName(computerOff, "Computer");

		GameRegistry.registerBlock(lightOff, "lightOff");
		LanguageRegistry.addName(lightOff, "Light");

	}
}
