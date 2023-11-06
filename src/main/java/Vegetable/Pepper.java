package Vegetable;

import Sales.Sellable;

public class Pepper extends Vegetable implements Sellable {

    public Pepper() {
        super(0.000044, 0.0013, 7, Color.PINK);
    }

    @Override
    public void grow(int lux, int water, int amountOfDays) {

        if(amountOfDays > 4 && water > 31){

            this.setStatus(Status.DESTROYED);

        }else if(water < 25 && amountOfDays == 10){


        } else{
            double result = (this.getSunshineGrowthFactor() * lux) + (this.getWaterGrowthFactor() * water);
            this.addToSizeInCM((int) result);
        }

    }

    @Override
    public double getPrice() {

        double price  = 0;
        if(this.isSellable()){
            price = this.getSizeInCM() * 0.15;
        }

        return price;
    }

    @Override
    public boolean isSellable() {

        if(this.getSizeInCM() >=15 && this.getSizeInCM() <= 21){
            return true;
        }
        return false;
    }

}
