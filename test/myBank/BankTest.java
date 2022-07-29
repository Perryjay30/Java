package myBank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    private Bank wemaBank;

    @BeforeEach
    public void startWithThis() {
        wemaBank = new Bank();
    }

    @Test
    public void bankExistsTest() {
        Bank wemaBank = new Bank();
        assertNotNull(wemaBank);
    }

    @Test
    public void accountCanBeCreated() {
      //given that there is a bank
      //when i create an account
      //check that number of accounts created is 1
      wemaBank.createAccountFor("Banke Celina", "2727");
      assertEquals(1, wemaBank.getNumberOfCustomers());
    }

    @Test
    public void createAccount_findAccountByAccountNumber() {
        wemaBank.createAccountFor("Banke Celina", "2727");
        assertEquals(1, wemaBank.getNumberOfCustomers());

        Account account = wemaBank.findAccount("1");
        assertEquals("Banke Celina", account.getName());
    }

    @Test
    public void customerCanDepositInHerAccount() {
    wemaBank.createAccountFor("Banke Celina", "2727");
    wemaBank.deposit(2_000, "1");

    Account bankeAccount = wemaBank.findAccount("1");
    assertEquals(2_000, bankeAccount.getBalance("2727"));
    }

    @Test
    public void customerCanWithdrawFromHerAccount() {
        wemaBank.createAccountFor("Banke Celina", "2727");
        wemaBank.deposit(10_000, "1");

        Account bankeAccount = wemaBank.withdraw(5000,"1", "2727");
        assertEquals(5000, bankeAccount.getBalance("2727"));
    }

    @Test
    public void customerCanWithdrawNegativeAccount() {
        wemaBank.createAccountFor("Banke Celina", "2727");
        wemaBank.deposit(10_000, "1");

        Account bankeAccount = wemaBank.withdraw(-5000,"1", "2727");
        assertEquals(10000, bankeAccount.getBalance("2727"));
    }
}