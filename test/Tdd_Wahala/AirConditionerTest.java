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
       assertFalse(samsung.isSwitchOn());

       samsung.turnOn();
       assertTrue(samsung.isSwitchOn());

    }

    @Test
    void testThatAirConditionerCanBeTurnedOff()  {
        samsung.turnOn();
        assertTrue(samsung.isSwitchOn());

        samsung.turnOff();
        assertFalse(samsung.isSwitchOn());
    }

    @Test
    void testThatAirConditionerHasDefaultTemperatureWhenSwitchedOn() {
        samsung.turnOn();
        assertTrue(samsung.isSwitchOn());

        samsung.defaultTemperature();
        assertEquals(16, samsung.defaultTemperature());
    }

    @Test
    void testTHatAirConditionerHasNoDefaultTemperatureWhenSwitchedOff() {
     assertFalse(samsung.isSwitchOn());
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
        assertFalse(samsung.isSwitchOn());
        assertEquals(0, samsung.defaultTemperature());

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
        samsung.increaseTemperature();
        assertEquals(30, samsung.getTemperature());
        System.out.println("The highest temperature is 30");
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

    @Test
    void testThatTemperatureCantBeDecreasedWhenSwitchedOff() throws Exception {
        samsung.turnOff();
        assertEquals(0, samsung.defaultTemperature());

        samsung.decreaseTemperature();
        assertEquals(0, samsung.getTemperature());
    }

    @Test
    void testThatTemperatureCantBeDecreasedBelow16() throws Exception {
        samsung.turnOn();
        assertEquals(16, samsung.defaultTemperature());
        samsung.increaseTemperature();
        assertEquals(17, samsung.getTemperature());

        samsung.decreaseTemperature();
        samsung.decreaseTemperature();
        assertEquals(16, samsung.getTemperature());
        System.out.println("Cant go below 16");
    }





}