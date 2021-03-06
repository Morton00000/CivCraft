package civcraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import civcraft.items.materials.Materials;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabMaterials extends CreativeTabs {

	public CreativeTabMaterials(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * the itemID for the item to be displayed on the tab
	 */
	public int getTabIconItemIndex() {
		return Materials.plastic.itemID;
	}
}
