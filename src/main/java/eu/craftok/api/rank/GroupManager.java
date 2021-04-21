package eu.craftok.api.rank;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface GroupManager {
    /**
     * Used to look up a group (primary group) in the luckperms database
     * @param id the {@link Group} id
     * @return an optional {@link Group}
     */
    Optional<Group> getGroup(String id);

    /**
     * Used to look all the current luckperms groups
     * @return a set of all the groups
     */
    Set<Group> getGroups();

    /**
     * Used to look up a user's primary group in the luckperms database
     * @param uuid the user's Unique Id
     * @return the user's {@link Group}
     */
    Group getUserGroup(UUID uuid);

    /**
     *
     * @param id the {@link Group} id
     * @return a Set of {@link UUID}
     */
    Optional<Set<UUID>> getGroupUsers(String id);
}
