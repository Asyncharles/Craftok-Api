package eu.craftok.api;

import eu.craftok.api.rank.RankManager;
import eu.craftok.api.user.UserManager;

public interface CraftokApi {
    /**
     *
     * @return the {@link RankManager} instance
     */
    RankManager getRankManager();

    /**
     *
     * @return the {@link UserManager} instance
     */
    UserManager getUserManager();
}
