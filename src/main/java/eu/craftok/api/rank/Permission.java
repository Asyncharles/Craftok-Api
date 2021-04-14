package eu.craftok.api.rank;

public interface Permission {
    /**
     *
     * @return the key
     */
    String getKey();

    /**
     *
     * @return {@code true} if the permission is active, {@code false} otherwise
     */
    boolean getValue();
}
