package eu.craftok.api.punishments;

import java.util.UUID;

public interface Punishment {
    /**
     *
     * @return the user's, that issued the punishment, Unique ID
     */
    UUID getIssuer();

    /**
     *
     * @return the user's, that received the punishment, Unique ID
     */
    UUID getTarget();

    /**
     *
     * @return the date of when the punishment was issued
     */
    long getIssuedDate();

    /**
     *
     * @return the expiry time of the punishment
     */
    long getExpiryTime();

    /**
     *
     * @return the reason of the punishment
     */
    String getReason();

    /**
     *
     * @return the punishment type {@link PunishmentType}
     */
    PunishmentType getPunishmentType();

    /**
     * Types of punishment
     * {@link #BAN}
     * {@link #MUTE}
     * {@link #KICK}
     */
    enum PunishmentType {
        /**
         * The punishment type for bans
         */
        BAN,

        /**
         * The punishment type for mutes
         */
        MUTE,

        /**
         * The punishment type for kicks
         */
        KICK
    }
}
