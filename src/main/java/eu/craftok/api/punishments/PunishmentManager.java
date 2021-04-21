package eu.craftok.api.punishments;

import java.util.List;
import java.util.UUID;

public interface PunishmentManager {
    /**
     * Used to punish a user
     * @param punishment the punishment applied to the user
     */
    void punish(PunishmentBuilder punishment);

    /**
     * Get the punishments of a user
     * @param uuid the user's Unique Id
     * @return a list of {@link Punishment}
     */
    List<Punishment> getPunishments(UUID uuid);

    /**
     * Get specific punishments of a user
     * @param uuid the user's Unique Id
     * @param punishmentType the {@link eu.craftok.api.punishments.Punishment.PunishmentType} you wish to get
     * @return a list of specific {@link Punishment}
     */
    List<Punishment> getPunishments(UUID uuid, Punishment.PunishmentType punishmentType);

    /**
     * Get the punishments given by a user
     * @param uuid the user's Unique Id
     * @return a list of {@link Punishment}
     */
    List<Punishment> getIssuedPunishments(UUID uuid);

    /**
     * Get specific punishments given by a user
     * @param uuid the user's Unique Id
     * @param punishmentType the {@link eu.craftok.api.punishments.Punishment.PunishmentType} you wish to get
     * @return a list of specific {@link Punishment}
     */
    List<Punishment> getIssuedPunishments(UUID uuid, Punishment.PunishmentType punishmentType);

    /**
     * Get the total punishments of a specific punishment type
     * @param punishmentType the punishment type
     * @return the total punishments
     */
    int getTotalPunishments(Punishment.PunishmentType punishmentType);
}
