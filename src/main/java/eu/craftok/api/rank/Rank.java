package eu.craftok.api.rank;

public interface Rank {
    /**
     *
     * <p>
     *     The rank will be reworked around the luckperms storing methods.
     * </p>
     *
     */

    String getName();
    String getDisplayName();
    String getPrefix();
    int getPower();

    RankPriority getPriority();
}
