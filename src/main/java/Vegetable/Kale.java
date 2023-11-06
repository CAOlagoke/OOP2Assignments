package Vegetable;

public class Kale extends Vegetable{

    public Kale() {
        super(0.0057, 0.032, 16, Color.YELLOW);
    }

    @Override
    public void grow(int lux, int water, int amountOfDays) {

        if(water > 40 && amountOfDays == 6){

        }else{
            double result = (this.getSunshineGrowthFactor() * lux) + (this.getWaterGrowthFactor() * water);
            this.addToSizeInCM((int) result);
        }
    }
}
