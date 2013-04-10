package civcraft.slots.machines;

import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class SlotPlasticOven extends Slot {
	/** The player that is using the GUI where this slot resides. */
	private EntityPlayer thePlayer;
	private int field_75228_b;

	public SlotPlasticOven(EntityPlayer par1EntityPlayer, IInventory par2IInventory, int par3, int par4, int par5) {
		super(par2IInventory, par3, par4, par5);
		thePlayer = par1EntityPlayer;
	}

	/**
	 * Check if the stack is a valid item for this slot. Always true beside for
	 * the armor slots.
	 */
	@Override
	public boolean isItemValid(ItemStack par1ItemStack) {
		return false;
	}

	/**
	 * Decrease the size of the stack in slot (first int arg) by the amount of
	 * the second int arg. Returns the new stack.
	 */
	@Override
	public ItemStack decrStackSize(int par1) {
		if (this.getHasStack()) {
			field_75228_b += Math.min(par1, this.getStack().stackSize);
		}

		return super.decrStackSize(par1);
	}

	@Override
	public void onPickupFromSlot(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack) {
		this.onCrafting(par2ItemStack);
		super.onPickupFromSlot(par1EntityPlayer, par2ItemStack);
	}

	/**
	 * the itemStack passed in is the output - ie, iron ingots, and pickaxes,
	 * not ore and wood. Typically increases an internal count then calls
	 * onCrafting(item).
	 */
	@Override
	protected void onCrafting(ItemStack par1ItemStack, int par2) {
		field_75228_b += par2;
		this.onCrafting(par1ItemStack);
	}

	/**
	 * the itemStack passed in is the output - ie, iron ingots, and pickaxes,
	 * not ore and wood.
	 */
	@Override
	protected void onCrafting(ItemStack par1ItemStack) {
		par1ItemStack.onCrafting(thePlayer.worldObj, thePlayer, field_75228_b);

		if (!thePlayer.worldObj.isRemote) {
			int i = field_75228_b;
			float f = FurnaceRecipes.smelting().getExperience(par1ItemStack);
			int j;

			if (f == 0.0F) {
				i = 0;
			} else if (f < 1.0F) {
				j = MathHelper.floor_float(i * f);

				if (j < MathHelper.ceiling_float_int(i * f) && (float) Math.random() < i * f - j) {
					++j;
				}

				i = j;
			}

			while (i > 0) {
				j = EntityXPOrb.getXPSplit(i);
				i -= j;
				thePlayer.worldObj.spawnEntityInWorld(new EntityXPOrb(thePlayer.worldObj, thePlayer.posX, thePlayer.posY + 0.5D, thePlayer.posZ + 0.5D, j));
			}
		}

		field_75228_b = 0;

		GameRegistry.onItemSmelted(thePlayer, par1ItemStack);

		if (par1ItemStack.itemID == Item.ingotIron.itemID) {
			thePlayer.addStat(AchievementList.acquireIron, 1);
		}

		if (par1ItemStack.itemID == Item.fishCooked.itemID) {
			thePlayer.addStat(AchievementList.cookFish, 1);
		}
	}
}
