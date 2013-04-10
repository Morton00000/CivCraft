package civcraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import civcraft.items.tools.Tools;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabTools extends CreativeTabs {

	public CreativeTabTools(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * the itemID for the item to be displayed on the tab
	 */
	public int getTabIconItemIndex() {
		return Tools.axeDCarbide.itemID;
	}
}
