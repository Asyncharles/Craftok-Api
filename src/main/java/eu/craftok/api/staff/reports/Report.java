package eu.craftok.api.staff.reports;

import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

public interface Report {
    /**
     *
     * @return if the {@link Report} is still active
     */
    boolean isActive();

    /**
     *
     * @return a list of all the issuers {@link UUID}
     */
    List<UUID> getIssuers();

    /**
     *
     * @return the target's {@link UUID}
     */
    UUID getTarget();

    /**
     *
     * @return the {@link Report} timestamp
     */
    long getTimestamp();

    /**
     *
     * @return the reason of the {@link Report}
     */
    String getReason();

    /**
     *
     * @return the number of time the {@link #getTarget()} was reported
     */
    default int getTimes() {
        return getIssuers().size();
    }

    /**
     *
     * @return the {@link ReportResult}
     */
    ReportResult getResult();

    /**
     * Set the result of the {@link Report}
     * @param reportResult the new {@link ReportResult}
     */
    void setResult(ReportResult reportResult);

    /**
     * Types of Results
     * {@link #AWAITING}
     * {@link #ACCEPTED}
     * {@link #DENIED}
     */
    enum ReportResult {
        AWAITING,
        ACCEPTED,
        DENIED
    }
}

