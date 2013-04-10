package civcraft.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import civcraft.CivCraftBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBlock extends Block {

	@SideOnly(Side.CLIENT)
	private Icon[] field_94349_a;
	@SideOnly(Side.CLIENT)
	public static Icon[] textures;

	public BlockBlock(int id) {
		super(id, Material.iron);
		this.setCreativeTab(CivCraftBase.tabsBlock);
		this.setUnlocalizedName("block");
		this.setHardness(3F);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegistry) {
		textures = new Icon[16];

		textures[0] = iconRegistry.registerIcon("CivCraft:blockTin");
		textures[1] = iconRegistry.registerIcon("CivCraft:blockCopper");
		textures[2] = iconRegistry.registerIcon("CivCraft:blockPlatinum");
		textures[3] = iconRegistry.registerIcon("CivCraft:blockSilver");
		textures[4] = iconRegistry.registerIcon("CivCraft:blockAluminum");
		textures[5] = iconRegistry.registerIcon("CivCraft:blockTitanium");
		textures[6] = iconRegistry.registerIcon("CivCraft:blockLead");
		textures[7] = iconRegistry.registerIcon("CivCraft:blockMercury");
		textures[8] = iconRegistry.registerIcon("CivCraft:blockZinc");
		textures[9] = iconRegistry.registerIcon("CivCraft:blockTungsten");
		textures[10] = iconRegistry.registerIcon("CivCraft:blockUranium");
		textures[11] = iconRegistry.registerIcon("CivCraft:blockBronze");
		textures[12] = iconRegistry.registerIcon("CivCraft:blockBrass");
		textures[13] = iconRegistry.registerIcon("CivCraft:blockSteel");
		textures[14] = iconRegistry.registerIcon("CivCraft:blockCarbide");
		textures[15] = iconRegistry.registerIcon("CivCraft:blockSilicon");
	}

	@Override
	public Icon getBlockTextureFromSideAndMetadata(int blockSide, int blockMeta) {
		return textures[blockMeta];
	}

	@Override
	public int damageDropped(int par1) {
		return par1;
	}

	public static int getBlockFromBlock(int par0) {
		return ~par0 & 15;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CivCraftBase par2CreativeTabs, List par3List) {
		for (int j = 0; j < 16; ++j) {
			par3List.add(new ItemStack(par1, 1, j));
		}
	}

	@SideOnly(Side.CLIENT)
	public void func_94332_a(IconRegister par1IconRegister) {
		field_94349_a = new Icon[16];
		for (int i = 0; i < field_94349_a.length; ++i) {
			field_94349_a[i] = par1IconRegister.registerIcon("block_" + i);
		}
	}
}