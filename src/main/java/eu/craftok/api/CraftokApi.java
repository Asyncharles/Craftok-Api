package eu.craftok.api;

import eu.craftok.api.network.CraftokNetwork;
import eu.craftok.api.party.PartyManager;
import eu.craftok.api.punishments.PunishmentManager;
import eu.craftok.api.rank.GroupManager;
import eu.craftok.api.staff.StaffOptionManager;
import eu.craftok.api.staff.reports.ReportHandler;
import eu.craftok.api.statistics.StatisticManager;
import eu.craftok.api.user.UserManager;

public interface CraftokApi {
    /**
     *
     * @return the {@link GroupManager} instance
     */
    GroupManager getGroupManager();

    /**
     *
     * @return the {@link UserManager} instance
     */
    UserManager getUserManager();

    /**
     *
     * @return the {@link StaffOptionManager} instance
     */
    StaffOptionManager getStaffOptionManager();

    /**
     *
     * @return the {@link PunishmentManager} instance
     */
    PunishmentManager getPunishmentManager();

    /**
     *
     * @return the {@link ReportHandler} instance
     */
    ReportHandler getReportHandler();

    /**
     *
     * @return the {@link StatisticManager} instance
     */
    StatisticManager getStatistics();

    /**
     *
     * @return the {@link CraftokNetwork} instance
     */
    CraftokNetwork getCraftokNetwork();

    /**
     *
     * @return the {@link PartyManager} instance
     */
    PartyManager getPartyManager();
}
