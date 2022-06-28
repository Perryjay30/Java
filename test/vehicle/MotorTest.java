package vehicle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MotorTest {

    private Motor honda;

    @BeforeEach
    void setUp(){
        honda = new Motor();
    }

    @Test
    public void test_setAndGetBrand() {
        honda.setBrand("Toyota");
        String variable = honda.getBrand();
        Assertions.assertEquals(variable, "Toyota");
    }

    @Test
    public void test_setAndGetBrake(){
        honda.setBrake("STOP");
        String variable = honda.getBrake();
        Assertions.assertEquals(variable, "STOP");
    }

    @Test
    public void test_setAndGetcolor(){
        honda.setColor("Blue");
        String variable = honda.getColor();
        Assertions.assertEquals(variable, "Blue");
    }

    @Test
    public void test_setAndGetPlateNumber(){
        honda.setPlateNumber(124);
        int variable = honda.getPlateNumber();
        Assertions.assertEquals(variable, 124);
    }


}