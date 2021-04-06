package net.defekt.mc.chatclient.protocol.packets.registry;

import java.util.HashMap;
import java.util.Map;

import net.defekt.mc.chatclient.protocol.packets.Packet;
import net.defekt.mc.chatclient.protocol.packets.PacketRegistry;
import net.defekt.mc.chatclient.protocol.packets.general.clientbound.login.ServerLoginSuccessPacket;
import net.defekt.mc.chatclient.protocol.packets.general.clientbound.play.ServerChatMessagePacket;
import net.defekt.mc.chatclient.protocol.packets.general.clientbound.play.ServerDisconnectPacket;
import net.defekt.mc.chatclient.protocol.packets.general.clientbound.play.ServerJoinGamePacket;
import net.defekt.mc.chatclient.protocol.packets.general.clientbound.play.ServerPlayerListItemPacket;
import net.defekt.mc.chatclient.protocol.packets.general.clientbound.play.ServerPluginMessagePacket;
import net.defekt.mc.chatclient.protocol.packets.general.clientbound.play.ServerResourcePackSendPacket;
import net.defekt.mc.chatclient.protocol.packets.general.clientbound.play.ServerUpdateHealthPacket;
import net.defekt.mc.chatclient.protocol.packets.general.serverbound.login.ClientLoginRequestPacket;
import net.defekt.mc.chatclient.protocol.packets.general.serverbound.play.ClientChatMessagePacket;
import net.defekt.mc.chatclient.protocol.packets.general.serverbound.play.ClientEntityActionPacket;
import net.defekt.mc.chatclient.protocol.packets.general.serverbound.play.ClientPluginMessagePacket;
import net.defekt.mc.chatclient.protocol.packets.general.serverbound.play.ClientRespawnPacket;
import net.defekt.mc.chatclient.protocol.packets.v47.clientbound.play.ServerKeepAlivePacket;
import net.defekt.mc.chatclient.protocol.packets.v47.clientbound.play.ServerPlayerPositionAndLookPacket;
import net.defekt.mc.chatclient.protocol.packets.v47.serverbound.play.ClientKeepAlivePacket;
import net.defekt.mc.chatclient.protocol.packets.v47.serverbound.play.ClientResourcePackStatusPacket;

/**
 * A packet registry implementation for protocol 47
 * 
 * @author Defective4
 */
public class PacketRegistryV47 extends PacketRegistry {

	@Override
	public Map<Integer, Class<? extends Packet>> initLoginPackets() {
		return new HashMap<Integer, Class<? extends Packet>>() {
			private static final long serialVersionUID = 1L;
			{
				put(0x00, ClientLoginRequestPacket.class);
				put(0x02, ServerLoginSuccessPacket.class);
			}
		};
	}

	@Override
	protected Map<Integer, Class<? extends Packet>> initOutPackets() {
		return new HashMap<Integer, Class<? extends Packet>>() {
			private static final long serialVersionUID = 1L;
			{
				put(0x00, ClientKeepAlivePacket.class);
				put(0x01, ClientChatMessagePacket.class);
				put(0x19, ClientResourcePackStatusPacket.class);
				put(0x17, ClientPluginMessagePacket.class);
				put(0x16, ClientRespawnPacket.class);
				put(0x0B, ClientEntityActionPacket.class);
			}
		};
	}

	@Override
	protected Map<Integer, Class<? extends Packet>> initInPackets() {
		return new HashMap<Integer, Class<? extends Packet>>() {
			private static final long serialVersionUID = 1L;
			{
				put(0x00, ServerKeepAlivePacket.class);
				put(0x02, ServerChatMessagePacket.class);
				put(0x08, ServerPlayerPositionAndLookPacket.class);
				put(0x40, ServerDisconnectPacket.class);
				put(0x48, ServerResourcePackSendPacket.class);
				put(0x3F, ServerPluginMessagePacket.class);
				put(0x06, ServerUpdateHealthPacket.class);
				put(0x01, ServerJoinGamePacket.class);
				put(0x38, ServerPlayerListItemPacket.class);
			}
		};
	}

}
