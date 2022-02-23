package com.acrylic.nativemcuniversal.renderer;

import com.acrylic.nativemcuniversal.packets.PacketWrapper;

/**
 * Use DI to get a reference of a PacketSender.
 */
public interface PacketRenderer {

    void renderPacket(Object packet);

    void renderPacket(PacketWrapper packetWrapper);

}
