package com.acrylic.nativemcuniversal.renderer;

import com.acrylic.nativemcuniversal.packets.PacketWrapper;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Stack;

public class RangePacketRenderer implements PacketRenderer {

    private final PacketSender sender;
    private final Collection<Player> players = new Stack<>();

    public RangePacketRenderer(@NotNull PacketSender sender) {
        this.sender = sender;
    }

    @Override
    public void renderPacket(Object packet) {
        players.forEach(player -> sender.send(player, packet));
    }

    @Override
    public void renderPacket(PacketWrapper packetWrapper) {
        players.forEach(player -> sender.send(player, packetWrapper));
    }

    public void scanPlayers(Location origin, float rangeX, float rangeY, float rangeZ) {
        World world = origin.getWorld();
        assert world != null;
        synchronized (this.players) {
            this.players.clear();
            world.getNearbyEntities(origin, rangeX, rangeY, rangeZ).forEach((entity -> {
                if (entity instanceof Player)
                    this.players.add((Player) entity);
            }));
        }
    }

    public void scanPlayers(Location origin, float range) {
        this.scanPlayers(origin, range, range, range);
    }

}
