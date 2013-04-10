package civcraft.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.network.INetworkManager;
import cpw.mods.fml.common.network.Player;

public class PacketResultEvent extends PacketCC {

	public boolean shouldChangeNextBlock;
	public boolean shouldDestroyCurrentlyHeldItem;

	public PacketResultEvent() {

		super(PacketTypeHandler.RESULT_EVENT, false);
	}

	public PacketResultEvent(boolean shouldChangeNextBlock, boolean shouldDestroyCurrentlyHeldItem) {

		super(PacketTypeHandler.RESULT_EVENT, false);
		this.shouldChangeNextBlock = shouldChangeNextBlock;
		this.shouldDestroyCurrentlyHeldItem = shouldDestroyCurrentlyHeldItem;
	}

	@Override
	public void writeData(DataOutputStream data) throws IOException {

		data.writeBoolean(shouldChangeNextBlock);
		data.writeBoolean(shouldDestroyCurrentlyHeldItem);
	}

	@Override
	public void readData(DataInputStream data) throws IOException {

		shouldChangeNextBlock = data.readBoolean();
		shouldDestroyCurrentlyHeldItem = data.readBoolean();
	}

	@Override
	public void execute(INetworkManager manager, Player player) {

		System.out.println(shouldChangeNextBlock);

	}

}
