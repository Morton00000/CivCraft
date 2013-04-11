package civcraft.items;

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

public class ItemMisc extends Item {

	public static final String[] miscNames = new String[] { "chip", "wire", "mboard", "hdrive", "ram", "bellows", "heatingCoil", "kevlar", "handle" };

	public static final String[] misc = new String[] { "misc_chip", "misc_wire", "misc_mboard", "misc_hdrive", "misc_ram", "misc_bellows", "misc_heatingCoil", "misc_kevlar", "misc_handle" };

	@SideOnly(Side.CLIENT)
	private Icon[] field_94594_d;
	@SideOnly(Side.CLIENT)
	public static Icon[] textures;

	public ItemMisc(int id) {
		super(id);
		this.setHasSubtypes(true);
		this.setUnlocalizedName("misc");
		this.setCreativeTab(CivCraftBase.tabsMisc);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegistry) {
		textures = new Icon[9];

		textures[0] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/misc/computer_chip.png");
		textures[1] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/misc/computer_wire.png");
		textures[2] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/misc/computer_mboard.png");
		textures[3] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/misc/computer_hdrive.png");
		textures[4] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/misc/computer_ram.png");
		textures[5] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/misc/misc_bellows.png");
		textures[6] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/misc/misc_heatingCoil.png");
		textures[7] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/misc/misc_kevlar.png");
		textures[8] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/misc/misc_handle.png");
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
		return super.getUnlocalizedName() + "." + miscNames[var2];
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
		field_94594_d = new Icon[misc.length];
		for (int i = 0; i < misc.length; ++i) {
			field_94594_d[i] = par1IconRegister.registerIcon(misc[i]);
		}
	}
}