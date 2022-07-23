package Exercise4_19UnitTesting;

public class StoreCustomer {

    private int accountNumber;
    private int balance;
    private int totalOfAllItemsCharged;
    private int totalOfCreditsApplied;
    private int creditLimit;

    public StoreCustomer(int accountNumber,int balance, int totalOfAllItemsCharged, int totalCreditsApplied, int creditLimit) {
     this.accountNumber = accountNumber;
     this.balance = balance;
     this.totalOfAllItemsCharged = totalOfAllItemsCharged;
     this.totalOfCreditsApplied = totalCreditsApplied;
     this.creditLimit = creditLimit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getTotalOfAllItemsCharged() {
        return totalOfAllItemsCharged;
    }
    public void setTotalOfAllItemsCharged(int totalOfAllItemsCharged) {
        this.totalOfAllItemsCharged = totalOfAllItemsCharged;
    }
    public int getCreditLimit(){
        return creditLimit;
    }
    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getTotalOfCreditsApplied(int totalOfCreditsApplied) {
        return totalOfCreditsApplied;
    }
    public void setTotalOfCreditsApplied(int totalOfCreditsApplied) {
        this.totalOfCreditsApplied = totalOfCreditsApplied;
    }

    public int calculateBalance() {
        int balance = getBalance() + totalOfAllItemsCharged - totalOfCreditsApplied;
        setBalance(balance);
        return getBalance();
    }

    public boolean creditLimitExceeded() {
        return false;
    }
}
