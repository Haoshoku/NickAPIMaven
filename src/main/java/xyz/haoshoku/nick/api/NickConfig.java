package xyz.haoshoku.nick.api;


import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

public class NickConfig {

    private boolean updateAvailable;
    private boolean skinChanging;
    private String preventJoinOnStartupMessage;
    private String accountAlreadyOnServerMessage;
    private boolean gameProfileChanges;
    private int tabComplete;
    private boolean mojangAPI;
    private int packetInjection;
    private int respawnMethod;

    private boolean commandSupportForNickNames;
    private boolean commandSupportRemoveOriginalName;
    private String commandOriginalPlayerReplacement;

    private boolean skinSettings;
    private List<String> skinSettingsDefaultNames;
    private boolean skinSettingsTexturesEnabled;
    private String skinSettingsDefaultValue;
    private String skinSettingsDefaultSignature;

    private int cacheResetTimeUUID, cacheResetTimeSkin;

    private boolean cracked;
    private List<String> crackedDefaultNames;
    private boolean crackedTexturesEnabled;
    private String crackedDefaultValue;
    private String crackedDefaultSignature;

    public NickConfig() {
        FileConfiguration config = null;

        this.updateAvailable = config.getBoolean( "nickapi.update_available" );
        this.skinChanging = config.getBoolean( "nickapi.skin_changing" );
        this.preventJoinOnStartupMessage = config.getString( "nickapi.prevent_join_on_startup" );
        this.accountAlreadyOnServerMessage = config.getString( "nickapi.account_already_on_server_message" );
        this.gameProfileChanges = config.getBoolean( "nickapi.game_profile_changes" );
        this.tabComplete = config.getInt( "nickapi.tab_complete" );
        this.packetInjection = config.getInt( "nickapi.packet_injection" );
        this.mojangAPI = config.getBoolean( "nickapi.mojang_api" );
        this.respawnMethod = config.getInt( "nickapi.respawn_method" );

        this.commandSupportForNickNames = config.getBoolean( "nickapi.command_support.nicked_names" );
        this.commandSupportRemoveOriginalName = config.getBoolean( "nickapi.command_support.remove_original_name" );
        this.commandOriginalPlayerReplacement = config.getString( "nickapi.command_support.original_player_replacement" );

        this.skinSettings = config.getBoolean( "nickapi.skin_settings.enabled" );
        this.skinSettingsDefaultNames = config.getStringList( "nickapi.skin_settings.default_names" );
        this.skinSettingsTexturesEnabled = config.getBoolean( "nickapi.skin_settings.textures.enabled" );
        this.skinSettingsDefaultValue = config.getString( "nickapi.skin_settings.textures.default_value" );
        this.skinSettingsDefaultSignature = config.getString( "nickapi.skin_settings.textures.default_signature" );

        this.cacheResetTimeUUID = config.getInt( "nickapi.cache_reset_time.uuid" );
        this.cacheResetTimeSkin = config.getInt( "nickapi.cache_reset_time.skin" );


        this.cracked = config.getBoolean( "nickapi.cracked.enabled" );
        this.crackedDefaultNames = config.getStringList( "nickapi.cracked.default_names" );
        this.crackedTexturesEnabled = config.getBoolean( "nickapi.cracked.textures.enabled" );
        this.crackedDefaultValue = config.getString( "nickapi.cracked.textures.default_value" );
        this.crackedDefaultSignature = config.getString( "nickapi.cracked.textures.default_signature" );
    }

    public int getPacketInjection() {
        return packetInjection;
    }

    public void setPacketInjection( int packetInjection ) {
        this.packetInjection = packetInjection;
    }

    public boolean isUpdateAvailable() {
        return updateAvailable;
    }

    public void setUpdateAvailable( boolean updateAvailable ) {
        this.updateAvailable = updateAvailable;
    }

    public boolean isSkinChanging() {
        return skinChanging;
    }

    public void setSkinChanging( boolean skinChanging ) {
        this.skinChanging = skinChanging;
    }

    public String getPreventJoinOnStartupMessage() {
        return preventJoinOnStartupMessage;
    }

    public void setPreventJoinOnStartupMessage( String preventJoinOnStartupMessage ) {
        this.preventJoinOnStartupMessage = preventJoinOnStartupMessage;
    }

    public String getAccountAlreadyOnServerMessage() {
        return this.accountAlreadyOnServerMessage;
    }

    public void setAccountAlreadyOnServerMessage( String accountAlreadyOnServerMessage ) {
        this.accountAlreadyOnServerMessage = accountAlreadyOnServerMessage;
    }

