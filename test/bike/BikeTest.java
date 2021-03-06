package bike;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BikeTest {
    private Bike nissian;

    @BeforeEach
    public void initialSetUp() {
        nissian = new Bike();
    }

    @Test
    public void test_isOn() throws Exception {
        String result = nissian.isOn("isOn");
        Assertions.assertEquals(result, "isOn");
    }

    @Test
    public void test_isOff() throws Exception {
        String result = nissian.isOff("isOff");
        Assertions.assertEquals(result, "isOff");
    }

    @Test
    public void test_accelerateGearOne() throws Exception {
        int gearResult = nissian.accelerateGearOne(1, 2);
        Assertions.assertEquals(gearResult, 3);
    }


    @Test
    public void test_accelerateGearTwo() throws Exception {
        int gearResult = nissian.decelerateGearTwo(2, 25);
        Assertions.assertEquals(gearResult, 27);
    }


    @Test
    public void test_accelerateGearThree() throws Exception {
        int gearResult = nissian.accelerateGearThree(3, 37);
        Assertions.assertEquals(gearResult, 40);
    }

    @Test
    public void test_accelerateGearFour() throws Exception {
        int gearResult = nissian.accelerateGearFour(4, 46);
        Assertions.assertEquals(gearResult, 50);
    }



    @Test
    public void test_decelerateGearOne() throws Exception {
        int gearResult = nissian.decelerateGearOne(1, 22);
        Assertions.assertEquals(gearResult, 21);
    }


    @Test
    public void test_decelerateGearTwo() throws Exception {
        int gearResult = nissian.decelerateGearTwo(2, 25);
        Assertions.assertEquals(gearResult, 23);
    }

    @Test
    public void test_decelerateGearThree() throws Exception {
        int gearResult = nissian.decelerateGearThree(3, 37);
        Assertions.assertEquals(gearResult, 34);
    }



    @Test
    public void test_decelerateGearFour() throws Exception {
        int gearResult = nissian.decelerateGearFour(4, 45);
        Assertions.assertEquals(gearResult, 41);
    }
}