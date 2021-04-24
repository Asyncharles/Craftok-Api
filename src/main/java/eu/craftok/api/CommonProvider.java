package eu.craftok.api;

public class CommonProvider {
    private final CraftokApi api;
    private final boolean tabOverride;
    private final boolean nameTagOverride;
    private final boolean chatFormatOverride;
    private final boolean activeDatabaseActor;
    private final boolean activeCacheActor;

    public CommonProvider(CraftokApi api, final boolean tabOverride, final boolean nameTagOverride, final boolean chatFormatOverride, final boolean activeDatabaseActor, final boolean activeCacheActor) {
        this.api = api;
        this.tabOverride = tabOverride;
        this.nameTagOverride = nameTagOverride;
        this.chatFormatOverride = chatFormatOverride;
        this.activeDatabaseActor = activeDatabaseActor;
        this.activeCacheActor = activeCacheActor;
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
    public boolean isActiveCacheActor() {
        return activeCacheActor;
    }
}
