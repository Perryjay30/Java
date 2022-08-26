package ArraySnack3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedArrayTest {
    ReversedArray selection;

    @BeforeEach
    void doThisRepeatedly() {
        selection = new ReversedArray();
    }

    @Test
    void testThatArrayIsNotEmpty() {
        int[] arrayC = {45, 78, 90, 23, 56, 10, 49, 32, 77};
        assertTrue(selection.arrayIsFull());
    }

    @Test
    void testThatNumbersInArrayCanBeReversed() {
        int[] arrayC = {45, 78, 90, 23, 56, 10, 49, 32, 77};
        assertTrue(selection.arrayIsFull());

        assertEquals(0,selection. arrayReversal(arrayC));
    }

}