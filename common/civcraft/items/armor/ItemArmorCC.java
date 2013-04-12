package civcraft.items.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import civcraft.CivCraftBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SuppressWarnings("deprecation")
public class ItemArmorCC extends ItemArmor implements IArmorTextureProvider {

	public ItemArmorCC(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(CivCraftBase.tabsCombat);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister) {
		iconIndex = iconRegister.registerIcon("/mods/CivCraft/textures/items/armor/" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1) + ".png");
	}

	@Override
	public String getArmorTextureFile(ItemStack stack) {

		if (stack.itemID == Armor.headCopper.itemID || stack.itemID == Armor.chestCopper.itemID || stack.itemID == Armor.bootsCopper.itemID)
			return "/mods/CivCraft/textures/armor/copper_1.png";
		else if (stack.itemID == Armor.legsCopper.itemID)
			return "/mods/CivCraft/textures/armor/copper_2.png";
		else if (stack.itemID == Armor.headBronze.itemID || stack.itemID == Armor.chestBronze.itemID || stack.itemID == Armor.bootsBronze.itemID)
			return "/mods/CivCraft/textures/armor/bronze_1.png";
		else if (stack.itemID == Armor.legsBronze.itemID)
			return "/mods/CivCraft/textures/armor/bronze_2.png";
		else if (stack.itemID == Armor.headSteel.itemID || stack.itemID == Armor.chestSteel.itemID || stack.itemID == Armor.bootsSteel.itemID)
			return "/mods/CivCraft/textures/armor/steel_1.png";
		else if (stack.itemID == Armor.legsSteel.itemID)
			return "/mods/CivCraft/textures/armor/steel_2.png";
		else if (stack.itemID == Armor.headCarbide.itemID || stack.itemID == Armor.chestCarbide.itemID || stack.itemID == Armor.bootsCarbide.itemID)
			return "/mods/CivCraft/textures/armor/carbide_1.png";
		else if (stack.itemID == Armor.legsCarbide.itemID)
			return "/mods/CivCraft/textures/armor/carbide_2.png";
		else if (stack.itemID == Armor.headTitanium.itemID || stack.itemID == Armor.chestTitanium.itemID || stack.itemID == Armor.bootsTitanium.itemID)
			return "/mods/CivCraft/textures/armor/titanium_1.png";
		else if (stack.itemID == Armor.legsTitanium.itemID)
			return "/mods/CivCraft/textures/armor/titanium_2.png";
		else if (stack.itemID == Armor.headDUranium.itemID || stack.itemID == Armor.chestDUranium.itemID || stack.itemID == Armor.bootsDUranium.itemID)
			return "/mods/CivCraft/textures/armor/de-uranium_1.png";
		else if (stack.itemID == Armor.legsDUranium.itemID)
			return "/mods/CivCraft/textures/armor/de-uranium_2.png";
		else if (stack.itemID == Armor.headAluminum.itemID || stack.itemID == Armor.chestAluminum.itemID || stack.itemID == Armor.bootsAluminum.itemID)
			return "/mods/CivCraft/textures/armor/aluminum_1.png";
		else if (stack.itemID == Armor.legsAluminum.itemID)
			return "/mods/CivCraft/textures/armor/aluminum_2.png";
		else if (stack.itemID == Armor.headKevlar.itemID || stack.itemID == Armor.chestKevlar.itemID || stack.itemID == Armor.bootsKevlar.itemID)
			return "/mods/CivCraft/textures/armor/kevlar_1.png";
		else if (stack.itemID == Armor.legsKevlar.itemID)
			return "/mods/CivCraft/textures/armor/kevlar_2.png";
		else
			return null;
	}
}