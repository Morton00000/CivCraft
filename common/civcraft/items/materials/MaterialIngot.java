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

public class MaterialIngot extends Item {

	public static final String[] ingotNames = new String[] { "tin", "copper", "platinum", "silver", "aluminum", "titanium", "lead", "mercury", "zinc", "tungsten", "uranium", "bronze", "brass", "steel", "carbide", "silicon" };

	public static final String[] ingot = new String[] { "ingot_tin", "ingot_copper", "ingot_platinum", "ingot_silver", "ingot_aluminum", "ingot_titanium", "ingot_lead", "ingot_mercury", "ingot_zinc", "ingot_tungsten", "ingot_uranium", "ingot_bronze", "ingot_brass", "ingot_steel", "ingot_carbide", "ingot_silicon" };

	@SideOnly(Side.CLIENT)
	private Icon[] field_94594_d;
	@SideOnly(Side.CLIENT)
	public static Icon[] textures;

	public MaterialIngot(int id) {
		super(id);
		this.setHasSubtypes(true);
		this.setUnlocalizedName("ingot");
		this.setCreativeTab(CivCraftBase.tabsMaterials);
	}

	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegistry) {
		textures = new Icon[16];

		textures[0] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotTin.png");
		textures[1] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotCopper.png");
		textures[2] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotPlatinum.png");
		textures[3] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotSilver.png");
		textures[4] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotAluminum.png");
		textures[5] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotTitanium.png");
		textures[6] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotLead.png");
		textures[7] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotMercury.png");
		textures[8] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotZinc.png");
		textures[9] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotTungsten.png");
		textures[10] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotUranium.png");
		textures[11] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotBronze.png");
		textures[12] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotBrass.png");
		textures[13] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotSteel.png");
		textures[14] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotCarbide.png");
		textures[15] = iconRegistry.registerIcon("/mods/CivCraft/textures/items/materials/ingotSilicon.png");
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
		int var2 = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
		return super.getUnlocalizedName() + "." + ingotNames[var2];
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int var4 = 0; var4 < 16; ++var4) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}

	@SideOnly(Side.CLIENT)
	public void func_94581_a(IconRegister par1IconRegister) {
		field_94594_d = new Icon[ingot.length];
		for (int i = 0; i < ingot.length; ++i) {
			field_94594_d[i] = par1IconRegister.registerIcon(ingot[i]);
		}
	}
}