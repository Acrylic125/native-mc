package com.acrylic.nativemcuniversal.factory;

import com.acrylic.nativemcuniversal.packets.EntityDestroyPacketWrapper;
import org.bukkit.entity.Entity;

public abstract class EntityFactory {

    public abstract EntityDestroyPacketWrapper destroyEntityPacket(int[] entityIds);

    public EntityDestroyPacketWrapper destroyEntityPacket(int entityId) {
        return this.destroyEntityPacket(new int[] {entityId});
    }

    public EntityDestroyPacketWrapper destroyEntityPacket(Entity entity) {
        return this.destroyEntityPacket(entity.getEntityId());
    }

}
