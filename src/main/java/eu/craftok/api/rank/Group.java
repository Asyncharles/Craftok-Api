package eu.craftok.api.rank;

public interface Group {
    /**
     * The id used to loop up the group
     * @return the group's id
     */
    String getId();

    /**
     * The name used while working with group
     * @return the group's display name
     */
    String getDisplayName();

    /**
     * The name used in the chat and tab list next to players
     * @return the group's prefix
     */
    String getPrefix();

    /**
     * The group's weight (power)
     * @return the group's weight
     */
    int getWeight();

    /**
     * The permission given to the group
     * @return an array of {@link Permission}
     */
    Permission[] getPermissions();

}
