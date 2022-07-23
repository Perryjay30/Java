package Exercise4_19UnitTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StoreCustomerTest {

   private StoreCustomer adetutu;
   private StoreCustomer damilola;
    @BeforeEach
    void setUp() {
       adetutu =  new StoreCustomer(1,500,2500,7000,6000);
       damilola = new StoreCustomer(2, 1000,4000,0,2000);
    }

    @Test
    void calculateBalance() {
        int balance = adetutu.calculateBalance();
        assertEquals(3000,balance);
        balance = damilola.calculateBalance();
        assertEquals(5000, balance);
    }

    @Test
    void calculateNegativeBalance() {
        int balance = adetutu.calculateBalance();
        assertEquals(-4000, balance);
    }

    @Test
    void checkCreditLimitHasExceeded() {
            adetutu.calculateBalance();
            boolean exceeded = adetutu.creditLimitExceeded();
            assertFalse(exceeded);
        }

    }

