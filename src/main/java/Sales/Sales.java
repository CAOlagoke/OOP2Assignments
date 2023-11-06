package Sales;

import Vegetable.Vegetable;

import java.util.HashSet;

public class Sales {

    private HashSet<Sellable> sellables;

    public Sales() {
        this.sellables = new HashSet<>();
    }


    public HashSet<Sellable> getSellables() {
        return sellables;
    }

    public void setSellables(HashSet<Sellable> sellables) {
        this.sellables = sellables;
    }

    public double getProfit() {

        double profit =0;

        for(Sellable sellable : getSellables()){
            profit+=sellable.getPrice();
        }

        return profit;
    }


    public void addSellableVegetable(Sellable vegetable){
        this.sellables.add(vegetable);
    }

}
