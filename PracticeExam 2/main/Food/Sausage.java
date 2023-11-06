package Food;

public class Sausage extends Meat {

    public Sausage(double browningFactor, double currentCookedPercentage, double cookingFactor, MeatType meatType) {
        super(browningFactor, currentCookedPercentage, cookingFactor, meatType);
    }

    @Override
    public String toString() {

        return "Sausage";
    }

    public void grill(double temperature){

        double cookedIncrease = (1/(80*3.142)) * temperature;
        double tanIncrease = 0.05* (temperature/100);

        this.setCurrentBrownPercentage(this.getCurrentBrownPercentage() + tanIncrease);
        this.currentCookedPercentage += cookedIncrease;
    }
}
