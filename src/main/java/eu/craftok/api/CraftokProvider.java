package eu.craftok.api;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CraftokProvider {
    private static CraftokApi instance = null;
    private final static Logger LOGGER = Logger.getLogger("PROVIDER");
    private final static String commonKey = new String("<3");

    private static boolean tabOverride;
    private static boolean nameTagOverride;
    private static boolean chatFormatOverride;
    private static boolean activeDatabaseActor;
    private static boolean activeCacheHandler;

    public final static String API_VERSION = "0.2.1";

    protected CraftokProvider(boolean tabOverride, boolean nameTagOverride, boolean chatFormatOverride, boolean activeDatabaseActor, boolean activeCacheHandler) {
        CraftokProvider.tabOverride = tabOverride;
        CraftokProvider.nameTagOverride = nameTagOverride;
        CraftokProvider.chatFormatOverride = chatFormatOverride;
        CraftokProvider.activeDatabaseActor = activeDatabaseActor;
        CraftokProvider.activeCacheHandler = activeCacheHandler;
    }

    /**
     * Used to get the api instance
     * @return the api instance
     */
    public CraftokApi getApi() {
        if (CraftokProvider.instance == null) {
            throw new IllegalStateException("The Craftok API has not been loaded. Please check your register!");
        }
        return CraftokProvider.instance;
    }

    /**
     * Used for the implementation to access Api Parameters
     * @param key the key to access the common instance
     * @return a {@link CommonProvider} instance
     */
    public static CommonProvider getCommonApi(String key) {
        if (instance == null) {
            throw new IllegalStateException("The Craftok API has not been loaded. Please check your register!");
        }
        if (!key.equals(commonKey) ) {
            throw new SecurityException("Attempt to access the Common Api - Wrong key!");
        }
        return new CommonProvider(instance, tabOverride, nameTagOverride, chatFormatOverride, activeDatabaseActor, activeCacheHandler);
    }

    /**
     * Registering the api instance
     * @param craftok the api instance
     */
    public static void register(CraftokApi craftok) {
        instance = craftok;
        LOGGER.setLevel(Level.ALL);
        LOGGER.info("API instance registered!");
    }

    /**
     * Shutting down the api instance
     */
    public static void shutdown() {
        instance = null;
        LOGGER.info("API instance unregistered!");
    }
}
