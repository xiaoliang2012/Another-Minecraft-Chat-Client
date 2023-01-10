package net.defekt.mc.chatclient.protocol.packets.alt.clientbound.play;

import java.io.IOException;

import net.defekt.mc.chatclient.protocol.io.VarInputStream;
import net.defekt.mc.chatclient.protocol.packets.PacketRegistry;
import net.defekt.mc.chatclient.protocol.packets.abstr.AbstractSpawnPlayerPacket;

@SuppressWarnings("javadoc")
public class ServerSpawnPlayerPacket extends AbstractSpawnPlayerPacket {

    public ServerSpawnPlayerPacket(final PacketRegistry reg, final byte[] data) throws IOException {
        super(reg, data);
        final VarInputStream is = getInputStream();
        id = is.readVarInt();
        uid = is.readUUID();
        x = is.readInt();
        y = is.readInt();
        z = is.readInt();

        x /= 32;
        y /= 32;
        z /= 32;
    }
}
