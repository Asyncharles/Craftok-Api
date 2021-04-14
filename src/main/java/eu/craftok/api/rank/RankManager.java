package eu.craftok.api.rank;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public interface RankManager {
    /**
     * Used to look up a rank (primary rank) in the luckperms database
     * @param name the rank's name
     * @return a future of an optional rank
     */
    CompletableFuture<Optional<Rank>> getRank(String name);

    /**
     * Used to look all the current luckperms rank
     * @return a set of all the ranks
     */
    CompletableFuture<Set<Rank>> getRanks();
}
