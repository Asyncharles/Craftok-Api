package eu.craftok.api.statistics;

import java.util.UUID;

public interface Statistic {
    /**
     * Fetch the user data container
     * @param uuid the {@link eu.craftok.api.user.User} unique Id
     * @return a {@link DataContainer}
     */
    DataContainer getStats(UUID uuid);

    /**
     * Save the statistic of a {@link eu.craftok.api.user.User}
     * @param dataContainer the updated {@link DataContainer}
     */
    void saveStats(DataContainer dataContainer);
}
