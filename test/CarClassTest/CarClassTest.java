package CarClassTest;

import CarPackage.CarClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarClassTest {

        CarClass application;
        @BeforeEach
        public void setUp() {
            application = new CarClass();
        }

    @Test
    @DisplayName("CarClass exists")
        void carClassExist() {assertNotNull(application);}

    @Test
    @DisplayName("mercedes is the brand")
    void mercedesIsTheBrand() {assertNotNull(application); }

    @Test
    double setPercentageDiscount(){
        assertEquals(40000, application.getPercentageDiscount());
        return application.getPercentageDiscount();
    }




}
