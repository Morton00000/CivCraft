package civcraft.recipes;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import civcraft.items.tools.Tools;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler {

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory matrix) {
		// TODO Auto-generated method stub
		for (int i = 0; i < matrix.getSizeInventory(); i++) {
			if (matrix.getStackInSlot(i) != null) {
				ItemStack itemnew = matrix.getStackInSlot(i);

				if (itemnew != null) {
					if (itemnew.getItemDamage() == itemnew.getMaxDamage()) {} else {

						if (itemnew.getItem() == Tools.hammerStone) {
							ItemStack k = new ItemStack(Tools.hammerStone, 2, itemnew.getItemDamage() + 1);
							matrix.setInventorySlotContents(i, k);
						}

						else if (itemnew.getItem() == Tools.hammerIron) {
							ItemStack k = new ItemStack(Tools.hammerIron, 2, itemnew.getItemDamage() + 1);
							matrix.setInventorySlotContents(i, k);
						}

						else if (itemnew.getItem() == Tools.hammerSteel) {
							ItemStack k = new ItemStack(Tools.hammerSteel, 2, itemnew.getItemDamage() + 1);
							matrix.setInventorySlotContents(i, k);
						}

						else if (itemnew.getItem() == Tools.hammerCarbide) {
							ItemStack k = new ItemStack(Tools.hammerCarbide, 2, itemnew.getItemDamage() + 1);
							matrix.setInventorySlotContents(i, k);
						}
					}
				}
			}
		}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		// TODO Auto-generated method stub
	}
}
