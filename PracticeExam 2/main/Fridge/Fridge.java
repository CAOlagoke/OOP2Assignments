package Fridge;

import Food.Food;
import Food.Meat;
import Food.Vegetable;
import java.util.HashSet;
import java.util.Iterator;

public class Fridge {

    private static Fridge instance;
    private HashSet<Food> foodInFridge;
    private int temperature;        //Ask about this

    public Fridge() {
        this.instance = new Fridge();
        this.foodInFridge = new HashSet<>();
        this.temperature = 8;
    }

    public Fridge getInstance() {
        return instance;
    }

    public void setInstance(Fridge instance) {
        this.instance = instance;
    }

    public HashSet<Food> getFoodInFridge() {
        return foodInFridge;
    }

    public void setFoodInFridge(HashSet<Food> foodInFridge) {
        this.foodInFridge = foodInFridge;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void addFood(Food food){     //Ask about getFoodInFridge

        getFoodInFridge().add(food);
    }

    public Meat getMeat() throws NoMoreFoodException, FridgeIsEmptyException{

        if(getFoodInFridge().size() == 1){

            throw new FridgeIsEmptyException("Last item in the Fridge.Fridge");
        }

        Iterator iterator = getFoodInFridge().iterator();

        while(iterator.hasNext()){

            if(iterator.next() instanceof Meat ){   //Ask if this is correct or just use the toString method

                return (Meat) iterator.next();
            }
        }

        throw new NoMoreFoodException("No more Food.Vegetable in Fridge.Fridge");
    }

    public Vegetable getVegetable() throws NoMoreFoodException, FridgeIsEmptyException{

        if(getFoodInFridge().size() == 1){

            throw new FridgeIsEmptyException("Last item in the Fridge.Fridge");
        }

        Iterator iterator = getFoodInFridge().iterator();

        while(iterator.hasNext()){

            if(iterator.next() instanceof Vegetable){   //Ask if this is correct
               return (Vegetable) iterator.next();
            }
        }

        throw new NoMoreFoodException("No more Food.Vegetable in Fridge.Fridge");
    }


}
