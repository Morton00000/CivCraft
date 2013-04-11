package civcraft.items.materials;

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

public class MaterialDust extends Item {

	public static final String[] dustNames = new String[] { "tin", "copper", "platinum", "silver", "aluminum", "titanium", "lead", "mercury", "zinc", "tungsten", "uranium", "bronze", "brass", "steel", "carbide", "silicon", "yellowcake", "gold", "iron" };

	public static final String[] dust = new String[] { "dust_tin", "dust_copper", "dust_platinum", "dust_silver", "dust_aluminum", "dust_titanium", "dust_lead", "dust_mercury", "dust_zinc", "dust_tungsten", "dust_uranium", "dust_bronze", "dust_brass", "dust_steel", "dust_carbide", "dust_silicon", "dust_yellowcake", "dust_gold", "dust_iron" };

	@SideOnly(Side.CLIENT)
	private Icon[] field_94594_d;
	@SideOnly(Side.CLIENT)
	public static Icon[] textures;

	public MaterialDust(int id) {
		super(id);
		this.setHasSubtypes(true);
		this.setUnlocalizedName("dust");
		this.setCreativeTab(CivCraftBase.tabsMaterials);
	}

	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegistry) {
		textures = new Icon[19];

		textures[0] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustTin.png");
		textures[1] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustCopper.png");
		textures[2] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustPlatinum.png");
		textures[3] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustSilver.png");
		textures[4] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustAluminum.png");
		textures[5] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustTitanium.png");
		textures[6] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustLead.png");
		textures[7] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustMercury.png");
		textures[8] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustZinc.png");
		textures[9] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustTungsten.png");
		textures[10] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustUranium.png");
		textures[11] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustBronze.png");
		textures[12] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustBrass.png");
		textures[13] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustSteel.png");
		textures[14] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustCarbide.png");
		textures[15] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustSilicon.png");
		textures[16] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustYellowcake.png");
		textures[17] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustGold.png");
		textures[18] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/dustIron.png");
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
		int var2 = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 18);
		return super.getUnlocalizedName() + "." + dustNames[var2];
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int var4 = 0; var4 < 19; ++var4) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}

	@SideOnly(Side.CLIENT)
	public void func_94581_a(IconRegister par1IconRegister) {
		field_94594_d = new Icon[dust.length];
		for (int i = 0; i < dust.length; ++i) {
			field_94594_d[i] = par1IconRegister.registerIcon(dust[i]);
		}
	}
}