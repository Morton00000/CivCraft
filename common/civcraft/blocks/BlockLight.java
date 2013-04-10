package civcraft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLight extends Block {

	/** Whether this lamp block is the powered version. */
	private final boolean powered;

	public BlockLight(int par1, boolean par2) {
		super(par1, Material.redstoneLight);
		powered = par2;

		if (par2) {
			this.setLightValue(1.0F);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	public void registerIcons(IconRegister par1IconRegister) {
		if (powered) {
			blockIcon = par1IconRegister.registerIcon("CivCraft:light_lit");
		} else {
			blockIcon = par1IconRegister.registerIcon("CivCraft:light");
		}
	}

	/**
	 * Called whenever the block is added into the world. Args: world, x, y, z
	 */
	@Override
	public void onBlockAdded(World par1World, int par2, int par3, int par4) {
		if (!par1World.isRemote) {
			if (powered && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4)) {
				par1World.scheduleBlockUpdate(par2, par3, par4, blockID, 4);
			} else if (!powered && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4)) {
				par1World.setBlock(par2, par3, par4, Machines.lightOn.blockID, 0, 2);
			}
		}
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which
	 * neighbor changed (coordinates passed are their own) Args: x, y, z,
	 * neighbor blockID
	 */
	@Override
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
		if (!par1World.isRemote) {
			if (powered && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4)) {
				par1World.scheduleBlockUpdate(par2, par3, par4, blockID, 4);
			} else if (!powered && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4)) {
				par1World.setBlock(par2, par3, par4, Machines.lightOn.blockID, 0, 2);
			}
		}
	}

	/**
	 * Ticks the block if it's been scheduled
	 */
	@Override
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
		if (!par1World.isRemote && powered && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4)) {
			par1World.setBlock(par2, par3, par4, Machines.lightOff.blockID, 0, 2);
		}
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return Machines.lightOff.blockID;
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
	 */
	public int idPicked(World par1World, int par2, int par3, int par4) {
		return Machines.lightOff.blockID;
	}
}
