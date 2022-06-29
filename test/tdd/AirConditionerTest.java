package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    @Test
    @DisplayName("Switch to turn Ac on or off")
    public void switchACOn() {
        //given
        AirCondition rachaelAC = new AirCondition();
        rachaelAC.off();
        //when
        rachaelAC.turnOn();
        //check
        assertEquals("on", rachaelAC.getAC2());
    }

    @Test
    @DisplayName("Switch to turn Ac off")
    public void switchOff() {
        //given
        AirCondition bolajiAC = new AirCondition();
        bolajiAC.turnOn();
        //when
        bolajiAC.off();
        //check
        assertEquals("off", bolajiAC.getAC());

    }

    @Test
    public void increaseTemp(){
        SecondAir secondair = new SecondAir(16);
        secondair.switchOn();

        secondair.setIncreaseTemp();

        assertEquals(17, secondair.getTemp());
    }
    @Test
    public void decreaseTemp(){
        SecondAir secondair = new SecondAir(17);
        secondair.switchOn();

        secondair.setDecreaseTemp();

        assertEquals(16, secondair.getTemp());
    }
    @Test
    public void decreaseTempBelow16(){
        SecondAir secondair = new SecondAir(16);
        secondair.switchOn();

        secondair.setDecreaseTemp();

        assertEquals(16, secondair.getTemp());
    }

    @Test
    public void increaseTempAbove30(){
        SecondAir secondair = new SecondAir(30);
        secondair.switchOn();

        secondair.setIncreaseTemp();

        assertEquals(30, secondair.getTemp());
    }

}














