package org.ayosynk.landClaimPlugin.models;

public class ChunkSettings {

    private boolean pvpEnabled;
    private boolean mobDamageEnabled;

    public ChunkSettings() {
        this.pvpEnabled = false;
        this.mobDamageEnabled = false;
    }

    public ChunkSettings(boolean pvpEnabled, boolean mobDamageEnabled) {
        this.pvpEnabled = pvpEnabled;
        this.mobDamageEnabled = mobDamageEnabled;
    }



    public boolean isPvpEnabled() {
        return pvpEnabled;
    }

    public void setPvpEnabled(boolean pvpEnabled) {
        this.pvpEnabled = pvpEnabled;
    }



    public boolean isMobDamageEnabled() {
        return isMobDamageAllowed();
    }

    public void setMobDamageEnabled(boolean enabled) {
        setMobDamageAllowed(enabled);
    }



    @Override
    public String toString() {
        return pvpEnabled + "," + mobDamageEnabled;
    }

    public static ChunkSettings fromString(String str) {
        if (str == null || str.isEmpty()) {
            return new ChunkSettings();
        }

        String[] parts = str.split(",");
        if (parts.length < 2) {
            return new ChunkSettings();
        }

        return new ChunkSettings(
            Boolean.parseBoolean(parts[0]),
            Boolean.parseBoolean(parts[1])
        );
    }
}
