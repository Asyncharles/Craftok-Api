package eu.craftok.api.network;

public enum ServicesTask {
    /**
     * All the running tasks on the network
     */
    GLOBAL("Global"),
    LOBBY("Lobby"),
    AUTH("Auth"),
    EVENT("Event"),
    JUMPLEAGUE("JL"),
    BEDWARS("BedWars"),
    BEDWARSDUELS("1v1Bed"),
    BEDWARS2("BedWars2v2"),
    BEDWARS3("BedWars3v3"),
    BEDWARS4("BedWars4v4"),
    SKYWARS("SkyWars"),
    SPEEDRUN("Speedrun");

    private final String taskName;

    /**
     *
     * @param taskName the task's name
     */
    ServicesTask(String taskName) {
        this.taskName = taskName;
    }

    /**
     *
     * @return the {@link ServicesTask} name
     */
    public String getTaskName() {
        return taskName;
    }
}
