package Fridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FridgeTest {

    private Fridge fridge;

    @BeforeEach
    void setUp(){

        this.fridge = new Fridge();


    }

    @Test
    void testConstructorSuccess(){
        double result= 8;

        assertEquals(result, this.fridge.getTemperature());
    }
}