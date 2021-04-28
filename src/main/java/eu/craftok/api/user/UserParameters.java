package eu.craftok.api.user;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface UserParameters {
    /**
     *
     * @return {@code true} if anyone can friend the {@link User}, {@code false} otherwise
     */
    boolean canFriend();

    /**
     * Toggle if the user's can friend or not
     */
    void toggleFriend();

    /**
     *
     * @return the minimal power {@link UserFilter} to party this user
     */
    int canParty();

    /**
     *
     * @param power the new power {@link UserFilter}
     */
    void setMinimalPowerToParty(int power);

    /**
     * Increments the actual power of the {@link UserFilter}
     * <p>
     *     If the power reaches the maximum power limit,
     *     the power goes back to 0
     * </p>
     */
    default void incrementPowerToParty() {
        setMinimalPowerToParty(canParty() == UserFilter.getMaximumPower() ? 0 : canParty() + 1);
    }

    /**
     *
     * @return the minimal power {@link UserFilter} to message this user
     */
    int canMessage();

    /**
     *
     * @param power the new power {@link UserFilter}
     */
    void setMinimalPowerToMessage(int power);

    /**
     * Increments the actual power of the {@link UserFilter}
     * <p>
     *     If the power reaches the maximum power limit,
     *     the power goes back to 0
     * </p>
     */
    default void incrementPowerToMessage() {
        setMinimalPowerToMessage(canMessage() == UserFilter.getMaximumPower() ? 0 : canMessage() + 1);
    }

    /**
     * User Filters
     * {@link #EVERYONE}
     * {@link #FRIENDS}
     * {@link #STAFF}
     */
    enum UserFilter {
        EVERYONE(0, "Tout le monde"),
        FRIENDS(1, "Vos amis"),
        STAFF(2, "Le staff");

        private final int power;
        private final String filterName;

        UserFilter(final int power, final String filterName) {
            this.power = power;
            this.filterName = filterName;
        }

        /**
         *
         * @param minimalPower the minimal {@link #power}
         * @return all the {@link UserFilter} above that power
         */
        public static List<UserFilter> getUsersFromMinimalPower(int minimalPower) {
            return Arrays.stream(values()).filter(value -> value.power >= minimalPower).collect(Collectors.toList());
        }

        /**
         *
         * @param power the {@link #power}
         * @return an {@link Optional} of {@link UserFilter} that have this power
         */
        public static Optional<UserFilter> getUserFilterFromPower(int power) {
            return Arrays.stream(values()).filter(value -> value.power == power).findFirst();
        }

        /**
         *
         * @return the maximum of the {@link UserFilter}
         */
        public static int getMaximumPower() {
            return Arrays.stream(values()).mapToInt(UserFilter::getPower).max().orElse(EVERYONE.power);
        }

        /**
         *
         * @return the {@link #power}
         */
        public int getPower() {
            return power;
        }

        /**
         *
         * @return the {@link #filterName}
         */
        public String getFilterName() {
            return filterName;
        }
    }
}
