package eu.craftok.api.user;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface UserManager {
    CompletableFuture<User> getUserByName(String name);
    CompletableFuture<User> getUser(UUID uuid);
    CompletableFuture<Void> saveUser(User user);
}
