package Garden;
import Vegetable.*;
import Sales.*;
import java.util.HashSet;

public class Garden {

    private HashSet<Vegetable> vegetables;
    private static final int MAXIMUM_ALLOWED_VEGETABLES = 27;
    private Sales sales;
    public Garden() {
        this.vegetables = new HashSet<>();
        this.sales = new Sales();
    }

    public HashSet<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(HashSet<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public HashSet<Vegetable> getReadyForHarvest(){

        HashSet<Vegetable> result = new HashSet<>();

        for(Vegetable vegetable : getVegetables()){
            if(vegetable.getStatus() == Status.READY_TO_HARVEST){
                result.add(vegetable);
            }
        }
        return result;
    }

    public void addVegetable(Vegetable vegetable) throws TooManyVegetablesException {

        if(getVegetables().size() >= MAXIMUM_ALLOWED_VEGETABLES){

            throw new TooManyVegetablesException("Can't add more Vegetables, Maximum of 27 vegetables");
        }

        this.vegetables.add(vegetable);
    }

    public void addToSellable(){

        for(Vegetable vegetable : getReadyForHarvest()){

            if(vegetable instanceof Sellable){

                if(((Sellable) vegetable).isSellable()){
                    this.sales.addSellableVegetable((Sellable) vegetable);
                }
            }
        }
    }
}
