package com.acrylic.nativemcuniversal.renderer;

import com.acrylic.nativemcuniversal.packets.PacketWrapper;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SinglePlayerPacketRenderer implements PacketRenderer {

    private final PacketSender sender;
    private Player player;

    public SinglePlayerPacketRenderer(@NotNull PacketSender sender) {
        this.sender = sender;
    }

    @Override
    public void renderPacket(Object packet) {
        if (player != null)
            sender.send(player, packet);
    }

    @Override
    public void renderPacket(PacketWrapper packetWrapper) {
        if (player != null)
            sender.send(player, packetWrapper);
    }

    @Nullable
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(@Nullable Player player) {
        this.player = player;
    }
}