    public boolean isGameProfileChanges() {
        return gameProfileChanges;
    }

    public void setGameProfileChanges( boolean gameProfileChanges ) {
        this.gameProfileChanges = gameProfileChanges;
    }

    public int getTabComplete() {
        return tabComplete;
    }

    public void setTabComplete( int tabComplete ) {
        this.tabComplete = tabComplete;
    }

    public boolean isMojangAPI() {
        return mojangAPI;
    }

    public void setMojangAPI( boolean mojangAPI ) {
        this.mojangAPI = mojangAPI;
    }

    public boolean isCommandSupportForNickNames() {
        return commandSupportForNickNames;
    }

    public void setCommandSupportForNickNames( boolean commandSupportForNickNames ) {
        this.commandSupportForNickNames = commandSupportForNickNames;
    }

    public boolean isCommandSupportRemoveOriginalName() {
        return commandSupportRemoveOriginalName;
    }

    public void setCommandSupportRemoveOriginalName( boolean commandSupportRemoveOriginalName ) {
        this.commandSupportRemoveOriginalName = commandSupportRemoveOriginalName;
    }

    public String getCommandOriginalPlayerReplacement() {
        return commandOriginalPlayerReplacement;
    }

    public void setCommandOriginalPlayerReplacement( String commandOriginalPlayerReplacement ) {
        this.commandOriginalPlayerReplacement = commandOriginalPlayerReplacement;
    }

    public boolean isSkinSettings() {
        return skinSettings;
    }

    public void setSkinSettings( boolean skinSettings ) {
        this.skinSettings = skinSettings;
    }

    public List<String> getSkinSettingsDefaultNames() {
        return skinSettingsDefaultNames;
    }

    public void setSkinSettingsDefaultNames( List<String> skinSettingsDefaultNames ) {
        this.skinSettingsDefaultNames = skinSettingsDefaultNames;
    }

    public boolean isSkinSettingsTexturesEnabled() {
        return skinSettingsTexturesEnabled;
    }

    public void setSkinSettingsTexturesEnabled( boolean skinSettingsTexturesEnabled ) {
        this.skinSettingsTexturesEnabled = skinSettingsTexturesEnabled;
    }

    public String getSkinSettingsDefaultValue() {
        return skinSettingsDefaultValue;
    }

    public void setSkinSettingsDefaultValue( String skinSettingsDefaultValue ) {
        this.skinSettingsDefaultValue = skinSettingsDefaultValue;
    }

    public String getSkinSettingsDefaultSignature() {
        return skinSettingsDefaultSignature;
    }

    public void setSkinSettingsDefaultSignature( String skinSettingsDefaultSignature ) {
        this.skinSettingsDefaultSignature = skinSettingsDefaultSignature;
    }

    public boolean isCracked() {
        return cracked;
    }

    public void setCracked( boolean cracked ) {
        this.cracked = cracked;
    }

    public List<String> getCrackedDefaultNames() {
        return crackedDefaultNames;
    }

    public void setCrackedDefaultNames( List<String> crackedDefaultNames ) {
        this.crackedDefaultNames = crackedDefaultNames;
    }

    public boolean isCrackedTexturesEnabled() {
        return crackedTexturesEnabled;
    }

    public void setCrackedTexturesEnabled( boolean crackedTexturesEnabled ) {
        this.crackedTexturesEnabled = crackedTexturesEnabled;
    }

    public String getCrackedDefaultValue() {
        return crackedDefaultValue;
    }

    public void setCrackedDefaultValue( String crackedDefaultValue ) {
        this.crackedDefaultValue = crackedDefaultValue;
    }

    public String getCrackedDefaultSignature() {
        return crackedDefaultSignature;
    }

    public void setCrackedDefaultSignature( String crackedDefaultSignature ) {
        this.crackedDefaultSignature = crackedDefaultSignature;
    }

    public int getCacheResetTimeUUID() {
        return this.cacheResetTimeUUID;
    }

    public void setCacheResetTimeUUID( int cacheResetTimeUUID ) {
        this.cacheResetTimeUUID = cacheResetTimeUUID;
    }

    public int getCacheResetTimeSkin() {
        return this.cacheResetTimeSkin;
    }

    public void setCacheResetTimeSkin( int cacheResetTimeSkin ) {
        this.cacheResetTimeSkin = cacheResetTimeSkin;
    }

    public int getRespawnMethod() {
        return this.respawnMethod;
    }

    public void setRespawnMethod( int respawnMethod ) {
        this.respawnMethod = respawnMethod;
    }
}
