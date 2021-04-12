package eu.craftok.api.rank;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public interface RankManager {
    CompletableFuture<Rank> createRank(String name);
    CompletableFuture<Optional<Rank>> getRank(String name);
    CompletableFuture<Set<Rank>> getRanks();
    CompletableFuture<Void> save(Rank rank);
    CompletableFuture<Void> delete(Rank rank);
}
