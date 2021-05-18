package eu.craftok.api.party;

import java.util.List;
import java.util.UUID;

public interface PartyManager {
    /**
     * Get a party by his id
     * @param id the {@link Party} id
     * @return {@link Party}
     */
    Party getPartyById(int id);

    /**
     * Get a party by his leader
     * @param uuid the {@link UUID} of the party leader
     * @return {@link Party}
     */
    Party getPartyByLeader(UUID uuid);

    /**
     *
     * @param uuid a player's Unique Id
     * @return {@code true} if the player is in a party, {@code false} if not
     */
    boolean isPartyMember(UUID uuid);

    /**
     *
     * @return the list of all existing {@link Party}
     */
    List<Party> getParties();
}
