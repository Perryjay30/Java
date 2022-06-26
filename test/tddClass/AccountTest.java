package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    @DisplayName("Deposit money, balance increase test")
    public void depositMoneyBalanceIncreaseTest() {
        //given
        Account jennyAccount = new Account();
        //when
        jennyAccount.deposit(500);
        //check
        assertEquals(500, jennyAccount.getBalance());

    }


    @Test
    @DisplayName("Deposit money, balance increase test")
    public void depositMoneyTwiceBalanceIncreaseTest() {
        //given
        Account jennyAccount = new Account();
        //when
        jennyAccount.deposit(500);
        //check
        assertEquals(500, jennyAccount.getBalance());

    }

    @Test
    public void withdrawWorkstest(){
        //given
        Account jennyAccount=new Account();
        jennyAccount.deposit(5000);
        //when
        jennyAccount.withdraw(2000);
        //check
        assertEquals(3000,jennyAccount.getBalance());

    }//

}


