package eu.craftok.api.rank;

public enum RankPriority {
    LOW("Basse"),
    MEDIUM("Moyenne"),
    HIGH("Eleve"),
    MAX("Maximum");

    private final String priorityName;

    RankPriority(String priorityName) {
        this.priorityName = priorityName;
    }

    public String getPriorityName() {
        return priorityName;
    }
}
