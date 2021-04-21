package eu.craftok.api.network;

public interface CraftokNetwork {
    /**
     *
     * @param task the current {@link ServicesTask}
     * @return the total player count on the service task
     */
    int getTaskPlayerCount(ServicesTask task);

    /**
     *
     * @param serverName the server/service name
     * @return the total player count on the server/service
     */
    int getServicePlayerCount(String serverName);

    /**
     *
     * @param task the {@link ServicesTask} used to create the node
     */
    void createCloudService(ServicesTask task);
}
