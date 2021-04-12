package eu.craftok.api;

import java.util.logging.Logger;

public class CraftokProvider {
    private static CraftokApi instance = null;

    private final static Logger LOGGER = Logger.getLogger("PROVIDER");

    private CraftokProvider() {
    }

    public static CraftokApi getApi() {
        if (instance == null) {
            throw new IllegalStateException("The Craftok API has not been loaded. Please check your register!");
        }
        return instance;
    }

    public static void register(CraftokApi craftok) {
        instance = craftok;
        LOGGER.info("API instance registered!");
    }

    public static void shutdown() {
        instance = null;
        LOGGER.info("API instance unregistered!");
    }
}
