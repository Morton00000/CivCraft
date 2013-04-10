package civcraft.containers.machines;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import civcraft.recipes.machines.RecipesFurnaceInd;
import civcraft.slots.machines.SlotFurnaceInd;
import civcraft.tiles.machines.TileFurnaceInd;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerFurnaceInd extends Container {
	private TileFurnaceInd furnace;
	private int lastCookTime = 0;
	private int lastBurnTime = 0;
	private int lastItemBurnTime = 0;

	public ContainerFurnaceInd(InventoryPlayer par1InventoryPlayer, TileFurnaceInd par2TileEntityFurnace) {
		furnace = par2TileEntityFurnace;
		this.addSlotToContainer(new Slot(par2TileEntityFurnace, 0, 56, 17));
		this.addSlotToContainer(new Slot(par2TileEntityFurnace, 1, 56, 53));
		this.addSlotToContainer(new SlotFurnaceInd(par1InventoryPlayer.player, par2TileEntityFurnace, 2, 116, 35));
		int i;

		for (i = 0; i < 3; ++i) {
			for (int j = 0; j < 9; ++j) {
				this.addSlotToContainer(new Slot(par1InventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}

		for (i = 0; i < 9; ++i) {
			this.addSlotToContainer(new Slot(par1InventoryPlayer, i, 8 + i * 18, 142));
		}
	}

	@Override
	public void addCraftingToCrafters(ICrafting par1ICrafting) {
		super.addCraftingToCrafters(par1ICrafting);
		par1ICrafting.sendProgressBarUpdate(this, 0, furnace.furnaceCookTime);
		par1ICrafting.sendProgressBarUpdate(this, 1, furnace.furnaceBurnTime);
		par1ICrafting.sendProgressBarUpdate(this, 2, furnace.currentItemBurnTime);
	}

	/**
	 * Looks for changes made in the container, sends them to every listener.
	 */
	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();

		for (int i = 0; i < crafters.size(); ++i) {
			ICrafting icrafting = (ICrafting) crafters.get(i);

			if (lastCookTime != furnace.furnaceCookTime) {
				icrafting.sendProgressBarUpdate(this, 0, furnace.furnaceCookTime);
			}

			if (lastBurnTime != furnace.furnaceBurnTime) {
				icrafting.sendProgressBarUpdate(this, 1, furnace.furnaceBurnTime);
			}

			if (lastItemBurnTime != furnace.currentItemBurnTime) {
				icrafting.sendProgressBarUpdate(this, 2, furnace.currentItemBurnTime);
			}
		}

		lastCookTime = furnace.furnaceCookTime;
		lastBurnTime = furnace.furnaceBurnTime;
		lastItemBurnTime = furnace.currentItemBurnTime;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int par1, int par2) {
		if (par1 == 0) {
			furnace.furnaceCookTime = par2;
		}

		if (par1 == 1) {
			furnace.furnaceBurnTime = par2;
		}

		if (par1 == 2) {
			furnace.currentItemBurnTime = par2;
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
		return furnace.isUseableByPlayer(par1EntityPlayer);
	}

	/**
	 * Called when a player shift-clicks on a slot. You must override this or
	 * you will crash when someone does that.
	 */
	@Override
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
		ItemStack itemstack = null;
		Slot slot = (Slot) inventorySlots.get(par2);

		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (par2 == 2) {
				if (!this.mergeItemStack(itemstack1, 3, 39, true))
					return null;

				slot.onSlotChange(itemstack1, itemstack);
			} else if (par2 != 1 && par2 != 0) {
				if (RecipesFurnaceInd.smelting().getSmeltingResult(itemstack1) != null) {
					if (!this.mergeItemStack(itemstack1, 0, 1, false))
						return null;
				} else if (TileFurnaceInd.isItemFuel(itemstack1)) {
					if (!this.mergeItemStack(itemstack1, 1, 2, false))
						return null;
				} else if (par2 >= 3 && par2 < 30) {
					if (!this.mergeItemStack(itemstack1, 30, 39, false))
						return null;
				} else if (par2 >= 30 && par2 < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
					return null;
			} else if (!this.mergeItemStack(itemstack1, 3, 39, false))
				return null;

			if (itemstack1.stackSize == 0) {
				slot.putStack((ItemStack) null);
			} else {
				slot.onSlotChanged();
			}

			if (itemstack1.stackSize == itemstack.stackSize)
				return null;

			slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
		}

		return itemstack;
	}
}
