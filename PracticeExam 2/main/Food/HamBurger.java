package Food;

public class HamBurger extends Meat{

    public HamBurger(double browningFactor, double currentCookedPercentage, double cookingFactor, MeatType meatType) {
        super(browningFactor, currentCookedPercentage, cookingFactor, meatType);
    }

    @Override
    public void grill(double temperature) {

        double cookedIncrease = (1/(100*3.142))* temperature;
        double tanIncrease = 0.06* (temperature/100);

    }

    @Override
    public String toString() {

        return "Hamburger";
    }

}
