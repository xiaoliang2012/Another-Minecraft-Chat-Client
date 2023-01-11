package net.defekt.mc.chatclient.protocol.packets.v1_19.serverbound.play;

import net.defekt.mc.chatclient.protocol.packets.PacketRegistry;
import net.defekt.mc.chatclient.protocol.packets.abstr.BaseClientChatMessagePacket;

public class ClientChatCommandPacket extends BaseClientChatMessagePacket {

    public ClientChatCommandPacket(PacketRegistry reg, String message) {
        super(reg, message, true);
        String cmd = message;
        if (cmd.startsWith("/")) cmd = cmd.substring(1);
        putString(cmd);
        putLong(System.currentTimeMillis());
        putLong(0);
        putVarInt(0);
        putBoolean(false);
    }

}