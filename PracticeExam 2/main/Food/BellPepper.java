package Food;

import Thermometer.Measurable;

public class BellPepper extends Vegetable implements Measurable {

    public BellPepper(double browningFactor, double moistPercentage, double moistFactor) {
        super(browningFactor, moistPercentage, moistFactor);
    }

    @Override
    public String toString() {

        return "BellPepper";
    }

    public void grill(double temperature){

        double tanIncrease = 0.03* temperature;
        double moistDecrease = 0.1* temperature;

        this.currentBrownPercentage += tanIncrease;
        this.decreaseMoistPercentage(moistDecrease);
    }

    @Override
    public double getTemperature() {

        return this.getCurrentTemperature();
    }
}
