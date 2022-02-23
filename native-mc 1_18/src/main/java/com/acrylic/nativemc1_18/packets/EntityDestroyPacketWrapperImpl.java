package com.acrylic.nativemc1_18.packets;

import com.acrylic.nativemcuniversal.packets.EntityDestroyPacketWrapper;
import net.minecraft.network.protocol.game.ClientboundRemoveEntitiesPacket;

public class EntityDestroyPacketWrapperImpl implements EntityDestroyPacketWrapper {

    private final ClientboundRemoveEntitiesPacket entityDestroy;

    public EntityDestroyPacketWrapperImpl(int[] entityIds) {
        this.entityDestroy = new ClientboundRemoveEntitiesPacket(entityIds);
    }

    @Override
    public int[] getEntityIDs() {
        return this.entityDestroy.getEntityIds().toIntArray();
    }

    @Override
    public ClientboundRemoveEntitiesPacket getRawPacket() {
        return this.entityDestroy;
    }
}
