package net.defekt.mc.chatclient.protocol.entity;

import java.util.UUID;

public class Player extends Entity {
    public Player(UUID uid, double x, double y, double z) {
        super(uid, -1, x, y, z);
    }
}