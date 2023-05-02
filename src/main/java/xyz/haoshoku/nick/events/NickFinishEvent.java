package xyz.haoshoku.nick.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;
import java.util.UUID;

public class NickFinishEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Player player;

    private final UUID originalUniqueId;
    private final String originalName;
    private final String[] originalSkinData;

    private final UUID uniqueId;
    private final String name;
    private final String[] skinData;

    private final List<UUID> bypassList;

    public NickFinishEvent( Player player, UUID originalUniqueId, String originalName, String[] originalSkinData, UUID uniqueId, String name, String[] skinData, List<UUID> bypassList ) {
        this.player = player;
        this.originalUniqueId = originalUniqueId;
        this.originalName = originalName;
        this.originalSkinData = originalSkinData;
        this.uniqueId = uniqueId;
        this.name = name;
        this.skinData = skinData;
        this.bypassList = bypassList;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public Player getPlayer() {
        return this.player;
    }

    public UUID getOriginalUniqueId() {
        return this.originalUniqueId;
    }

    public String getOriginalName() {
        return this.originalName;
    }

    public String[] getOriginalSkinData() {
        return this.originalSkinData;
    }

    public UUID getUniqueId() {
        return this.uniqueId;
    }

    public String getName() {
        return this.name;
    }

    public String[] getSkinData() {
        return this.skinData;
    }

    public List<UUID> getBypassList() {
        return this.bypassList;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

}
