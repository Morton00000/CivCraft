package civcraft.tiles.machines;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.ForgeDummyContainer;
import civcraft.blocks.Blocks;
import civcraft.blocks.Machines;
import civcraft.blocks.machines.PlasticOven;
import civcraft.items.materials.Materials;
import civcraft.recipes.machines.RecipesPlasticOven;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SuppressWarnings("deprecation")
public class TilePlasticOven extends TileEntity implements ISidedInventory, net.minecraftforge.common.ISidedInventory {
	private static final int[] field_102010_d = new int[] { 0 };
	private static final int[] field_102011_e = new int[] { 2, 1 };
	private static final int[] field_102009_f = new int[] { 1 };

	/**
	 * The ItemStacks that hold the items currently being used in the furnace
	 */
	private ItemStack[] furnaceItemStacks = new ItemStack[3];

	/** The number of ticks that the furnace will keep burning */
	public int furnaceBurnTime = 0;

	/**
	 * The number of ticks that a fresh copy of the currently-burning item would
	 * keep the furnace burning for
	 */
	public int currentItemBurnTime = 0;

	/** The number of ticks that the current item has been cooking for */
	public int furnaceCookTime = 0;
	private String field_94130_e;

	/**
	 * Returns the number of slots in the inventory.
	 */
	@Override
	public int getSizeInventory() {
		return furnaceItemStacks.length;
	}

	/**
	 * Returns the stack in slot i
	 */
	@Override
	public ItemStack getStackInSlot(int par1) {
		return furnaceItemStacks[par1];
	}

	/**
	 * Removes from an inventory slot (first arg) up to a specified number
	 * (second arg) of items and returns them in a new stack.
	 */
	@Override
	public ItemStack decrStackSize(int par1, int par2) {
		if (furnaceItemStacks[par1] != null) {
			ItemStack itemstack;

			if (furnaceItemStacks[par1].stackSize <= par2) {
				itemstack = furnaceItemStacks[par1];
				furnaceItemStacks[par1] = null;
				return itemstack;
			} else {
				itemstack = furnaceItemStacks[par1].splitStack(par2);

				if (furnaceItemStacks[par1].stackSize == 0) {
					furnaceItemStacks[par1] = null;
				}

				return itemstack;
			}
		} else
			return null;
	}

	/**
	 * When some containers are closed they call this on each slot, then drop
	 * whatever it returns as an EntityItem - like when you close a workbench
	 * GUI.
	 */
	@Override
	public ItemStack getStackInSlotOnClosing(int par1) {
		if (furnaceItemStacks[par1] != null) {
			ItemStack itemstack = furnaceItemStacks[par1];
			furnaceItemStacks[par1] = null;
			return itemstack;
		} else
			return null;
	}

