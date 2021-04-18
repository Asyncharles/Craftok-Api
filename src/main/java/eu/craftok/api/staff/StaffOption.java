package eu.craftok.api.staff;

import java.util.UUID;

public interface StaffOption {
    /**
     *
     * @return the staff's Unique Id
     */
    UUID getUniqueId();

    /**
     *
     * @param toggle {@code true} to toggle moderator mode, {@code false} otherwise
     */
    void toggleModeratorMode(boolean toggle);

    /**
     *
     * @return {@code true} if the staff is in moderator mode, {@code false} otherwise
     */
    boolean hasModeratorModeToggled();

    /**
     *
     * @param toggle {@code true} to toggle vanish, {@code false} otherwise
     */
    void toggleVanish(boolean toggle);

    /**
     * <p>
     *     If {@link #hasModeratorModeToggled()} is toggle, the staff is by default, vanish
     * </p>
     * @return {@code true} if the staff is vanished, {@code false} otherwise
     */
    boolean isVanished();

    /**
     *
     * @param toggle {@code true} to toggle report alerts, {@code false} otherwise
     */
    void toggleReports(boolean toggle);

    /**
     *
     * @return {@code true} if the staff has reports alerts toggled, {@code false} otherwise
     */
    boolean hasReportsToggled();
}
