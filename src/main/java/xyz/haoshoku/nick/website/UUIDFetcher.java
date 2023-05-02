package xyz.haoshoku.nick.website;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.gson.JsonParser;
import org.bukkit.Bukkit;
import xyz.haoshoku.nick.api.NickAPI;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * The type Uuid fetcher.
 */
public class UUIDFetcher {

    /**
     * Gets uuid by name synchronously.
     *
     * @param name the name
     * @return the uuid by name
     */
    public UUID getUUIDByName( String name ) {
        return null;
    }

    private UUID applyUniqueId( String uuidAsString ) {
        return null;
    }

    /**
     * Gets the uuid by name asynchronously.
     *
     * @param name The name whose uuid you want to get
     * @param consumer Consumer (Callback)
     */
    public void getUUIDByNameAsync( String name, Consumer<UUID> consumer ) {

    }

    public LoadingCache<String, UUID> getDataCache() {
        return null;
    }
}
