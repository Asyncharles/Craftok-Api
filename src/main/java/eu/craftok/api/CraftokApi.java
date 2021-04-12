package eu.craftok.api;

import eu.craftok.api.rank.RankManager;
import eu.craftok.api.user.UserManager;

public interface CraftokApi {
    RankManager getRankManager();
    UserManager getUserManager();
}
