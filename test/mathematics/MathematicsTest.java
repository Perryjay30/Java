package mathematics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicsTest {
    private Mathematics algebra;

    @BeforeEach
    public void initialSetUp() {
        algebra = new Mathematics();
    }

    @Test
    public void test_addNumbers() {
        int result = algebra.addNumbers(8, 7);
        Assertions.assertEquals(result ,15);
    }
    @Test
    public void test_subtractNumbers() {
        int result = algebra.subtractNumbers(8, 7);
        Assertions.assertEquals(result, 1);
    }

    @Test
    public void test_divideNumbers() {
        int result = algebra.divideNumbers(8, 7);
        Assertions.assertEquals(result , 1);

    }




}