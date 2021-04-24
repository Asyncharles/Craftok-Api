package eu.craftok.api;

public class CommonProvider {
    private final CraftokApi api;
    private final boolean tabOverride;
    private final boolean nameTagOverride;
    private final boolean chatFormatOverride;
    private final boolean activeDatabaseActor;
    private final boolean activeCacheHandler;
    private final boolean logApiResponse;
    private final int cacheHandlerTimer;
    private final int nThreadLog;

    public CommonProvider(CraftokApi api,
                          final boolean tabOverride,
                          final boolean nameTagOverride,
                          final boolean chatFormatOverride,
                          final boolean activeDatabaseActor,
                          final boolean activeCacheHandler,
                          final boolean logApiResponse,
                          final int cacheHandlerTimer,
                          final int nThreadLog) {
        this.api = api;
        this.tabOverride = tabOverride;
        this.nameTagOverride = nameTagOverride;
        this.chatFormatOverride = chatFormatOverride;
        this.activeDatabaseActor = activeDatabaseActor;
        this.activeCacheHandler = activeCacheHandler;
        this.logApiResponse = logApiResponse;
        this.cacheHandlerTimer = cacheHandlerTimer;
        this.nThreadLog = nThreadLog;
    }

    /**
     *
     * @return the {@link CraftokApi} instance
     */
    public CraftokApi getApi() {
        return api;
    }

    /**
     *
     * @return {@code true} to override the default tab, {@code false} otherwise
     */
    public boolean isTabOverride() {
        return tabOverride;
    }

    /**
     *
     * @return {@code true} to override the default name tags, {@code false} otherwise
     */
    public boolean isNameTagOverride() {
        return nameTagOverride;
    }

    /**
     *
     * @return {@code true} to override the default chat format, {@code false} otherwise
     */
    public boolean isChatFormatOverride() {
        return chatFormatOverride;
    }

    /**
     *
     * @return {@code true} if the server is an active database actor, {@code false} otherwise
     */
    public boolean isActiveDatabaseActor() {
        return activeDatabaseActor;
    }

    /**
     *
     * @return {@code true} if the server is an active cache actor, {@code false} otherwise
     */
    public boolean isActiveCacheHandler() {
        return activeCacheHandler;
    }

    /**
     *
     * @return {@code true} to log the api response time, {@code false} otherwise
     */
    public boolean hasLogApiResponse() {
        return logApiResponse;
    }

    /**
     *
     * @return the cache update timer
     */
    public int getCacheHandlerTimer() {
        return cacheHandlerTimer;
    }

    /**
     *
     * @return the amount of thread available to log the api response time
     */
    public int getNThreadLog() {
        return nThreadLog;
    }
}
