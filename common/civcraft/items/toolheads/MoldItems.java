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

public class MoldItems extends Item {

	public static final String[] moldNames = new String[] { "axe", "hoe", "spade", "pick", "sword", "head", "chest", "legs", "feet" };

	public static final String[] mold = new String[] { "axe", "hoe", "spade", "pick", "sword", "head", "chest", "legs", "feet" };

	@SideOnly(Side.CLIENT)
	private Icon[] field_94594_d;
	@SideOnly(Side.CLIENT)
	public static Icon[] textures;

	public MoldItems(int id) {
		super(id);
		this.setHasSubtypes(true);
		this.setUnlocalizedName("mold");
		this.setCreativeTab(CivCraftBase.tabsMisc);
	}

	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegistry) {
		textures = new Icon[9];

		textures[0] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/molds/moldAxe.png");
		textures[1] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/molds/moldHoe.png");
		textures[2] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/molds/moldSpade.png");
		textures[3] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/molds/moldPickaxe.png");
		textures[4] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/molds/moldSword.png");
		textures[5] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/molds/moldHead.png");
		textures[6] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/molds/moldChest.png");
		textures[7] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/molds/moldLegs.png");
		textures[8] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/molds/moldBoots.png");
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
		int var2 = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 8);
		return super.getUnlocalizedName() + "." + moldNames[var2];
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int var4 = 0; var4 < 9; ++var4) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}

	@SideOnly(Side.CLIENT)
	public void func_94581_a(IconRegister par1IconRegister) {
		field_94594_d = new Icon[mold.length];
		for (int i = 0; i < mold.length; ++i) {
			field_94594_d[i] = par1IconRegister.registerIcon(mold[i]);
		}
	}
}