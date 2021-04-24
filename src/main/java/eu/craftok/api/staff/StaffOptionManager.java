package eu.craftok.api.staff;

import eu.craftok.api.user.User;

import java.util.Optional;
import java.util.UUID;

public interface StaffOptionManager {
    /**
     *
     * @param uuid the staff's Unique Id
     * @return an optional of {@link StaffOption}
     */
    Optional<StaffOption> getStaffOptions(UUID uuid);

    /**
     *
     * @param staffOption the new staff option value you wish to save
     * @return the updated staff option
     */
    StaffOption saveOptions(StaffOption staffOption);

    /**
     * <p>
     *     Inserts a user into the staff option database
     *     This user will now have access to access to staff options
     * </p>
     * @param uuid the staff's Unique Id
     * @return {@code true} if the staff has been added to the database, {@code false} if an error occurred
     */
    boolean insertStaffOptions(UUID uuid);

    /**
     * <p>
     *    Removes a user from the staff option database
     *    This user will no longer have access to staff options
     * </p>
     * @param uuid the staff's Unique Id
     */
    void removeStaffOptions(UUID uuid);
}
