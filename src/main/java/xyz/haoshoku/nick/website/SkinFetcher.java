package xyz.haoshoku.nick.website;

import com.google.common.cache.LoadingCache;

import java.util.UUID;
import java.util.function.Consumer;

public class SkinFetcher {

    /**
     * Gets the skindata by uuid synchronously.
     *
     * @param uuid The uuid whose skindata you want to get
     * @return
     */
    public String[] getSkinDataByUUID( UUID uuid ) {
        return null;
    }

    /**
     * Gets the skindata by uuid asynchronously.
     *
     * @param uuid The uuid whose skindata you want to get
     * @param consumer Consumer (Callback)
     */
    public void getSkinDataByUUIDAsync( UUID uuid, Consumer<String[]> consumer ) {

    }

    public LoadingCache<UUID, String[]> getDataCache() {
        return null;
    }
}
