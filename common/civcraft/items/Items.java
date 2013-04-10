package civcraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import civcraft.CivCraftBase;
import civcraft.lib.ItemIDs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

	// Computer
	public static final Item misc = new ItemMisc(ItemIDs.MISC);

	public static final String[] miscNames = { "Chip", "Wire", "Mother-Board", "Hard Drive", "Ram", "Bellows", "Heating Coil", "Kevlar", "Handle" };

	// Computer List
	public static ItemStack chip = new ItemStack(misc, 1, 0);
	public static ItemStack wire = new ItemStack(misc, 1, 1);
	public static ItemStack motherBoard = new ItemStack(misc, 1, 2);
	public static ItemStack hardDrive = new ItemStack(misc, 1, 3);
	public static ItemStack ram = new ItemStack(misc, 1, 4);
	public static ItemStack bellows = new ItemStack(misc, 1, 5);
	public static ItemStack heatingCoil = new ItemStack(misc, 1, 6);
	public static ItemStack kevlar = new ItemStack(misc, 1, 7);
	public static ItemStack handle = new ItemStack(misc, 1, 8);

	// Buckets
	public static Item bucketPlasticEmpty = new ItemBucketPlastic(ItemIDs.BUCKET_EMPTY, 0).setUnlocalizedName("bucketPlastic").setMaxStackSize(32).setCreativeTab(CivCraftBase.tabsMisc);
	public static Item bucketPlasticWater = new ItemBucketPlastic(ItemIDs.BUCKET_WATER, Block.waterMoving.blockID).setUnlocalizedName("bucketPlastickWater").setMaxStackSize(1).setCreativeTab(CivCraftBase.tabsMisc);
	public static Item bucketPlasticMilk = new ItemBucketPlasticMilk(ItemIDs.BUCKET_MILK).setUnlocalizedName("bucketPlasticMilk").setMaxStackSize(1).setCreativeTab(CivCraftBase.tabsMisc);

	public static void init() {

		// Buckets
		LanguageRegistry.addName(bucketPlasticEmpty, "Plastic Bucket");
		LanguageRegistry.addName(bucketPlasticWater, "Plastic Water Bucket");
		LanguageRegistry.addName(bucketPlasticMilk, "Plastic Milk Bucket");

	}
}
