package eu.craftok.api.rank;

public interface Rank {
    String getName();
    String getDisplayName();
    String getPrefix();

    int getPower();

    RankPriority getPriority();
}
