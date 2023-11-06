package GreenHouse;

import java.util.Random;

public class WeatherGenerator {

    private static final int MAX_LUX_VALUE = 101592;
    private static final int MIN_LUX_VALUE = 1000;

    private static final int MAX_MM_VALUE = 48;
    private static final int MIN_MM_VALUE = 0;

    public static int getLuxValue(){

        int lux = new Random().nextInt(MIN_LUX_VALUE, MAX_LUX_VALUE +1);

        return lux;
    }

    public static int getMMValue(){

        int mm = new Random().nextInt(MIN_MM_VALUE, MAX_MM_VALUE +1);

        return mm;
    }

}
