package PetrolStation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnicornOilTest {
    UnicornOil perry;
    @BeforeEach
    void setUp(){
        perry = new UnicornOil();
    }
    @Test
    @DisplayName("UnicornOil exist")
    void UnicornOilExists(){
        assertNotNull(perry);
    }
    @Test
    @DisplayName("Test Percentage Discount")
    void testPercentageDiscount(){
        perry.setQuantityPurchased(2);
        assertEquals(8, perry.getPercentageDiscount());
    }
    @Test
    void testTotalCharges(){
        perry.setQuantityPurchased(2);
        perry.getPercentageDiscount();

        assertEquals(392, perry.getTotalCharges());
    }
}
