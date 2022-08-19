package BasicTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialsTest {
    Factorials factors;
    @BeforeEach
    void setUp() {
        factors = new Factorials();
    }

    @Test
    void testThataNumberHasFactors() {
        assertNotNull(factors.factorsInaNumber(27));
        System.out.println(factors.factorsInaNumber(27));
    }

    @Test
    void testThatNumbersHasPrime() {
        assertTrue(factors.isPrime(5));
        assertFalse(factors.isPrime(8));
    }

    @Test
    void testThereIsaMaximumNumberInAnArray() {
        int [] array = {73, 67, 32, 14, 89, 55, 101, 47};
        assertNotNull(factors.maxArray(array));
        System.out.println(factors.maxArray(array));
    }

    @Test
    void testThereIsaMinimumNumberInAnArray() {
        int [] array = {73, 67, 32, 14, 89, 55, 101, 47};
        assertNotNull(factors.minArray(array));
        System.out.println(factors.minArray(array));
    }

    @Test
    void testThatAnArrayHasaMaximumSum() {
        int [] array = {73, 67, 32, 14, 89, 55, 101, 47};
        assertNotNull(factors.arraySumMax(array));
        System.out.println(factors.arraySumMax(array));
    }

    @Test
    void testThatAnArrayHasaMinimumSum() {
        int [] array = {73, 67, 32, 14, 89, 55, 101, 47};
        assertNotNull(factors.arraySumMin(array));
        System.out.println(factors.arraySumMin(array));
    }
}