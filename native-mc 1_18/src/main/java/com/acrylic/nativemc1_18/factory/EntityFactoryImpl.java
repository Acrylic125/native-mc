package com.acrylic.nativemc1_18.factory;

import com.acrylic.nativemc1_18.packets.EntityDestroyPacketWrapperImpl;
import com.acrylic.nativemcuniversal.factory.EntityFactory;
import com.acrylic.nativemcuniversal.packets.EntityDestroyPacketWrapper;

public class EntityFactoryImpl extends EntityFactory {

    @Override
    public EntityDestroyPacketWrapper destroyEntityPacket(int[] entityIds) {
        return new EntityDestroyPacketWrapperImpl(entityIds);
    }
}
