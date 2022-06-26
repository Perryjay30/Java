package ac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ACTest {

        private AC dynamic;

        @BeforeEach
        public void intiialSetUp() {
                dynamic = new AC();
        }

        @Test
        public void test_isOn() throws Exception {
            String result = dynamic.isOn("on");
            Assertions.assertEquals(result, "on");
        }

     @Test
    public void test_isOnIsInvalid() throws Exception {
            String isOn = dynamic.isOn("ppppp");

            Assertions.assertEquals(isOn, "ppppp");
     }

    @Test
    public void test_isOff() throws Exception {
        String result = dynamic.isOff("off");
        Assertions.assertEquals(result, "off");
    }


    @Test
    public void test_increaseTemp() throws Exception {
            int result = dynamic.increaseTemp(20);
            Assertions.assertEquals(result, 20);
    }

    @Test
    public void test_decreaseTemp() throws Exception {
            int result = dynamic.decreaseTemp(16);
            Assertions.assertEquals(result, 16);
    }
}