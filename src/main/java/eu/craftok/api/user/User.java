package eu.craftok.api.user;

import eu.craftok.api.rank.Rank;

import java.util.UUID;

public interface User {
    UUID getUniqueID();
    String getName();
    String getPlayerDisplayName();

    boolean isPremium();

    String getNick();

    String getPrefixOverride();

    Rank getRank();

    int getCoins();

    float getNetworkXp();
}
