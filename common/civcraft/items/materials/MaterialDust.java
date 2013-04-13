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

	public static final String[] dustNames = new String[] { "tin", "copper", "platinum", "silver", "aluminium", "titanium", "lead", "mercury", "zinc", "tungsten", "uranium", "bronze", "brass", "steel", "carbide", "silicon", "yellowcake", "gold", "iron" };

	public static final String[] dust = new String[] { "dust_tin", "dust_copper", "dust_platinum", "dust_silver", "dust_aluminium", "dust_titanium", "dust_lead", "dust_mercury", "dust_zinc", "dust_tungsten", "dust_uranium", "dust_bronze", "dust_brass", "dust_steel", "dust_carbide", "dust_silicon", "dust_yellowcake", "dust_gold", "dust_iron" };

	@SideOnly(Side.CLIENT)
	public static Icon[] textures;

	public MaterialDust(int id) {
		super(id);
		this.setHasSubtypes(true);
		this.setUnlocalizedName("dust");
		this.setCreativeTab(CivCraftBase.tabsMaterials);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegistry) {
		textures = new Icon[19];

		textures[0] = iconRegistry.registerIcon("CivCraft:dustTin");
		textures[1] = iconRegistry.registerIcon("CivCraft:dustCopper");
		textures[2] = iconRegistry.registerIcon("CivCraft:dustPlatinum");
		textures[3] = iconRegistry.registerIcon("CivCraft:dustSilver");
		textures[4] = iconRegistry.registerIcon("CivCraft:dustAluminium");
		textures[5] = iconRegistry.registerIcon("CivCraft:dustTitanium");
		textures[6] = iconRegistry.registerIcon("CivCraft:dustLead");
		textures[7] = iconRegistry.registerIcon("CivCraft:dustMercury");
		textures[8] = iconRegistry.registerIcon("CivCraft:dustZinc");
		textures[9] = iconRegistry.registerIcon("CivCraft:dustTungsten");
		textures[10] = iconRegistry.registerIcon("CivCraft:dustUranium");
		textures[11] = iconRegistry.registerIcon("CivCraft:dustBronze");
		textures[12] = iconRegistry.registerIcon("CivCraft:dustBrass");
		textures[13] = iconRegistry.registerIcon("CivCraft:dustSteel");
		textures[14] = iconRegistry.registerIcon("CivCraft:dustCarbide");
		textures[15] = iconRegistry.registerIcon("CivCraft:dustSilicon");
		textures[16] = iconRegistry.registerIcon("CivCraft:dustYellowcake");
		textures[17] = iconRegistry.registerIcon("CivCraft:dustGold");
		textures[18] = iconRegistry.registerIcon("CivCraft:dustIron");
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
}