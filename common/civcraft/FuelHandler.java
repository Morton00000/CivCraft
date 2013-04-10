package civcraft;

import net.minecraft.item.ItemStack;
import civcraft.blocks.Blocks;
import civcraft.blocks.Machines;
import civcraft.items.materials.Materials;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		int var1 = fuel.itemID;
		if (var1 == Materials.plastic.itemID)
			return 200;
		else if (var1 == Blocks.blockPlastic.blockID)
			return 2000;
		else if (var1 == Machines.plasticOvenOff.blockID)
			return 1800;
		else if (var1 == Machines.computerOff.blockID)
			return 1000;
		else if (var1 == Materials.plasticGlob.itemID)
			return 100;
		else
			return 0;
	}

}
