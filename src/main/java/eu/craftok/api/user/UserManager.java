package eu.craftok.api.user;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface UserManager {
    /**
     * Used when a players logs onto the Network
     * Checks if the user is registered in the database (Higher performances)
     * @param uuid the user's unique ID
     * @return a future of the user
     */
    CompletableFuture<User> loadUser(UUID uuid);

    /**
     * Used to look up a user by their minecraft account name
     * Can be unsafe
     * @param name the user's name
     * @return a future of the user
     */
    CompletableFuture<User> getUserByName(String name);

    /**
     * Used to look a user by their unique ID
     * @param uuid the user's unique ID
     * @return a future of the user
     */
    CompletableFuture<User> getUser(UUID uuid);

    /**
     * Used when a players logs off the Network or
     * to save some values
     * @param user the new user with updated values
     * @return a future void
     */
    CompletableFuture<Void> saveUser(User user);
}
