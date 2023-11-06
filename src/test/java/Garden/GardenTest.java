package Garden;

import Vegetable.Asparagus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GardenTest {

    private Garden garden;
    @BeforeEach
    void Setup(){

        this.garden = new Garden();
    }
    @Test
    void addVegetable_TooManyVegetablesException_Thrown() throws TooManyVegetablesException {

        for(int i = 0; i< 27 ; i++){

            this.garden.addVegetable(new Asparagus());
        }

        assertThrows(TooManyVegetablesException.class,() ->{

            this.garden.addVegetable(new Asparagus());
        });
    }

    @Test
    void addVegetable_TooManyVegetablesException_NotThrown() throws TooManyVegetablesException{

        assertDoesNotThrow(() ->this.garden.addVegetable(new Asparagus()));
    }
}