import Food.*;
import Thermometer.Measurable;

import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;

public class SmartBBQ extends TimerTask implements Measurable {

    private HashSet<Food> food;
    private int temperature;
    private Timer timer;
    public SmartBBQ() {

        this.food = new HashSet<>();
        this.temperature = 0;
        this.timer = new Timer();
    }



    public HashSet<Food> getFood() {
        return food;
    }

    public void setFood(HashSet<Food> food) {
        this.food = food;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature){

        if(temperature >250){
            this.temperature = 250;
        }else{
            this.temperature = temperature;
        }
    }

    public void addFood(Food food){

        if(getFood().size()<6){
            this.food.add(food);
        }else{
            System.out.println();
        }

    }

    public void turnOn(int temperature) {

        setTemperature(temperature);
        this.timer = new Timer();
        this.timer.schedule(this, 0, 1000);     //ask why we can't passer period as a param to turnOn BBQ
        run();
    }

    public void turnOff(){      //Check this method later

        setTemperature(0);
        this.timer.cancel();
    }
    @Override
    public void run() {

        for(Food f : getFood()){
            f.grill(getTemperature());
        }
    }
}
