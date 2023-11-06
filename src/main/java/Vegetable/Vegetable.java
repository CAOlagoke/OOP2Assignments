package Vegetable;

public abstract class Vegetable {

    protected double sizeInCM;
    protected double sunshineGrowthFactor;
    protected double waterGrowthFactor;
    protected int ripeLength;
    protected Color color;
    protected Status status;

    public Vegetable(double sunshineGrowthFactor, double waterGrowthFactor, int ripeLength, Color color) {
        this.sunshineGrowthFactor = sunshineGrowthFactor;
        this.waterGrowthFactor = waterGrowthFactor;
        this.ripeLength = ripeLength;
        this.color = color;
        this.sizeInCM = 0;
        this.status = Status.GROWING;
    }

    public double getSizeInCM() {
        return sizeInCM;
    }

    public void setSizeInCM(double sizeInCM) {
        this.sizeInCM = sizeInCM;
    }

    public double getSunshineGrowthFactor() {
        return sunshineGrowthFactor;
    }

    public void setSunshineGrowthFactor(double sunshineGrowthFactor) {
        this.sunshineGrowthFactor = sunshineGrowthFactor;
    }

    public double getWaterGrowthFactor() {
        return waterGrowthFactor;
    }

    public void setWaterGrowthFactor(double waterGrowthFactor) {
        this.waterGrowthFactor = waterGrowthFactor;
    }

    public int getRipeLength() {
        return ripeLength;
    }

    public void setRipeLength(int ripeLength) {
        this.ripeLength = ripeLength;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void addToSizeInCM(int growthInSize){

        this.sizeInCM += growthInSize;
    }
    public abstract void grow(int lux, int water, int amountOfDays);
}
