package eu.craftok.api.network;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

public enum ServerType {
    /**
     * All the current Server Types available on the network
     */
    LOBBY("Lobby", false, ServicesTask.LOBBY),
    AUTH("Auth", false, ServicesTask.AUTH),
    JUMPLEAGUE("JL", true,ServicesTask.JUMPLEAGUE),
    SPEEDRUN("Speedrun", true, ServicesTask.SPEEDRUN),
    BEDWARS("Bedwars", true, ServicesTask.BEDWARS, ServicesTask.BEDWARS2, ServicesTask.BEDWARS3, ServicesTask.BEDWARS4),
    SKYWARS("Skywars", true, ServicesTask.SKYWARS);

    private final String prefix;
    private final boolean gameServer;
    protected ServicesTask[] serviceTask;

    /**
     *
     * @param prefix the server's prefix
     * @param gameServer if the server is a game server
     * @param tasks the {@link ServicesTask} that contains the Server Type
     */
    ServerType(String prefix, boolean gameServer, ServicesTask... tasks) {
        this.prefix = prefix;
        this.gameServer = gameServer;
        this.serviceTask = tasks;
    }

    /**
     *
     * @return the server's prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     *
     * @return {@code true} if the server is a game server, {@code false} otherwise
     */
    public boolean isGameServer() {
        return gameServer;
    }

    /**
     *
     * @return an array of the {@link ServicesTask}
     */
    public ServicesTask[] getServiceTask() {
        return serviceTask;
    }

    /**
     *
     * @param prefix the server's prefix
     * @return an option of {@link ServerType}
     */
    public static Optional<ServerType> fetchServerTypeByPrefix(String prefix) {
        return Arrays.stream(values()).filter(st -> st.getPrefix().equalsIgnoreCase(prefix)).findFirst();
    }

    /**
     *
     * @param task the {@link ServicesTask}
     * @return an optional of {@link ServerType}
     */
    public static Optional<ServerType> fetchServerTypeByTask(ServicesTask task) {
        return Arrays.stream(values()).filter(st -> Arrays.asList(st.getServiceTask()).contains(task)).findFirst();
    }
}
