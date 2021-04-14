package eu.craftok.api.user;

import eu.craftok.api.rank.Rank;

import java.util.UUID;

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
     *
     * @return the user's display name on the network
     */
    String getPlayerDisplayName();

    /**
     *
     * @return {@code true} if the user has a payed mojang account, {@code false} otherwise
     */
    boolean isPremium();

    /**
     *
     * @return the user's nickname
     */
    String getNick();

    /**
     *
     * @return the user's prefix that override's any other prefix
     */
    String getPrefixOverride();

    /**
     *
     * @return the user's rank {@link Rank}
     */
    Rank getRank();

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
}
