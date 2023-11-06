package Vegetable;

import Sales.Sellable;

public class Asparagus extends Vegetable implements Sellable {

    public Asparagus() {
        super(0.000027, 0.0049, 20, Color.BLUE);

    }

    @Override
    public void grow(int lux, int water, int amountOfDays) {

        if(water < 14 && amountOfDays == 10){

            this.setStatus(Status.DESTROYED);
        }else{

            double result = (this.getSunshineGrowthFactor() * lux) + (this.getWaterGrowthFactor() * water);

            this.addToSizeInCM((int) result);
        }
    }

    @Override
    public double getPrice() {

        double result = 0;
        if(isSellable()){

            result = this.getSizeInCM() * 0.12;
        }

        return result;
    }

    @Override
    public boolean isSellable() {

        if(this.getSizeInCM() >= this.getRipeLength() && this.getSizeInCM() <=29){

            return true;
        }
        return false;
    }


}
