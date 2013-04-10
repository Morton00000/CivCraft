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

public class HeadsAxe extends Item {

	public static final String[] axeHeadNames = new String[] { "copper", "aluminum", "titanium", "duranium", "bronze", "steel", "carbide", "dcarbide", "iron", "gold" };

	public static final String[] axeHead = new String[] { "copper", "aluminum", "titanium", "duranium", "bronze", "steel", "carbide", "dcarbide", "iron", "gold" };

	@SideOnly(Side.CLIENT)
	private Icon[] field_94594_d;
	@SideOnly(Side.CLIENT)
	public static Icon[] textures;

	public HeadsAxe(int id) {
		super(id);
		this.setHasSubtypes(true);
		this.setUnlocalizedName("axeHead");
		this.setCreativeTab(CivCraftBase.tabsMisc);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegistry) {
		textures = new Icon[10];

		textures[0] = iconRegistry.registerIcon("CivCraft:axeHeadCopper");
		textures[1] = iconRegistry.registerIcon("CivCraft:axeHeadAluminum");
		textures[2] = iconRegistry.registerIcon("CivCraft:axeHeadTitanium");
		textures[3] = iconRegistry.registerIcon("CivCraft:axeHeadDUranium");
		textures[4] = iconRegistry.registerIcon("CivCraft:axeHeadBronze");
		textures[5] = iconRegistry.registerIcon("CivCraft:axeHeadSteel");
		textures[6] = iconRegistry.registerIcon("CivCraft:axeHeadCarbide");
		textures[7] = iconRegistry.registerIcon("CivCraft:axeHeadDCarbide");
		textures[8] = iconRegistry.registerIcon("CivCraft:axeHeadIron");
		textures[9] = iconRegistry.registerIcon("CivCraft:axeHeadGold");
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
		return super.getUnlocalizedName() + "." + axeHeadNames[var2];
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int var4 = 0; var4 < 10; ++var4) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}

	@SideOnly(Side.CLIENT)
	public void func_94581_a(IconRegister par1IconRegister) {
		field_94594_d = new Icon[axeHead.length];
		for (int i = 0; i < axeHead.length; ++i) {
			field_94594_d[i] = par1IconRegister.registerIcon(axeHead[i]);
		}
	}
}