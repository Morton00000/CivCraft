package civcraft.items.toolheads;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import civcraft.CivCraftBase;
import civcraft.items.BaseItem;
import civcraft.lib.ItemIDs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Molds {

	// Molds
	public static final Item mold = new MoldItems(ItemIDs.MOLD);

	public static final String[] moldNames = { "Axe Head Mold", "Hoe Head Mold", "Spade Head Mold", "Pickaxe Head Mold", "Sword Head Mold", "Head Mold", "Chestplate Mold", "Greeves Mold", "Boots Mold" };

	// Molds
	public static ItemStack moldAxe = new ItemStack(mold, 1, 0);
	public static ItemStack moldHoe = new ItemStack(mold, 1, 1);
	public static ItemStack moldSpade = new ItemStack(mold, 1, 2);
	public static ItemStack moldPick = new ItemStack(mold, 1, 3);
	public static ItemStack moldSword = new ItemStack(mold, 1, 4);

	public static ItemStack moldHead = new ItemStack(mold, 1, 5);
	public static ItemStack moldChest = new ItemStack(mold, 1, 6);
	public static ItemStack moldLegs = new ItemStack(mold, 1, 7);
	public static ItemStack moldFeet = new ItemStack(mold, 1, 8);

	// Fired Molds
	public static Item moldfAxe = new BaseItem(ItemIDs.MOLDF_AXE).setUnlocalizedName("moldfAxe").setMaxDamage(4).setMaxStackSize(2).setCreativeTab(CivCraftBase.tabsMisc);
	public static Item moldfHoe = new BaseItem(ItemIDs.MOLDF_HOE).setUnlocalizedName("moldfHoe").setMaxDamage(4).setMaxStackSize(2).setCreativeTab(CivCraftBase.tabsMisc);
	public static Item moldfSpade = new BaseItem(ItemIDs.MOLDF_SPADE).setUnlocalizedName("moldfSpade").setMaxDamage(4).setMaxStackSize(2).setCreativeTab(CivCraftBase.tabsMisc);
	public static Item moldfPick = new BaseItem(ItemIDs.MOLDF_PICK).setUnlocalizedName("moldfPick").setMaxDamage(4).setMaxStackSize(2).setCreativeTab(CivCraftBase.tabsMisc);
	public static Item moldfSword = new BaseItem(ItemIDs.MOLDF_SWORD).setUnlocalizedName("moldfSword").setMaxDamage(4).setMaxStackSize(2).setCreativeTab(CivCraftBase.tabsMisc);

	public static Item moldfHead = new BaseItem(ItemIDs.MOLDF_HEAD).setUnlocalizedName("moldfHead").setMaxDamage(4).setMaxStackSize(2).setCreativeTab(CivCraftBase.tabsMisc);
	public static Item moldfChest = new BaseItem(ItemIDs.MOLDF_CHEST).setUnlocalizedName("moldfChest").setMaxDamage(4).setMaxStackSize(2).setCreativeTab(CivCraftBase.tabsMisc);
	public static Item moldfLegs = new BaseItem(ItemIDs.MOLDF_LEGS).setUnlocalizedName("moldfLegs").setMaxDamage(4).setMaxStackSize(2).setCreativeTab(CivCraftBase.tabsMisc);
	public static Item moldfFeet = new BaseItem(ItemIDs.MOLDF_FEET).setUnlocalizedName("moldfFeet").setMaxDamage(4).setMaxStackSize(2).setCreativeTab(CivCraftBase.tabsMisc);

	public static void init() {

		// Molds
		LanguageRegistry.addName(moldfAxe, "Fired Axe Head Mold");
		LanguageRegistry.addName(moldfHoe, "Fired Hoe Head Mold");
		LanguageRegistry.addName(moldfSpade, "Fired Shovel Head Mold");
		LanguageRegistry.addName(moldfPick, "Fired Pickaxe Head Mold");
		LanguageRegistry.addName(moldfSword, "Fired Sword Head Mold");

		LanguageRegistry.addName(moldfHead, "Fired Helmet Mold");
		LanguageRegistry.addName(moldfChest, "Fired Chestplate Mold");
		LanguageRegistry.addName(moldfLegs, "Fired Greeves Mold");
		LanguageRegistry.addName(moldfFeet, "Fired Boots Mold");

	}
}
