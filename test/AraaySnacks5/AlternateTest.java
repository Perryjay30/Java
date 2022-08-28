package AraaySnacks5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternateTest {
    Alternate software;

    @BeforeEach
    void BeginsAllWithThis() {
        software = new Alternate();
    }

    @Test
    void testThatArrayIsNotEmpty() {
        String [] array1 = {"1", "2", "3"};
        String [] array2 = {"a", "b", "c"};
        assertTrue(software.isNotEmpty());
    }

    @Test
    void testThatArrayContainsString() {
        assertTrue(software.isNotEmpty());

        String [] array2 = {"a", "b", "c"};
        assertTrue(software.ArrayContainsString());
    }

    @Test
    void testThatArrayCanBeAlternated() {
        assertTrue(software.isNotEmpty());
        assertTrue(software.ArrayContainsString());

        String [] array1 = {"1", "2", "3"};
        String [] array2 = {"a", "b", "c"};
        assertEquals(0, software.alternativeArray(array1, array2));
    }



}