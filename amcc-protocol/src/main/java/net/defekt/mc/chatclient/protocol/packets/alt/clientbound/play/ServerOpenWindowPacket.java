package net.defekt.mc.chatclient.protocol.packets.alt.clientbound.play;

import java.io.IOException;

import net.defekt.mc.chatclient.protocol.io.VarInputStream;
import net.defekt.mc.chatclient.protocol.packets.PacketRegistry;
import net.defekt.mc.chatclient.protocol.packets.abstr.BaseServerOpenWindowPacket;

/**
 * Old version of
 * {@link net.defekt.mc.chatclient.protocol.packets.general.clientbound.play.ServerOpenWindowPacket}
 * 
 * @author Defective4
 *
 */
public class ServerOpenWindowPacket extends BaseServerOpenWindowPacket {

    /**
     * Constructs {@link ServerOpenWindowPacket}
     * 
     * @param reg  packet registry used to construct this packet
     * @param data packet's data
     * @throws IOException never thrown
     */
    public ServerOpenWindowPacket(final PacketRegistry reg, final byte[] data) throws IOException {
        super(reg, data);
        final VarInputStream is = getInputStream();
        windowID = is.readUnsignedByte();
        windowInt = is.readVarInt();
        windowTitle = is.readString();
    }

}
