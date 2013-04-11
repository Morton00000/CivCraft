package civcraft.items.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import civcraft.CivCraftBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemHoeCC extends ItemHoe {

	public ItemHoeCC(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(CivCraftBase.tabsTools);
		// TODO Auto-generated constructor stub
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister) {
		iconIndex = iconRegister.registerIcon("/mods/CivCraft/textures/items/tools/" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1) + ".png");
	}
}
