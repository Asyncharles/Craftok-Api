package eu.craftok.api.user;
import eu.craftok.api.CraftokProvider;
import eu.craftok.api.network.ServicesTask;

import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

public interface User {
    /**
     *
     * @return the user's unique ID
     */
    UUID getUniqueID();

    /**
     *
     * @return the user's minecraft account name
     */
    String getName();

    /**
     * Updates the user's name
     * @param name the new name
     */
    void updateName(String name);

    /**
     *
     * @return a list of the user's previous name
     */
    List<String> getPreviousNames();

    /**
     *
     * @return the api version used for the schema
     */
    String getApiVersionSchema();

    /**
     * Updates the api version user for the schema
     */
    void updateApiVersionSchema();

    /**
     *
     * @return the user's display name on the network
     */
    String getPlayerDisplayName();

    /**
     * Sets the user's display name on the network
     * @param displayName the new display name
     */
    void setPlayerDisplayName(String displayName);

    /**
     *
     * @return {@code true} if the user has a payed mojang account, {@code false} otherwise
     */
    boolean isPremium();

    /**
     *
     * @return {@code true} if the user is online, {@code false} otherwise
     */
    boolean isOnline();

    /**
     * Set if the user is online or offline
     */
    void setOnline();

    /**
     *
     * @return the user's nickname
     */
    String getNick();

    /**
     *
     * @param nick the new nick of the user
     */
    void setNick(String nick);

    /**
     * Removes the user's nick
     */
    void removeNick();

    /**
     *
     * @return the user's prefix that override's any other prefix
     */
    String getPrefixOverride();

    /**
     *
     * @param prefixOverride the new prefix of the user
     */
    void setPrefixOverride(String prefixOverride);

    /**
     *
     * @return the first connection of the user's
     */
    long getFirstJoin();

    /**
     *
     * @return the last connection of the user's
     */
    long getLastConnection();

    /**
     * update's the user's last connection
     */
    void updateLastConnection();

    /**
     *
     * @return the user's total play time
     */
    long getTotalPlayTime();

    /**
     * Add play time to a current user's play time
     * @param time the value added to the user's current playtime
     */
    void addPlaytime(long time);

    /**
     *
     * @return the user's coins
     */ 
    int getCoins();

    /**
     * Add coins to the user
     * @param amount the value added to the user's current amount of coins
     */
    void addCoins(int amount);

    /**
     * Remove coins to the user
     * @param amout the value removed to the user's current amount of coins
     */
    void removeCoins(int amout);

    /**
     * Set a user's coin amount
     * @param coins the new value of the user's coins amount, {@code 0} to reset
     */
    void setCoins(int coins);

    /**
     *
     * @return the user's total network experience
     */
    float getNetworkXp();

    /**
     * Add network experience to the user's total experience amount
     * @param amount the value added to the user's total experience amount
     */
    void addNetworkXp(float amount);

    /**
     * Set a user's experience amount
     * @param xp the new value of the user's experience amount, {@code 0} to reset
     */
    void setNetworkXp(float xp);

    /**
     *
     * @return the user's network experience based from {@link #getNetworkXp()}
     */
    default float getNetworkLevel() {
        return (float) ((Math.sqrt(getNetworkXp() + 15312.5) - 125 / Math.sqrt(2)) / (25 * Math.sqrt(2)));
    }

    /**
     * Get the user's friends
     * @param callback a consumer callback
     */
    void getFriends(Consumer<List<User>> callback);

    /**
     *
     * @return the user's {@link UserParameters}
     */
    UserParameters getUserParameters();

    /**
     * Send a message to the user
     * @param message the message
     */
    default void sendMessage(String message) {
        CraftokProvider.getRawApi().getCraftokNetwork().getPlayerExecutor().sendMessage(getUniqueID(), message);
    }

    /**
     * Connect the user to a task
     * @param servicesTask the {@link ServicesTask}
     */
    default void connect(ServicesTask servicesTask) {
        CraftokProvider.getRawApi().getCraftokNetwork().getPlayerExecutor().connectToTask(getUniqueID(), servicesTask);
    }
}
