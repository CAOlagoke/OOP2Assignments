import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class StendaaniumTest {

    private ArrayList<Double> result;
    private Stendaanium stendaanium;
    @BeforeEach
    void setUp(){

        this.result = new ArrayList<>();

        this.stendaanium = new Stendaanium();
    }

    @Test
    void splitTemperatureBelow50KelvinSuccessful() throws MeltdownException {

        double temperature = 49;
        result = this.stendaanium.split(temperature, 10);

//        System.out.println("ResidualHeat:" + result.get(0));
//        System.out.println("AmtOfSteam:" + result.get(1));

        assertEquals(result, this.stendaanium.split(49, 10));
    }

    @Test
    void splitTemperatureAbove50KelvinSuccessful() throws MeltdownException{

        double temperature = 51;
        result = this.stendaanium.split(temperature, 10);

        assertEquals(result, this.stendaanium.split(49, 10));
    }

    @Test
    void splitThrowsMeltdownExceptionTemperatureHigherThan150(){

        double temperature = 151;
        assertThrows(MeltdownException.class, () ->{
            this.stendaanium.split(temperature, 100);
        });
    }
}