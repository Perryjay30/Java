package ArraySnacks2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfArrayTest {

    SumOfArray bloat;
    @BeforeEach
    void startsAllWith() {
        bloat = new SumOfArray();
    }

    @Test
    public void testThatArrayIsNotEmpty() {
        int [] array = {53, 21, 78, 90, 55, 145, 31, 67};
        boolean seed = bloat.isEmpty();
        assertFalse(seed);
    }

    @Test
    public void testTheTotalNumbersInAnArray() {
        int [] array = {53, 21, 78, 90, 55, 145, 31, 67};
        int store = bloat.arrayTotals(array);
        assertEquals(540, store);
    }
}