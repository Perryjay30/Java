package BankingApp;

import BankingApp.BankException.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private Bank bank;
    @BeforeEach
    void setUp(){
        bank = new Bank();
    }

    @Test
    void testThatAccountCanBeCreated(){
        bank.createAccount("Perry", "1234");
        assertEquals("Perry", bank.findAccount("1").getAccountName());
        bank.createAccount("Oluwapelumi", "3345");
        assertEquals("Oluwapelumi",bank.findAccount("2").getAccountName());
    }
    @Test
    void testThatExceptionCanBeThrownIfAccountIsNotFound(){
        bank.createAccount("Perry", "1234");
        assertThrows(NullPointerException.class,()-> bank.findAccount("5"));
    }

    @Test
    void testThatAccountBalanceCanBeChecked(){
        bank.createAccount("Perry", "1234");
        assertEquals(0, bank.findAccount("1").getBalance("1234"));
    }
    @Test
    void testThatICantBeCheckedBalance(){
        bank.createAccount("Perry", "1234");
        assertThrows(InvalidPinException.class,()->bank.checkBalance("1","2234"));
    }

    @Test
    void testThatICanMakeDeposit(){
        bank.createAccount("Perry", "1234");
        assertEquals(0,bank.checkBalance("1","1234"));
        bank.deposit("1", 5000);
        assertEquals(5000, bank.checkBalance("1","1234"));
    }
    @Test
    void testThatNegativeAmountDepositWillThrowException_AndBalanceRemainsZero(){
        bank.createAccount("Perry", "1234");
        assertEquals(0, bank.checkBalance("1","1234"));
        assertThrows(InvalidAmountException.class,()->  bank.deposit("1",-300));
        assertEquals(0, bank.checkBalance("1","1234"));
    }

    @Test
    void testThatMoneyCanBeWithdrawn(){
        bank.createAccount("Perry", "1234");
        assertEquals(0,bank.checkBalance("1","1234"));
        bank.deposit("1", 5000);
        assertEquals(5000, bank.checkBalance("1","1234"));
        bank.withdraw("1", "1234",2000);
        assertEquals(3000, bank.checkBalance("1", "1234"));
    }
    @Test
    void testThatInsufficientAmountThrowsException(){
        bank.createAccount("Perry", "1234");
        assertEquals(0,bank.checkBalance("1","1234"));
        bank.deposit("1", 5000);
        assertEquals(5000, bank.checkBalance("1","1234"));
        assertThrows(InvalidAmountException.class,()->bank.withdraw("1", "1234",7000));
        assertEquals(5000, bank.checkBalance("1", "1234"));
    }

    @Test
    void testThatTransferCanBeDone(){
        bank.createAccount("Perry", "1234");
        assertEquals("Perry", bank.findAccount("1").getAccountName());
        assertEquals(0, bank.checkBalance("1", "1234"));
        bank.deposit("1",5000);
        assertEquals(5000, bank.checkBalance("1", "1234"));
        bank.createAccount("Oluwapelumi", "3345");
        assertEquals("Oluwapelumi",bank.findAccount("2").getAccountName());
        assertEquals(0, bank.checkBalance("2", "3345"));
        bank.transfer("1","1234",2000,"2");
        assertEquals(2000, bank.checkBalance("2", "3345"));
        assertEquals(3000, bank.checkBalance("1", "1234"));
    }
    @Test
    void testThatTransferThrowsExceptionIfAWrongReceiverAccountNumberIsIncorrect(){
        bank.createAccount("Perry", "1234");
        assertEquals("Perry", bank.findAccount("1").getAccountName());
        assertEquals(0, bank.checkBalance("1", "1234"));
        bank.deposit("1",5000);
        assertEquals(5000, bank.checkBalance("1", "1234"));
        bank.createAccount("", "3345");
        assertEquals("Oluwapelumi",bank.findAccount("2").getAccountName());
        assertEquals(0, bank.checkBalance("2", "3345"));
        assertThrows(NullPointerException.class,()->bank.transfer("1","1234",2000,"3"));
        assertEquals(0, bank.checkBalance("2", "3345"));
        assertEquals(5000, bank.checkBalance("1", "1234"));
    }

    @Test
    void testThatTransferThrowsExceptionIfAWrongSenderAccountNumberIsIncorrect(){
        bank.createAccount("Perry", "1234");
        assertEquals("Perry", bank.findAccount("1").getAccountName());
        assertEquals(0, bank.checkBalance("1", "1234"));
        bank.deposit("1",5000);
        assertEquals(5000, bank.checkBalance("1", "1234"));
        bank.createAccount("Oluwapelumi", "3345");
        assertEquals("Oluwapelumi",bank.findAccount("2").getAccountName());
        assertEquals(0, bank.checkBalance("2", "3345"));
        assertThrows(NullPointerException.class,()->bank.transfer("5","1234",2000,"2"));
        assertEquals(0, bank.checkBalance("2", "3345"));
        assertEquals(5000, bank.checkBalance("1", "1234"));
    }

    @Test
    void testThatTransferThrowsExceptionIfPinIsIncorrect(){
        bank.createAccount("Perry", "1234");
        assertEquals("Perry", bank.findAccount("1").getAccountName());
        assertEquals(0, bank.checkBalance("1", "1234"));
        bank.deposit("1",5000);
        assertEquals(5000, bank.checkBalance("1", "1234"));
        bank.createAccount("Oluwapelumi", "3345");
        assertEquals("Oluwapelumi",bank.findAccount("2").getAccountName());
        assertEquals(0, bank.checkBalance("2", "3345"));
        assertThrows(InvalidPinException.class,()->bank.transfer("1","3345",2000,"2"));
        assertEquals(0, bank.checkBalance("2", "3345"));
        assertEquals(5000, bank.checkBalance("1", "1234"));
    }
    @Test
    void testThatTransferThrowsExceptionIfAnInvalidAmountIsEntered(){
        bank.createAccount("Perry", "1234");
        assertEquals("Perry", bank.findAccount("1").getAccountName());
        assertEquals(0, bank.checkBalance("1", "1234"));
        bank.deposit("1",5000);
        assertEquals(5000, bank.checkBalance("1", "1234"));
        bank.createAccount("Oluwapelumi", "3345");
        assertEquals("Oluwapelumi",bank.findAccount("2").getAccountName());
        assertEquals(0, bank.checkBalance("2", "3345"));
        assertThrows(InvalidAmountException.class,()->bank.transfer("1","1234",9000,"2"));
        assertEquals(0, bank.checkBalance("2", "3345"));
        assertEquals(5000, bank.checkBalance("1", "1234"));
    }

}