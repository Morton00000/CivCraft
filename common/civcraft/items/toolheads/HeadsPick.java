package civcraft.items.toolheads;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import civcraft.CivCraftBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HeadsPick extends Item {

	public static final String[] pickHeadNames = new String[] { "copper", "Aluminium", "titanium", "duranium", "bronze", "steel", "carbide", "dcarbide", "iron", "gold" };

	public static final String[] pickHead = new String[] { "copper", "Aluminium", "titanium", "duranium", "bronze", "steel", "carbide", "dcarbide", "iron", "gold" };

	@SideOnly(Side.CLIENT)
	public static Icon[] textures;

	public HeadsPick(int id) {
		super(id);
		this.setHasSubtypes(true);
		this.setUnlocalizedName("pickHead");
		this.setCreativeTab(CivCraftBase.tabsMisc);
		this.setMaxStackSize(4);
	}

	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegistry) {
		textures = new Icon[10];

		textures[0] = iconRegistry.registerIcon("CivCraft:pickHeadCopper");
		textures[1] = iconRegistry.registerIcon("CivCraft:pickHeadAluminium");
		textures[2] = iconRegistry.registerIcon("CivCraft:pickHeadTitanium");
		textures[3] = iconRegistry.registerIcon("CivCraft:pickHeadDUranium");
		textures[4] = iconRegistry.registerIcon("CivCraft:pickHeadBronze");
		textures[5] = iconRegistry.registerIcon("CivCraft:pickHeadSteel");
		textures[6] = iconRegistry.registerIcon("CivCraft:pickHeadCarbide");
		textures[7] = iconRegistry.registerIcon("CivCraft:pickHeadDCarbide");
		textures[8] = iconRegistry.registerIcon("CivCraft:pickHeadIron");
		textures[9] = iconRegistry.registerIcon("CivCraft:pickHeadGold");
	}

	@Override
	public Icon getIconFromDamage(int itemMeta) {
		return textures[itemMeta];
	}

	@Override
	public int getMetadata(int damageValue) {
		return damageValue;
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack) {
		int var2 = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 9);
		return super.getUnlocalizedName() + "." + pickHeadNames[var2];
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int var4 = 0; var4 < 10; ++var4) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}
}