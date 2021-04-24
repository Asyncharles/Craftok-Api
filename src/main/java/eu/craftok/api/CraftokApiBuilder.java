package eu.craftok.api;

public class CraftokApiBuilder {
    private boolean tabOverride = false;
    private boolean nameTagOverride = false;
    private boolean chatFormatOverride = false;
    private boolean activeDatabaseActor = false;
    private boolean activeCacheHandler =  false;

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

    public CraftokApiBuilder setActiveCacheHandler() {
        activeCacheHandler = true;
        return this;
    }

    public CraftokApi create() {
        return new CraftokProvider(tabOverride, nameTagOverride, chatFormatOverride, activeDatabaseActor, activeCacheHandler).getApi();
    }
}
