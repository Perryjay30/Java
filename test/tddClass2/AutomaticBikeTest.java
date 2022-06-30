package tddClass2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticBikeTest {

    @Test
    @DisplayName("test bike turn on")
    public void testBikeTurnOn(){
        //given
        AutomaticBike bajaj = new AutomaticBike(false, true);
        //when
        bajaj.setBikeOn();
        //check
        assertEquals("It is on", bajaj.getBikeOn());
    }

    @Test
    @DisplayName("test bike turn off")
    public void testBikeTurnOff(){
        //given
        AutomaticBike bajaj =new AutomaticBike(true, false);
        //when
        bajaj.setBikeOff();
        //check
        assertEquals("It is Off", bajaj.getBikeOff());
    }

    @Test
    @DisplayName("test bike acceleration")
    public void testBikeAcceleration(){
        //given
        AutomaticBike bajaj = new AutomaticBike(false, true);
        //when
        bajaj.setBikeOn();
        bajaj.setGear(2);
        bajaj.accelerate();
        bajaj.accelerate();
        //check
        assertEquals(4, bajaj.getSpeed());
    }

    @Test
    @DisplayName("test bike deceleration")
    public void testBikeDeceleratiom(){
        //given
        AutomaticBike bajaj = new AutomaticBike(false, true);
        //when
        bajaj.setBikeOn();
        bajaj.setGear(2);
        bajaj.decelerate();
        bajaj.decelerate();
        //check
        assertEquals(6, bajaj.getSpeed());
    }

}