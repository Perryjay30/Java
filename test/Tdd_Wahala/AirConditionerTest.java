package Tdd_Wahala;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    AirConditioner samsung;

    @BeforeEach
    void alwaysStartsWithThis() {
        samsung = new AirConditioner();
    }

    @Test
    void testThatAirConditionerCanBeTurnedOn() {
       assertFalse(samsung.isSwitchedOn());

       samsung.turnOn();
       assertTrue(samsung.isSwitchedOn());

    }

    @Test
    void testThatAirConditionerCanBeTurnedOff()  {
        samsung.turnOn();
        assertTrue(samsung.isSwitchedOn());

        samsung.turnOff();
        assertTrue(samsung.isSwitchedOff());
    }

    @Test
    void testThatAirConditionerHasDefaultTemperatureWhenSwitchedOn() {
        samsung.turnOn();
        assertTrue(samsung.isSwitchedOn());

        samsung.defaultTemperature();
        assertEquals(16, samsung.defaultTemperature());
    }

    @Test
    void testTHatAirConditionerHasNoDefaultTemperatureWhenSwitchedOff() {
     assertFalse(samsung.isSwitchedOn());
     assertEquals(0, samsung.defaultTemperature());
    }

    @Test
    void testThatTemperatureCanBeIncreased() throws Exception {
        samsung.turnOn();
        assertEquals(16, samsung.defaultTemperature());

        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        assertEquals(19, samsung.getTemperature());


    }

    @Test
    void testThatTemperatureCantBeIncreasedWhenSwitchedOff() throws Exception {
        samsung.turnOff();
        assertTrue(samsung.isSwitchedOff());
        assertEquals(0, samsung.defaultTemperature());

        assertFalse(samsung.isSwitchedOn());
        samsung.increaseTemperature();
        assertEquals(0, samsung.getTemperature());
    }

    @Test
    void testThatTemperatureCantBeIncreasedAbove30() throws Exception {
        samsung.turnOn();
        assertEquals(16, samsung.defaultTemperature());

        for (int i = 17; i < 30; i++) {
            samsung.increaseTemperature();
        }
        assertEquals(29, samsung.getTemperature());
        samsung.increaseTemperature();
//        samsung.increaseTemperature();
        assertEquals(30, samsung.getTemperature());
    }

    @Test
    void testThatTemperatureCantBeDecreasedWhenSwitchedOff() throws Exception {
        samsung.turnOff();
        assertTrue(samsung.isSwitchedOff());
        assertEquals(0, samsung.defaultTemperature());

        assertFalse(samsung.isSwitchedOn());
        samsung.decreaseTemperature();
        assertEquals(0, samsung.getTemperature());
    }

    @Test
    void testThatTemperatureCanBeDecreased() throws Exception {
        samsung.turnOn();
        assertEquals(16, samsung.defaultTemperature());

        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        assertEquals(19, samsung.getTemperature());

        samsung.decreaseTemperature();
        samsung.decreaseTemperature();
        assertEquals(17, samsung.getTemperature());
    }





}