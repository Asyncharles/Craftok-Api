package eu.craftok.api.user;

import java.util.Optional;
import java.util.UUID;

public interface UserManager {
    /**
     * Used when a players logs onto the Network
     * Checks if the user is registered in the database (Higher performances)
     * Updates the user's schema depending on the api version
     * @param uuid the user's unique ID
     * @param name the user's name
     * @return the {@link User}
     */
    User loadUser(UUID uuid, String name);

    /**
     * Used to look up a user by their minecraft account name
     * Can be unsafe
     * Query's the user in the Mongo Database
     * @param name the user's name
     * @return an optional of {@link User}
     */
    Optional<User> getUserByName(String name);

    /**
     * Used to look a user by their unique ID
     * Query's the user in the cache memory (Redis)
     * @param uuid the user's unique ID {@link UUID}
     * @return the {@link User}
     */
    User getUser(UUID uuid);

    /**
     * Used to save some new values of a user
     * Saves the users in the cache memory (Redis)
     * @param user the new user with updated values
     * @return the updated {@link User}
     */
    User saveUser(User user);

    /**
     * Used to look a user by their unique ID in the cache memory
     * @param uuid the users unique ID {@link UUID}
     * @return the {@link User}
     */
    User getDBUser(UUID uuid);

    /**
     * Used when a players logs off the Network or
     * to save some values
     * Saves the users in the Mongo Database
     * @param user the new user with updated values
     * @return the updated {@link User}
     */
    User saveUserToDatabase(User user);

    /**
     * Get a user's formatted name
     * Format : {@link eu.craftok.api.rank.Group} prefix + name
     * @param uuid the user's unique ID {@link UUID}
     * @return the user's formatted name
     */
    String getUserFormattedName(UUID uuid);
}
