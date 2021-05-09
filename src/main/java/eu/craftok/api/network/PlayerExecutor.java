package eu.craftok.api.network;

import java.util.UUID;

public interface PlayerExecutor {
    /**
     * Send a message to an online player
     * @param uuid the player's Unique Id
     * @param message the message to send
     */
    void sendMessage(UUID uuid, String message);

    /**
     * Send a message to all the online players
     * @param message the message to send
     */
    void sendGlobalMessage(String message);

    /**
     * Send a message to all online player on a task
     * @param servicesTask the {@link ServicesTask}
     */
    void sendMessageToTask(ServicesTask servicesTask);

    /**
     * Send message to a server from a player's Unique Id
     * @param uuid the player's Unique Id
     */
    void sendMessageToServerFromPlayer(UUID uuid);

    /**
     * Connect a player to a {@link ServicesTask}
     * @param uuid the player's Unique Id
     * @param servicesTask the {@link ServicesTask}
     */
    void connectToTask(UUID uuid, ServicesTask servicesTask);
}
