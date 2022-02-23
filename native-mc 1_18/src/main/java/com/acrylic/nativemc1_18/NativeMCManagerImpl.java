package com.acrylic.nativemc1_18;

import com.acrylic.nativemc1_18.factory.EntityFactoryImpl;
import com.acrylic.nativemc1_18.renderer.PacketSenderImpl;
import com.acrylic.nativemcuniversal.factory.EntityFactory;
import com.acrylic.nativemcuniversal.NativeMCManager;
import com.acrylic.nativemcuniversal.renderer.PacketSender;

public class NativeMCManagerImpl implements NativeMCManager {

    private final EntityFactory entityFactory = new EntityFactoryImpl();
    private final PacketSender packetSender = new PacketSenderImpl();

    @Override
    public EntityFactory useEntity() {
        return this.entityFactory;
    }

    @Override
    public PacketSender usePacketSender() {
        return packetSender;
    }
}
