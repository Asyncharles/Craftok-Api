package eu.craftok.api.user;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface UserManager {
    /**
     * Used when a players logs onto the Network
     * Checks if the user is registered in the database (Higher performances)
     * Updates the user's schema depending on the api version
     * @param uuid the user's unique ID
     * @return the {@link User}
     */
    User loadUser(UUID uuid);

    /**
     * Used to look up a user by their minecraft account name
     * Can be unsafe
     * @param name the user's name
     * @return an optional of {@link User}
     */
    Optional<User> getUserByName(String name);

    /**
     * Used to look a user by their unique ID
     * @param uuid the user's unique ID
     * @return the {@link User}
     */
    User getUser(UUID uuid);

    /**
     * Used when a players logs off the Network or
     * to save some values
     * @param user the new user with updated values
     * @return the updated {@link User}
     */
    User saveUser(User user);
}
