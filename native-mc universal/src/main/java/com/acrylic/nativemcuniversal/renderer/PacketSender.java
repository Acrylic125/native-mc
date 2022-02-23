package com.acrylic.nativemcuniversal.renderer;

import com.acrylic.nativemcuniversal.packets.PacketWrapper;
import org.bukkit.entity.Player;

public interface PacketSender {

    void send(Player player, Object packet);

    void send(Player player, PacketWrapper packetWrapper);

}
