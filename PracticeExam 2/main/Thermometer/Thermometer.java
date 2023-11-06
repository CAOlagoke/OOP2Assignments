package Thermometer;

import java.util.ArrayList;

public class Thermometer {

    protected ArrayList<Measurable> measurables;

    public Thermometer(ArrayList<Measurable> measurables) {
        this.measurables = measurables;
    }

    public ArrayList<Measurable> getMeasurables() {
        return measurables;
    }

    public void setMeasurables(ArrayList<Measurable> measurables) {
        this.measurables = measurables;
    }

    public double measureTemperature(Measurable measurable){

        double result = 0;

        for(Measurable m : getMeasurables()){

            if(m.equals(measurable)){
                result= m.getTemperature();
            }
        }

        return result;
    }

}
