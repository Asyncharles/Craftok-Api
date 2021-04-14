package eu.craftok.api;

import eu.craftok.api.rank.GroupManager;
import eu.craftok.api.user.UserManager;

public interface CraftokApi {
    /**
     *
     * @return the {@link GroupManager} instance
     */
    GroupManager getGroupManager();

    /**
     *
     * @return the {@link UserManager} instance
     */
    UserManager getUserManager();
}
