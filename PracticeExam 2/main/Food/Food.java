package Food;

import Thermometer.Measurable;

public abstract class Food implements Measurable {

    protected double currentBrownPercentage;
    private double browningFactor;
    private double currentTemperature;

    public Food(double browningFactor) {
        this.browningFactor = browningFactor;
        this.currentBrownPercentage = 0;
        this.currentTemperature = 0;
    }

    public double getCurrentBrownPercentage() {
        return currentBrownPercentage;
    }

    public void setCurrentBrownPercentage(double currentBrownPercentage) {
        this.currentBrownPercentage = currentBrownPercentage;
    }

    public double getBrowningFactor() {
        return browningFactor;
    }

    public void setBrowningFactor(double browningFactor) {
        this.browningFactor = browningFactor;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public double getTemperature(){

        return this.currentTemperature;
    }
    public abstract void grill(double temperature);

}
