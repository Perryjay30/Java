package ArraySnacks1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayLargestNumberTest {

    ArrayLargestNumber gold;
    @BeforeEach
    void setUp() {
        gold = new ArrayLargestNumber();
    }

    @Test
    public void testArrayIsNotEmpty() {
        int [] array = {382, 956, 70, 12, 453, 909, 821, 889, 733};
        boolean doll = gold.isNotEmpty();
        assertTrue(doll);
    }

    @Test
    public void testThatArrayHasLargestNumber() {
        int [] array = {382, 956, 70, 12, 453, 909, 821, 889, 733};
        int doll = gold.largestNumberInArray(array);
        assertEquals(956, doll);
    }

}