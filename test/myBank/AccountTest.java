package myBank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account bankeAccount;

   @BeforeEach
   public void initialSetUp() {
    bankeAccount = new Account("1", "Banke Celina", "1234");
    }


@Test
    public void accountCanBeCreated() {
    //given that account exists
    //check that account exists
    assertNotNull(bankeAccount);
    assertEquals(0, bankeAccount.getBalance("1234"));
    }

    @Test
    public void depositMoney_balanceIncreasesTest() {
    //given that i have account and balance is zero
        //when i deposit 200
        //check that balance is 200
        assertEquals(0, bankeAccount.getBalance("1234"));
        bankeAccount.deposit(200);
        assertEquals(200, bankeAccount.getBalance("1234"));
    }

    @Test
    public void cannotDepositNegativeAmountTest() {
    //given i have account and balance is zero
        //when i try to deposit -2500
        //check that balance is zero
        assertEquals(0, bankeAccount.getBalance("1234"));
        bankeAccount.deposit(-2500);
        assertEquals(0, bankeAccount.getBalance("1234"));
   }

   @Test
    @DisplayName("Getting balance with invalid pin returns zero")
    public void getBalanceWithWrongPin_returnsZeroTest() {
       bankeAccount.deposit(2000);
       int myBalance = bankeAccount.getBalance("1211");
       assertEquals(0, myBalance);
   }

    @Test
    @DisplayName("Getting balance with invalid pin returns real Balance")
    public void getBalanceWithCorrectPin_returnsRealBalanceTest() {
        bankeAccount.deposit(2000);
        int myBalance = bankeAccount.getBalance("1234");
        assertEquals(2000, myBalance);
    }

    @Test
    public void withdrawMoney_balanceDecreaseTest() {
        bankeAccount.deposit(5000);
        bankeAccount.withdraw(3000,"1234");
        assertEquals(2000, bankeAccount.getBalance("1234"));
    }

    @Test
    public void withdrawWithWrongPinDoesNotWorkTest() {
       bankeAccount.deposit(5000);
        bankeAccount.withdraw(3000,"1211");
        assertEquals(5000, bankeAccount.getBalance("1234"));
    }

    @Test
    @DisplayName("if pin is correct and amount exceeds balance, Withdraw does not work")
    public void withdrawWithRightPinAndAmountDoesNotWorkTest() {
        bankeAccount.deposit(5_000);
        bankeAccount.withdraw(10_000,"1234");
        assertEquals(5_000, bankeAccount.getBalance("1234"));
    }




}