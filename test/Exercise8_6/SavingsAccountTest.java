package Exercise8_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    SavingsAccount saver1;
    SavingsAccount saver2;

    @BeforeEach
    void initialSetup() {
        saver1 = new SavingsAccount(0.04, 2000.00);
        saver2 = new SavingsAccount(0.04, 3000.00);
    }

    @Test
    void testThatAccountExists() {
        saver1.isThereAnAccount();
        saver2.isThereAnAccount();
        assertTrue(saver1.accountIsAvailable);
        assertTrue(saver2.accountIsAvailable);
    }

    @Test
    void testThatAccountHasBalance() {
        saver1.isThereAnAccount();
        saver2.isThereAnAccount();
        assertTrue(saver1.accountIsAvailable);
        assertTrue(saver2.accountIsAvailable);

        saver1.getSavingsBalance();
        saver2.getSavingsBalance();
        assertEquals(2000.00, saver1.getSavingsBalance());
        assertEquals(3000.00, saver2.getSavingsBalance());
    }

    @Test
    void testThatMonthlyInterestCanBeCalculated() {
        saver1.getSavingsBalance();
        saver2.getSavingsBalance();
        assertEquals(2000.00, saver1.getSavingsBalance());
        assertEquals(3000.00, saver2.getSavingsBalance());

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        assertEquals(6.666666666666667,saver1.calculateMonthlyInterest());
        assertEquals(10.00,saver2.calculateMonthlyInterest());
    }

    @Test
    void testThatAnnualInterestRateCanBeModified() {
        saver1.getAnnualInterestRate();
        saver2.getAnnualInterestRate();
        assertEquals(0.04, saver1.getAnnualInterestRate());
        assertEquals(0.04, saver2.getAnnualInterestRate());

        saver1.modifyAnnualInterestRate();
        saver2.modifyAnnualInterestRate();
        assertEquals(0.05,saver1.modifyAnnualInterestRate());
        assertEquals(0.05,saver2.modifyAnnualInterestRate());
    }

    @Test
    void testThatModifiedInterestRateCanBeCalculated() {
        saver1.modifyAnnualInterestRate();
        saver2.modifyAnnualInterestRate();
        assertEquals(0.05,saver1.modifyAnnualInterestRate());
        assertEquals(0.05,saver2.modifyAnnualInterestRate());


        saver1.modifiedMonthlyInterest();
        saver2.modifiedMonthlyInterest();
        assertEquals(8.3333333333333334,saver1.modifiedMonthlyInterest());
        assertEquals(12.5,saver2.modifiedMonthlyInterest());
    }

}