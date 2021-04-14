package eu.craftok.api.rank;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public interface GroupManager {
    /**
     * Used to look up a group (primary group) in the luckperms database
     * @param id the group's id
     * @return an optional {@link Group}
     */
    Optional<Group> getGroup(String id);

    /**
     * Used to look all the current luckperms groups
     * @return a set of all the groups
     */
    Set<Group> getGroups();
}
