package eu.craftok.api.network;

import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

public interface NetworkMaintenance {
    /**
     * Used to filter and fetch the document
     * @return the maintenance id
     */
    int getId();

    /**
     *
     * @return the maintenance reason
     */
    String getReason();

    /**
     *
     * @return {@code true} if the network is under maintenance, {@code false} otherwise
     */
    boolean isActive();

    /**
     * Toggles (on and off) the {@link NetworkMaintenance}
     */
    void toggleMaintenance();

    /**
     *
     * @param callback a consumer callback
     * @return a {@link List} of the allowed user
     */
    List<UUID> allowedUsers(Consumer<List<UUID>> callback);
}
