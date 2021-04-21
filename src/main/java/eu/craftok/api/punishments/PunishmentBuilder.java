package eu.craftok.api.punishments;

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

    public void setIssuerUuid(UUID issuerUuid) {
        this.issuerUuid = issuerUuid;
    }

    public void setTargetUUid(UUID targetUUid) {
        this.targetUUid = targetUUid;
    }

    public void setIssuedDate(long issuedDate) {
        this.issuedDate = issuedDate;
    }

    public void setExpiryTime(long expiryTime) {
        this.expiryTime = expiryTime;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setPunishmentType(Punishment.PunishmentType punishmentType) {
        this.punishmentType = punishmentType;
    }

    public PunishmentBuilder build() {
        return this;
    }
}
