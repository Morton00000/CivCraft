package civcraft.network;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;

public enum PacketTypeHandler {

	KEY(PacketKeyPressed.class), TILE(PacketTileUpdate.class), REQUEST_EVENT(
			PacketRequestEvent.class), SPAWN_PARTICLE(PacketSpawnParticle.class), RESULT_EVENT(
			PacketResultEvent.class);

	private Class<? extends PacketCC> clazz;

	PacketTypeHandler(Class<? extends PacketCC> clazz) {

		this.clazz = clazz;
	}

	public static PacketCC buildPacket(byte[] data) {

		ByteArrayInputStream bis = new ByteArrayInputStream(data);
		int selector = bis.read();
		DataInputStream dis = new DataInputStream(bis);

		PacketCC packet = null;

		try {
			packet = values()[selector].clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}

		packet.readPopulate(dis);

		return packet;
	}

	public static PacketCC buildPacket(PacketTypeHandler type) {

		PacketCC packet = null;

		try {
			packet = values()[type.ordinal()].clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}

		return packet;
	}

	public static Packet populatePacket(PacketCC packet1) {

		byte[] data = packet1.populate();

		Packet250CustomPayload packet250 = new Packet250CustomPayload();
		packet250.channel = "civcraft";
		packet250.data = data;
		packet250.length = data.length;
		packet250.isChunkDataPacket = packet1.isChunkDataPacket;

		return packet250;
	}
}
