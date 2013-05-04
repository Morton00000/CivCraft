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

public class BlockOre extends Block {

	@SideOnly(Side.CLIENT)
	public static Icon[] textures;

	public BlockOre(int id) {
		super(id, Material.rock);
		this.setCreativeTab(CivCraftBase.tabsBlock);
		this.setUnlocalizedName("ore");
		this.setHardness(3F);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegistry) {
		textures = new Icon[11];

		textures[0] = iconRegistry.registerIcon("CivCraft:oreTin");
		textures[1] = iconRegistry.registerIcon("CivCraft:oreCopper");
		textures[2] = iconRegistry.registerIcon("CivCraft:orePlatinum");
		textures[3] = iconRegistry.registerIcon("CivCraft:oreSilver");
		textures[4] = iconRegistry.registerIcon("CivCraft:oreAluminium");
		textures[5] = iconRegistry.registerIcon("CivCraft:oreTitanium");
		textures[6] = iconRegistry.registerIcon("CivCraft:oreLead");
		textures[7] = iconRegistry.registerIcon("CivCraft:oreMercury");
		textures[8] = iconRegistry.registerIcon("CivCraft:oreZinc");
		textures[9] = iconRegistry.registerIcon("CivCraft:oreTungsten");
		textures[10] = iconRegistry.registerIcon("CivCraft:oreUranium");
	}

	public Icon getBlockTextureFromSideAndMetadata(int blockSide, int blockMeta) {
		return textures[blockMeta];
	}

	@Override
	public int damageDropped(int par1) {
		return par1;
	}

	public static int getBlockFromOre(int par0) {
		return ~par0 & 10;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CivCraftBase par2CreativeTabs, List par3List) {
		for (int j = 0; j < 11; ++j) {
			par3List.add(new ItemStack(par1, 1, j));
		}
	}
}