	/**
	 * Sets the given item stack to the specified slot in the inventory (can be
	 * crafting or armor sections).
	 */
	@Override
	public void setInventorySlotContents(int par1, ItemStack par2ItemStack) {
		furnaceItemStacks[par1] = par2ItemStack;

		if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit()) {
			par2ItemStack.stackSize = this.getInventoryStackLimit();
		}
	}

	/**
	 * Returns the name of the inventory.
	 */
	@Override
	public String getInvName() {
		return this.isInvNameLocalized() ? field_94130_e : "container.furnace";
	}

	/**
	 * If this returns false, the inventory name will be used as an unlocalized
	 * name, and translated into the player's language. Otherwise it will be
	 * used directly.
	 */
	@Override
	public boolean isInvNameLocalized() {
		return field_94130_e != null && field_94130_e.length() > 0;
	}

	public void func_94129_a(String par1Str) {
		field_94130_e = par1Str;
	}

	/**
	 * Reads a tile entity from NBT.
	 */
	@Override
	public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
		super.readFromNBT(par1NBTTagCompound);
		NBTTagList nbttaglist = par1NBTTagCompound.getTagList("Items");
		furnaceItemStacks = new ItemStack[this.getSizeInventory()];

		for (int i = 0; i < nbttaglist.tagCount(); ++i) {
			NBTTagCompound nbttagcompound1 = (NBTTagCompound) nbttaglist.tagAt(i);
			byte b0 = nbttagcompound1.getByte("Slot");

			if (b0 >= 0 && b0 < furnaceItemStacks.length) {
				furnaceItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}

		furnaceBurnTime = par1NBTTagCompound.getShort("BurnTime");
		furnaceCookTime = par1NBTTagCompound.getShort("CookTime");
		currentItemBurnTime = getItemBurnTime(furnaceItemStacks[1]);

		if (par1NBTTagCompound.hasKey("CustomName")) {
			field_94130_e = par1NBTTagCompound.getString("CustomName");
		}
	}

	/**
	 * Writes a tile entity to NBT.
	 */
	@Override
	public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
		super.writeToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setShort("BurnTime", (short) furnaceBurnTime);
		par1NBTTagCompound.setShort("CookTime", (short) furnaceCookTime);
		NBTTagList nbttaglist = new NBTTagList();

		for (int i = 0; i < furnaceItemStacks.length; ++i) {
			if (furnaceItemStacks[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				furnaceItemStacks[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}

		par1NBTTagCompound.setTag("Items", nbttaglist);

		if (this.isInvNameLocalized()) {
			par1NBTTagCompound.setString("CustomName", field_94130_e);
		}
	}

	/**
	 * Returns the maximum stack size for a inventory slot. Seems to always be
	 * 64, possibly will be extended. *Isn't this more of a set than a get?*
	 */
	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * Returns an integer between 0 and the passed value representing how close the current item is to being completely
	 * cooked
	 */
	public int getCookProgressScaled(int par1) {
		return furnaceCookTime * par1 / 200;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * Returns an integer between 0 and the passed value representing how much burn time is left on the current fuel
	 * item, where 0 means that the item is exhausted and the passed value means that the item is fresh
	 */
	public int getBurnTimeRemainingScaled(int par1) {
		if (currentItemBurnTime == 0) {
			currentItemBurnTime = 200;
		}

		return furnaceBurnTime * par1 / currentItemBurnTime;
	}

	/**
	 * Returns true if the furnace is currently burning
	 */
	public boolean isBurning() {
		return furnaceBurnTime > 0;
	}

	/**
	 * Allows the entity to update its state. Overridden in most subclasses,
	 * e.g. the mob spawner uses this to count ticks and creates a new spawn
	 * inside its implementation.
	 */
	@Override
	public void updateEntity() {
		boolean flag = furnaceBurnTime > 0;
		boolean flag1 = false;

		if (furnaceBurnTime > 0) {
			--furnaceBurnTime;
		}

		if (!worldObj.isRemote) {
			if (furnaceBurnTime == 0 && this.canSmelt()) {
				currentItemBurnTime = furnaceBurnTime = getItemBurnTime(furnaceItemStacks[1]);

				if (furnaceBurnTime > 0) {
					flag1 = true;

					if (furnaceItemStacks[1] != null) {
						--furnaceItemStacks[1].stackSize;

						if (furnaceItemStacks[1].stackSize == 0) {
							furnaceItemStacks[1] = furnaceItemStacks[1].getItem().getContainerItemStack(furnaceItemStacks[1]);
						}
					}
				}
			}

			if (this.isBurning() && this.canSmelt()) {
				++furnaceCookTime;

				if (furnaceCookTime == 200) {
					furnaceCookTime = 0;
					this.smeltItem();
					flag1 = true;
				}
			} else {
				furnaceCookTime = 0;
			}

			if (flag != furnaceBurnTime > 0) {
				flag1 = true;
				PlasticOven.updateFurnaceBlockState(furnaceBurnTime > 0, worldObj, xCoord, yCoord, zCoord);
			}
		}

		if (flag1) {
			this.onInventoryChanged();
		}
	}

	/**
	 * Returns true if the furnace can smelt an item, i.e. has a source item,
	 * destination stack isn't full, etc.
	 */
	private boolean canSmelt() {
		if (furnaceItemStacks[0] == null)
			return false;
		else {
			ItemStack itemstack = RecipesPlasticOven.smelting().getSmeltingResult(furnaceItemStacks[0]);
			if (itemstack == null)
				return false;
			if (furnaceItemStacks[2] == null)
				return true;
			if (!furnaceItemStacks[2].isItemEqual(itemstack))
				return false;
			int result = furnaceItemStacks[2].stackSize + itemstack.stackSize;
			return result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize();
		}
	}

	/**
	 * Turn one item from the furnace source stack into the appropriate smelted
	 * item in the furnace result stack
	 */
	public void smeltItem() {
		if (this.canSmelt()) {
			ItemStack itemstack = RecipesPlasticOven.smelting().getSmeltingResult(furnaceItemStacks[0]);

			if (furnaceItemStacks[2] == null) {
				furnaceItemStacks[2] = itemstack.copy();
			} else if (furnaceItemStacks[2].isItemEqual(itemstack)) {
				furnaceItemStacks[2].stackSize += itemstack.stackSize;
			}

			--furnaceItemStacks[0].stackSize;

			if (furnaceItemStacks[0].stackSize <= 0) {
				furnaceItemStacks[0] = null;
			}
		}
	}

	/**
	 * Returns the number of ticks that the supplied fuel item will keep the
	 * furnace burning, or 0 if the item isn't fuel
	 */
	public static int getItemBurnTime(ItemStack par0ItemStack) {
		if (par0ItemStack == null)
			return 0;
		else {
			int i = par0ItemStack.getItem().itemID;

			if (par0ItemStack.getItem() instanceof ItemBlock && Block.blocksList[i] != null) {
				Block block = Block.blocksList[i];

				if (block == Blocks.blockPlastic)
					return 2000;
				if (block == Machines.plasticOvenOff)
					return 1800;
				if (block == Machines.computerOff)
					return 1000;
			}
			if (i == Materials.plasticGlob.itemID)
				return 100;
			if (i == Materials.plastic.itemID)
				return 200;

			return 0;
		}
	}

    /**
     * Return true if item is a fuel source (getItemBurnTime() > 0).
     */
    public static boolean isItemFuel(ItemStack par0ItemStack)
    {
        return getItemBurnTime(par0ItemStack) > 0;
    }

    /**
     * Do not make give this method the name canInteractWith because it clashes with Container
     */
    public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer)
    {
        return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : par1EntityPlayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    public void openChest() {}

    public void closeChest() {}

    /**
     * Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot.
     */
    public boolean isStackValidForSlot(int par1, ItemStack par2ItemStack)
    {
        return par1 == 2 ? false : (par1 == 1 ? isItemFuel(par2ItemStack) : true);
    }

    /**
     * Returns an array containing the indices of the slots that can be accessed by automation on the given side of this
     * block.
     */
    public int[] getAccessibleSlotsFromSide(int par1)
    {
        return par1 == 0 ? field_102011_e : (par1 == 1 ? field_102010_d : field_102009_f);
    }

    /**
     * Returns true if automation can insert the given item in the given slot from the given side. Args: Slot, item,
     * side
     */
    public boolean canInsertItem(int par1, ItemStack par2ItemStack, int par3)
    {
        return this.isStackValidForSlot(par1, par2ItemStack);
    }

    /**
     * Returns true if automation can extract the given item in the given slot from the given side. Args: Slot, item,
     * side
     */
    public boolean canExtractItem(int par1, ItemStack par2ItemStack, int par3)
    {
        return par3 != 0 || par1 != 1 || par2ItemStack.itemID == Item.bucketEmpty.itemID;
    }

    /***********************************************************************************
     * This function is here for compatibilities sake, Modders should Check for
     * Sided before ContainerWorldly, Vanilla Minecraft does not follow the sided standard
     * that Modding has for a while.
     *
     * In vanilla:
     *
     *   Top: Ores
     *   Sides: Fuel
     *   Bottom: Output
     *
     * Standard Modding:
     *   Top: Ores
     *   Sides: Output
     *   Bottom: Fuel
     *
     * The Modding one is designed after the GUI, the vanilla one is designed because its
     * intended use is for the hopper, which logically would take things in from the top.
     *
     * This will possibly be removed in future updates, and make vanilla the definitive
     * standard.
     */

    @Override
    public int getStartInventorySide(ForgeDirection side)
    {
        if (ForgeDummyContainer.legacyFurnaceSides)
        {
            if (side == ForgeDirection.DOWN) return 1;
            if (side == ForgeDirection.UP) return 0;
            return 2;
        }
        else
        {
            if (side == ForgeDirection.DOWN) return 2;
            if (side == ForgeDirection.UP) return 0;
            return 1;
        }
    }

    @Override
    public int getSizeInventorySide(ForgeDirection side)
    {
        return 1;
    }
}
