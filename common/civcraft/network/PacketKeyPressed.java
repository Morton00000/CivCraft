package civcraft.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.network.INetworkManager;
import cpw.mods.fml.common.network.Player;

public class PacketKeyPressed extends PacketCC {

	public String key;

	public PacketKeyPressed() {

		super(PacketTypeHandler.KEY, false);
	}

	public PacketKeyPressed(String key) {

		super(PacketTypeHandler.KEY, false);
		this.key = key;
	}

	@Override
	public void writeData(DataOutputStream data) throws IOException {

		data.writeUTF(key);
	}

	@Override
	public void readData(DataInputStream data) throws IOException {

		key = data.readUTF();
	}

	public void setKey(String key) {

		this.key = key;
	}

	@Override
	public void execute(INetworkManager manager, Player player) {}
}
