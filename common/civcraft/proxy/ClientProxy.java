package civcraft.proxy;

import civcraft.lib.RenderIDs;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void initRenderingAndTextures() {

		RenderIDs.furnaceBlastRenderId = RenderingRegistry.getNextAvailableRenderId();
		RenderIDs.furnaceIndRenderId = RenderingRegistry.getNextAvailableRenderId();
		RenderIDs.furnaceMoldRenderId = RenderingRegistry.getNextAvailableRenderId();
		RenderIDs.furnacePlasticRenderId = RenderingRegistry.getNextAvailableRenderId();
		RenderIDs.crusher1RenderId = RenderingRegistry.getNextAvailableRenderId();
		RenderIDs.crusher2RenderId = RenderingRegistry.getNextAvailableRenderId();

	}
}
