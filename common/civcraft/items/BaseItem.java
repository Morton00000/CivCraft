package civcraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseItem extends Item {

	public BaseItem(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}

	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("CivCraft" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}