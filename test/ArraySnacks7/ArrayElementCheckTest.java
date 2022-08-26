package ArraySnacks7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayElementCheckTest {
    ArrayElementCheck bliss;
    @BeforeEach
    void initialSetUp() {
    bliss = new ArrayElementCheck();
    }

    @Test
    void testThatThereAreElementsInTheArray() {
        int [] array = {21, 45, 37, 89, 90, 56, 43, 62};
        assertTrue(bliss.arrayHasElement());
        System.out.println("There are elements in the array");
    }

    @Test
    void testThatAnElementIsInTheArray() {
        int [] array = {21, 45, 37, 89, 90, 56, 43, 62};
        assertTrue(bliss.arrayHasElement());

        int checkElement = 37;
        assertEquals(true, bliss.checkElementsInAnArray(checkElement,array));
        System.out.println("Element exists in the array");
    }

    @Test
    void testThatAnElementIsNotInTheArray() {
        int [] array = {21, 45, 37, 89, 90, 56, 43, 62};
        assertTrue(bliss.arrayHasElement());

        int checkElement = 50;
        assertEquals(false, bliss.checkElementsInAnArray(checkElement,array));
        System.out.println("Element doesn't exists in the array");
    }

}