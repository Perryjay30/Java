package Exercise8_11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumbersTest {

    ComplexNumbers cp1;
    ComplexNumbers cp2;

@BeforeEach
    void initialSetUp() {
    cp1 = new ComplexNumbers(79.7, 64.9);
    cp2 = new ComplexNumbers(53.5, 41.7);
}

@Test
    void testThatTwoComplexNumbersCanBeAdded() {
    assertNotNull(ComplexNumbers.addComplexNumbers(cp1, cp2));
}

@Test
    void testThatComplexNumbersCanBeSubtracted() {
    assertNotNull(ComplexNumbers.subtractComplexNumbers(cp1, cp2));
}





}