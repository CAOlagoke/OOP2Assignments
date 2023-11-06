package GreenHouse;
import Garden.Garden;
import Vegetable.Vegetable;

public class GreenHouse extends Garden{

    public GreenHouse() {
    }

    public void runWeather(){

        int lux = WeatherGenerator.getLuxValue();
        int mm = WeatherGenerator.getMMValue();

        for(Vegetable vegetable : this.getVegetables()){

            vegetable.grow(lux, mm, 1);
        }
    }

}
