package xyz.haoshoku.nick.api;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import xyz.haoshoku.nick.events.NickFinishEvent;
import xyz.haoshoku.nick.website.SkinFetcher;
import xyz.haoshoku.nick.website.UUIDFetcher;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class NickAPI {

    private static final NickConfig config = null;

    public static final String PREFIX = "[NickAPI] ";

    public static void nick( @NotNull Player player, @NotNull String toNick ) {

    }

    /**
     * Resets the nick of the {@code player} you want.
     *
     * @param player The player whose nickname should be removed
     *
     * @see #nick(Player, String)
     */
    public static void resetNick( @NotNull Player player ) {

    }

    /**
     * Check if the {@code player} is nicked
     *
     * @param player The player who needs to be checked whether nicked or not
     *
     * @return Boolean: Whether the player is currently nicked or not
     */
    public static boolean isNicked( @NotNull Player player ) {
        return true;
    }


    /**
     * Check if player has another skin.
     *
     * @param player The player who needs to be checked if he has another skin but his original one
     * @return Whether the player has another skin but his original one
     */
    public static boolean isSkinChanged( @NotNull Player player ) {
        return true;
    }


    /**
     * Specify the skin - {@code toSkin} - that the {@code player} should have.
     *
     * @param player The player whose skin you want to change
     * @param toSkin Player name whose skin the player should have
     */
    public static void setSkin( @NotNull Player player, @NotNull String toSkin ) {

    }

    /**
     * Specify the skin that the {@code player} should have with the specific {@code value} and {@code signature}.
     * Get the value and the signature by pinging
     * https://sessionserver.mojang.com/session/minecraft/profile/{UUIDOFPLAYER}?unsigned=false
     * or
     * https://api.minetools.eu/profile/{UUIDOFPLAYER}
     *
     * @param player    The player whose skin you want to change
     * @param value     Set the value
     * @param signature Set the signature
     *
     * @see #setSkin(Player, String)
     */
    public static void setSkin( @NotNull Player player, @NotNull String value, @NotNull String signature ) {

    }

    /**
     * Reset the skin of the specific {@code player}.
     *
     * @param player The player whose skin should be reset
     */
    public static void resetSkin( @NotNull Player player ) {

    }

    /*
    Nick {GameProfile}
     */

    public static String[] getSkinData( @NotNull Player player ) {
        return null;
    }

    /**
     * Gets the original GameProfile name.
     *
     * @param player the player
     *
     * @return the original GameProfile name
     */
    public static String getOriginalGameProfileName( @NotNull Player player ) {
        return null;
    }

    /**
     * Gets the original name.
     * @param player the player
     * @return the original player name
     */
    public static String getOriginalName( @NotNull Player player ) {
        return null;
    }

    /**
     * Gets the GameProfile name of {@code player}.
     *
     * @param player the player
     *
     * @return the GameProfile name
     */

    public static String getGameProfileName( @NotNull Player player ) {
        return null;
    }

    /**
     * Sets the GameProfile name of {@code player} to a specific {@code name}.
     *
     * @param player the player
     * @param name the name
     */

    public static void setGameProfileName( @NotNull Player player, @NotNull String name ) {

    }

    /**
     * Resets the GameProfile name of {@code player}.
     *
     * @param player the player
     */

    public static void resetGameProfileName( @NotNull Player player ) {

    }


    /*
    Nick {UUID}
     */

    /**
     * Gets the uuid from {@code player}.
     * This is never null. It will return the original player uuid or the changed uuid.
     * Note that the changed uuid is NOT serverside.
     * Use it carefully.
     *
     * @param player Specify the {@code player} object from which you want to get the uuid
     *
     * @return returns the original or changed uuid from the {@code player}
     */
    public static UUID getUniqueId( @NotNull Player player ) {
        return null;
    }

    /**
     * Sets the {@code uuid} of the {@code player}.
     * The uuid will be changed clientside not serverside.
     * This means that it does not destroy the compatibilities with other plugins that are related to uuids.
     * Perhaps another packet related plugins like PacketPlayOutPlayerInfo, etc. could make issues.
     *
     * @param player Specify the {@code player} object
     * @param uuid   Enter the {@code uuid} object
     *
     * @see #getUniqueId(Player)
     */
    public static void setUniqueId( @NotNull Player player, @NotNull UUID uuid ) {

    }

    /**
     * Sets the uuid of the {@code player} into the uuid of {@code name}.
     *
     * @param player Specify the {@code player} object
     * @param name   Enter the {@code name}
     *
     * @see #setUniqueId(Player, UUID)
     */
    public static void setUniqueId( @NotNull Player player, @NotNull String name ) {

    }

    /**
     * Resets the uuid of the {@code player} object into the player's original uuid.
     *
     * @param player The {@code player} object whose uuid should be reset
     */
    public static void resetUniqueId( @NotNull Player player ) {

    }

    /*
    Refreshing
     */

    /**
     * This method is the most important thing in the API.
     * This is required after you applied the nick changes here.
     * The whole nick procedure is within this method.
     *
     * Use NickAPI's {@link NickFinishEvent} if you want to execute something when the nick is done.
     *
     * @param player Set the {@code player} object
     */
    public static void refreshPlayer( @NotNull Player player ) {

    }


    /**
     * This method refreshs the player synchronously - it is not recommended to use it!
     * @param player Re
     */
    public static void refreshPlayerSync( @NotNull Player player ) {

    }

    /*
    Bypass
     */

    /**
     * Get the bypass list of nicked {@code player}.
     * Player who are in this list will not be able to see {@code player} in the list.
     *
     * @param player the player
     *
     * @return the bypass list
     */
    public static List<UUID> getBypassList( @NotNull Player player ) {
        return null;
    }

    /**
     * Adds {@code bypassPlayer} into the list of {@code nickedPlayer}.
     * The result is after refreshing the {@code nickedPlayer} the {@code bypassPlayer} will be able to see the {@code nickedPlayer} original tag, uuid and skin.
     *
     * @param nickedPlayer the nicked player
     * @param bypassPlayer the bypass player
     */
    public static void addBypass( @NotNull Player nickedPlayer, @NotNull Player bypassPlayer ) {

    }

    /**
     * Adds {@code bypassPlayers} into the list of {@code nickedPlayer}.
     * The result is after refreshing the {@code nickedPlayer} the {@code bypassPlayers} will be able to see the {@code nickedPlayer}  original tag, uuid and skin.
     *
     * @param nickedPlayer  the nicked player
     * @param bypassPlayers the bypass players
     */
    public static void addBypass( @NotNull Player nickedPlayer, @NotNull Player... bypassPlayers ) {

    }

    /**
     * Adds {@code bypassPlayerUUID} into the list of {@code nickedPlayerUUID}.
     * The result is after refreshing the {@code nickedPlayerUUID} the {@code bypassPlayerUUID} will be able to see the {@code nickedPlayerUUID}  original tag, uuid and skin.
     *
     * @param nickedPlayerUUID the nicked player uuid
     * @param bypassPlayerUUID the bypass player uuid
     */
    public static void addBypass( @NotNull UUID nickedPlayerUUID, @NotNull UUID bypassPlayerUUID ) {

    }

    /**
     * Adds {@code bypassPlayerUUIDs} into the list of {@code nickedPlayerUUID}.
     * The result is after refreshing the {@code nickedPlayerUUID} the {@code bypassPlayerUUIDs} will be able to see the {@code nickedPlayerUUID} original tag, uuid and skin.
     *
     * @param nickedPlayerUUID  the nicked player uuid
     * @param bypassPlayerUUIDs the bypass player uuids
     */
    public static void addBypass( @NotNull UUID nickedPlayerUUID, @NotNull UUID... bypassPlayerUUIDs ) {

    }

    /**
     * Removes {@code bypassPlayer} into the list of {@code nickedPlayer}.
     * The result is after refreshing the {@code nickedPlayer} the {@code bypassPlayer} will not be able to see the {@code nickedPlayer} original tag, uuid and skin anymore.
     *
     * @param nickedPlayer the nicked player
     * @param bypassPlayer the bypass player
     */
    public static void removeBypass( @NotNull Player nickedPlayer, @NotNull Player bypassPlayer ) {

    }

    /**
     * Removes {@code bypassPlayers} into the list of {@code nickedPlayer}.
     * The result is after refreshing the {@code nickedPlayer} the {@code bypassPlayers} will not be able to see the {@code nickedPlayer} original tag, uuid and skin anymore.
     *
     * @param nickedPlayer the nicked player
     * @param bypassPlayers the bypass players
     */
    public static void removeBypass( @NotNull Player nickedPlayer, @NotNull Player... bypassPlayers ) {

    }

    /**
     * Removes {@code bypassPlayerUUID} into the list of {@code nickedPlayerUUID}.
     * The result is after refreshing the {@code nickedPlayerUUID} the {@code bypassPlayerUUID} will not be able to see the {@code nickedPlayerUUID} original tag, uuid and skin anymore.
     *
     * @param nickedPlayerUUID the nicked player uuid
     * @param bypassPlayerUUID the bypass player uuid
     */
    public static void removeBypass( @NotNull UUID nickedPlayerUUID, @NotNull UUID bypassPlayerUUID ) {

    }

    /**
     * Removes {@code bypassPlayerUUIDs} into the list of {@code nickedPlayerUUID}.
     * The result is after refreshing the {@code nickedPlayerUUID} the {@code bypassPlayerUUIDs} will not be able to see the {@code nickedPlayerUUID} original tag, uuid and skin anymore.
     *
     * @param nickedPlayerUUID  the nicked player uuid
     * @param bypassPlayerUUIDs the bypass player uuids
     */
    public static void removeBypass( @NotNull UUID nickedPlayerUUID, @NotNull UUID... bypassPlayerUUIDs ) {

    }

    /**
     * Clear the whole list of {@code nickedPlayer}.
     * All players will see him nicked after refreshing him.
     *
     * @param nickedPlayer the nicked player
     */
    public static void clearBypass( @NotNull Player nickedPlayer ) {

    }


    /*
    Admin methods
     */

    /**
     * Gets the player object of the original player name.
     * It will return {@code null} if the player does not exist.
     *
     * @param name the original player name
     *
     * @return the player object of original name
     */
    public static Player getPlayerOfOriginalName( @NotNull String name ) {
        return null;
    }

    /**
     * Gets the player object of the nicked player name.
     * It will return {@code null} if the player does not exist.
     *
     * @param name the nicked name
     *
     * @return the player object of nicked name
     */
    public static Player getPlayerOfNickedName( @NotNull String name ) {
        return null;
    }

    /**
     * Checks whether the {@code name} is already being used.
     * It checks the nicked names and the original names.
     * You can be sure that no double names will exist by using this check.
     *
     * @param name the specific name
     *
     * @return whether the nick exist or not
     */
    public static boolean nickExists( @NotNull String name ) {
        return true;
    }

    public static boolean isNickedName( @NotNull String name ) { return true; }

    /**
     * Gets the nicked players.
     *
     * @return the nicked players {@link java.util.Map}
     *
     * @see java.util.Map
     */
    public static Map<UUID, String> getNickedPlayers() {
        return null;
    }

    /**
     * Can never be null.
     * It returns the original name if {@code player} is not nicked and it returns the nicked name if {@code player} is nicked.
     *
     * @param player the player
     *
     * @return the name
     */
    public static String getName( @NotNull Player player ) {
        return null;
    }

    /**
     * Hide the player from toHide
     *
     * @param player the player
     * @param toHide the player that should not see player
     */

    public static void hidePlayer( @NotNull Player player, @NotNull Player toHide ) {

    }
    /**
     * Hides the player from toHide
     *
     * @param player the player
     * @param playersToHide the players that should not see the player
     */
    public static void hidePlayer( @NotNull Player player, @NotNull Collection<? extends Player> playersToHide ) {

    }

    /**
     * Shows the player from toHide
     *
     * @param player the player
     * @param toShow the players that should see the player
     * the player that should not see player
     */

    public static void showPlayer( @NotNull Player player, @NotNull Player toShow ) {

    }

    /**
     * Shows the player from toHide
     *
     * @param player the player
     * @param playersToShow the players that should see the player
     * the player that should not see player
     */

    public static void showPlayer( @NotNull Player player, @NotNull Collection<? extends Player> playersToShow ) {

    }


    /*
    UUID-Fetcher & Skin-Fetcher
     */

    /**
     * The NickAPI provides its own UUIDFetcher with caching.
     * You can use the fetcher freely if you need to.
     *
     * @return the uuid fetcher
     */
    public static UUIDFetcher getUUIDFetcher() {
        return null;
    }

    /**
     * The NickAPI provides its own SkinFetcher with caching.
     * You can use the fetcher freely if you need to.
     *
     * @return the skin fetcher
     */
    public static SkinFetcher getSkinFetcher() {
        return null;
    }

    public static NickConfig getConfig() {
        return config;
    }
}
