package civcraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import civcraft.items.Items;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabMisc extends CreativeTabs {

	public CreativeTabMisc(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * the itemID for the item to be displayed on the tab
	 */
	public int getTabIconItemIndex() {
		return Items.bucketPlasticWater.itemID;
	}
}