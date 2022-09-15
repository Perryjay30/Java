package Exercise5_32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FairTaxCalculatorTest {

    private FairTaxCalculator ftCalculator;

    @BeforeEach
    void startWithThis() {
        ftCalculator = new FairTaxCalculator();
    }
    @Test
    void testThatFairTaxCanBeCalculated() {
        //given
        Product product = new Product("Milo", 100.00);
        //when
        double tax = ftCalculator.calculateTax(product.getPrice());
        assertEquals(23, tax);
    }

    @Test
    void testThatProductsTotalPriceCanBeCalculated() {
        ftCalculator.setTotalPrice(50.00);
        double totalPrice = ftCalculator.calculateTotalPrice(30.00);
        assertEquals(80.00, totalPrice);
    }

}