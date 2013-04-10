package civcraft.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import civcraft.containers.machines.ContainerCrusher1;
import civcraft.containers.machines.ContainerCrusher2;
import civcraft.containers.machines.ContainerFurnaceBlast;
import civcraft.containers.machines.ContainerFurnaceInd;
import civcraft.containers.machines.ContainerFurnaceMold;
import civcraft.containers.machines.ContainerPlasticOven;
import civcraft.guis.machines.GuiCrusher1;
import civcraft.guis.machines.GuiCrusher2;
import civcraft.guis.machines.GuiFurnaceBlast;
import civcraft.guis.machines.GuiFurnaceInd;
import civcraft.guis.machines.GuiFurnaceMold;
import civcraft.guis.machines.GuiPlasticOven;
import civcraft.lib.GuiIDs;
import civcraft.tiles.machines.TileCrusher1;
import civcraft.tiles.machines.TileCrusher2;
import civcraft.tiles.machines.TileFurnaceBlast;
import civcraft.tiles.machines.TileFurnaceInd;
import civcraft.tiles.machines.TileFurnaceMold;
import civcraft.tiles.machines.TilePlasticOven;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy implements IGuiHandler {

	public void registerKeyBindingHandler() {}

	public void registerRenderTickHandler() {}

	public void registerDrawBlockHighlightHandler() {}

	public void setKeyBinding(String name, int value) {}

	public void registerSoundHandler() {}

	public void initCustomRarityTypes() {}

	public void initRenderingAndTextures() {}

	public void initTileEntities() {

		GameRegistry.registerTileEntity(TileFurnaceBlast.class, "furnaceBlast");
		GameRegistry.registerTileEntity(TileFurnaceInd.class, "furnaceInd");
		GameRegistry.registerTileEntity(TileFurnaceMold.class, "furnaceMold");
		GameRegistry.registerTileEntity(TilePlasticOven.class, "furnacePlastic");
		GameRegistry.registerTileEntity(TileCrusher1.class, "crusher1");
		GameRegistry.registerTileEntity(TileCrusher2.class, "crusher2");

	}

	public void sendWorldEventPacket(byte eventType, int originX, int originY, int originZ, byte sideHit, byte rangeX, byte rangeY, byte rangeZ, String data) {}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		if (ID == GuiIDs.FURNACE_BLAST) {
			TileFurnaceBlast tilefurnaceBlast = (TileFurnaceBlast) world.getBlockTileEntity(x, y, z);
			return new ContainerFurnaceBlast(player.inventory, tilefurnaceBlast);
		}

		else if (ID == GuiIDs.FURNACE_IND) {
			TileFurnaceInd tileFurnaceInd = (TileFurnaceInd) world.getBlockTileEntity(x, y, z);
			return new ContainerFurnaceInd(player.inventory, tileFurnaceInd);
		}

		else if (ID == GuiIDs.FURNACE_MOLD) {
			TileFurnaceMold tileFurnaceMold = (TileFurnaceMold) world.getBlockTileEntity(x, y, z);
			return new ContainerFurnaceMold(player.inventory, tileFurnaceMold);
		}

		else if (ID == GuiIDs.FURNACE_EASY) {
			TilePlasticOven tilePlasticOven = (TilePlasticOven) world.getBlockTileEntity(x, y, z);
			return new ContainerPlasticOven(player.inventory, tilePlasticOven);
		}

		else if (ID == GuiIDs.CRUSHER_1) {
			TileCrusher1 tileCrusher1 = (TileCrusher1) world.getBlockTileEntity(x, y, z);
			return new ContainerCrusher1(player.inventory, tileCrusher1);
		}

		else if (ID == GuiIDs.CRUSHER_2) {
			TileCrusher2 tileCrusher2 = (TileCrusher2) world.getBlockTileEntity(x, y, z);
			return new ContainerCrusher2(player.inventory, tileCrusher2);
		}

		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		if (ID == GuiIDs.FURNACE_BLAST) {
			TileFurnaceBlast tilefurnaceBlast = (TileFurnaceBlast) world.getBlockTileEntity(x, y, z);
			return new GuiFurnaceBlast(player.inventory, tilefurnaceBlast);
		}

		else if (ID == GuiIDs.FURNACE_IND) {
			TileFurnaceInd tilefurnaceInd = (TileFurnaceInd) world.getBlockTileEntity(x, y, z);
			return new GuiFurnaceInd(player.inventory, tilefurnaceInd);
		}

		else if (ID == GuiIDs.FURNACE_MOLD) {
			TileFurnaceMold tileFurnaceMold = (TileFurnaceMold) world.getBlockTileEntity(x, y, z);
			return new GuiFurnaceMold(player.inventory, tileFurnaceMold);
		}

		else if (ID == GuiIDs.FURNACE_EASY) {
			TilePlasticOven tilePlasticOven = (TilePlasticOven) world.getBlockTileEntity(x, y, z);
			return new GuiPlasticOven(player.inventory, tilePlasticOven);
		}

		else if (ID == GuiIDs.CRUSHER_1) {
			TileCrusher1 tileCrusher1 = (TileCrusher1) world.getBlockTileEntity(x, y, z);
			return new GuiCrusher1(player.inventory, tileCrusher1);
		}

		else if (ID == GuiIDs.CRUSHER_2) {
			TileCrusher2 tileCrusher2 = (TileCrusher2) world.getBlockTileEntity(x, y, z);
			return new GuiCrusher2(player.inventory, tileCrusher2);
		}

		return null;
	}

	public void registerRenderers() {}
}
