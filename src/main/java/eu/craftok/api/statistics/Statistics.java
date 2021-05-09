package eu.craftok.api.statistics;

public interface Statistics {
    /**
     * Get a statistic
     * @param key the key of the statistic
     * @param <T> the generic type
     * @return the statistic
     */
    <T> T get(String key);

    /**
     * Get a statistic
     * @param key the key of the statistic
     * @param <T> the generic type
     * @return the statistic
     */
    <T> T get(String key, Class<T> t);

    /**
     * Get a nested object
     * @param key the key of the nested object
     * @return {@link Statistics}
     */
    Statistics getNestedObject(String key);

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
     * @param c the statistic's value
     * @param <T> the generic type
     * @return {@link Statistics}
     */
    <T> Statistics add(String key, T c);

    /**
     * Adds a nested object in the statistic (e.g: "jumpleague.kills" : 10)
     * @param key the key of the nested object
     * @param <T> the generic type
     * @return {@link Statistics}
     */
    <T> Statistics addNestedObject(String key);

    /**
     * Adds a nested object in the statistic (e.g: "jumpleague.kills" : 10)
     * @param key the key of the nested object
     * @param fieldKey the key of the field
     * @param c the statistic's value
     * @param <T> the generic type
     * @return {@link Statistics}
     */
    <T> Statistics addNestedObject(String key, String fieldKey, T c);

    /**
     * Increment a statistic
     * @param key the key of statistic
     * @param v the increment value
     * @return the incremented value {@link Integer}
     */
    int getAndIncrement(String key, int v);

    /**
     * Increment a statistic
     * @param key the key of statistic
     * @param v the increment value
     * @return the incremented value {@link Long}
     */
    long getAndIncrement(String key, long v);

    /**
     * Set a statistic
     * @param key the key of the statistic
     * @param c the statistic's value
     * @param <T> the generic type
     */
    <T> Statistics set(String key, T c);

    /**
     * Remove a statistic
     * @param key the of the statistic
     */
    Statistics remove(String key);

    /**
     * Remove a statistic
     * @param key the key of the statistic
     * @param c the type of the statistic
     * @param <T> the generic type
     * @return the {@link T} statistic removed
     */
    <T> T remove(String key, Class<T> c);

    /**
     * Save the changes
     */
    void save();
}
