package eu.craftok.api.punishments;

import java.util.Objects;
import java.util.UUID;

public class PunishmentBuilder {
    /**
     * <p>
     *     Builder to help with the punishment.
     *     {@link Punishment}
     * </p>
     */
    private UUID issuerUuid;
    private UUID targetUUid;
    private long issuedDate;
    private long expiryTime;
    private String reason;
    private Punishment.PunishmentType punishmentType;

    public PunishmentBuilder() {
        this.issuedDate = System.currentTimeMillis();
    }

    public PunishmentBuilder setIssuerUuid(UUID issuerUuid) {
        this.issuerUuid = issuerUuid;
        return this;
    }

    public PunishmentBuilder setTargetUUid(UUID targetUUid) {
        this.targetUUid = targetUUid;
        return this;
    }

    public PunishmentBuilder setIssuedDate(long issuedDate) {
        this.issuedDate = issuedDate;
        return this;
    }

    public PunishmentBuilder setExpiryTime(long expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    public PunishmentBuilder setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public PunishmentBuilder setPunishmentType(Punishment.PunishmentType punishmentType) {
        this.punishmentType = punishmentType;
        return this;
    }

    public PunishmentBuilder build() {
        if (issuerUuid == null || targetUUid == null || reason == null || punishmentType == null) {
            return null;
        }
        return this;
    }

    public UUID getIssuerUuid() {
        return issuerUuid;
    }

    public UUID getTargetUUid() {
        return targetUUid;
    }

    public long getIssuedDate() {
        return issuedDate;
    }

    public long getExpiryTime() {
        return expiryTime;
    }

    public String getReason() {
        return reason;
    }

    public Punishment.PunishmentType getPunishmentType() {
        return punishmentType;
    }
}
