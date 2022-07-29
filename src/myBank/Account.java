package myBank;

public class Account {

    private int balance;
    private String number;
    private String name;
    private String pin;

    public Account(String accountNumber, String accountName, String accountPin) {
        pin = accountPin;
        number = accountNumber;
        name = accountName;
    }

    public int getBalance(String pin) {
        if(pin.equals(this.pin)) return balance;
        else return 0;
    }

    public void deposit(int amount) {
        if(amount > 0) balance = getBalance(pin)+amount;
    }

    public void withdraw(int amount, String pin) {
        boolean amountIsValid = balance > amount && amount > 0;
        if(isCorrect(pin) && amountIsValid)
            balance -= amount;
    }

    private boolean isCorrect(String pin) {
        return pin.equals(this.pin);
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getPin() {
        return pin;
    }
}
