package eu.craftok.api.statistics;

public interface Statistics {
    /**
     * Get a statistic
     * @param key the key of the statistic
     * @param c the type of the statistic
     * @param <T> the generic type
     * @return the statistic
     */
    <T> T get(String key, T c);

    /**
     * Check if the statistic exists
     * @param key the key of the statistic
     * @return {@code true} if the statistic exists, {@code false} otherwise
     */
    boolean has(String key);

    /**
     * Check if the statistic exists
     * @param key the of the statistic
     * @param c the type of the statistic
     * @param <T> the generic type
     * @return {@code true} if the statistic exists, {@code false} otherwise
     */
    <T> boolean has(String key, T c);

    /**
     * Add a statistic
     * @param key the key of the statistic
     * @param c the type of the statistic
     * @param <T> the generic type
     */
    <T> void add(String key, T c);

    /**
     * Remove a statistic
     * @param key the of the statistic
     */
    void remove(String key);

    /**
     * Remove a statistic
     * @param key the key of the statistic
     * @param c the type of the statistic
     * @param <T> the generic type
     * @return the {@link T} statistic removed
     */
    <T> T remove(String key, T c);

    /**
     * Save the changes
     */
    void save();
}
