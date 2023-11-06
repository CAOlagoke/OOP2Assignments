package Vegetable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsparagusTest {

    @Test
    void grow_notEnoughWater_shouldBeDestroyed(){

        Asparagus asparagus = new Asparagus();

        asparagus.grow(10, 13, 10);
        assertEquals(Status.DESTROYED, asparagus.getStatus());
    }

    @Test
    void asparagusDestroyedConditionNotSatisfied(){

        Asparagus asparagus = new Asparagus();

        asparagus.grow(10, 14, 10);

        assertNotEquals(Status.DESTROYED, asparagus.getStatus());
    }


}