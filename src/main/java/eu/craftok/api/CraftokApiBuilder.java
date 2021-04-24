package eu.craftok.api;

public class CraftokApiBuilder {
    private boolean tabOverride = false;
    private boolean nameTagOverride = false;
    private boolean chatFormatOverride = false;
    private boolean activeDatabaseActor = false;
    private boolean activeCacheHandler =  false;
    private boolean logApiResponse = false;
    private int cacheHandlerTimer = 0;
    private int nThreadLog = 1;

    public CraftokApiBuilder() {
    }

    public CraftokApiBuilder overrideTab() {
        tabOverride = true;
        return this;
    }

    public CraftokApiBuilder overrideNameTag() {
        nameTagOverride = true;
        return this;
    }

    public CraftokApiBuilder overrideChatFormat() {
        chatFormatOverride = true;
        return this;
    }

    public CraftokApiBuilder setActiveDatabaseActor() {
        activeDatabaseActor = true;
        return this;
    }

    public CraftokApiBuilder setActiveCacheHandler(final int timer) {
        activeCacheHandler = true;
        cacheHandlerTimer = timer;
        return this;
    }

    public CraftokApiBuilder logApiResponse(final int nThread) {
        logApiResponse = true;
        nThreadLog = nThread;
        return this;
    }

    public CraftokApi create() {
        return new CraftokProvider(tabOverride, nameTagOverride, chatFormatOverride, activeDatabaseActor, activeCacheHandler, logApiResponse, cacheHandlerTimer, nThreadLog).getApi();
    }
}
