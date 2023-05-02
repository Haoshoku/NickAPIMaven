package xyz.haoshoku.nick.user;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import org.bukkit.Color;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;


public class NickUser {

    private UUID uuid;
    private Player player;

    private int nickAbleLoop;

    private boolean login;

    private String originalName;
    private String[] originalSkinData;
    private boolean nickAble;

    private boolean nickSet;
    private boolean skinSet;

    private volatile boolean refreshingPlayer;

    private volatile GameProfile originalProfile;
    private volatile GameProfile nickProfile;
    private UUID fakeUUID;
    private String[] skinData;

    private volatile List<UUID> bypassList;

    private volatile ConcurrentHashMap<String, Object> queueMap;

    private String teamName, prefix, suffix;
    private Color color;

    public NickUser( UUID uuid ) {
        this.uuid = uuid;
        this.bypassList = Lists.newArrayList();
        this.queueMap = new ConcurrentHashMap<>();
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid( UUID uuid ) {
        this.uuid = uuid;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer( Player player ) {
        this.player = player;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin( boolean login ) {
        this.login = login;
    }

    public int getNickAbleLoop() {
        return nickAbleLoop;
    }

    public void setNickAbleLoop( int nickAbleLoop ) {
        this.nickAbleLoop = nickAbleLoop;
    }

    public boolean isRefreshingPlayer() {
        return refreshingPlayer;
    }

    public void setRefreshingPlayer( boolean refreshingPlayer ) {
        this.refreshingPlayer = refreshingPlayer;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName( String originalName ) {
        this.originalName = originalName;
    }

    public String[] getOriginalSkinData() {
        return originalSkinData;
    }

    public void setOriginalSkinData( String[] originalSkinData ) {
        this.originalSkinData = originalSkinData;
    }

    public boolean isNickAble() {
        return nickAble;
    }

    public void setNickAble( boolean nickAble ) {
        this.nickAble = nickAble;
    }

    public boolean isNickSet() {
        return nickSet;
    }

    public void setNickSet( boolean nickSet ) {
        this.nickSet = nickSet;
    }

    public boolean isSkinSet() {
        return skinSet;
    }

    public void setSkinSet( boolean skinSet ) {
        this.skinSet = skinSet;
    }

    public GameProfile getOriginalProfile() {
        return originalProfile;
    }

    public void setOriginalProfile( GameProfile originalProfile ) {
        this.originalProfile = originalProfile;
    }

    public GameProfile getNickProfile() {
        return nickProfile;
    }

    public void setNickProfile( GameProfile nickProfile ) {
        this.nickProfile = nickProfile;
    }

    public UUID getFakeUUID() {
        return fakeUUID;
    }

    public void setFakeUUID( UUID fakeUUID ) {
        this.fakeUUID = fakeUUID;
    }

    public List<UUID> getBypassList() {
        return bypassList;
    }

    public void setBypassList( List<UUID> bypassList ) {
        this.bypassList = bypassList;
    }

    public ConcurrentHashMap<String, Object> getQueueMap() {
        return queueMap;
    }

    public void setQueueMap( ConcurrentHashMap<String, Object> queueMap ) {
        this.queueMap = queueMap;
    }

    public String[] getSkinData() {
        return skinData;
    }

    public void setSkinData( String[] skinData ) {
        this.skinData = skinData;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName( String teamName ) {
        this.teamName = teamName;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix( String prefix ) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix( String suffix ) {
        this.suffix = suffix;
    }

    public Color getColor() {
        return color;
    }

    public void setColor( Color color ) {
        this.color = color;
    }

}
