package civcraft.items.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import civcraft.CivCraftBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSwordCC extends ItemSword {

	public ItemSwordCC(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(CivCraftBase.tabsCombat);
		// TODO Auto-generated constructor stub
	}

	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("CivCraft" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}
