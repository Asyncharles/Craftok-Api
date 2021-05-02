package eu.craftok.api.statistics;

import java.util.UUID;

public interface StatisticManager {
    /**
     * Fetch the user data container
     * @param uuid the {@link eu.craftok.api.user.User} unique Id
     * @return a {@link Statistics}
     */
    Statistics getStats(UUID uuid);

    /**
     * Inserts a statistic document for a {@link eu.craftok.api.user.User}
     * @param uuid the {@link eu.craftok.api.user.User} unique Id
     */
    void insertStats(UUID uuid);
}
