package com.acrylic.nativemcuniversal;

import com.acrylic.nativemcuniversal.factory.EntityFactory;
import com.acrylic.nativemcuniversal.renderer.PacketSender;

/**
 * Holds factories and other utilities implemented within each version.
 * Side Note: Maybe rename it to something else?
 */
public interface NativeMCManager {

    EntityFactory useEntity();

    PacketSender usePacketSender();

}
