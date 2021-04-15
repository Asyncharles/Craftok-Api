package eu.craftok.api;

import java.util.logging.Logger;

public class CraftokProvider {
    private static CraftokApi instance = null;
    private final static Logger LOGGER = Logger.getLogger("PROVIDER");
    public final static String API_VERSION = "0.1.5";

    private CraftokProvider() {
    }

    /**
     * Used to get the api instance
     * @return the api instance
     */
    public static CraftokApi getApi() {
        if (instance == null) {
            throw new IllegalStateException("The Craftok API has not been loaded. Please check your register!");
        }
        return instance;
    }

    /**
     * Registering the api instance
     * @param craftok the api instance
     */
    public static void register(CraftokApi craftok) {
        instance = craftok;
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
