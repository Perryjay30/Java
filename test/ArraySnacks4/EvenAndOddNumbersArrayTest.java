package ArraySnacks4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenAndOddNumbersArrayTest {
    EvenAndOddNumbersArray ceremony;

    @BeforeEach
    void doThisRepeatedly() {
        ceremony = new EvenAndOddNumbersArray();
    }

    @Test
    void testThatArrayIsNotEmpty() {
        int [] evens = {432, 656, 42, 21, 901, 876, 57, 22, 78, 63, 12, 50};
        assertFalse(ceremony.arrayIsEmpty());
    }

    @Test
    void testThereAreEvenNumbersInTheArray() {
        int [] evens = {432, 656, 42, 21, 901, 876, 57, 22, 78, 63, 12, 50};
        assertFalse(ceremony.arrayIsEmpty());

        assertEquals(0,ceremony.evenArray(evens));
    }

    @Test
    void testThereAreOddNumbersInTheArray() {
        int [] odd = {432, 656, 42, 21, 901, 876, 57, 22, 78, 63, 12, 50};
        assertFalse(ceremony.arrayIsEmpty());

        assertEquals(0,ceremony.oddArray(odd));
    }

}