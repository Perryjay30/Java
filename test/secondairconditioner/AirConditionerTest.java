package secondairconditioner;

import airconditioner.SecondAirConditioner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirConditionerTest {

    SecondAirConditioner love;

    @BeforeEach
    public void initialSetUp(){
        love = new SecondAirConditioner();
    }

    @Test
    public void test_isOn(){
        String result = love.isOn("on");
        Assertions.assertEquals(result, "on");
    }

    @Test
    public void test_isOff(){
        String result = love.isOff("off");
        Assertions.assertEquals(result, "off");
    }

    @Test
    public void test_increaseTemp() {
        int result = love.increaseTemp(30);
        Assertions.assertEquals(result, 30);
    }
    @Test
    public void test_decreaseTemp() {
        int result = love.decreaseTemp(16);
        Assertions.assertEquals(result, "16");
    }
}