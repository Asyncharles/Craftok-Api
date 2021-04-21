package eu.craftok.api.staff.reports;

import java.util.Optional;
import java.util.UUID;

public interface ReportHandler {
    /**
     *
     * @param report the {@link Report}
     */
    void push(Report report);

    /**
     *
     * @param report the {@link Report}
     * @return the handled report
     */
    Report handleReport(Report report);

    /**
     *
     * @return all active {@link Report}
     */
    Report[] getActiveReports();

    /**
     *
     * @param uuid the potential reported target
     * @return an optional {@link Report}
     */
    Optional<Report> getReported(UUID uuid);

    /**
     * Flush all inactive and denied reports
     */
    void flushReports();
}
