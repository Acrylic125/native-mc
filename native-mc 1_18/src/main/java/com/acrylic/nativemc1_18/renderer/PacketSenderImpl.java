package com.acrylic.nativemc1_18.renderer;

import com.acrylic.nativemcuniversal.packets.PacketWrapper;
import com.acrylic.nativemcuniversal.renderer.PacketSender;
import net.minecraft.network.protocol.Packet;
import org.bukkit.craftbukkit.v1_18_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class PacketSenderImpl implements PacketSender {

    @Override
    public void send(Player player, Object packet) {
        if (packet instanceof Packet)
           ((CraftPlayer) player).getHandle().connection.send((Packet<?>) packet);
    }

    @Override
    public void send(Player player, PacketWrapper packetWrapper) {
        this.send(player, packetWrapper);
    }
}
