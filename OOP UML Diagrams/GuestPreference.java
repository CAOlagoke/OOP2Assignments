public class GuestPreference {

    private boolean useThePool;
    private boolean skipCleaning;
    private boolean wantCleanTowel;

    public GuestPreference(boolean useThePool, boolean skipCleaning, boolean wantCleanTowel) {
        this.useThePool = useThePool;
        this.skipCleaning = skipCleaning;
        this.wantCleanTowel = wantCleanTowel;
    }

    public boolean isUseThePool() {
        return useThePool;
    }

    public void setUseThePool(boolean useThePool) {
        this.useThePool = useThePool;
    }

    public boolean isSkipCleaning() {
        return skipCleaning;
    }

    public void setSkipCleaning(boolean skipCleaning) {
        this.skipCleaning = skipCleaning;
    }

    public boolean isWantCleanTowel() {
        return wantCleanTowel;
    }

    public void setWantCleanTowel(boolean wantCleanTowel) {
        this.wantCleanTowel = wantCleanTowel;
    }
}
