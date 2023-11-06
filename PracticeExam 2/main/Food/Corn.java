package Food;

public class Corn extends Vegetable {
    public Corn(double browningFactor, double moistPercentage, double moistFactor) {
        super(browningFactor, moistPercentage, moistFactor);
    }

    @Override
    public String toString() {

        return "Corn";
    }

    public void grill(double temperature){

        double tanIncrease = 0.08* temperature;
        double moistDecrease = 0.05* temperature;

        this.currentBrownPercentage = this.getCurrentBrownPercentage() + tanIncrease;
        this.decreaseMoistPercentage(moistDecrease);
    }

}
