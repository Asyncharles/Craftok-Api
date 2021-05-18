package eu.craftok.api.party;

import java.util.List;
import java.util.UUID;

public interface Party {
    /**
     *
     * @return {@link Party} id
     */
    int getPartyId();

    /**
     * Get the party leader Unique Id
     * @return {@link UUID}
     */
    UUID getPartyLeader();

    /**
     * Get the list of the party members Unique Id
     * @return {@link List} of {@link UUID}
     */
    List<UUID> getPartyMembers();

    /**
     *
     * @return {@code true} if the party chat is muted, {@code false} otherwise
     */
    boolean isMuted();

    /**
     * Toggle the party chat mute
     */
    void toggleMute();

    /**
     * Add a member to the party
     * @param uuid the member's Unique Id
     * @return the {@link Party}
     */
    default Party addMember(UUID uuid) {
        getPartyMembers().add(uuid);
        return this;
    }

    /**
     * Remove a member from the party
     * @param uuid the member's Unique Id
     * @return the {@link Party}
     */
    default Party removeMember(UUID uuid) {
        getPartyMembers().remove(uuid);
        return this;
    }

    /**
     * Get the total party size
     * @return the {@link #getPartyMembers()} size + the leader
     */
    default int getPartySize() {
        return getPartyMembers().size() + 1;
    }

    /**
     * Save the changes
     */
    void save();
}
